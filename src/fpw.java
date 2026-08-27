import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fpw<B extends fxv.a<?>> extends flz {
   private static final wx y = wx.c("gui.abuseReport.report_sent_msg");
   private static final wx z = wx.c("gui.abuseReport.sending.title").a(n.r);
   private static final wx A = wx.c("gui.abuseReport.sent.title").a(n.r);
   private static final wx B = wx.c("gui.abuseReport.error.title").a(n.r);
   private static final wx C = wx.c("gui.abuseReport.send.generic_error");
   protected static final wx a = wx.c("gui.abuseReport.send");
   protected static final wx b = wx.c("gui.abuseReport.observed_what");
   protected static final wx c = wx.c("gui.abuseReport.select_reason");
   private static final wx D = wx.c("gui.abuseReport.describe");
   protected static final wx d = wx.c("gui.abuseReport.more_comments");
   private static final wx E = wx.c("gui.abuseReport.comments");
   protected static final int r = 20;
   protected static final int s = 280;
   protected static final int u = 8;
   private static final Logger F = LogUtils.getLogger();
   protected final flz v;
   protected final fxz w;
   protected B x;

   protected fpw(wx $$0, flz $$1, fxz $$2, B $$3) {
      super($$0);
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
   }

   protected fgs a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.w.a().b();
      fgs $$4 = new fgs(this.p, 0, 0, $$0, $$1, D, E);
      $$4.a(this.x.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void m() {
      this.x.a(this.w).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.w.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(flg.a(z, ww.e, () -> {
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
      this.m.a(flg.a(A, y, ww.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      F.error("Encountered error while sending abuse report", $$0);
      wx $$2;
      if ($$0.getCause() instanceof xx $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = C;
      }

      this.a($$2);
   }

   private void a(wx $$0) {
      wx $$1 = $$0.f().a(n.m);
      this.m.a(flg.a(B, $$1, ww.k, () -> this.m.a(this)));
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
         this.m.a(new fpw.a());
      } else {
         this.m.a(this.v);
      }
   }

   @Override
   public void j() {
      this.D();
      super.j();
   }

   class a extends fpb {
      private static final wx c = wx.c("gui.abuseReport.discard.title").a(n.r);
      private static final wx d = wx.c("gui.abuseReport.discard.content");
      private static final wx r = wx.c("gui.abuseReport.discard.return");
      private static final wx s = wx.c("gui.abuseReport.discard.draft");
      private static final wx u = wx.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fjo m() {
         fjr $$0 = fjr.d().a(8);
         $$0.c().b();
         fjr $$1 = $$0.a(fjr.e().a(8));
         $$1.a(fga.a(r, $$0x -> this.d()).a());
         $$1.a(fga.a(s, $$0x -> {
            fpw.this.D();
            this.m.a(fpw.this.v);
         }).a());
         $$0.a(fga.a(u, $$0x -> {
            fpw.this.E();
            this.m.a(fpw.this.v);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.m.a(fpw.this);
      }

      @Override
      public boolean aE_() {
         return false;
      }
   }
}
