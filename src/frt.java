import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class frt extends fnc {
   private static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("selectWorld.enterName").a(n.h);
   private static final xo c = xo.c("selectWorld.edit.resetIcon");
   private static final xo d = xo.c("selectWorld.edit.openFolder");
   private static final xo r = xo.c("selectWorld.edit.backup");
   private static final xo s = xo.c("selectWorld.edit.backupFolder");
   private static final xo u = xo.c("selectWorld.edit.optimize");
   private static final xo v = xo.c("optimizeWorld.confirm.title");
   private static final xo w = xo.c("optimizeWorld.confirm.description");
   private static final xo x = xo.c("selectWorld.edit.save");
   private static final int y = 200;
   private static final int z = 4;
   private static final int A = 98;
   private final fku B = fku.d().a(5);
   private final BooleanConsumer C;
   private final epv.c D;
   private final fhm E;

   public static frt a(ffe $$0, epv.c $$1, BooleanConsumer $$2) throws IOException {
      epw $$3 = $$1.a($$1.h());
      return new frt($$0, $$1, $$3.b(), $$2);
   }

   private frt(ffe $$0, epv.c $$1, String $$2, BooleanConsumer $$3) {
      super(xo.c("selectWorld.edit.title"));
      this.C = $$3;
      this.D = $$1;
      fgo $$4 = $$0.h;
      this.B.a(new fkv(200, 20));
      this.B.a(new fik(b, $$4));
      this.E = this.B.a(new fhm($$4, 200, 20, b));
      this.E.a($$2);
      fku $$5 = fku.e().a(4);
      fhd $$6 = $$5.a(fhd.a(x, $$0x -> this.a(this.E.a())).a(98).a());
      $$5.a(fhd.a(xn.e, $$0x -> this.d()).a(98).a());
      this.E.b($$1x -> $$6.j = !azu.h($$1x));
      this.B.a(fhd.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.B.a(fhd.a(d, $$1x -> ac.k().a($$1.a(ept.l).toFile())).a(200).a());
      this.B.a(fhd.a(r, $$1x -> {
         boolean $$2x = a($$1);
         this.C.accept(!$$2x);
      }).a(200).a());
      this.B.a(fhd.a(s, $$1x -> {
         epv $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.k().a($$3x.toFile());
      }).a(200).a());
      this.B.a(fhd.a(u, $$2x -> $$0.a(new flp(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(frv.a($$0, this.C, $$0.as(), $$1, $$3x));
         }, v, w, true))).a(200).a());
      this.B.a(new fkv(200, 20));
      this.B.a($$5);
      this.B.a($$1x -> {
         fhb var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aB_() {
      this.b(this.E);
   }

   @Override
   protected void aM_() {
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      fko.a(this.B, this.G());
   }

   @Override
   public void d() {
      this.C.accept(false);
   }

   private void a(String $$0) {
      try {
         this.D.a($$0);
      } catch (vc | vi | IOException var3) {
         a.error("Failed to access world '{}'", this.D.f(), var3);
         fjl.a(this.m, this.D.f());
      }

      this.C.accept(true);
   }

   public static boolean a(epv.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xo $$4 = xo.c("selectWorld.edit.backupFailed");
         xo $$5 = xo.b($$2.getMessage());
         ffe.Q().ax().a(new fjl(fjl.a.b, $$4, $$5));
         return false;
      } else {
         xo $$6 = xo.a("selectWorld.edit.backupCreated", $$0.f());
         xo $$7 = xo.a("selectWorld.edit.backupSize", ayy.c((double)$$1 / 1048576.0));
         ffe.Q().ax().a(new fjl(fjl.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
