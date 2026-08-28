import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fra<B extends fyz.a<?>> extends fnd {
   private static final xp y = xp.c("gui.abuseReport.report_sent_msg");
   private static final xp z = xp.c("gui.abuseReport.sending.title").a(n.r);
   private static final xp A = xp.c("gui.abuseReport.sent.title").a(n.r);
   private static final xp B = xp.c("gui.abuseReport.error.title").a(n.r);
   private static final xp C = xp.c("gui.abuseReport.send.generic_error");
   protected static final xp a = xp.c("gui.abuseReport.send");
   protected static final xp b = xp.c("gui.abuseReport.observed_what");
   protected static final xp c = xp.c("gui.abuseReport.select_reason");
   private static final xp D = xp.c("gui.abuseReport.describe");
   protected static final xp d = xp.c("gui.abuseReport.more_comments");
   private static final xp E = xp.c("gui.abuseReport.comments");
   protected static final int r = 20;
   protected static final int s = 280;
   protected static final int u = 8;
   private static final Logger F = LogUtils.getLogger();
   protected final fnd v;
   protected final fzd w;
   protected B x;

   protected fra(xp $$0, fnd $$1, fzd $$2, B $$3) {
      super($$0);
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
   }

   protected fhw a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.w.a().b();
      fhw $$4 = new fhw(this.p, 0, 0, $$0, $$1, D, E);
      $$4.a(this.x.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void m() {
      this.x.a(this.w).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.w.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fmk.a(z, xo.e, () -> {
            this.m.a(this);
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
         }, this.m);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void E() {
      this.I();
      this.m.a(fmk.a(A, y, xo.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      F.error("Encountered error while sending abuse report", $$0);
      xp $$2;
      if ($$0.getCause() instanceof yp $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = C;
      }

      this.a($$2);
   }

   private void a(xp $$0) {
      xp $$1 = $$0.f().a(n.m);
      this.m.a(fmk.a(B, $$1, xo.k, () -> this.m.a(this)));
   }

   void F() {
      if (this.x.b()) {
         this.w.a(this.x.e().b());
      }
   }

   void I() {
      this.w.a(null);
   }

   @Override
   public void d() {
      if (this.x.b()) {
         this.m.a(new fra.a());
      } else {
         this.m.a(this.v);
      }
   }

   @Override
   public void j() {
      this.F();
      super.j();
   }

   class a extends fqf {
      private static final xp c = xp.c("gui.abuseReport.discard.title").a(n.r);
      private static final xp d = xp.c("gui.abuseReport.discard.content");
      private static final xp r = xp.c("gui.abuseReport.discard.return");
      private static final xp s = xp.c("gui.abuseReport.discard.draft");
      private static final xp u = xp.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fks m() {
         fkv $$0 = fkv.d().a(8);
         $$0.c().b();
         fkv $$1 = $$0.a(fkv.e().a(8));
         $$1.a(fhe.a(r, $$0x -> this.d()).a());
         $$1.a(fhe.a(s, $$0x -> {
            fra.this.F();
            this.m.a(fra.this.v);
         }).a());
         $$0.a(fhe.a(u, $$0x -> {
            fra.this.I();
            this.m.a(fra.this.v);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.m.a(fra.this);
      }

      @Override
      public boolean aC_() {
         return false;
      }
   }
}
