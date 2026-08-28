import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqb {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "screenshots";

   public static void a(File $$0, fij $$1, Consumer<wy> $$2) {
      a($$0, null, $$1, $$2);
   }

   public static void a(File $$0, @Nullable String $$1, fij $$2, Consumer<wy> $$3) {
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
               fiz $$4x = $$3x;

               try {
                  $$3x.a($$5);
                  wy $$3xx = wy.b($$5.getName()).a(o.t).a($$1xxx -> $$1xxx.a(new ww.d($$5.getAbsoluteFile())));
                  $$3.accept(wy.a("screenshot.success", $$3xx));
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
               $$3.accept(wy.a("screenshot.failure", var8.getMessage()));
            }
         });
      });
   }

   public static void a(fij $$0, Consumer<fiz> $$1) {
      int $$2 = $$0.c;
      int $$3 = $$0.d;
      fjw $$4 = $$0.g();
      if ($$4 == null) {
         throw new IllegalStateException("Tried to capture screenshot of an incomplete framebuffer");
      } else {
         fhs $$5 = new fhs(fhq.c, fhr.d, $$2 * $$3 * $$4.b().d());
         $$4.a($$5, 0, () -> {
            try (fhs.a $$5x = $$5.a()) {
               fiz $$6 = new fiz($$2, $$3, false);

               for (int $$7 = 0; $$7 < $$3; $$7++) {
                  for (int $$8 = 0; $$8 < $$2; $$8++) {
                     int $$9 = $$5x.a().getInt(($$8 + $$7 * $$2) * $$4.b().d());
                     $$6.a($$8, $$3 - $$7 - 1, $$9 | 0xFF000000);
                  }
               }

               $$1.accept($$6);
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
