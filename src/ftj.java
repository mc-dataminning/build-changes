import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class ftj extends fon {
   private static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("selectWorld.enterName").a(n.h);
   private static final xe c = xe.c("selectWorld.edit.resetIcon");
   private static final xe d = xe.c("selectWorld.edit.openFolder");
   private static final xe r = xe.c("selectWorld.edit.backup");
   private static final xe s = xe.c("selectWorld.edit.backupFolder");
   private static final xe u = xe.c("selectWorld.edit.optimize");
   private static final xe v = xe.c("optimizeWorld.confirm.title");
   private static final xe w = xe.c("optimizeWorld.confirm.description");
   private static final xe x = xe.c("selectWorld.edit.save");
   private static final int y = 200;
   private static final int z = 4;
   private static final int A = 98;
   private final fme B = fme.d().a(5);
   private final BooleanConsumer C;
   private final erf.c D;
   private final fiw E;

   public static ftj a(fgj $$0, erf.c $$1, BooleanConsumer $$2) throws IOException {
      erg $$3 = $$1.a($$1.h());
      return new ftj($$0, $$1, $$3.b(), $$2);
   }

   private ftj(fgj $$0, erf.c $$1, String $$2, BooleanConsumer $$3) {
      super(xe.c("selectWorld.edit.title"));
      this.C = $$3;
      this.D = $$1;
      fhy $$4 = $$0.h;
      this.B.a(new fmf(200, 20));
      this.B.a(new fju(b, $$4));
      this.E = this.B.a(new fiw($$4, 200, 20, b));
      this.E.a($$2);
      fme $$5 = fme.e().a(4);
      fin $$6 = $$5.a(fin.a(x, $$0x -> this.a(this.E.a())).a(98).a());
      $$5.a(fin.a(xd.e, $$0x -> this.d()).a(98).a());
      this.E.b($$1x -> $$6.j = !azh.h($$1x));
      this.B.a(fin.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.B.a(fin.a(d, $$1x -> ad.j().a($$1.a(erd.l).toFile())).a(200).a());
      this.B.a(fin.a(r, $$1x -> {
         boolean $$2x = a($$1);
         this.C.accept(!$$2x);
      }).a(200).a());
      this.B.a(fin.a(s, $$1x -> {
         erf $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ad.j().a($$3x.toFile());
      }).a(200).a());
      this.B.a(fin.a(u, $$2x -> $$0.a(new fmz(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(ftl.a($$0, this.C, $$0.at(), $$1, $$3x));
         }, v, w, true))).a(200).a());
      this.B.a(new fmf(200, 20));
      this.B.a($$5);
      this.B.a($$1x -> {
         fil var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aC_() {
      this.b(this.E);
   }

   @Override
   protected void aN_() {
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      fly.a(this.B, this.G());
   }

   @Override
   public void d() {
      this.C.accept(false);
   }

   private void a(String $$0) {
      try {
         this.D.a($$0);
      } catch (uv | vb | IOException var3) {
         a.error("Failed to access world '{}'", this.D.f(), var3);
         fkv.a(this.m, this.D.f());
      }

      this.C.accept(true);
   }

   public static boolean a(erf.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xe $$4 = xe.c("selectWorld.edit.backupFailed");
         xe $$5 = xe.b($$2.getMessage());
         fgj.Q().aA().a(new fkv(fkv.a.b, $$4, $$5));
         return false;
      } else {
         xe $$6 = xe.a("selectWorld.edit.backupCreated", $$0.f());
         xe $$7 = xe.a("selectWorld.edit.backupSize", aym.c((double)$$1 / 1048576.0));
         fgj.Q().aA().a(new fkv(fkv.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
