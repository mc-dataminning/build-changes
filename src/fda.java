import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fda<B extends fkq.a<?>> extends ezd {
   private static final ui s = ui.c("gui.abuseReport.report_sent_msg");
   private static final ui t = ui.c("gui.abuseReport.sending.title").a(n.r);
   private static final ui u = ui.c("gui.abuseReport.sent.title").a(n.r);
   private static final ui v = ui.c("gui.abuseReport.error.title").a(n.r);
   private static final ui w = ui.c("gui.abuseReport.send.generic_error");
   protected static final ui a = ui.c("gui.abuseReport.send");
   protected static final ui b = ui.c("gui.abuseReport.observed_what");
   protected static final ui c = ui.c("gui.abuseReport.select_reason");
   private static final ui x = ui.c("gui.abuseReport.describe");
   protected static final ui k = ui.c("gui.abuseReport.more_comments");
   private static final ui y = ui.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final ezd o;
   protected final fku p;
   protected B q;

   protected fda(ui $$0, ezd $$1, fku $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected eub a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      eub $$4 = new eub(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void l() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(eyl.a(t, uh.e, () -> {
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
      this.f.a(eyl.a(u, s, uh.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      ui $$2;
      if ($$0.getCause() instanceof vi $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(ui $$0) {
      ui $$1 = $$0.f().a(n.m);
      this.f.a(eyl.a(v, $$1, uh.k, () -> this.f.a(this)));
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
   public void aC_() {
      if (this.q.b()) {
         this.f.a(new fda.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void aD_() {
      this.D();
      super.aD_();
   }

   class a extends fcf {
      private static final int c = 20;
      private static final ui k = ui.c("gui.abuseReport.discard.title").a(n.r);
      private static final ui l = ui.c("gui.abuseReport.discard.content");
      private static final ui m = ui.c("gui.abuseReport.discard.return");
      private static final ui n = ui.c("gui.abuseReport.discard.draft");
      private static final ui o = ui.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.d(etj.a(m, $$0x -> this.aC_()).a(this.g / 2 - 155, 100 + $$0).a());
         this.d(etj.a(n, $$0x -> {
            fda.this.D();
            this.f.a(fda.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.d(etj.a(o, $$0x -> {
            fda.this.E();
            this.f.a(fda.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void aC_() {
         this.f.a(fda.this);
      }

      @Override
      public boolean aB_() {
         return false;
      }

      @Override
      protected void c(esy $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
