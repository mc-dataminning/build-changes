import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fex<B extends fmn.a<?>> extends faz {
   private static final uv r = uv.c("gui.abuseReport.report_sent_msg");
   private static final uv t = uv.c("gui.abuseReport.sending.title").a(n.r);
   private static final uv u = uv.c("gui.abuseReport.sent.title").a(n.r);
   private static final uv v = uv.c("gui.abuseReport.error.title").a(n.r);
   private static final uv w = uv.c("gui.abuseReport.send.generic_error");
   protected static final uv a = uv.c("gui.abuseReport.send");
   protected static final uv b = uv.c("gui.abuseReport.observed_what");
   protected static final uv c = uv.c("gui.abuseReport.select_reason");
   private static final uv x = uv.c("gui.abuseReport.describe");
   protected static final uv k = uv.c("gui.abuseReport.more_comments");
   private static final uv y = uv.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final faz o;
   protected final fmr p;
   protected B q;

   protected fex(uv $$0, faz $$1, fmr $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected evw a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      evw $$4 = new evw(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void l() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(fag.a(t, uu.e, () -> {
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
      this.f.a(fag.a(u, r, uu.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      uv $$2;
      if ($$0.getCause() instanceof vv $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(uv $$0) {
      uv $$1 = $$0.f().a(n.m);
      this.f.a(fag.a(v, $$1, uu.k, () -> this.f.a(this)));
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
   public void aG_() {
      if (this.q.b()) {
         this.f.a(new fex.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void aH_() {
      this.D();
      super.aH_();
   }

   class a extends fec {
      private static final int c = 20;
      private static final uv k = uv.c("gui.abuseReport.discard.title").a(n.r);
      private static final uv l = uv.c("gui.abuseReport.discard.content");
      private static final uv m = uv.c("gui.abuseReport.discard.return");
      private static final uv n = uv.c("gui.abuseReport.discard.draft");
      private static final uv o = uv.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(eve.a(m, $$0x -> this.aG_()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(eve.a(n, $$0x -> {
            fex.this.D();
            this.f.a(fex.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(eve.a(o, $$0x -> {
            fex.this.E();
            this.f.a(fex.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void aG_() {
         this.f.a(fex.this);
      }

      @Override
      public boolean aF_() {
         return false;
      }

      @Override
      protected void c(eut $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
