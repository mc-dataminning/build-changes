import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fbw<B extends fjl.a<?>> extends eya {
   private static final tf s = tf.c("gui.abuseReport.report_sent_msg");
   private static final tf t = tf.c("gui.abuseReport.sending.title").a(n.r);
   private static final tf u = tf.c("gui.abuseReport.sent.title").a(n.r);
   private static final tf v = tf.c("gui.abuseReport.error.title").a(n.r);
   private static final tf w = tf.c("gui.abuseReport.send.generic_error");
   protected static final tf a = tf.c("gui.abuseReport.send");
   protected static final tf b = tf.c("gui.abuseReport.observed_what");
   protected static final tf c = tf.c("gui.abuseReport.select_reason");
   private static final tf x = tf.c("gui.abuseReport.describe");
   protected static final tf k = tf.c("gui.abuseReport.more_comments");
   private static final tf y = tf.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final eya o;
   protected final fjp p;
   protected B q;

   protected fbw(tf $$0, eya $$1, fjp $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected esy a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      esy $$4 = new esy(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void l() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(exh.a(t, te.e, () -> {
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
      this.f.a(exh.a(u, s, te.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      tf $$2;
      if ($$0.getCause() instanceof ue $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(tf $$0) {
      tf $$1 = $$0.e().a(n.m);
      this.f.a(exh.a(v, $$1, te.k, () -> this.f.a(this)));
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
   public void at_() {
      if (this.q.b()) {
         this.f.a(new fbw.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void h() {
      this.D();
      super.h();
   }

   class a extends fbb {
      private static final int c = 20;
      private static final tf k = tf.c("gui.abuseReport.discard.title").a(n.r);
      private static final tf l = tf.c("gui.abuseReport.discard.content");
      private static final tf m = tf.c("gui.abuseReport.discard.return");
      private static final tf n = tf.c("gui.abuseReport.discard.draft");
      private static final tf o = tf.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(esg.a(m, $$0x -> this.at_()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(esg.a(n, $$0x -> {
            fbw.this.D();
            this.f.a(fbw.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(esg.a(o, $$0x -> {
            fbw.this.E();
            this.f.a(fbw.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void at_() {
         this.f.a(fbw.this);
      }

      @Override
      public boolean ay_() {
         return false;
      }

      @Override
      protected void c(erv $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
