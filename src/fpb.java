import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fpb<B extends fxa.a<?>> extends fld {
   private static final wu y = wu.c("gui.abuseReport.report_sent_msg");
   private static final wu z = wu.c("gui.abuseReport.sending.title").a(n.r);
   private static final wu A = wu.c("gui.abuseReport.sent.title").a(n.r);
   private static final wu B = wu.c("gui.abuseReport.error.title").a(n.r);
   private static final wu C = wu.c("gui.abuseReport.send.generic_error");
   protected static final wu a = wu.c("gui.abuseReport.send");
   protected static final wu b = wu.c("gui.abuseReport.observed_what");
   protected static final wu c = wu.c("gui.abuseReport.select_reason");
   private static final wu D = wu.c("gui.abuseReport.describe");
   protected static final wu d = wu.c("gui.abuseReport.more_comments");
   private static final wu E = wu.c("gui.abuseReport.comments");
   protected static final int r = 20;
   protected static final int s = 280;
   protected static final int u = 8;
   private static final Logger F = LogUtils.getLogger();
   protected final fld v;
   protected final fxe w;
   protected B x;

   protected fpb(wu $$0, fld $$1, fxe $$2, B $$3) {
      super($$0);
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
   }

   protected ffw a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.w.a().b();
      ffw $$4 = new ffw(this.p, 0, 0, $$0, $$1, D, E);
      $$4.a(this.x.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void m() {
      this.x.a(this.w).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.w.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fkk.a(z, wt.e, () -> {
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
      this.m.a(fkk.a(A, y, wt.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      F.error("Encountered error while sending abuse report", $$0);
      wu $$2;
      if ($$0.getCause() instanceof xu $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = C;
      }

      this.a($$2);
   }

   private void a(wu $$0) {
      wu $$1 = $$0.f().a(n.m);
      this.m.a(fkk.a(B, $$1, wt.k, () -> this.m.a(this)));
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
         this.m.a(new fpb.a());
      } else {
         this.m.a(this.v);
      }
   }

   @Override
   public void j() {
      this.D();
      super.j();
   }

   class a extends fof {
      private static final wu c = wu.c("gui.abuseReport.discard.title").a(n.r);
      private static final wu d = wu.c("gui.abuseReport.discard.content");
      private static final wu r = wu.c("gui.abuseReport.discard.return");
      private static final wu s = wu.c("gui.abuseReport.discard.draft");
      private static final wu u = wu.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fis m() {
         fiv $$0 = fiv.d().a(8);
         $$0.c().b();
         fiv $$1 = $$0.a(fiv.e().a(8));
         $$1.a(ffe.a(r, $$0x -> this.d()).a());
         $$1.a(ffe.a(s, $$0x -> {
            fpb.this.D();
            this.m.a(fpb.this.v);
         }).a());
         $$0.a(ffe.a(u, $$0x -> {
            fpb.this.E();
            this.m.a(fpb.this.v);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.m.a(fpb.this);
      }

      @Override
      public boolean aD_() {
         return false;
      }
   }
}
