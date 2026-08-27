import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fes<B extends fmi.a<?>> extends fau {
   private static final ur r = ur.c("gui.abuseReport.report_sent_msg");
   private static final ur t = ur.c("gui.abuseReport.sending.title").a(n.r);
   private static final ur u = ur.c("gui.abuseReport.sent.title").a(n.r);
   private static final ur v = ur.c("gui.abuseReport.error.title").a(n.r);
   private static final ur w = ur.c("gui.abuseReport.send.generic_error");
   protected static final ur a = ur.c("gui.abuseReport.send");
   protected static final ur b = ur.c("gui.abuseReport.observed_what");
   protected static final ur c = ur.c("gui.abuseReport.select_reason");
   private static final ur x = ur.c("gui.abuseReport.describe");
   protected static final ur k = ur.c("gui.abuseReport.more_comments");
   private static final ur y = ur.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final fau o;
   protected final fmm p;
   protected B q;

   protected fes(ur $$0, fau $$1, fmm $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected evr a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      evr $$4 = new evr(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void l() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(fab.a(t, uq.e, () -> {
            this.f.a(this);
            $$1.cancel(true);
         }));
         $$1.handleAsync(($$0x, $$1x) -> {
            if ($$1x == null) {
               this.C();
            } else {
               if ($$1x instanceof CancellationException) {
                  return null;
               }

               this.a($$1x);
            }

            return null;
         }, this.f);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void C() {
      this.E();
      this.f.a(fab.a(u, r, uq.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      ur $$2;
      if ($$0.getCause() instanceof vr $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(ur $$0) {
      ur $$1 = $$0.f().a(n.m);
      this.f.a(fab.a(v, $$1, uq.k, () -> this.f.a(this)));
   }

   void D() {
      if (this.q.b()) {
         this.p.a(this.q.e().b());
      }
   }

   void E() {
      this.p.a(null);
   }

   @Override
   public void aF_() {
      if (this.q.b()) {
         this.f.a(new fes.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void aG_() {
      this.D();
      super.aG_();
   }

   class a extends fdx {
      private static final int c = 20;
      private static final ur k = ur.c("gui.abuseReport.discard.title").a(n.r);
      private static final ur l = ur.c("gui.abuseReport.discard.content");
      private static final ur m = ur.c("gui.abuseReport.discard.return");
      private static final ur n = ur.c("gui.abuseReport.discard.draft");
      private static final ur o = ur.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(euz.a(m, $$0x -> this.aF_()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(euz.a(n, $$0x -> {
            fes.this.D();
            this.f.a(fes.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(euz.a(o, $$0x -> {
            fes.this.E();
            this.f.a(fes.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void aF_() {
         this.f.a(fes.this);
      }

      @Override
      public boolean aE_() {
         return false;
      }

      @Override
      protected void c(euo $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
