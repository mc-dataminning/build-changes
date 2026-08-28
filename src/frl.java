import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frl {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "screenshots";

   public static void a(File $$0, fjq $$1, Consumer<xa> $$2) {
      a($$0, null, $$1, $$2);
   }

   public static void a(File $$0, @Nullable String $$1, fjq $$2, Consumer<xa> $$3) {
      a($$2, $$3x -> {
         File $$4 = new File($$0, "screenshots");
         $$4.mkdir();
         File $$5;
         if ($$1 == null) {
            $$5 = a($$4);
         } else {
            $$5 = new File($$4, $$1);
         }

         ag.i().execute(() -> {
            try {
               fkg $$4x = $$3x;

               try {
                  $$3x.a($$5);
                  xa $$3xx = xa.b($$5.getName()).a(o.t).a($$1xxx -> $$1xxx.a(new wy.d($$5.getAbsoluteFile())));
                  $$3.accept(xa.a("screenshot.success", $$3xx));
               } catch (Throwable var7) {
                  if ($$3x != null) {
                     try {
                        $$4x.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if ($$3x != null) {
                  $$3x.close();
               }
            } catch (Exception var8) {
               b.warn("Couldn't save screenshot", var8);
               $$3.accept(xa.a("screenshot.failure", var8.getMessage()));
            }
         });
      });
   }

   public static void a(fjq $$0, Consumer<fkg> $$1) {
      int $$2 = $$0.c;
      int $$3 = $$0.d;
      flh $$4 = $$0.d();
      if ($$4 == null) {
         throw new IllegalStateException("Tried to capture screenshot of an incomplete framebuffer");
      } else {
         fig $$5 = RenderSystem.getDevice().a(() -> "Screenshot buffer", fie.c, fif.d, $$2 * $$3 * $$4.d().a());
         fkz $$6 = RenderSystem.getDevice().b();
         RenderSystem.getDevice().b().a($$4, $$5, 0, () -> {
            try (fig.a $$6x = $$6.a($$5)) {
               fkg $$7 = new fkg($$2, $$3, false);

               for (int $$8 = 0; $$8 < $$3; $$8++) {
                  for (int $$9 = 0; $$9 < $$2; $$9++) {
                     int $$10 = $$6x.a().getInt(($$9 + $$8 * $$2) * $$4.d().a());
                     $$7.a($$9, $$3 - $$8 - 1, $$10 | 0xFF000000);
                  }
               }

               $$1.accept($$7);
            }

            $$5.close();
         }, 0);
      }
   }

   private static File a(File $$0) {
      String $$1 = ag.f();
      int $$2 = 1;

      while (true) {
         File $$3 = new File($$0, $$1 + ($$2 == 1 ? "" : "_" + $$2) + ".png");
         if (!$$3.exists()) {
            return $$3;
         }

         $$2++;
      }
   }
}
