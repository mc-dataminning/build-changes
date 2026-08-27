import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fga<B extends fns.a<?>> extends fcc {
   private static final vb r = vb.c("gui.abuseReport.report_sent_msg");
   private static final vb t = vb.c("gui.abuseReport.sending.title").a(n.r);
   private static final vb u = vb.c("gui.abuseReport.sent.title").a(n.r);
   private static final vb v = vb.c("gui.abuseReport.error.title").a(n.r);
   private static final vb w = vb.c("gui.abuseReport.send.generic_error");
   protected static final vb a = vb.c("gui.abuseReport.send");
   protected static final vb b = vb.c("gui.abuseReport.observed_what");
   protected static final vb c = vb.c("gui.abuseReport.select_reason");
   private static final vb x = vb.c("gui.abuseReport.describe");
   protected static final vb k = vb.c("gui.abuseReport.more_comments");
   private static final vb y = vb.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final fcc o;
   protected final fnw p;
   protected B q;

   protected fga(vb $$0, fcc $$1, fnw $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected ewz a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      ewz $$4 = new ewz(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void l() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(fbj.a(t, va.e, () -> {
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
      this.f.a(fbj.a(u, r, va.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      vb $$2;
      if ($$0.getCause() instanceof wb $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(vb $$0) {
      vb $$1 = $$0.f().a(n.m);
      this.f.a(fbj.a(v, $$1, va.k, () -> this.f.a(this)));
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
   public void aF_() {
      if (this.q.b()) {
         this.f.a(new fga.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void aG_() {
      this.D();
      super.aG_();
   }

   class a extends fff {
      private static final int c = 20;
      private static final vb k = vb.c("gui.abuseReport.discard.title").a(n.r);
      private static final vb l = vb.c("gui.abuseReport.discard.content");
      private static final vb m = vb.c("gui.abuseReport.discard.return");
      private static final vb n = vb.c("gui.abuseReport.discard.draft");
      private static final vb o = vb.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(ewh.a(m, $$0x -> this.aF_()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(ewh.a(n, $$0x -> {
            fga.this.D();
            this.f.a(fga.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(ewh.a(o, $$0x -> {
            fga.this.E();
            this.f.a(fga.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void aF_() {
         this.f.a(fga.this);
      }

      @Override
      public boolean aE_() {
         return false;
      }

      @Override
      protected void c(evw $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
