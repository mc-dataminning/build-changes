import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fqv<B extends fyu.a<?>> extends fmy {
   private static final xl y = xl.c("gui.abuseReport.report_sent_msg");
   private static final xl z = xl.c("gui.abuseReport.sending.title").a(n.r);
   private static final xl A = xl.c("gui.abuseReport.sent.title").a(n.r);
   private static final xl B = xl.c("gui.abuseReport.error.title").a(n.r);
   private static final xl C = xl.c("gui.abuseReport.send.generic_error");
   protected static final xl a = xl.c("gui.abuseReport.send");
   protected static final xl b = xl.c("gui.abuseReport.observed_what");
   protected static final xl c = xl.c("gui.abuseReport.select_reason");
   private static final xl D = xl.c("gui.abuseReport.describe");
   protected static final xl d = xl.c("gui.abuseReport.more_comments");
   private static final xl E = xl.c("gui.abuseReport.comments");
   protected static final int r = 20;
   protected static final int s = 280;
   protected static final int u = 8;
   private static final Logger F = LogUtils.getLogger();
   protected final fmy v;
   protected final fyy w;
   protected B x;

   protected fqv(xl $$0, fmy $$1, fyy $$2, B $$3) {
      super($$0);
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
   }

   protected fhr a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.w.a().b();
      fhr $$4 = new fhr(this.p, 0, 0, $$0, $$1, D, E);
      $$4.a(this.x.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void m() {
      this.x.a(this.w).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.w.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fmf.a(z, xk.e, () -> {
            this.m.a(this);
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
         }, this.m);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void C() {
      this.E();
      this.m.a(fmf.a(A, y, xk.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      F.error("Encountered error while sending abuse report", $$0);
      xl $$2;
      if ($$0.getCause() instanceof yl $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = C;
      }

      this.a($$2);
   }

   private void a(xl $$0) {
      xl $$1 = $$0.f().a(n.m);
      this.m.a(fmf.a(B, $$1, xk.k, () -> this.m.a(this)));
   }

   void D() {
      if (this.x.b()) {
         this.w.a(this.x.e().b());
      }
   }

   void E() {
      this.w.a(null);
   }

   @Override
   public void d() {
      if (this.x.b()) {
         this.m.a(new fqv.a());
      } else {
         this.m.a(this.v);
      }
   }

   @Override
   public void j() {
      this.D();
      super.j();
   }

   class a extends fqa {
      private static final xl c = xl.c("gui.abuseReport.discard.title").a(n.r);
      private static final xl d = xl.c("gui.abuseReport.discard.content");
      private static final xl r = xl.c("gui.abuseReport.discard.return");
      private static final xl s = xl.c("gui.abuseReport.discard.draft");
      private static final xl u = xl.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fkn m() {
         fkq $$0 = fkq.d().a(8);
         $$0.c().b();
         fkq $$1 = $$0.a(fkq.e().a(8));
         $$1.a(fgz.a(r, $$0x -> this.d()).a());
         $$1.a(fgz.a(s, $$0x -> {
            fqv.this.D();
            this.m.a(fqv.this.v);
         }).a());
         $$0.a(fgz.a(u, $$0x -> {
            fqv.this.E();
            this.m.a(fqv.this.v);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.m.a(fqv.this);
      }

      @Override
      public boolean aE_() {
         return false;
      }
   }
}
