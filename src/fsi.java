import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fsi<B extends gai.a<?>> extends fob {
   private static final wz z = wz.c("gui.abuseReport.report_sent_msg");
   private static final wz A = wz.c("gui.abuseReport.sending.title").a(n.r);
   private static final wz B = wz.c("gui.abuseReport.sent.title").a(n.r);
   private static final wz C = wz.c("gui.abuseReport.error.title").a(n.r);
   private static final wz D = wz.c("gui.abuseReport.send.generic_error");
   protected static final wz a = wz.c("gui.abuseReport.send");
   protected static final wz b = wz.c("gui.abuseReport.observed_what");
   protected static final wz c = wz.c("gui.abuseReport.select_reason");
   private static final wz E = wz.c("gui.abuseReport.describe");
   protected static final wz r = wz.c("gui.abuseReport.more_comments");
   private static final wz F = wz.c("gui.abuseReport.comments");
   protected static final int s = 20;
   protected static final int u = 280;
   protected static final int v = 8;
   private static final Logger G = LogUtils.getLogger();
   protected final fob w;
   protected final gam x;
   protected B y;

   protected fsi(wz $$0, fob $$1, gam $$2, B $$3) {
      super($$0);
      this.w = $$1;
      this.x = $$2;
      this.y = $$3;
   }

   protected fjc a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.x.a().b();
      fjc $$4 = new fjc(this.o, 0, 0, $$0, $$1, E, F);
      $$4.a(this.y.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void m() {
      this.y.a(this.x).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.x.a().a($$0.a(), $$0.b(), $$0.c());
         this.l.a(fnn.a(A, wy.e, () -> {
            this.l.a(this);
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
         }, this.l);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void C() {
      this.E();
      this.l.a(fnn.a(B, z, wy.d, () -> this.l.a(null)));
   }

   private void a(Throwable $$0) {
      G.error("Encountered error while sending abuse report", $$0);
      wz $$2;
      if ($$0.getCause() instanceof xz $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = D;
      }

      this.a($$2);
   }

   private void a(wz $$0) {
      wz $$1 = $$0.f().a(n.m);
      this.l.a(fnn.a(C, $$1, wy.k, () -> this.l.a(this)));
   }

   void D() {
      if (this.y.b()) {
         this.x.a(this.y.e().b());
      }
   }

   void E() {
      this.x.a(null);
   }

   @Override
   public void d() {
      if (this.y.b()) {
         this.l.a(new fsi.a());
      } else {
         this.l.a(this.w);
      }
   }

   @Override
   public void j() {
      this.D();
      super.j();
   }

   class a extends fqw {
      private static final wz c = wz.c("gui.abuseReport.discard.title").a(n.r);
      private static final wz r = wz.c("gui.abuseReport.discard.content");
      private static final wz s = wz.c("gui.abuseReport.discard.return");
      private static final wz u = wz.c("gui.abuseReport.discard.draft");
      private static final wz v = wz.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, r, r);
      }

      @Override
      protected fly m() {
         fmb $$0 = fmb.d().a(8);
         $$0.c().b();
         fmb $$1 = $$0.a(fmb.e().a(8));
         $$1.a(fik.a(s, $$0x -> this.d()).a());
         $$1.a(fik.a(u, $$0x -> {
            fsi.this.D();
            this.l.a(fsi.this.w);
         }).a());
         $$0.a(fik.a(v, $$0x -> {
            fsi.this.E();
            this.l.a(fsi.this.w);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.l.a(fsi.this);
      }

      @Override
      public boolean aJ_() {
         return false;
      }
   }
}
