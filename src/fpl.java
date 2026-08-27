import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fpl extends fkt {
   private static final Logger a = LogUtils.getLogger();
   private static final ws b = ws.c("selectWorld.enterName").a(n.h);
   private static final ws c = ws.c("selectWorld.edit.resetIcon");
   private static final ws d = ws.c("selectWorld.edit.openFolder");
   private static final ws r = ws.c("selectWorld.edit.backup");
   private static final ws s = ws.c("selectWorld.edit.backupFolder");
   private static final ws u = ws.c("selectWorld.edit.optimize");
   private static final ws v = ws.c("optimizeWorld.confirm.title");
   private static final ws w = ws.c("optimizeWorld.confirm.description");
   private static final ws x = ws.c("selectWorld.edit.save");
   private static final int y = 200;
   private static final int z = 4;
   private static final int A = 98;
   private final fil B = fil.d().a(5);
   private final BooleanConsumer C;
   private final enq.c D;
   private final ffd E;

   public static fpl a(fcu $$0, enq.c $$1, BooleanConsumer $$2) throws IOException {
      enr $$3 = $$1.a($$1.h());
      return new fpl($$0, $$1, $$3.b(), $$2);
   }

   private fpl(fcu $$0, enq.c $$1, String $$2, BooleanConsumer $$3) {
      super(ws.c("selectWorld.edit.title"));
      this.C = $$3;
      this.D = $$1;
      fef $$4 = $$0.h;
      this.B.a(new fim(200, 20));
      this.B.a(new fgb(b, $$4));
      this.E = this.B.a(new ffd($$4, 200, 20, b));
      this.E.a($$2);
      fil $$5 = fil.e().a(4);
      feu $$6 = $$5.a(feu.a(x, $$0x -> this.a(this.E.a())).a(98).a());
      $$5.a(feu.a(wr.e, $$0x -> this.d()).a(98).a());
      this.E.b($$1x -> $$6.j = !ayr.h($$1x));
      this.B.a(feu.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.B.a(feu.a(d, $$1x -> ac.j().a($$1.a(eno.l).toFile())).a(200).a());
      this.B.a(feu.a(r, $$1x -> {
         boolean $$2x = a($$1);
         this.C.accept(!$$2x);
      }).a(200).a());
      this.B.a(feu.a(s, $$1x -> {
         enq $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.j().a($$3x.toFile());
      }).a(200).a());
      this.B.a(feu.a(u, $$2x -> $$0.a(new fjg(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fpn.a($$0, this.C, $$0.at(), $$1, $$3x));
         }, v, w, true))).a(200).a());
      this.B.a(new fim(200, 20));
      this.B.a($$5);
      this.B.a($$1x -> {
         fes var10000 = this.c($$1x);
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
      fif.a(this.B, this.G());
   }

   @Override
   public void d() {
      this.C.accept(false);
   }

   private void a(String $$0) {
      try {
         this.D.a($$0);
      } catch (uj | up | IOException var3) {
         a.error("Failed to access world '{}'", this.D.f(), var3);
         fhc.a(this.m, this.D.f());
      }

      this.C.accept(true);
   }

   public static boolean a(enq.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         ws $$4 = ws.c("selectWorld.edit.backupFailed");
         ws $$5 = ws.b($$2.getMessage());
         fcu.Q().aA().a(new fhc(fhc.a.b, $$4, $$5));
         return false;
      } else {
         ws $$6 = ws.a("selectWorld.edit.backupCreated", $$0.f());
         ws $$7 = ws.a("selectWorld.edit.backupSize", axw.c((double)$$1 / 1048576.0));
         fcu.Q().aA().a(new fhc(fhc.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
