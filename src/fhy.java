import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.nio.IntBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.OptionalLong;
import java.util.Set;
import javax.annotation.Nullable;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALC11;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.openal.ALUtil;
import org.lwjgl.system.MemoryStack;
import org.slf4j.Logger;

public class fhy {
   static final Logger a = LogUtils.getLogger();
   private static final int b = 0;
   private static final int c = 30;
   private long d;
   private long e;
   private boolean f;
   @Nullable
   private String g;
   private static final fhy.a h = new fhy.a() {
      @Nullable
      @Override
      public fhx a() {
         return null;
      }

      @Override
      public boolean a(fhx $$0) {
         return false;
      }

      @Override
      public void b() {
      }

      @Override
      public int c() {
         return 0;
      }

      @Override
      public int d() {
         return 0;
      }
   };
   private fhy.a i = h;
   private fhy.a j = h;
   private final fhz k = new fhz();

   public fhy() {
      this.g = a();
   }

   public void a(@Nullable String $$0, boolean $$1) {
      this.d = a($$0);
      this.f = false;
      ALCCapabilities $$2 = ALC.createCapabilities(this.d);
      if (fib.a(this.d, "Get capabilities")) {
         throw new IllegalStateException("Failed to get OpenAL capabilities");
      } else if (!$$2.OpenALC11) {
         throw new IllegalStateException("OpenAL 1.1 not supported");
      } else {
         MemoryStack $$3 = MemoryStack.stackPush();

         try {
            IntBuffer $$4 = this.a($$3, $$2.ALC_SOFT_HRTF && $$1);
            this.e = ALC10.alcCreateContext(this.d, $$4);
         } catch (Throwable var9) {
            if ($$3 != null) {
               try {
                  $$3.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }
            }

            throw var9;
         }

         if ($$3 != null) {
            $$3.close();
         }

         if (fib.a(this.d, "Create context")) {
            throw new IllegalStateException("Unable to create OpenAL context");
         } else {
            ALC10.alcMakeContextCurrent(this.e);
            int $$5 = this.i();
            int $$6 = azo.a((int)azo.c((float)$$5), 2, 8);
            int $$7 = azo.a($$5 - $$6, 8, 255);
            this.i = new fhy.b($$7);
            this.j = new fhy.b($$6);
            ALCapabilities $$8 = AL.createCapabilities($$2);
            fib.a("Initialization");
            if (!$$8.AL_EXT_source_distance_model) {
               throw new IllegalStateException("AL_EXT_source_distance_model is not supported");
            } else {
               AL10.alEnable(512);
               if (!$$8.AL_EXT_LINEAR_DISTANCE) {
                  throw new IllegalStateException("AL_EXT_LINEAR_DISTANCE is not supported");
               } else {
                  fib.a("Enable per-source distance models");
                  a.info("OpenAL initialized on device {}", this.b());
                  this.f = ALC10.alcIsExtensionPresent(this.d, "ALC_EXT_disconnect");
               }
            }
         }
      }
   }

   private IntBuffer a(MemoryStack $$0, boolean $$1) {
      int $$2 = 5;
      IntBuffer $$3 = $$0.callocInt(11);
      int $$4 = ALC10.alcGetInteger(this.d, 6548);
      if ($$4 > 0) {
         $$3.put(6546).put($$1 ? 1 : 0);
         $$3.put(6550).put(0);
      }

      $$3.put(6554).put(1);
      return $$3.put(0).flip();
   }

   private int i() {
      MemoryStack $$0 = MemoryStack.stackPush();

      int var7;
      label58: {
         try {
            int $$1 = ALC10.alcGetInteger(this.d, 4098);
            if (fib.a(this.d, "Get attributes size")) {
               throw new IllegalStateException("Failed to get OpenAL attributes");
            }

            IntBuffer $$2 = $$0.mallocInt($$1);
            ALC10.alcGetIntegerv(this.d, 4099, $$2);
            if (fib.a(this.d, "Get attributes")) {
               throw new IllegalStateException("Failed to get OpenAL attributes");
            }

            int $$3 = 0;

            while ($$3 < $$1) {
               int $$4 = $$2.get($$3++);
               if ($$4 == 0) {
                  break;
               }

               int $$5 = $$2.get($$3++);
               if ($$4 == 4112) {
                  var7 = $$5;
                  break label58;
               }
            }
         } catch (Throwable var9) {
            if ($$0 != null) {
               try {
                  $$0.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }
            }

            throw var9;
         }

         if ($$0 != null) {
            $$0.close();
         }

         return 30;
      }

      if ($$0 != null) {
         $$0.close();
      }

      return var7;
   }

