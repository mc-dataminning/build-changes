import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fns extends fnx {
   private static final akq a = akq.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int q = 4;
   private static final int r = 204;
   private static final int s = 98;
   private static final wy u = wy.c("menu.returnToGame");
   private static final wy v = wy.c("gui.advancements");
   private static final wy w = wy.c("gui.stats");
   private static final wy x = wy.c("menu.sendFeedback");
   private static final wy y = wy.c("menu.reportBugs");
   private static final wy z = wy.c("menu.feedback");
   private static final wy A = wy.c("menu.server_links");
   private static final wy B = wy.c("menu.options");
   private static final wy C = wy.c("menu.shareToLan");
   private static final wy D = wy.c("menu.playerReporting");
   private static final wy E = wy.c("menu.returnToMenu");
   private static final wy F = wy.c("menu.savingLevel");
   private static final wy G = wy.c("menu.game");
   private static final wy H = wy.c("menu.paused");
   private final boolean I;
   @Nullable
   private fig J;

   public fns(boolean $$0) {
      super($$0 ? G : H);
      this.I = $$0;
   }

   public boolean m() {
      return this.I;
   }

   @Override
   protected void aP_() {
      if (this.I) {
         this.D();
      }

      this.c(new fjn(0, this.I ? 40 : 10, this.m, 9, this.k, this.o));
   }

   private void D() {
      fls $$0 = new fls();
      $$0.c().a(4, 4, 4, 0);
      fls.b $$1 = $$0.d(2);
      $$1.a(fig.a(u, $$0x -> {
         this.l.a(null);
         this.l.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(v, () -> new foh(this.l.s.h.p(), this)));
      $$1.a(this.a(w, () -> new fob(this, this.l.s.j())));
      ali $$2 = this.l.s.h.C();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(z, () -> new fns.a(this)));
         $$1.a(this.a(A, () -> new fqp(this, $$2)));
      }

      $$1.a(this.a(B, () -> new fra(this, this.l.m)));
      if (this.l.U() && !this.l.V().r()) {
         $$1.a(this.a(C, () -> new fny(this)));
      } else {
         $$1.a(this.a(D, () -> new fsq(this)));
      }

      wy $$3 = this.l.T() ? E : wx.p;
      this.J = $$1.a(fig.a($$3, $$0x -> {
         $$0x.j = false;
         this.l.aX().a(this.l, this, this::E, true);
      }).a(204).a(), 2);
      $$0.a();
      flr.a($$0, 0, 0, this.m, this.n, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fnx $$0, fls.b $$1) {
      $$1.a(a($$0, x, ab.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(a($$0, y, "https://aka.ms/snapshotbugs?ref=game")).j = !ab.b().d().a();
   }

   private void E() {
      boolean $$0 = this.l.T();
      fzn $$1 = this.l.S();
      this.l.r.Y();
      if ($$0) {
         this.l.b(new fni(F));
      } else {
         this.l.y();
      }

      fnz $$2 = new fnz();
      if ($$0) {
         this.l.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.l.a(new fbn($$2));
      } else {
         this.l.a(new fqn($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.I && this.l != null && this.l.aX().c() && this.J != null) {
         $$0.a(a, this.J.D() + this.J.y() - 17, this.J.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      if (this.I) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fig a(wy $$0, Supplier<fnx> $$1) {
      return fig.a($$0, $$1x -> this.l.a($$1.get())).a(98).a();
   }

   private static fig a(fnx $$0, wy $$1, String $$2) {
      return fig.a($$1, fmu.b($$0, $$2)).a(98).a();
   }

   static class a extends fnx {
      private static final wy b = wy.c("menu.feedback.title");
      public final fnx a;
      private final flt c = new flt(this);

      protected a(fnx $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aP_() {
         this.c.a(b, this.o);
         fls $$0 = this.c.c(new fls());
         $$0.c().a(4, 4, 4, 0);
         fls.b $$1 = $$0.d(2);
         fns.a(this, $$1);
         this.c.b(fig.a(wx.k, $$0x -> this.d()).a(200).a());
         this.c.a(this::c);
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void d() {
         this.l.a(this.a);
      }
   }
}
