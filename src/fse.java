import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fse<B extends gae.a<?>> extends fnx {
   private static final wy y = wy.c("gui.abuseReport.report_sent_msg");
   private static final wy z = wy.c("gui.abuseReport.sending.title").a(n.r);
   private static final wy A = wy.c("gui.abuseReport.sent.title").a(n.r);
   private static final wy B = wy.c("gui.abuseReport.error.title").a(n.r);
   private static final wy C = wy.c("gui.abuseReport.send.generic_error");
   protected static final wy a = wy.c("gui.abuseReport.send");
   protected static final wy b = wy.c("gui.abuseReport.observed_what");
   protected static final wy c = wy.c("gui.abuseReport.select_reason");
   private static final wy D = wy.c("gui.abuseReport.describe");
   protected static final wy q = wy.c("gui.abuseReport.more_comments");
   private static final wy E = wy.c("gui.abuseReport.comments");
   protected static final int r = 20;
   protected static final int s = 280;
   protected static final int u = 8;
   private static final Logger F = LogUtils.getLogger();
   protected final fnx v;
   protected final gai w;
   protected B x;

   protected fse(wy $$0, fnx $$1, gai $$2, B $$3) {
      super($$0);
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
   }

   protected fiy a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.w.a().b();
      fiy $$4 = new fiy(this.o, 0, 0, $$0, $$1, D, E);
      $$4.a(this.x.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void m() {
      this.x.a(this.w).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.w.a().a($$0.a(), $$0.b(), $$0.c());
         this.l.a(fnj.a(z, wx.e, () -> {
            this.l.a(this);
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
         }, this.l);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void D() {
      this.F();
      this.l.a(fnj.a(A, y, wx.d, () -> this.l.a(null)));
   }

   private void a(Throwable $$0) {
      F.error("Encountered error while sending abuse report", $$0);
      wy $$2;
      if ($$0.getCause() instanceof xy $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = C;
      }

      this.a($$2);
   }

   private void a(wy $$0) {
      wy $$1 = $$0.f().a(n.m);
      this.l.a(fnj.a(B, $$1, wx.k, () -> this.l.a(this)));
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
         this.l.a(new fse.a());
      } else {
         this.l.a(this.v);
      }
   }

   @Override
   public void j() {
      this.E();
      super.j();
   }

   class a extends fqs {
      private static final wy c = wy.c("gui.abuseReport.discard.title").a(n.r);
      private static final wy q = wy.c("gui.abuseReport.discard.content");
      private static final wy r = wy.c("gui.abuseReport.discard.return");
      private static final wy s = wy.c("gui.abuseReport.discard.draft");
      private static final wy u = wy.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, q, q);
      }

      @Override
      protected flu m() {
         flx $$0 = flx.d().a(8);
         $$0.c().b();
         flx $$1 = $$0.a(flx.e().a(8));
         $$1.a(fig.a(r, $$0x -> this.d()).a());
         $$1.a(fig.a(s, $$0x -> {
            fse.this.E();
            this.l.a(fse.this.v);
         }).a());
         $$0.a(fig.a(u, $$0x -> {
            fse.this.F();
            this.l.a(fse.this.v);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.l.a(fse.this);
      }

      @Override
      public boolean aF_() {
         return false;
      }
   }
}
