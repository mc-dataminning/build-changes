import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fgx<B extends fop.a<?>> extends fcz {
   private static final vf r = vf.c("gui.abuseReport.report_sent_msg");
   private static final vf t = vf.c("gui.abuseReport.sending.title").a(n.r);
   private static final vf u = vf.c("gui.abuseReport.sent.title").a(n.r);
   private static final vf v = vf.c("gui.abuseReport.error.title").a(n.r);
   private static final vf w = vf.c("gui.abuseReport.send.generic_error");
   protected static final vf a = vf.c("gui.abuseReport.send");
   protected static final vf b = vf.c("gui.abuseReport.observed_what");
   protected static final vf c = vf.c("gui.abuseReport.select_reason");
   private static final vf x = vf.c("gui.abuseReport.describe");
   protected static final vf k = vf.c("gui.abuseReport.more_comments");
   private static final vf y = vf.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final fcz o;
   protected final fou p;
   protected B q;

   protected fgx(vf $$0, fcz $$1, fou $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected exw a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      exw $$4 = new exw(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void n() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(fcg.a(t, ve.e, () -> {
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
      this.f.a(fcg.a(u, r, ve.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      vf $$2;
      if ($$0.getCause() instanceof wf $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(vf $$0) {
      vf $$1 = $$0.f().a(n.m);
      this.f.a(fcg.a(v, $$1, ve.k, () -> this.f.a(this)));
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
         this.f.a(new fgx.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void j() {
      this.D();
      super.j();
   }

   class a extends fgc {
      private static final int c = 20;
      private static final vf k = vf.c("gui.abuseReport.discard.title").a(n.r);
      private static final vf l = vf.c("gui.abuseReport.discard.content");
      private static final vf m = vf.c("gui.abuseReport.discard.return");
      private static final vf n = vf.c("gui.abuseReport.discard.draft");
      private static final vf o = vf.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(exe.a(m, $$0x -> this.aE_()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(exe.a(n, $$0x -> {
            fgx.this.D();
            this.f.a(fgx.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(exe.a(o, $$0x -> {
            fgx.this.E();
            this.f.a(fgx.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void aE_() {
         this.f.a(fgx.this);
      }

      @Override
      public boolean aL_() {
         return false;
      }

      @Override
      protected void c(ews $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
