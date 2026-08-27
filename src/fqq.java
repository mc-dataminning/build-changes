import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fqq extends flz {
   private static final Logger a = LogUtils.getLogger();
   private static final wx b = wx.c("selectWorld.enterName").a(n.h);
   private static final wx c = wx.c("selectWorld.edit.resetIcon");
   private static final wx d = wx.c("selectWorld.edit.openFolder");
   private static final wx r = wx.c("selectWorld.edit.backup");
   private static final wx s = wx.c("selectWorld.edit.backupFolder");
   private static final wx u = wx.c("selectWorld.edit.optimize");
   private static final wx v = wx.c("optimizeWorld.confirm.title");
   private static final wx w = wx.c("optimizeWorld.confirm.description");
   private static final wx x = wx.c("selectWorld.edit.save");
   private static final int y = 200;
   private static final int z = 4;
   private static final int A = 98;
   private final fjr B = fjr.d().a(5);
   private final BooleanConsumer C;
   private final eox.c D;
   private final fgj E;

   public static fqq a(feb $$0, eox.c $$1, BooleanConsumer $$2) throws IOException {
      eoy $$3 = $$1.a($$1.h());
      return new fqq($$0, $$1, $$3.b(), $$2);
   }

   private fqq(feb $$0, eox.c $$1, String $$2, BooleanConsumer $$3) {
      super(wx.c("selectWorld.edit.title"));
      this.C = $$3;
      this.D = $$1;
      ffl $$4 = $$0.h;
      this.B.a(new fjs(200, 20));
      this.B.a(new fhh(b, $$4));
      this.E = this.B.a(new fgj($$4, 200, 20, b));
      this.E.a($$2);
      fjr $$5 = fjr.e().a(4);
      fga $$6 = $$5.a(fga.a(x, $$0x -> this.a(this.E.a())).a(98).a());
      $$5.a(fga.a(ww.e, $$0x -> this.d()).a(98).a());
      this.E.b($$1x -> $$6.j = !aza.h($$1x));
      this.B.a(fga.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.B.a(fga.a(d, $$1x -> ac.k().a($$1.a(eov.l).toFile())).a(200).a());
      this.B.a(fga.a(r, $$1x -> {
         boolean $$2x = a($$1);
         this.C.accept(!$$2x);
      }).a(200).a());
      this.B.a(fga.a(s, $$1x -> {
         eox $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.k().a($$3x.toFile());
      }).a(200).a());
      this.B.a(fga.a(u, $$2x -> $$0.a(new fkm(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fqs.a($$0, this.C, $$0.as(), $$1, $$3x));
         }, v, w, true))).a(200).a());
      this.B.a(new fjs(200, 20));
      this.B.a($$5);
      this.B.a($$1x -> {
         ffy var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aD_() {
      this.b(this.E);
   }

   @Override
   protected void aN_() {
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      fjl.a(this.B, this.G());
   }

   @Override
   public void d() {
      this.C.accept(false);
   }

   private void a(String $$0) {
      try {
         this.D.a($$0);
      } catch (uo | uu | IOException var3) {
         a.error("Failed to access world '{}'", this.D.f(), var3);
         fii.a(this.m, this.D.f());
      }

      this.C.accept(true);
   }

   public static boolean a(eox.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         wx $$4 = wx.c("selectWorld.edit.backupFailed");
         wx $$5 = wx.b($$2.getMessage());
         feb.Q().ax().a(new fii(fii.a.b, $$4, $$5));
         return false;
      } else {
         wx $$6 = wx.a("selectWorld.edit.backupCreated", $$0.f());
         wx $$7 = wx.a("selectWorld.edit.backupSize", ayf.c((double)$$1 / 1048576.0));
         feb.Q().ax().a(new fii(fii.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
