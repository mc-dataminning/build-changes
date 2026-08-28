import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fqy<B extends fyx.a<?>> extends fnb {
   private static final xo y = xo.c("gui.abuseReport.report_sent_msg");
   private static final xo z = xo.c("gui.abuseReport.sending.title").a(n.r);
   private static final xo A = xo.c("gui.abuseReport.sent.title").a(n.r);
   private static final xo B = xo.c("gui.abuseReport.error.title").a(n.r);
   private static final xo C = xo.c("gui.abuseReport.send.generic_error");
   protected static final xo a = xo.c("gui.abuseReport.send");
   protected static final xo b = xo.c("gui.abuseReport.observed_what");
   protected static final xo c = xo.c("gui.abuseReport.select_reason");
   private static final xo D = xo.c("gui.abuseReport.describe");
   protected static final xo d = xo.c("gui.abuseReport.more_comments");
   private static final xo E = xo.c("gui.abuseReport.comments");
   protected static final int r = 20;
   protected static final int s = 280;
   protected static final int u = 8;
   private static final Logger F = LogUtils.getLogger();
   protected final fnb v;
   protected final fzb w;
   protected B x;

   protected fqy(xo $$0, fnb $$1, fzb $$2, B $$3) {
      super($$0);
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
   }

   protected fhu a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.w.a().b();
      fhu $$4 = new fhu(this.p, 0, 0, $$0, $$1, D, E);
      $$4.a(this.x.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void m() {
      this.x.a(this.w).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.w.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fmi.a(z, xn.e, () -> {
            this.m.a(this);
            $$1.cancel(true);
         }));
         $$1.handleAsync(($$0x, $$1x) -> {
            if ($$1x == null) {
               this.D();
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

   private void D() {
      this.F();
      this.m.a(fmi.a(A, y, xn.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      F.error("Encountered error while sending abuse report", $$0);
      xo $$2;
      if ($$0.getCause() instanceof yo $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = C;
      }

      this.a($$2);
   }

   private void a(xo $$0) {
      xo $$1 = $$0.f().a(n.m);
      this.m.a(fmi.a(B, $$1, xn.k, () -> this.m.a(this)));
   }

   void E() {
      if (this.x.b()) {
         this.w.a(this.x.e().b());
      }
   }

   void F() {
      this.w.a(null);
   }

   @Override
   public void d() {
      if (this.x.b()) {
         this.m.a(new fqy.a());
      } else {
         this.m.a(this.v);
      }
   }

   @Override
   public void j() {
      this.E();
      super.j();
   }

   class a extends fqd {
      private static final xo c = xo.c("gui.abuseReport.discard.title").a(n.r);
      private static final xo d = xo.c("gui.abuseReport.discard.content");
      private static final xo r = xo.c("gui.abuseReport.discard.return");
      private static final xo s = xo.c("gui.abuseReport.discard.draft");
      private static final xo u = xo.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fkq m() {
         fkt $$0 = fkt.d().a(8);
         $$0.c().b();
         fkt $$1 = $$0.a(fkt.e().a(8));
         $$1.a(fhc.a(r, $$0x -> this.d()).a());
         $$1.a(fhc.a(s, $$0x -> {
            fqy.this.E();
            this.m.a(fqy.this.v);
         }).a());
         $$0.a(fhc.a(u, $$0x -> {
            fqy.this.F();
            this.m.a(fqy.this.v);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.m.a(fqy.this);
      }

      @Override
      public boolean aD_() {
         return false;
      }
   }
}
