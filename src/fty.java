import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fty<B extends gcb.a<?>> extends fpt {
   private static final xd C = xd.c("gui.abuseReport.report_sent_msg");
   private static final xd D = xd.c("gui.abuseReport.sending.title").a(n.r);
   private static final xd E = xd.c("gui.abuseReport.sent.title").a(n.r);
   private static final xd F = xd.c("gui.abuseReport.error.title").a(n.r);
   private static final xd G = xd.c("gui.abuseReport.send.generic_error");
   protected static final xd a = xd.c("gui.abuseReport.send");
   protected static final xd b = xd.c("gui.abuseReport.observed_what");
   protected static final xd c = xd.c("gui.abuseReport.select_reason");
   private static final xd H = xd.c("gui.abuseReport.describe");
   protected static final xd d = xd.c("gui.abuseReport.more_comments");
   private static final xd I = xd.c("gui.abuseReport.comments");
   private static final xd J = xd.c("gui.abuseReport.attestation");
   protected static final int s = 120;
   protected static final int u = 20;
   protected static final int v = 280;
   protected static final int w = 8;
   private static final Logger K = LogUtils.getLogger();
   protected final fpt x;
   protected final gcf y;
   protected final fns z = fns.d().a(8);
   protected B A;
   private fkc L;
   protected fka B;

   protected fty(xd $$0, fpt $$1, gcf $$2, B $$3) {
      super($$0);
      this.x = $$1;
      this.y = $$2;
      this.A = $$3;
   }

   protected fks a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.y.a().b();
      fks $$4 = new fks(this.p, 0, 0, $$0, $$1, H, I);
      $$4.a(this.A.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aT_() {
      this.z.c().b();
      this.m();
      this.D();
      this.E();
      this.F();
      this.z.a($$1 -> {
         fjy var10000 = this.c($$1);
      });
      this.c();
   }

   protected void m() {
      this.z.a(new flh(this.l, this.p));
   }

   protected abstract void D();

   protected void E() {
      this.L = this.z.a(fkc.a(J, this.p).a(this.A.h()).a(280).a(($$0x, $$1) -> {
         this.A.a($$1);
         this.F();
      }).a());
      fns $$0 = this.z.a(fns.e().a(8));
      $$0.a(fka.a(xc.k, $$0x -> this.d()).a(120).a());
      this.B = $$0.a(fka.a(a, $$0x -> this.G()).a(120).a());
   }

   protected void F() {
      gcb.b $$0 = this.A.c();
      this.B.j = $$0 == null && this.L.a();
      this.B.a(x.a($$0, gcb.b::a));
   }

   @Override
   protected void c() {
      this.z.a();
      fnm.a(this.z, this.H());
   }

   protected void G() {
      this.A.a(this.y).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.y.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fpf.a(D, xc.e, () -> {
            this.m.a(this);
            $$1.cancel(true);
         }));
         $$1.handleAsync(($$0x, $$1x) -> {
            if ($$1x == null) {
               this.J();
            } else {
               if ($$1x instanceof CancellationException) {
                  return null;
               }

               this.a($$1x);
            }

            return null;
         }, this.m);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void J() {
      this.L();
      this.m.a(fpf.a(E, C, xc.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      K.error("Encountered error while sending abuse report", $$0);
      xd $$2;
      if ($$0.getCause() instanceof yd $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = G;
      }

      this.a($$2);
   }

   private void a(xd $$0) {
      xd $$1 = $$0.f().a(n.m);
      this.m.a(fpf.a(F, $$1, xc.k, () -> this.m.a(this)));
   }

   void K() {
      if (this.A.b()) {
         this.y.a(this.A.e().b());
      }
   }

   void L() {
      this.y.a(null);
   }

   @Override
   public void d() {
      if (this.A.b()) {
         this.m.a(new fty.a());
      } else {
         this.m.a(this.x);
      }
   }

   @Override
   public void j() {
      this.K();
      super.j();
   }

   class a extends fsn {
      private static final xd c = xd.c("gui.abuseReport.discard.title").a(n.r);
      private static final xd d = xd.c("gui.abuseReport.discard.content");
      private static final xd s = xd.c("gui.abuseReport.discard.return");
      private static final xd u = xd.c("gui.abuseReport.discard.draft");
      private static final xd v = xd.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fnp m() {
         fns $$0 = fns.d().a(8);
         $$0.c().b();
         fns $$1 = $$0.a(fns.e().a(8));
         $$1.a(fka.a(s, $$0x -> this.d()).a());
         $$1.a(fka.a(u, $$0x -> {
            fty.this.K();
            this.m.a(fty.this.x);
         }).a());
         $$0.a(fka.a(v, $$0x -> {
            fty.this.L();
            this.m.a(fty.this.x);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.m.a(fty.this);
      }

      @Override
      public boolean aJ_() {
         return false;
      }
   }
}
