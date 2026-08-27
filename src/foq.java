import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class foq<B extends fwq.a<?>> extends fkt {
   private static final ws y = ws.c("gui.abuseReport.report_sent_msg");
   private static final ws z = ws.c("gui.abuseReport.sending.title").a(n.r);
   private static final ws A = ws.c("gui.abuseReport.sent.title").a(n.r);
   private static final ws B = ws.c("gui.abuseReport.error.title").a(n.r);
   private static final ws C = ws.c("gui.abuseReport.send.generic_error");
   protected static final ws a = ws.c("gui.abuseReport.send");
   protected static final ws b = ws.c("gui.abuseReport.observed_what");
   protected static final ws c = ws.c("gui.abuseReport.select_reason");
   private static final ws D = ws.c("gui.abuseReport.describe");
   protected static final ws d = ws.c("gui.abuseReport.more_comments");
   private static final ws E = ws.c("gui.abuseReport.comments");
   protected static final int r = 20;
   protected static final int s = 280;
   protected static final int u = 8;
   private static final Logger F = LogUtils.getLogger();
   protected final fkt v;
   protected final fwu w;
   protected B x;

   protected foq(ws $$0, fkt $$1, fwu $$2, B $$3) {
      super($$0);
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
   }

   protected ffm a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.w.a().b();
      ffm $$4 = new ffm(this.p, 0, 0, $$0, $$1, D, E);
      $$4.a(this.x.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void m() {
      this.x.a(this.w).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.w.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fka.a(z, wr.e, () -> {
            this.m.a(this);
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
         }, this.m);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void C() {
      this.E();
      this.m.a(fka.a(A, y, wr.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      F.error("Encountered error while sending abuse report", $$0);
      ws $$2;
      if ($$0.getCause() instanceof xs $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = C;
      }

      this.a($$2);
   }

   private void a(ws $$0) {
      ws $$1 = $$0.f().a(n.m);
      this.m.a(fka.a(B, $$1, wr.k, () -> this.m.a(this)));
   }

   void D() {
      if (this.x.b()) {
         this.w.a(this.x.e().b());
      }
   }

   void E() {
      this.w.a(null);
   }

   @Override
   public void d() {
      if (this.x.b()) {
         this.m.a(new foq.a());
      } else {
         this.m.a(this.v);
      }
   }

   @Override
   public void j() {
      this.D();
      super.j();
   }

   class a extends fnv {
      private static final ws c = ws.c("gui.abuseReport.discard.title").a(n.r);
      private static final ws d = ws.c("gui.abuseReport.discard.content");
      private static final ws r = ws.c("gui.abuseReport.discard.return");
      private static final ws s = ws.c("gui.abuseReport.discard.draft");
      private static final ws u = ws.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fii m() {
         fil $$0 = fil.d().a(8);
         $$0.c().b();
         fil $$1 = $$0.a(fil.e().a(8));
         $$1.a(feu.a(r, $$0x -> this.d()).a());
         $$1.a(feu.a(s, $$0x -> {
            foq.this.D();
            this.m.a(foq.this.v);
         }).a());
         $$0.a(feu.a(u, $$0x -> {
            foq.this.E();
            this.m.a(foq.this.v);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.m.a(foq.this);
      }

      @Override
      public boolean aD_() {
         return false;
      }
   }
}
