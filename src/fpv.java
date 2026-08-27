import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fpv extends fld {
   private static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("selectWorld.enterName").a(n.h);
   private static final wu c = wu.c("selectWorld.edit.resetIcon");
   private static final wu d = wu.c("selectWorld.edit.openFolder");
   private static final wu r = wu.c("selectWorld.edit.backup");
   private static final wu s = wu.c("selectWorld.edit.backupFolder");
   private static final wu u = wu.c("selectWorld.edit.optimize");
   private static final wu v = wu.c("optimizeWorld.confirm.title");
   private static final wu w = wu.c("optimizeWorld.confirm.description");
   private static final wu x = wu.c("selectWorld.edit.save");
   private static final int y = 200;
   private static final int z = 4;
   private static final int A = 98;
   private final fiv B = fiv.d().a(5);
   private final BooleanConsumer C;
   private final eob.c D;
   private final ffn E;

   public static fpv a(fde $$0, eob.c $$1, BooleanConsumer $$2) throws IOException {
      eoc $$3 = $$1.a($$1.h());
      return new fpv($$0, $$1, $$3.b(), $$2);
   }

   private fpv(fde $$0, eob.c $$1, String $$2, BooleanConsumer $$3) {
      super(wu.c("selectWorld.edit.title"));
      this.C = $$3;
      this.D = $$1;
      fep $$4 = $$0.h;
      this.B.a(new fiw(200, 20));
      this.B.a(new fgl(b, $$4));
      this.E = this.B.a(new ffn($$4, 200, 20, b));
      this.E.a($$2);
      fiv $$5 = fiv.e().a(4);
      ffe $$6 = $$5.a(ffe.a(x, $$0x -> this.a(this.E.a())).a(98).a());
      $$5.a(ffe.a(wt.e, $$0x -> this.d()).a(98).a());
      this.E.b($$1x -> $$6.j = !ayu.h($$1x));
      this.B.a(ffe.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.B.a(ffe.a(d, $$1x -> ac.j().a($$1.a(enz.l).toFile())).a(200).a());
      this.B.a(ffe.a(r, $$1x -> {
         boolean $$2x = a($$1);
         this.C.accept(!$$2x);
      }).a(200).a());
      this.B.a(ffe.a(s, $$1x -> {
         eob $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.j().a($$3x.toFile());
      }).a(200).a());
      this.B.a(ffe.a(u, $$2x -> $$0.a(new fjq(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fpx.a($$0, this.C, $$0.at(), $$1, $$3x));
         }, v, w, true))).a(200).a());
      this.B.a(new fiw(200, 20));
      this.B.a($$5);
      this.B.a($$1x -> {
         ffc var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aC_() {
      this.b(this.E);
   }

   @Override
   protected void aM_() {
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      fip.a(this.B, this.G());
   }

   @Override
   public void d() {
      this.C.accept(false);
   }

   private void a(String $$0) {
      try {
         this.D.a($$0);
      } catch (ul | ur | IOException var3) {
         a.error("Failed to access world '{}'", this.D.f(), var3);
         fhm.a(this.m, this.D.f());
      }

      this.C.accept(true);
   }

   public static boolean a(eob.c $$0) {
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
         fde.Q().aA().a(new fhm(fhm.a.b, $$4, $$5));
         return false;
      } else {
         wu $$6 = wu.a("selectWorld.edit.backupCreated", $$0.f());
         wu $$7 = wu.a("selectWorld.edit.backupSize", axz.c((double)$$1 / 1048576.0));
         fde.Q().aA().a(new fhm(fhm.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
