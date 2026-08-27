import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fcb<B extends fjq.a<?>> extends eyf {
   private static final ti s = ti.c("gui.abuseReport.report_sent_msg");
   private static final ti t = ti.c("gui.abuseReport.sending.title").a(n.r);
   private static final ti u = ti.c("gui.abuseReport.sent.title").a(n.r);
   private static final ti v = ti.c("gui.abuseReport.error.title").a(n.r);
   private static final ti w = ti.c("gui.abuseReport.send.generic_error");
   protected static final ti a = ti.c("gui.abuseReport.send");
   protected static final ti b = ti.c("gui.abuseReport.observed_what");
   protected static final ti c = ti.c("gui.abuseReport.select_reason");
   private static final ti x = ti.c("gui.abuseReport.describe");
   protected static final ti k = ti.c("gui.abuseReport.more_comments");
   private static final ti y = ti.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final eyf o;
   protected final fju p;
   protected B q;

   protected fcb(ti $$0, eyf $$1, fju $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected etd a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      etd $$4 = new etd(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void l() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(exm.a(t, th.e, () -> {
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
      this.f.a(exm.a(u, s, th.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      ti $$2;
      if ($$0.getCause() instanceof uh $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(ti $$0) {
      ti $$1 = $$0.e().a(n.m);
      this.f.a(exm.a(v, $$1, th.k, () -> this.f.a(this)));
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
   public void au_() {
      if (this.q.b()) {
         this.f.a(new fcb.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void av_() {
      this.D();
      super.av_();
   }

   class a extends fbg {
      private static final int c = 20;
      private static final ti k = ti.c("gui.abuseReport.discard.title").a(n.r);
      private static final ti l = ti.c("gui.abuseReport.discard.content");
      private static final ti m = ti.c("gui.abuseReport.discard.return");
      private static final ti n = ti.c("gui.abuseReport.discard.draft");
      private static final ti o = ti.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(esl.a(m, $$0x -> this.au_()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(esl.a(n, $$0x -> {
            fcb.this.D();
            this.f.a(fcb.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(esl.a(o, $$0x -> {
            fcb.this.E();
            this.f.a(fcb.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void au_() {
         this.f.a(fcb.this);
      }

      @Override
      public boolean at_() {
         return false;
      }

      @Override
      protected void c(esa $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
