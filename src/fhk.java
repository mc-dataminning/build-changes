import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fhk<B extends fpe.a<?>> extends fdm {
   private static final vg r = vg.c("gui.abuseReport.report_sent_msg");
   private static final vg t = vg.c("gui.abuseReport.sending.title").a(n.r);
   private static final vg u = vg.c("gui.abuseReport.sent.title").a(n.r);
   private static final vg v = vg.c("gui.abuseReport.error.title").a(n.r);
   private static final vg w = vg.c("gui.abuseReport.send.generic_error");
   protected static final vg a = vg.c("gui.abuseReport.send");
   protected static final vg b = vg.c("gui.abuseReport.observed_what");
   protected static final vg c = vg.c("gui.abuseReport.select_reason");
   private static final vg x = vg.c("gui.abuseReport.describe");
   protected static final vg k = vg.c("gui.abuseReport.more_comments");
   private static final vg y = vg.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final fdm o;
   protected final fpi p;
   protected B q;

   protected fhk(vg $$0, fdm $$1, fpi $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected eyj a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      eyj $$4 = new eyj(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void o() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(fct.a(t, vf.e, () -> {
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
      this.f.a(fct.a(u, r, vf.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      vg $$2;
      if ($$0.getCause() instanceof wg $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(vg $$0) {
      vg $$1 = $$0.f().a(n.m);
      this.f.a(fct.a(v, $$1, vf.k, () -> this.f.a(this)));
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
         this.f.a(new fhk.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void k() {
      this.H();
      super.k();
   }

   class a extends fgp {
      private static final int c = 20;
      private static final vg k = vg.c("gui.abuseReport.discard.title").a(n.r);
      private static final vg l = vg.c("gui.abuseReport.discard.content");
      private static final vg m = vg.c("gui.abuseReport.discard.return");
      private static final vg n = vg.c("gui.abuseReport.discard.draft");
      private static final vg o = vg.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(exr.a(m, $$0x -> this.d()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(exr.a(n, $$0x -> {
            fhk.this.H();
            this.f.a(fhk.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(exr.a(o, $$0x -> {
            fhk.this.I();
            this.f.a(fhk.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void d() {
         this.f.a(fhk.this);
      }

      @Override
      public boolean aN_() {
         return false;
      }

      @Override
      protected void c(exe $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
