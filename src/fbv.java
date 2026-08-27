import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbv extends exz {
   private static final int a = 120;
   private static final int b = 20;
   private static final int c = 20;
   private static final int k = 10;
   private static final int l = 25;
   private static final int m = 280;
   private static final int n = 300;
   private static final tf o = tf.c("gui.chatReport.observed_what");
   private static final tf p = tf.c("gui.chatReport.select_reason");
   private static final tf q = tf.c("gui.chatReport.more_comments");
   private static final tf s = tf.c("gui.chatReport.describe");
   private static final tf t = tf.c("gui.chatReport.report_sent_msg");
   private static final tf u = tf.c("gui.chatReport.select_chat");
   private static final tf v = tf.c("gui.abuseReport.sending.title").a(n.r);
   private static final tf w = tf.c("gui.abuseReport.sent.title").a(n.r);
   private static final tf x = tf.c("gui.abuseReport.error.title").a(n.r);
   private static final tf y = tf.c("gui.abuseReport.send.generic_error");
   private static final Logger z = LogUtils.getLogger();
   @Nullable
   final exz A;
   private final fjh B;
   @Nullable
   private eta C;
   @Nullable
   private esz D;
   private esh E;
   private fjd F;
   @Nullable
   private fjd.a G;

   private fbv(@Nullable exz $$0, fjh $$1, fjd $$2) {
      super(tf.c("gui.chatReport.title"));
      this.A = $$0;
      this.B = $$1;
      this.F = $$2;
   }

   public fbv(@Nullable exz $$0, fjh $$1, UUID $$2) {
      this($$0, $$1, new fjd($$2, $$1.a().b()));
   }

   public fbv(@Nullable exz $$0, fjh $$1, fjd.b $$2) {
      this($$0, $$1, new fjd($$2, $$1.a().b()));
   }

   @Override
   protected void aE_() {
      AbuseReportLimits $$0 = this.B.a().b();
      int $$1 = this.g / 2;
      fjg $$2 = this.F.e();
      if ($$2 != null) {
         this.C = eta.a(this.i, $$2.c(), 280);
      } else {
         this.C = null;
      }

      IntSet $$3 = this.F.c();
      tf $$4;
      if ($$3.isEmpty()) {
         $$4 = u;
      } else {
         $$4 = tf.a("gui.chatReport.selected_chat", $$3.size());
      }

      this.d(esh.a($$4, $$0x -> this.f.a(new fbx(this, this.B, this.F, $$0xx -> {
            this.F = $$0xx;
            this.l();
         }))).a(this.F(), this.J(), 280, 20).a());
      tf $$6 = x.a($$2, fjg::b, p);
      this.d(esh.a($$6, $$0x -> this.f.a(new fby(this, this.F.e(), $$0xx -> {
            this.F.a($$0xx);
            this.l();
         }))).a(this.F(), this.K(), 280, 20).a());
      this.D = this.d(new esz(this.f.h, this.F(), this.L(), 280, this.M() - this.L(), s, tf.c("gui.chatReport.comments")));
      this.D.a(this.F.d());
      this.D.a($$0.maxOpinionCommentsLength());
      this.D.b($$0x -> {
         this.F.a($$0x);
         this.l();
      });
      this.d(esh.a(te.k, $$0x -> this.au_()).a($$1 - 120, this.N(), 120, 20).a());
      this.E = this.d(esh.a(tf.c("gui.chatReport.send"), $$0x -> this.B()).a($$1 + 10, this.N(), 120, 20).a());
      this.l();
   }

   private void l() {
      this.G = this.F.g();
      this.E.i = this.G == null;
      this.E.a(x.a(this.G, $$0 -> etq.a($$0.a())));
   }

   private void B() {
      this.F.a(this.B).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.B.a().a($$0.a(), $$0.b());
         this.f.a(exg.a(v, te.e, () -> {
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
      this.f.a(exg.a(w, t, te.d, () -> this.f.a(null)));
   }

   private void a(Throwable $$0) {
      z.error("Encountered error while sending abuse report", $$0);
      tf $$2;
      if ($$0.getCause() instanceof ue $$1) {
         $$2 = $$1.b();
      } else {
         $$2 = y;
      }

      this.a($$2);
   }

   private void a(tf $$0) {
      tf $$1 = $$0.e().a(n.m);
      this.f.a(exg.a(x, $$1, te.k, () -> this.f.a(this)));
   }

   void D() {
      if (this.F.f()) {
         this.B.a(this.F.a().a());
      }
   }

   void E() {
      this.B.a(null);
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.g / 2;
      $$0.a(this.i, this.e, $$4, 10, 16777215);
      $$0.a(this.i, o, $$4, this.J() - 9 - 6, 16777215);
      if (this.C != null) {
         this.C.b($$0, this.F(), this.K() + 20 + 5, 9, 16777215);
      }

      $$0.b(this.i, q, this.F(), this.L() - 9 - 6, 16777215);
   }

   @Override
   public void au_() {
      if (this.F.f()) {
         this.f.a(new fbv.a());
      } else {
         this.f.a(this.A);
      }
   }

   @Override
   public void h() {
      this.D();
      super.h();
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

   class a extends fba {
      private static final tf c = tf.c("gui.chatReport.discard.title").a(n.r);
      private static final tf k = tf.c("gui.chatReport.discard.content");
      private static final tf l = tf.c("gui.chatReport.discard.return");
      private static final tf m = tf.c("gui.chatReport.discard.draft");
      private static final tf n = tf.c("gui.chatReport.discard.discard");

      protected a() {
         super(c, k, k);
      }

      @Override
      protected void a(int $$0) {
         int $$1 = 150;
         this.d(esh.a(l, $$0x -> this.au_()).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
         this.d(esh.a(m, $$0x -> {
            fbv.this.D();
            this.f.a(fbv.this.A);
         }).a(this.g / 2 + 5, 100 + $$0, 150, 20).a());
         this.d(esh.a(n, $$0x -> {
            fbv.this.E();
            this.f.a(fbv.this.A);
         }).a(this.g / 2 - 75, 130 + $$0, 150, 20).a());
      }

      @Override
      public void au_() {
         this.f.a(fbv.this);
      }

      @Override
      public boolean aA_() {
         return false;
      }

      @Override
      protected void c(erw $$0) {
         $$0.b(this.i, this.e, this.g / 2 - 155, 30, 16777215);
      }
   }
}
