import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fcg<B extends fjv.a<?>> extends eyk {
   private static final tl s = tl.c("gui.abuseReport.report_sent_msg");
   private static final tl t = tl.c("gui.abuseReport.sending.title").a(n.r);
   private static final tl u = tl.c("gui.abuseReport.sent.title").a(n.r);
   private static final tl v = tl.c("gui.abuseReport.error.title").a(n.r);
   private static final tl w = tl.c("gui.abuseReport.send.generic_error");
   protected static final tl a = tl.c("gui.abuseReport.send");
   protected static final tl b = tl.c("gui.abuseReport.observed_what");
   protected static final tl c = tl.c("gui.abuseReport.select_reason");
   private static final tl x = tl.c("gui.abuseReport.describe");
   protected static final tl k = tl.c("gui.abuseReport.more_comments");
   private static final tl y = tl.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final eyk o;
   protected final fjz p;
   protected B q;

   protected fcg(tl $$0, eyk $$1, fjz $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected eti a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      eti $$4 = new eti(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void l() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(exr.a(t, tk.e, () -> {
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
      this.f.a(exr.a(u, s, tk.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      tl $$2;
      if ($$0.getCause() instanceof uk $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(tl $$0) {
      tl $$1 = $$0.e().a(n.m);
      this.f.a(exr.a(v, $$1, tk.k, () -> this.f.a(this)));
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
   public void az_() {
      if (this.q.b()) {
         this.f.a(new fcg.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void aA_() {
      this.D();
      super.aA_();
   }

   class a extends fbl {
      private static final int c = 20;
      private static final tl k = tl.c("gui.abuseReport.discard.title").a(n.r);
      private static final tl l = tl.c("gui.abuseReport.discard.content");
      private static final tl m = tl.c("gui.abuseReport.discard.return");
      private static final tl n = tl.c("gui.abuseReport.discard.draft");
      private static final tl o = tl.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(esq.a(m, $$0x -> this.az_()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(esq.a(n, $$0x -> {
            fcg.this.D();
            this.f.a(fcg.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(esq.a(o, $$0x -> {
            fcg.this.E();
            this.f.a(fcg.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void az_() {
         this.f.a(fcg.this);
      }

      @Override
      public boolean ay_() {
         return false;
      }

      @Override
      protected void c(esf $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
