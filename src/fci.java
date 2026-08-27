import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fci<B extends fjx.a<?>> extends eym {
   private static final tn s = tn.c("gui.abuseReport.report_sent_msg");
   private static final tn t = tn.c("gui.abuseReport.sending.title").a(n.r);
   private static final tn u = tn.c("gui.abuseReport.sent.title").a(n.r);
   private static final tn v = tn.c("gui.abuseReport.error.title").a(n.r);
   private static final tn w = tn.c("gui.abuseReport.send.generic_error");
   protected static final tn a = tn.c("gui.abuseReport.send");
   protected static final tn b = tn.c("gui.abuseReport.observed_what");
   protected static final tn c = tn.c("gui.abuseReport.select_reason");
   private static final tn x = tn.c("gui.abuseReport.describe");
   protected static final tn k = tn.c("gui.abuseReport.more_comments");
   private static final tn y = tn.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final eym o;
   protected final fkb p;
   protected B q;

   protected fci(tn $$0, eym $$1, fkb $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected etk a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      etk $$4 = new etk(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void l() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(ext.a(t, tm.e, () -> {
            this.f.a(this);
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
         }, this.f);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void D() {
      this.F();
      this.f.a(ext.a(u, s, tm.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      tn $$2;
      if ($$0.getCause() instanceof um $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(tn $$0) {
      tn $$1 = $$0.e().a(n.m);
      this.f.a(ext.a(v, $$1, tm.k, () -> this.f.a(this)));
   }

   void E() {
      if (this.q.b()) {
         this.p.a(this.q.e().b());
      }
   }

   void F() {
      this.p.a(null);
   }

   @Override
   public void az_() {
      if (this.q.b()) {
         this.f.a(new fci.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void h() {
      this.E();
      super.h();
   }

   class a extends fbn {
      private static final int c = 20;
      private static final tn k = tn.c("gui.abuseReport.discard.title").a(n.r);
      private static final tn l = tn.c("gui.abuseReport.discard.content");
      private static final tn m = tn.c("gui.abuseReport.discard.return");
      private static final tn n = tn.c("gui.abuseReport.discard.draft");
      private static final tn o = tn.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(ess.a(m, $$0x -> this.az_()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(ess.a(n, $$0x -> {
            fci.this.E();
            this.f.a(fci.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(ess.a(o, $$0x -> {
            fci.this.F();
            this.f.a(fci.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void az_() {
         this.f.a(fci.this);
      }

      @Override
      public boolean ay_() {
         return false;
      }

      @Override
      protected void c(esh $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
