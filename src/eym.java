import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eym extends euq {
   private static final int a = 120;
   private static final int b = 20;
   private static final int c = 20;
   private static final int k = 10;
   private static final int l = 25;
   private static final int m = 280;
   private static final int n = 300;
   private static final sw o = sw.c("gui.chatReport.observed_what");
   private static final sw p = sw.c("gui.chatReport.select_reason");
   private static final sw q = sw.c("gui.chatReport.more_comments");
   private static final sw r = sw.c("gui.chatReport.describe");
   private static final sw s = sw.c("gui.chatReport.report_sent_msg");
   private static final sw t = sw.c("gui.chatReport.select_chat");
   private static final sw u = sw.c("gui.abuseReport.sending.title").a(n.r);
   private static final sw v = sw.c("gui.abuseReport.sent.title").a(n.r);
   private static final sw w = sw.c("gui.abuseReport.error.title").a(n.r);
   private static final sw x = sw.c("gui.abuseReport.send.generic_error");
   private static final Logger y = LogUtils.getLogger();
   @Nullable
   final euq z;
   private final ffs A;
   @Nullable
   private epz C;
   @Nullable
   private epy D;
   private epi E;
   private ffo F;
   @Nullable
   private ffo.a G;

   private eym(@Nullable euq $$0, ffs $$1, ffo $$2) {
      super(sw.c("gui.chatReport.title"));
      this.z = $$0;
      this.A = $$1;
      this.F = $$2;
   }

   public eym(@Nullable euq $$0, ffs $$1, UUID $$2) {
      this($$0, $$1, new ffo($$2, $$1.a().b()));
   }

   public eym(@Nullable euq $$0, ffs $$1, ffo.b $$2) {
      this($$0, $$1, new ffo($$2, $$1.a().b()));
   }

   @Override
   protected void b() {
      AbuseReportLimits $$0 = this.A.a().b();
      int $$1 = this.g / 2;
      ffr $$2 = this.F.e();
      if ($$2 != null) {
         this.C = epz.a(this.i, $$2.c(), 280);
      } else {
         this.C = null;
      }

      IntSet $$3 = this.F.c();
      sw $$4;
      if ($$3.isEmpty()) {
         $$4 = t;
      } else {
         $$4 = sw.a("gui.chatReport.selected_chat", $$3.size());
      }

      this.d(epi.a($$4, $$0x -> this.f.a(new eyo(this, this.A, this.F, $$0xx -> {
            this.F = $$0xx;
            this.l();
         }))).a(this.F(), this.J(), 280, 20).a());
      sw $$6 = x.a($$2, ffr::b, p);
      this.d(epi.a($$6, $$0x -> this.f.a(new eyp(this, this.F.e(), $$0xx -> {
            this.F.a($$0xx);
            this.l();
         }))).a(this.F(), this.K(), 280, 20).a());
      this.D = this.d(new epy(this.f.h, this.F(), this.L(), 280, this.M() - this.L(), r, sw.c("gui.chatReport.comments")));
      this.D.a(this.F.d());
      this.D.a($$0.maxOpinionCommentsLength());
      this.D.b($$0x -> {
         this.F.a($$0x);
         this.l();
      });
      this.d(epi.a(sv.k, $$0x -> this.aw_()).a($$1 - 120, this.N(), 120, 20).a());
      this.E = this.d(epi.a(sw.c("gui.chatReport.send"), $$0x -> this.B()).a($$1 + 10, this.N(), 120, 20).a());
      this.l();
   }

   private void l() {
      this.G = this.F.g();
      this.E.r = this.G == null;
      this.E.a(x.a(this.G, $$0 -> eqp.a($$0.a())));
   }

   private void B() {
      this.F.a(this.A).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.A.a().a($$0.a(), $$0.b());
         this.f.a(ety.a(u, sv.e, () -> {
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
      }).ifRight($$0 -> this.a($$0.a()));
   }

   private void C() {
      this.E();
      this.f.a(ety.a(v, s, sv.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      y.error("Encountered error while sending abuse report", $$0);
      sw $$2;
      if ($$0.getCause() instanceof tv $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = x;
      }

      this.a($$2);
   }

   private void a(sw $$0) {
      sw $$1 = $$0.e().a(n.m);
      this.f.a(ety.a(w, $$1, sv.k, () -> this.f.a(this)));
   }

   void D() {
      if (this.F.f()) {
         this.A.a(this.F.a().a());
      }
   }

   void E() {
      this.A.a(null);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.g / 2;
      this.a($$0);
      $$0.a(this.i, this.e, $$4, 10, 16777215);
      $$0.a(this.i, o, $$4, this.J() - 9 - 6, 16777215);
      if (this.C != null) {
         this.C.b($$0, this.F(), this.K() + 20 + 5, 9, 16777215);
      }

      $$0.b(this.i, q, this.F(), this.L() - 9 - 6, 16777215);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void f() {
      this.D.v();
      super.f();
   }

   @Override
   public void aw_() {
      if (this.F.f()) {
         this.f.a(new eym.a());
      } else {
         this.f.a(this.z);
      }
   }

   @Override
   public void ax_() {
      this.D();
      super.ax_();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }

   private int F() {
      return this.g / 2 - 140;
   }

   private int G() {
      return this.g / 2 + 140;
   }

   private int H() {
      return Math.max((this.h - 300) / 2, 0);
   }

   private int I() {
      return Math.min((this.h + 300) / 2, this.h);
   }

   private int J() {
      return this.H() + 40;
   }

   private int K() {
      return this.J() + 10 + 20;
   }

   private int L() {
      int $$0 = this.K() + 20 + 25;
      if (this.C != null) {
         $$0 += (this.C.a() + 1) * 9;
      }

      return $$0;
   }

   private int M() {
      return this.N() - 20;
   }

   private int N() {
      return this.I() - 20 - 10;
   }

   class a extends exr {
      private static final sw c = sw.c("gui.chatReport.discard.title").a(n.r);
      private static final sw k = sw.c("gui.chatReport.discard.content");
      private static final sw l = sw.c("gui.chatReport.discard.return");
      private static final sw m = sw.c("gui.chatReport.discard.draft");
      private static final sw n = sw.c("gui.chatReport.discard.discard");

      protected a() {
         super(c, k, k);
      }

      @Override
      protected void a(int $$0) {
         int $$1 = 150;
         this.d(epi.a(l, $$0x -> this.aw_()).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
         this.d(epi.a(m, $$0x -> {
            eym.this.D();
            this.f.a(eym.this.z);
         }).a(this.g / 2 + 5, 100 + $$0, 150, 20).a());
         this.d(epi.a(n, $$0x -> {
            eym.this.E();
            this.f.a(eym.this.z);
         }).a(this.g / 2 - 75, 130 + $$0, 150, 20).a());
      }

      @Override
      public void aw_() {
         this.f.a(eym.this);
      }

      @Override
      public boolean av_() {
         return false;
      }

      @Override
      protected void c(eox $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, 16777215);
      }
   }
}
