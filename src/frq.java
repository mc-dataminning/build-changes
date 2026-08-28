import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class frq<B extends fzq.a<?>> extends fnl {
   private static final wu y = wu.c("gui.abuseReport.report_sent_msg");
   private static final wu z = wu.c("gui.abuseReport.sending.title").a(n.r);
   private static final wu A = wu.c("gui.abuseReport.sent.title").a(n.r);
   private static final wu B = wu.c("gui.abuseReport.error.title").a(n.r);
   private static final wu C = wu.c("gui.abuseReport.send.generic_error");
   protected static final wu a = wu.c("gui.abuseReport.send");
   protected static final wu b = wu.c("gui.abuseReport.observed_what");
   protected static final wu c = wu.c("gui.abuseReport.select_reason");
   private static final wu D = wu.c("gui.abuseReport.describe");
   protected static final wu q = wu.c("gui.abuseReport.more_comments");
   private static final wu E = wu.c("gui.abuseReport.comments");
   protected static final int r = 20;
   protected static final int s = 280;
   protected static final int u = 8;
   private static final Logger F = LogUtils.getLogger();
   protected final fnl v;
   protected final fzu w;
   protected B x;

   protected frq(wu $$0, fnl $$1, fzu $$2, B $$3) {
      super($$0);
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
   }

   protected fim a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.w.a().b();
      fim $$4 = new fim(this.o, 0, 0, $$0, $$1, D, E);
      $$4.a(this.x.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void m() {
      this.x.a(this.w).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.w.a().a($$0.a(), $$0.b(), $$0.c());
         this.l.a(fmx.a(z, wt.e, () -> {
            this.l.a(this);
            $$1.cancel(true);
         }));
         $$1.handleAsync(($$0x, $$1x) -> {
            if ($$1x == null) {
               this.D();
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

   private void D() {
      this.F();
      this.l.a(fmx.a(A, y, wt.d, () -> this.l.a(null)));
   }

   private void a(Throwable $$0) {
      F.error("Encountered error while sending abuse report", $$0);
      wu $$2;
      if ($$0.getCause() instanceof xu $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = C;
      }

      this.a($$2);
   }

   private void a(wu $$0) {
      wu $$1 = $$0.f().a(n.m);
      this.l.a(fmx.a(B, $$1, wt.k, () -> this.l.a(this)));
   }

   void E() {
      if (this.x.b()) {
         this.w.a(this.x.e().b());
      }
   }

   void F() {
      this.w.a(null);
   }

   @Override
   public void d() {
      if (this.x.b()) {
         this.l.a(new frq.a());
      } else {
         this.l.a(this.v);
      }
   }

   @Override
   public void j() {
      this.E();
      super.j();
   }

   class a extends fqe {
      private static final wu c = wu.c("gui.abuseReport.discard.title").a(n.r);
      private static final wu q = wu.c("gui.abuseReport.discard.content");
      private static final wu r = wu.c("gui.abuseReport.discard.return");
      private static final wu s = wu.c("gui.abuseReport.discard.draft");
      private static final wu u = wu.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, q, q);
      }

      @Override
      protected fli m() {
         fll $$0 = fll.d().a(8);
         $$0.c().b();
         fll $$1 = $$0.a(fll.e().a(8));
         $$1.a(fhu.a(r, $$0x -> this.d()).a());
         $$1.a(fhu.a(s, $$0x -> {
            frq.this.E();
            this.l.a(frq.this.v);
         }).a());
         $$0.a(fhu.a(u, $$0x -> {
            frq.this.F();
            this.l.a(frq.this.v);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.l.a(frq.this);
      }

      @Override
      public boolean aF_() {
         return false;
      }
   }
}
