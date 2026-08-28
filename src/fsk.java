import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fsk<B extends gak.a<?>> extends fod {
   private static final wz C = wz.c("gui.abuseReport.report_sent_msg");
   private static final wz D = wz.c("gui.abuseReport.sending.title").a(n.r);
   private static final wz E = wz.c("gui.abuseReport.sent.title").a(n.r);
   private static final wz F = wz.c("gui.abuseReport.error.title").a(n.r);
   private static final wz G = wz.c("gui.abuseReport.send.generic_error");
   protected static final wz a = wz.c("gui.abuseReport.send");
   protected static final wz b = wz.c("gui.abuseReport.observed_what");
   protected static final wz c = wz.c("gui.abuseReport.select_reason");
   private static final wz H = wz.c("gui.abuseReport.describe");
   protected static final wz r = wz.c("gui.abuseReport.more_comments");
   private static final wz I = wz.c("gui.abuseReport.comments");
   private static final wz J = wz.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final fod x;
   protected final gao y;
   protected final fmd z = fmd.d().a(8);
   protected B A;
   private fio L;
   protected fim B;

   protected fsk(wz $$0, fod $$1, gao $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected fje a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      fje $$4 = new fje(this.o, 0, 0, $$0, $$1, H, I);
      $$4.a(this.A.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aT_() {
      this.z.c().b();
      this.m();
      this.C();
      this.D();
      this.E();
      this.z.a($$1 -> {
         fik var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new fjt(this.k, this.o));
   }

   protected abstract void C();

   protected void D() {
      this.L = this.z.a(fio.a(J, this.o).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.E();
      }).a());
      fmd $$0 = this.z.a(fmd.e().a(8));
      $$0.a(fim.a(wy.k, $$0x -> this.d()).a(120).a());
      this.B = $$0.a(fim.a(a, $$0x -> this.F()).a(120).a());
   }

   protected void E() {
      gak.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, gak.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      flx.a(this.z, this.H());
   }

   protected void F() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.l.a(fnp.a(D, wy.e, () -> {
            this.l.a(this);
            $$1.cancel(true);
         }));
         $$1.handleAsync(($$0x, $$1x) -> {
            if ($$1x == null) {
               this.G();
            } else {
               if ($$1x instanceof CancellationException) {
                  return null;
               }

               this.a($$1x);
            }

            return null;
         }, this.l);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void G() {
      this.K();
      this.l.a(fnp.a(E, C, wy.d, () -> this.l.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      wz $$2;
      if ($$0.getCause() instanceof xz $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(wz $$0) {
      wz $$1 = $$0.f().a(n.m);
      this.l.a(fnp.a(F, $$1, wy.k, () -> this.l.a(this)));
   }

   void J() {
      if (this.A.b()) {
         this.y.a(this.A.e().b());
      }
   }

   void K() {
      this.y.a(null);
   }

   @Override
   public void d() {
      if (this.A.b()) {
         this.l.a(new fsk.a());
      } else {
         this.l.a(this.x);
      }
   }

   @Override
   public void j() {
      this.J();
      super.j();
   }

   class a extends fqy {
      private static final wz c = wz.c("gui.abuseReport.discard.title").a(n.r);
      private static final wz r = wz.c("gui.abuseReport.discard.content");
      private static final wz s = wz.c("gui.abuseReport.discard.return");
      private static final wz u = wz.c("gui.abuseReport.discard.draft");
      private static final wz v = wz.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, r, r);
      }

      @Override
      protected fma m() {
         fmd $$0 = fmd.d().a(8);
         $$0.c().b();
         fmd $$1 = $$0.a(fmd.e().a(8));
         $$1.a(fim.a(s, $$0x -> this.d()).a());
         $$1.a(fim.a(u, $$0x -> {
            fsk.this.J();
            this.l.a(fsk.this.x);
         }).a());
         $$0.a(fim.a(v, $$0x -> {
            fsk.this.K();
            this.l.a(fsk.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.l.a(fsk.this);
      }

      @Override
      public boolean aJ_() {
         return false;
      }
   }
}
