import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class fld<B extends ftc.a<?>> extends fhf {
   private static final vu r = vu.c("gui.abuseReport.report_sent_msg");
   private static final vu t = vu.c("gui.abuseReport.sending.title").a(n.r);
   private static final vu u = vu.c("gui.abuseReport.sent.title").a(n.r);
   private static final vu v = vu.c("gui.abuseReport.error.title").a(n.r);
   private static final vu w = vu.c("gui.abuseReport.send.generic_error");
   protected static final vu a = vu.c("gui.abuseReport.send");
   protected static final vu b = vu.c("gui.abuseReport.observed_what");
   protected static final vu c = vu.c("gui.abuseReport.select_reason");
   private static final vu x = vu.c("gui.abuseReport.describe");
   protected static final vu k = vu.c("gui.abuseReport.more_comments");
   private static final vu y = vu.c("gui.abuseReport.comments");
   protected static final int l = 20;
   protected static final int m = 280;
   protected static final int n = 8;
   private static final Logger z = LogUtils.getLogger();
   protected final fhf o;
   protected final ftg p;
   protected B q;

   protected fld(vu $$0, fhf $$1, ftg $$2, B $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   protected fby a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.p.a().b();
      fby $$4 = new fby(this.i, 0, 0, $$0, $$1, x, y);
      $$4.a(this.q.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   protected void o() {
      this.q.a(this.p).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.p.a().a($$0.a(), $$0.b(), $$0.c());
         this.f.a(fgm.a(t, vt.e, () -> {
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
      this.f.a(fgm.a(u, r, vt.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      vu $$2;
      if ($$0.getCause() instanceof wu $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = w;
      }

      this.a($$2);
   }

   private void a(vu $$0) {
      vu $$1 = $$0.f().a(n.m);
      this.f.a(fgm.a(v, $$1, vt.k, () -> this.f.a(this)));
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
         this.f.a(new fld.a());
      } else {
         this.f.a(this.o);
      }
   }

   @Override
   public void k() {
      this.H();
      super.k();
   }

   class a extends fki {
      private static final int c = 20;
      private static final vu k = vu.c("gui.abuseReport.discard.title").a(n.r);
      private static final vu l = vu.c("gui.abuseReport.discard.content");
      private static final vu m = vu.c("gui.abuseReport.discard.return");
      private static final vu n = vu.c("gui.abuseReport.discard.draft");
      private static final vu o = vu.c("gui.abuseReport.discard.discard");

      protected a() {
         super(k, l, l);
      }

      @Override
      protected void a(int $$0) {
         this.c((fdc)fbg.a(m, $$0x -> this.d()).a(this.g / 2 - 155, 100 + $$0).a());
         this.c((fdc)fbg.a(n, $$0x -> {
            fld.this.H();
            this.f.a(fld.this.o);
         }).a(this.g / 2 + 5, 100 + $$0).a());
         this.c((fdc)fbg.a(o, $$0x -> {
            fld.this.I();
            this.f.a(fld.this.o);
         }).a(this.g / 2 - 75, 130 + $$0).a());
      }

      @Override
      public void d() {
         this.f.a(fld.this);
      }

      @Override
      public boolean aM_() {
         return false;
      }

      @Override
      protected void c(fat $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, -1);
      }
   }
}
