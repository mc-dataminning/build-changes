import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fgr<B extends foj.a<?>> extends fct {
   private static final vd r = vd.c("gui.abuseReport.report_sent_msg");
   private static final vd t = vd.c("gui.abuseReport.sending.title").a(n.r);
   private static final vd u = vd.c("gui.abuseReport.sent.title").a(n.r);
   private static final vd v = vd.c("gui.abuseReport.error.title").a(n.r);
   private static final vd w = vd.c("gui.abuseReport.send.generic_error");
   protected static final vd a = vd.c("gui.abuseReport.send");
   protected static final vd b = vd.c("gui.abuseReport.observed_what");
   protected static final vd c = vd.c("gui.abuseReport.select_reason");
   private static final vd x = vd.c("gui.abuseReport.describe");
   protected static final vd k = vd.c("gui.abuseReport.more_comments");
   private static final vd y = vd.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final fct o;
   protected final fon p;
   protected B q;

   protected fgr(vd $$0, fct $$1, fon $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected exq a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      exq $$4 = new exq(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void n() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(fca.a(t, vc.e, () -> {
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
      this.f.a(fca.a(u, r, vc.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      vd $$2;
      if ($$0.getCause() instanceof wd $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(vd $$0) {
      vd $$1 = $$0.f().a(n.m);
      this.f.a(fca.a(v, $$1, vc.k, () -> this.f.a(this)));
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
   public void aE_() {
      if (this.q.b()) {
         this.f.a(new fgr.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void j() {
      this.D();
      super.j();
   }

   class a extends ffw {
      private static final int c = 20;
      private static final vd k = vd.c("gui.abuseReport.discard.title").a(n.r);
      private static final vd l = vd.c("gui.abuseReport.discard.content");
      private static final vd m = vd.c("gui.abuseReport.discard.return");
      private static final vd n = vd.c("gui.abuseReport.discard.draft");
      private static final vd o = vd.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(ewy.a(m, $$0x -> this.aE_()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(ewy.a(n, $$0x -> {
            fgr.this.D();
            this.f.a(fgr.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(ewy.a(o, $$0x -> {
            fgr.this.E();
            this.f.a(fgr.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void aE_() {
         this.f.a(fgr.this);
      }

      @Override
      public boolean aL_() {
         return false;
      }

      @Override
      protected void c(ewm $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
