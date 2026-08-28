import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fsi extends fnj {
   private static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("selectWorld.enterName").a(n.h);
   private static final wu c = wu.c("selectWorld.edit.resetIcon");
   private static final wu q = wu.c("selectWorld.edit.openFolder");
   private static final wu r = wu.c("selectWorld.edit.backup");
   private static final wu s = wu.c("selectWorld.edit.backupFolder");
   private static final wu u = wu.c("selectWorld.edit.optimize");
   private static final wu v = wu.c("optimizeWorld.confirm.title");
   private static final wu w = wu.c("optimizeWorld.confirm.description");
   private static final wu x = wu.c("selectWorld.edit.save");
   private static final int y = 200;
   private static final int z = 4;
   private static final int A = 98;
   private final flj B = flj.d().a(5);
   private final BooleanConsumer C;
   private final eqi.c D;
   private final fib E;

   public static fsi a(fft $$0, eqi.c $$1, BooleanConsumer $$2) throws IOException {
      eqj $$3 = $$1.a($$1.h());
      return new fsi($$0, $$1, $$3.b(), $$2);
   }

   private fsi(fft $$0, eqi.c $$1, String $$2, BooleanConsumer $$3) {
      super(wu.c("selectWorld.edit.title"));
      this.C = $$3;
      this.D = $$1;
      fhd $$4 = $$0.h;
      this.B.a(new flk(200, 20));
      this.B.a(new fiz(b, $$4));
      this.E = this.B.a(new fib($$4, 200, 20, b));
      this.E.a($$2);
      flj $$5 = flj.e().a(4);
      fhs $$6 = $$5.a(fhs.a(x, $$0x -> this.a(this.E.a())).a(98).a());
      $$5.a(fhs.a(wt.e, $$0x -> this.d()).a(98).a());
      this.E.b($$1x -> $$6.j = !azd.h($$1x));
      this.B.a(fhs.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.B.a(fhs.a(q, $$1x -> ac.k().a($$1.a(eqg.l).toFile())).a(200).a());
      this.B.a(fhs.a(r, $$1x -> {
         boolean $$2x = a($$1);
         this.C.accept(!$$2x);
      }).a(200).a());
      this.B.a(fhs.a(s, $$1x -> {
         eqi $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.k().a($$3x.toFile());
      }).a(200).a());
      this.B.a(fhs.a(u, $$2x -> $$0.a(new fmd(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fsk.a($$0, this.C, $$0.as(), $$1, $$3x));
         }, v, w, true))).a(200).a());
      this.B.a(new flk(200, 20));
      this.B.a($$5);
      this.B.a($$1x -> {
         fhq var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aE_() {
      this.b(this.E);
   }

   @Override
   protected void aP_() {
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      fld.a(this.B, this.H());
   }

   @Override
   public void d() {
      this.C.accept(false);
   }

   private void a(String $$0) {
      try {
         this.D.a($$0);
      } catch (ui | uo | IOException var3) {
         a.error("Failed to access world '{}'", this.D.f(), var3);
         fka.a(this.l, this.D.f());
      }

      this.C.accept(true);
   }

   public static boolean a(eqi.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         wu $$4 = wu.c("selectWorld.edit.backupFailed");
         wu $$5 = wu.b($$2.getMessage());
         fft.Q().ax().a(new fka(fka.a.b, $$4, $$5));
         return false;
      } else {
         wu $$6 = wu.a("selectWorld.edit.backupCreated", $$0.f());
         wu $$7 = wu.a("selectWorld.edit.backupSize", ayg.c((double)$$1 / 1048576.0));
         fft.Q().ax().a(new fka(fka.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 15, 16777215);
   }
}
