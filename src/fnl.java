import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fnl<B extends fvl.a<?>> extends fjo {
   private static final wg v = wg.c("gui.abuseReport.report_sent_msg");
   private static final wg w = wg.c("gui.abuseReport.sending.title").a(n.r);
   private static final wg x = wg.c("gui.abuseReport.sent.title").a(n.r);
   private static final wg y = wg.c("gui.abuseReport.error.title").a(n.r);
   private static final wg z = wg.c("gui.abuseReport.send.generic_error");
   protected static final wg a = wg.c("gui.abuseReport.send");
   protected static final wg b = wg.c("gui.abuseReport.observed_what");
   protected static final wg c = wg.c("gui.abuseReport.select_reason");
   private static final wg A = wg.c("gui.abuseReport.describe");
   protected static final wg d = wg.c("gui.abuseReport.more_comments");
   private static final wg B = wg.c("gui.abuseReport.comments");
   protected static final int o = 20;
   protected static final int p = 280;
   protected static final int q = 8;
   private static final Logger C = LogUtils.getLogger();
   protected final fjo r;
   protected final fvp s;
   protected B u;

   protected fnl(wg $$0, fjo $$1, fvp $$2, B $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   protected feh a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.s.a().b();
      feh $$4 = new feh(this.m, 0, 0, $$0, $$1, A, B);
      $$4.a(this.u.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void m() {
      this.u.a(this.s).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.s.a().a($$0.a(), $$0.b(), $$0.c());
         this.j.a(fiv.a(w, wf.e, () -> {
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
      this.j.a(fiv.a(x, v, wf.d, () -> this.j.a(null)));
   }

   private void a(Throwable $$0) {
      C.error("Encountered error while sending abuse report", $$0);
      wg $$2;
      if ($$0.getCause() instanceof xg $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = z;
      }

      this.a($$2);
   }

   private void a(wg $$0) {
      wg $$1 = $$0.f().a(n.m);
      this.j.a(fiv.a(y, $$1, wf.k, () -> this.j.a(this)));
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
         this.j.a(new fnl.a());
      } else {
         this.j.a(this.r);
      }
   }

   @Override
   public void j() {
      this.D();
      super.j();
   }

   class a extends fmq {
      private static final wg c = wg.c("gui.abuseReport.discard.title").a(n.r);
      private static final wg d = wg.c("gui.abuseReport.discard.content");
      private static final wg o = wg.c("gui.abuseReport.discard.return");
      private static final wg p = wg.c("gui.abuseReport.discard.draft");
      private static final wg q = wg.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fhd m() {
         fhg $$0 = fhg.d().a(8);
         $$0.c().b();
         fhg $$1 = $$0.a(fhg.e().a(8));
         $$1.a(fdp.a(o, $$0x -> this.d()).a());
         $$1.a(fdp.a(p, $$0x -> {
            fnl.this.D();
            this.j.a(fnl.this.r);
         }).a());
         $$0.a(fdp.a(q, $$0x -> {
            fnl.this.E();
            this.j.a(fnl.this.r);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.j.a(fnl.this);
      }

      @Override
      public boolean aE_() {
         return false;
      }
   }
}