   @Nullable
   public static String a() {
      if (!ALC10.alcIsExtensionPresent(0L, "ALC_ENUMERATE_ALL_EXT")) {
         return null;
      } else {
         ALUtil.getStringList(0L, 4115);
         return ALC10.alcGetString(0L, 4114);
      }
   }

   public String b() {
      String $$0 = ALC10.alcGetString(this.d, 4115);
      if ($$0 == null) {
         $$0 = ALC10.alcGetString(this.d, 4101);
      }

      if ($$0 == null) {
         $$0 = "Unknown";
      }

      return $$0;
   }

   public synchronized boolean c() {
      String $$0 = a();
      if (Objects.equals(this.g, $$0)) {
         return false;
      } else {
         this.g = $$0;
         return true;
      }
   }

   private static long a(@Nullable String $$0) {
      OptionalLong $$1 = OptionalLong.empty();
      if ($$0 != null) {
         $$1 = b($$0);
      }

      if ($$1.isEmpty()) {
         $$1 = b(a());
      }

      if ($$1.isEmpty()) {
         $$1 = b(null);
      }

      if ($$1.isEmpty()) {
         throw new IllegalStateException("Failed to open OpenAL device");
      } else {
         return $$1.getAsLong();
      }
   }

   private static OptionalLong b(@Nullable String $$0) {
      long $$1 = ALC10.alcOpenDevice($$0);
      return $$1 != 0L && !fib.a($$1, "Open device") ? OptionalLong.of($$1) : OptionalLong.empty();
   }

   public void d() {
      this.i.b();
      this.j.b();
      ALC10.alcDestroyContext(this.e);
      if (this.d != 0L) {
         ALC10.alcCloseDevice(this.d);
      }
   }

   public fhz e() {
      return this.k;
   }

   @Nullable
   public fhx a(fhy.c $$0) {
      return ($$0 == fhy.c.b ? this.j : this.i).a();
   }

   public void a(fhx $$0) {
      if (!this.i.a($$0) && !this.j.a($$0)) {
         throw new IllegalStateException("Tried to release unknown channel");
      }
   }

   public String f() {
      return String.format(Locale.ROOT, "Sounds: %d/%d + %d/%d", this.i.d(), this.i.c(), this.j.d(), this.j.c());
   }

   public List<String> g() {
      List<String> $$0 = ALUtil.getStringList(0L, 4115);
      return $$0 == null ? Collections.emptyList() : $$0;
   }

   public boolean h() {
      return this.f && ALC11.alcGetInteger(this.d, 787) == 0;
   }

   interface a {
      @Nullable
      fhx a();

      boolean a(fhx var1);

      void b();

      int c();

      int d();
   }

   static class b implements fhy.a {
      private final int a;
      private final Set<fhx> b = Sets.newIdentityHashSet();

      public b(int $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public fhx a() {
         if (this.b.size() >= this.a) {
            if (ac.aU) {
               fhy.a.warn("Maximum sound pool size {} reached", this.a);
            }

            return null;
         } else {
            fhx $$0 = fhx.a();
            if ($$0 != null) {
               this.b.add($$0);
            }

            return $$0;
         }
      }

      @Override
      public boolean a(fhx $$0) {
         if (!this.b.remove($$0)) {
            return false;
         } else {
            $$0.b();
            return true;
         }
      }

      @Override
      public void b() {
         this.b.forEach(fhx::b);
         this.b.clear();
      }

      @Override
      public int c() {
         return this.a;
      }

      @Override
      public int d() {
         return this.b.size();
      }
   }

   public static enum c {
      a,
      b;
   }
}
