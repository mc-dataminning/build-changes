import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fsp<B extends gar.a<?>> extends fon {
   private static final xe y = xe.c("gui.abuseReport.report_sent_msg");
   private static final xe z = xe.c("gui.abuseReport.sending.title").a(n.r);
   private static final xe A = xe.c("gui.abuseReport.sent.title").a(n.r);
   private static final xe B = xe.c("gui.abuseReport.error.title").a(n.r);
   private static final xe C = xe.c("gui.abuseReport.send.generic_error");
   protected static final xe a = xe.c("gui.abuseReport.send");
   protected static final xe b = xe.c("gui.abuseReport.observed_what");
   protected static final xe c = xe.c("gui.abuseReport.select_reason");
   private static final xe D = xe.c("gui.abuseReport.describe");
   protected static final xe d = xe.c("gui.abuseReport.more_comments");
   private static final xe E = xe.c("gui.abuseReport.comments");
   protected static final int r = 20;
   protected static final int s = 280;
   protected static final int u = 8;
   private static final Logger F = LogUtils.getLogger();
   protected final fon v;
   protected final gav w;
   protected B x;

   protected fsp(xe $$0, fon $$1, gav $$2, B $$3) {
      super($$0);
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
   }

   protected fjf a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.w.a().b();
      fjf $$4 = new fjf(this.p, 0, 0, $$0, $$1, D, E);
      $$4.a(this.x.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void B() {
      this.x.a(this.w).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.w.a().a($$0.a(), $$0.b(), $$0.c());
         this.m.a(fnt.a(z, xd.e, () -> {
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
      this.m.a(fnt.a(A, y, xd.d, () -> this.m.a(null)));
   }

   private void a(Throwable $$0) {
      F.error("Encountered error while sending abuse report", $$0);
      xe $$2;
      if ($$0.getCause() instanceof ye $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = C;
      }

      this.a($$2);
   }

   private void a(xe $$0) {
      xe $$1 = $$0.f().a(n.m);
      this.m.a(fnt.a(B, $$1, xd.k, () -> this.m.a(this)));
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
         this.m.a(new fsp.a());
      } else {
         this.m.a(this.v);
      }
   }

   @Override
   public void j() {
      this.D();
      super.j();
   }

   class a extends fru {
      private static final xe c = xe.c("gui.abuseReport.discard.title").a(n.r);
      private static final xe d = xe.c("gui.abuseReport.discard.content");
      private static final xe r = xe.c("gui.abuseReport.discard.return");
      private static final xe s = xe.c("gui.abuseReport.discard.draft");
      private static final xe u = xe.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected fmb B() {
         fme $$0 = fme.d().a(8);
         $$0.c().b();
         fme $$1 = $$0.a(fme.e().a(8));
         $$1.a(fin.a(r, $$0x -> this.d()).a());
         $$1.a(fin.a(s, $$0x -> {
            fsp.this.D();
            this.m.a(fsp.this.v);
         }).a());
         $$0.a(fin.a(u, $$0x -> {
            fsp.this.E();
            this.m.a(fsp.this.v);
         }).a());
         return $$0;
      }

      @Override
      public void d() {
         this.m.a(fsp.this);
      }

      @Override
      public boolean aD_() {
         return false;
      }
   }
}
