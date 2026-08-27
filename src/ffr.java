import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class ffr extends faz {
   private static final Logger a = LogUtils.getLogger();
   private static final uv b = uv.c("selectWorld.enterName").a(n.h);
   private static final uv c = uv.c("selectWorld.edit.resetIcon");
   private static final uv k = uv.c("selectWorld.edit.openFolder");
   private static final uv l = uv.c("selectWorld.edit.backup");
   private static final uv m = uv.c("selectWorld.edit.backupFolder");
   private static final uv n = uv.c("selectWorld.edit.optimize");
   private static final uv o = uv.c("optimizeWorld.confirm.title");
   private static final uv p = uv.c("optimizeWorld.confirm.description");
   private static final uv q = uv.c("selectWorld.edit.save");
   private static final int r = 200;
   private static final int t = 4;
   private static final int u = 98;
   private final eys v = eys.d().a(5);
   private final BooleanConsumer w;
   private final ees.c x;

   public static ffr a(eti $$0, ees.c $$1, BooleanConsumer $$2) throws IOException {
      eet $$3 = $$1.a($$1.f());
      return new ffr($$0, $$1, $$3.b(), $$2);
   }

   private ffr(eti $$0, ees.c $$1, String $$2, BooleanConsumer $$3) {
      super(uv.c("selectWorld.edit.title"));
      this.w = $$3;
      this.x = $$1;
      eur $$4 = $$0.h;
      this.v.a(new eyt(200, 20));
      this.v.a(new ewl(b, $$4));
      evn $$5 = this.v.a(new evn($$4, 200, 20, b));
      $$5.a($$2);
      eys $$6 = eys.e().a(4);
      eve $$7 = $$6.a(eve.a(q, $$1x -> this.a($$5.a())).a(98).a());
      $$6.a(eve.a(uu.e, $$0x -> this.aG_()).a(98).a());
      $$5.b($$1x -> $$7.i = !ac.b($$1x));
      this.v.a(eve.a(c, $$1x -> {
         $$1.h().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.i = false;
      }).a(200).a()).i = $$1.h().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.v.a(eve.a(k, $$1x -> ac.i().a($$1.a(eeq.l).toFile())).a(200).a());
      this.v.a(eve.a(l, $$1x -> {
         boolean $$2x = a($$1);
         this.w.accept(!$$2x);
      }).a(200).a());
      this.v.a(eve.a(m, $$1x -> {
         ees $$2x = $$0.l();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.i().a($$3x.toFile());
      }).a(200).a());
      this.v.a(eve.a(n, $$2x -> $$0.a(new ezn(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fft.a($$0, this.w, $$0.aq(), $$1, $$3x));
         }, o, p, true))).a(200).a());
      this.v.a(new eyt(200, 20));
      this.v.a($$6);
      this.c($$5);
      this.v.a($$1x -> {
         evc var10000 = this.d($$1x);
      });
   }

   @Override
   protected void aQ_() {
      this.c();
   }

   @Override
   protected void c() {
      this.v.a();
      eym.a(this.v, this.s());
   }

   @Override
   public void aG_() {
      this.w.accept(false);
   }

   private void a(String $$0) {
      try {
         this.x.a($$0);
      } catch (so | su | IOException var3) {
         a.error("Failed to access world '{}'", this.x.d(), var3);
         exl.a(this.f, this.x.d());
      }

      this.w.accept(true);
   }

   public static boolean a(ees.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.j();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         uv $$4 = uv.c("selectWorld.edit.backupFailed");
         uv $$5 = uv.b($$2.getMessage());
         eti.N().ax().a(new exl(exl.a.c, $$4, $$5));
         return false;
      } else {
         uv $$6 = uv.a("selectWorld.edit.backupCreated", $$0.d());
         uv $$7 = uv.a("selectWorld.edit.backupSize", atq.c((double)$$1 / 1048576.0));
         eti.N().ax().a(new exl(exl.a.c, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
