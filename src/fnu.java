import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fnu<B extends fvu.a<?>> extends fjx {
   private static final wi v = wi.c("gui.abuseReport.report_sent_msg");
   private static final wi w = wi.c("gui.abuseReport.sending.title").a(n.r);
   private static final wi x = wi.c("gui.abuseReport.sent.title").a(n.r);
   private static final wi y = wi.c("gui.abuseReport.error.title").a(n.r);
   private static final wi z = wi.c("gui.abuseReport.send.generic_error");
   protected static final wi a = wi.c("gui.abuseReport.send");
   protected static final wi b = wi.c("gui.abuseReport.observed_what");
   protected static final wi c = wi.c("gui.abuseReport.select_reason");
   private static final wi A = wi.c("gui.abuseReport.describe");
   protected static final wi d = wi.c("gui.abuseReport.more_comments");
   private static final wi B = wi.c("gui.abuseReport.comments");
   protected static final int o = 20;
   protected static final int p = 280;
   protected static final int q = 8;
   private static final Logger C = LogUtils.getLogger();
   protected final fjx r;
   protected final fvy s;
   protected B u;

   protected fnu(wi $$0, fjx $$1, fvy $$2, B $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   protected feq a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.s.a().b();
      feq $$4 = new feq(this.m, 0, 0, $$0, $$1, A, B);
      $$4.a(this.u.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void m() {
      this.u.a(this.s).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.s.a().a($$0.a(), $$0.b(), $$0.c());
         this.j.a(fje.a(w, wh.e, () -> {
            this.j.a(this);
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
         }, this.j);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void C() {
      this.E();
      this.j.a(fje.a(x, v, wh.d, () -> this.j.a(null)));
   }

   private void a(Throwable $$0) {
      C.error("Encountered error while sending abuse report", $$0);
      wi $$2;
      if ($$0.getCause() instanceof xi $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = z;
      }

      this.a($$2);
   }

   private void a(wi $$0) {
      wi $$1 = $$0.f().a(n.m);
      this.j.a(fje.a(y, $$1, wh.k, () -> this.j.a(this)));
   }

   void D() {
      if (this.u.b()) {
         this.s.a(this.u.e().b());
      }
   }

   void E() {
      this.s.a(null);
   }

   @Override
   public void d() {
      if (this.u.b()) {
         this.j.a(new fnu.a());
      } else {
         this.j.a(this.r);
      }
   }

   @Override
   public void j() {
      this.D();
      super.j();
   }

   class a extends fmz {
      private static final wi c = wi.c("gui.abuseReport.discard.title").a(n.r);
      private static final wi d = wi.c("gui.abuseReport.discard.content");
      private static final wi o = wi.c("gui.abuseReport.discard.return");
      private static final wi p = wi.c("gui.abuseReport.discard.draft");
      private static final wi q = wi.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fhm m() {
         fhp $$0 = fhp.d().a(8);
         $$0.c().b();
         fhp $$1 = $$0.a(fhp.e().a(8));
         $$1.a(fdy.a(o, $$0x -> this.d()).a());
         $$1.a(fdy.a(p, $$0x -> {
            fnu.this.D();
            this.j.a(fnu.this.r);
         }).a());
         $$0.a(fdy.a(q, $$0x -> {
            fnu.this.E();
            this.j.a(fnu.this.r);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.j.a(fnu.this);
      }

      @Override
      public boolean aD_() {
         return false;
      }
   }
}
