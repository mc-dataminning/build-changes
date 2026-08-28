import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.openal.AL10;
import org.slf4j.Logger;

public class exv {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 4;
   public static final int a = 1;
   private final int d;
   private final AtomicBoolean e = new AtomicBoolean(true);
   private int f = 16384;
   @Nullable
   private gtl g;

   @Nullable
   static exv a() {
      int[] $$0 = new int[1];
      AL10.alGenSources($$0);
      return exz.a("Allocate new source") ? null : new exv($$0[0]);
   }

   private exv(int $$0) {
      this.d = $$0;
   }

   public void b() {
      if (this.e.compareAndSet(true, false)) {
         AL10.alSourceStop(this.d);
         exz.a("Stop");
         if (this.g != null) {
            try {
               this.g.close();
            } catch (IOException var2) {
               b.error("Failed to close audio stream", var2);
            }

            this.l();
            this.g = null;
         }

         AL10.alDeleteSources(new int[]{this.d});
         exz.a("Cleanup");
      }
   }

   public void c() {
      AL10.alSourcePlay(this.d);
   }

   private int k() {
      return !this.e.get() ? 4116 : AL10.alGetSourcei(this.d, 4112);
   }

   public void d() {
      if (this.k() == 4114) {
         AL10.alSourcePause(this.d);
      }
   }

   public void e() {
      if (this.k() == 4115) {
         AL10.alSourcePlay(this.d);
      }
   }

   public void f() {
      if (this.e.get()) {
         AL10.alSourceStop(this.d);
         exz.a("Stop");
      }
   }

   public boolean g() {
      return this.k() == 4114;
   }

   public boolean h() {
      return this.k() == 4116;
   }

   public void a(evt $$0) {
      AL10.alSourcefv(this.d, 4100, new float[]{(float)$$0.c, (float)$$0.d, (float)$$0.e});
   }

   public void a(float $$0) {
      AL10.alSourcef(this.d, 4099, $$0);
   }

   public void a(boolean $$0) {
      AL10.alSourcei(this.d, 4103, $$0 ? 1 : 0);
   }

   public void b(float $$0) {
      AL10.alSourcef(this.d, 4106, $$0);
   }

   public void i() {
      AL10.alSourcei(this.d, 53248, 0);
   }

   public void c(float $$0) {
      AL10.alSourcei(this.d, 53248, 53251);
      AL10.alSourcef(this.d, 4131, $$0);
      AL10.alSourcef(this.d, 4129, 1.0F);
      AL10.alSourcef(this.d, 4128, 0.0F);
   }

   public void b(boolean $$0) {
      AL10.alSourcei(this.d, 514, $$0 ? 1 : 0);
   }

   public void a(eya $$0) {
      $$0.a().ifPresent($$0x -> AL10.alSourcei(this.d, 4105, $$0x));
   }

   public void a(gtl $$0) {
      this.g = $$0;
      AudioFormat $$1 = $$0.a();
      this.f = a($$1, 1);
      this.a(4);
   }

   private static int a(AudioFormat $$0, int $$1) {
      return (int)((float)($$1 * $$0.getSampleSizeInBits()) / 8.0F * (float)$$0.getChannels() * $$0.getSampleRate());
   }

   private void a(int $$0) {
      if (this.g != null) {
         try {
            for (int $$1 = 0; $$1 < $$0; $$1++) {
               ByteBuffer $$2 = this.g.a(this.f);
               if ($$2 != null) {
                  new eya($$2, this.g.a()).c().ifPresent($$0x -> AL10.alSourceQueueBuffers(this.d, new int[]{$$0x}));
               }
            }
         } catch (IOException var4) {
            b.error("Failed to read from audio stream", var4);
         }
      }
   }

   public void j() {
      if (this.g != null) {
         int $$0 = this.l();
         this.a($$0);
      }
   }

   private int l() {
      int $$0 = AL10.alGetSourcei(this.d, 4118);
      if ($$0 > 0) {
         int[] $$1 = new int[$$0];
         AL10.alSourceUnqueueBuffers(this.d, $$1);
         exz.a("Unqueue buffers");
         AL10.alDeleteBuffers($$1);
         exz.a("Remove processed buffers");
      }

      return $$0;
   }
}
