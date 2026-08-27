import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exz {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "screenshots";
   private int c;
   private final DataOutputStream d;
   private final byte[] e;
   private final int f;
   private final int g;
   private File h;

   public static void a(File $$0, eqt $$1, Consumer<vq> $$2) {
      a($$0, null, $$1, $$2);
   }

   public static void a(File $$0, @Nullable String $$1, eqt $$2, Consumer<vq> $$3) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> b($$0, $$1, $$2, $$3));
      } else {
         b($$0, $$1, $$2, $$3);
      }
   }

   private static void b(File $$0, @Nullable String $$1, eqt $$2, Consumer<vq> $$3) {
      eri $$4 = a($$2);
      File $$5 = new File($$0, "screenshots");
      $$5.mkdir();
      File $$6;
      if ($$1 == null) {
         $$6 = a($$5);
      } else {
         $$6 = new File($$5, $$1);
      }

      ac.g().execute(() -> {
         try {
            $$4.a($$6);
            vq $$3x = vq.b($$6.getName()).a(n.t).a($$1xx -> $$1xx.a(new vo(vo.a.b, $$6.getAbsolutePath())));
            $$3.accept(vq.a("screenshot.success", $$3x));
         } catch (Exception var7) {
            b.warn("Couldn't save screenshot", var7);
            $$3.accept(vq.a("screenshot.failure", var7.getMessage()));
         } finally {
            $$4.close();
         }
      });
   }

   public static eri a(eqt $$0) {
      int $$1 = $$0.c;
      int $$2 = $$0.d;
      eri $$3 = new eri($$1, $$2, false);
      RenderSystem.bindTexture($$0.f());
      $$3.a(0, true);
      $$3.h();
      return $$3;
   }

   private static File a(File $$0) {
      String $$1 = ac.e();
      int $$2 = 1;

      while (true) {
         File $$3 = new File($$0, $$1 + ($$2 == 1 ? "" : "_" + $$2) + ".png");
         if (!$$3.exists()) {
            return $$3;
         }

         $$2++;
      }
   }

   public exz(File $$0, int $$1, int $$2, int $$3) throws IOException {
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      File $$4 = new File($$0, "screenshots");
      $$4.mkdir();
      String $$5 = "huge_" + ac.e();
      int $$6 = 1;

      while ((this.h = new File($$4, $$5 + ($$6 == 1 ? "" : "_" + $$6) + ".tga")).exists()) {
         $$6++;
      }

      byte[] $$7 = new byte[18];
      $$7[2] = 2;
      $$7[12] = (byte)($$1 % 256);
      $$7[13] = (byte)($$1 / 256);
      $$7[14] = (byte)($$2 % 256);
      $$7[15] = (byte)($$2 / 256);
      $$7[16] = 24;
      this.e = new byte[$$1 * $$3 * 3];
      this.d = new DataOutputStream(new FileOutputStream(this.h));
      this.d.write($$7);
   }

   public void a(ByteBuffer $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$3;
      int $$6 = $$4;
      if ($$3 > this.f - $$1) {
         $$5 = this.f - $$1;
      }

      if ($$4 > this.g - $$2) {
         $$6 = this.g - $$2;
      }

      this.c = $$6;

      for (int $$7 = 0; $$7 < $$6; $$7++) {
         $$0.position(($$4 - $$6) * $$3 * 3 + $$7 * $$3 * 3);
         int $$8 = ($$1 + $$7 * this.f) * 3;
         $$0.get(this.e, $$8, $$5 * 3);
      }
   }

   public void a() throws IOException {
      this.d.write(this.e, 0, this.f * 3 * this.c);
   }

   public File b() throws IOException {
      this.d.close();
      return this.h;
   }
}
