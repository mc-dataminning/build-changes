import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fkz extends fgh {
   private static final Logger a = LogUtils.getLogger();
   private static final vs b = vs.c("selectWorld.enterName").a(n.h);
   private static final vs c = vs.c("selectWorld.edit.resetIcon");
   private static final vs k = vs.c("selectWorld.edit.openFolder");
   private static final vs l = vs.c("selectWorld.edit.backup");
   private static final vs m = vs.c("selectWorld.edit.backupFolder");
   private static final vs n = vs.c("selectWorld.edit.optimize");
   private static final vs o = vs.c("optimizeWorld.confirm.title");
   private static final vs p = vs.c("optimizeWorld.confirm.description");
   private static final vs q = vs.c("selectWorld.edit.save");
   private static final int r = 200;
   private static final int t = 4;
   private static final int u = 98;
   private final fea v = fea.d().a(5);
   private final BooleanConsumer w;
   private final ejo.c x;
   private final fat y;

   public static fkz a(eyk $$0, ejo.c $$1, BooleanConsumer $$2) throws IOException {
      ejp $$3 = $$1.a($$1.f());
      return new fkz($$0, $$1, $$3.b(), $$2);
   }

   private fkz(eyk $$0, ejo.c $$1, String $$2, BooleanConsumer $$3) {
      super(vs.c("selectWorld.edit.title"));
      this.w = $$3;
      this.x = $$1;
      ezv $$4 = $$0.h;
      this.v.a(new feb(200, 20));
      this.v.a(new fbr(b, $$4));
      this.y = this.v.a(new fat($$4, 200, 20, b));
      this.y.a($$2);
      fea $$5 = fea.e().a(4);
      fak $$6 = $$5.a(fak.a(q, $$0x -> this.a(this.y.a())).a(98).a());
      $$5.a(fak.a(vr.e, $$0x -> this.d()).a(98).a());
      this.y.b($$1x -> $$6.j = !ac.b($$1x));
      this.v.a(fak.a(c, $$1x -> {
         $$1.h().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.h().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.v.a(fak.a(k, $$1x -> ac.j().a($$1.a(ejm.l).toFile())).a(200).a());
      this.v.a(fak.a(l, $$1x -> {
         boolean $$2x = a($$1);
         this.w.accept(!$$2x);
      }).a(200).a());
      this.v.a(fak.a(m, $$1x -> {
         ejo $$2x = $$0.l();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.j().a($$3x.toFile());
      }).a(200).a());
      this.v.a(fak.a(n, $$2x -> $$0.a(new fev(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(flb.a($$0, this.w, $$0.as(), $$1, $$3x));
         }, o, p, true))).a(200).a());
      this.v.a(new feb(200, 20));
      this.v.a($$5);
      this.v.a($$1x -> {
         fai var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aG_() {
      this.b(this.y);
   }

   @Override
   protected void aP_() {
      this.c();
   }

   @Override
   protected void c() {
      this.v.a();
      fdu.a(this.v, this.F());
   }

   @Override
   public void d() {
      this.w.accept(false);
   }

   private void a(String $$0) {
      try {
         this.x.a($$0);
      } catch (tj | tp | IOException var3) {
         a.error("Failed to access world '{}'", this.x.d(), var3);
         fcs.a(this.f, this.x.d());
      }

      this.w.accept(true);
   }

   public static boolean a(ejo.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.j();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         vs $$4 = vs.c("selectWorld.edit.backupFailed");
         vs $$5 = vs.b($$2.getMessage());
         eyk.P().ax().a(new fcs(fcs.a.b, $$4, $$5));
         return false;
      } else {
         vs $$6 = vs.a("selectWorld.edit.backupCreated", $$0.d());
         vs $$7 = vs.a("selectWorld.edit.backupSize", awm.c((double)$$1 / 1048576.0));
         eyk.P().ax().a(new fcs(fcs.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
