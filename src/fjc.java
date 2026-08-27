import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fjc<B extends fqx.a<?>> extends ffe {
   private static final vq r = vq.c("gui.abuseReport.report_sent_msg");
   private static final vq t = vq.c("gui.abuseReport.sending.title").a(n.r);
   private static final vq u = vq.c("gui.abuseReport.sent.title").a(n.r);
   private static final vq v = vq.c("gui.abuseReport.error.title").a(n.r);
   private static final vq w = vq.c("gui.abuseReport.send.generic_error");
   protected static final vq a = vq.c("gui.abuseReport.send");
   protected static final vq b = vq.c("gui.abuseReport.observed_what");
   protected static final vq c = vq.c("gui.abuseReport.select_reason");
   private static final vq x = vq.c("gui.abuseReport.describe");
   protected static final vq k = vq.c("gui.abuseReport.more_comments");
   private static final vq y = vq.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final ffe o;
   protected final frb p;
   protected B q;

   protected fjc(vq $$0, ffe $$1, frb $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected ezz a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      ezz $$4 = new ezz(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void o() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(fel.a(t, vp.e, () -> {
            this.f.a(this);
            $$1.cancel(true);
         }));
         $$1.handleAsync(($$0x, $$1x) -> {
            if ($$1x == null) {
               this.E();
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

   private void E() {
      this.I();
      this.f.a(fel.a(u, r, vp.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      vq $$2;
      if ($$0.getCause() instanceof wq $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(vq $$0) {
      vq $$1 = $$0.f().a(n.m);
      this.f.a(fel.a(v, $$1, vp.k, () -> this.f.a(this)));
   }

   void H() {
      if (this.q.b()) {
         this.p.a(this.q.e().b());
      }
   }

   void I() {
      this.p.a(null);
   }

   @Override
   public void d() {
      if (this.q.b()) {
         this.f.a(new fjc.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void k() {
      this.H();
      super.k();
   }

   class a extends fih {
      private static final int c = 20;
      private static final vq k = vq.c("gui.abuseReport.discard.title").a(n.r);
      private static final vq l = vq.c("gui.abuseReport.discard.content");
      private static final vq m = vq.c("gui.abuseReport.discard.return");
      private static final vq n = vq.c("gui.abuseReport.discard.draft");
      private static final vq o = vq.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(ezh.a(m, $$0x -> this.d()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(ezh.a(n, $$0x -> {
            fjc.this.H();
            this.f.a(fjc.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(ezh.a(o, $$0x -> {
            fjc.this.I();
            this.f.a(fjc.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void d() {
         this.f.a(fjc.this);
      }

      @Override
      public boolean aO_() {
         return false;
      }

      @Override
      protected void c(eyu $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
