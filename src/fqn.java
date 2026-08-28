import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqn extends fqs {
   private static final alh a = alh.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final xh v = xh.c("menu.returnToGame");
   private static final xh w = xh.c("gui.advancements");
   private static final xh x = xh.c("gui.stats");
   private static final xh y = xh.c("menu.sendFeedback");
   private static final xh z = xh.c("menu.reportBugs");
   private static final xh A = xh.c("menu.feedback");
   private static final xh B = xh.c("menu.server_links");
   private static final xh C = xh.c("menu.options");
   private static final xh D = xh.c("menu.shareToLan");
   private static final xh E = xh.c("menu.playerReporting");
   private static final xh F = xh.c("menu.returnToMenu");
   private static final xh G = xh.c("menu.savingLevel");
   private static final xh H = xh.c("menu.game");
   private static final xh I = xh.c("menu.paused");
   private final boolean J;
   @Nullable
   private fkz K;

   public fqn(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean m() {
      return this.J;
   }

   @Override
   protected void aS_() {
      if (this.J) {
         this.D();
      }

      this.c(new fmg(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void D() {
      fom $$0 = new fom();
      $$0.c().a(4, 4, 4, 0);
      fom.b $$1 = $$0.d(2);
      $$1.a(fkz.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new frc(this.m.t.cw.p(), this)));
      $$1.a(this.a(x, () -> new fqw(this, this.m.t.i())));
      alz $$2 = this.m.t.cw.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fqn.a(this)));
         $$1.a(this.a(B, () -> new ftj(this, $$2)));
      }

      $$1.a(this.a(C, () -> new ftu(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fqt(this)));
      } else {
         $$1.a(this.a(E, () -> new fvj(this)));
      }

      xh $$3 = this.m.T() ? F : xg.p;
      this.K = $$1.a(fkz.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.bc().a(this.m, this, this::E, true);
      }).a(204).a(), 2);
      $$0.a();
      fol.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fqs $$0, fom.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? ayf.i : ayf.h));
      $$1.a(a($$0, z, ayf.j)).j = !ab.b().d().a();
   }

   private void E() {
      boolean $$0 = this.m.T();
      gcl $$1 = this.m.S();
      this.m.s.Z();
      if ($$0) {
         this.m.b(new fqd(G));
      } else {
         this.m.y();
      }

      fqu $$2 = new fqu();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fee($$2));
      } else {
         this.m.a(new fth($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.bc().c() && this.K != null) {
         $$0.a(gig::B, a, this.K.D() + this.K.y() - 17, this.K.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fkz a(xh $$0, Supplier<fqs> $$1) {
      return fkz.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fkz a(fqs $$0, xh $$1, URI $$2) {
      return fkz.a($$1, fpp.b($$0, $$2)).a(98).a();
   }

   static class a extends fqs {
      private static final xh b = xh.c("menu.feedback.title");
      public final fqs a;
      private final fon c = new fon(this);

      protected a(fqs $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aS_() {
         this.c.a(b, this.p);
         fom $$0 = this.c.c(new fom());
         $$0.c().a(4, 4, 4, 0);
         fom.b $$1 = $$0.d(2);
         fqn.a(this, $$1);
         this.c.b(fkz.a(xg.k, $$0x -> this.d()).a(200).a());
         this.c.a(this::c);
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void d() {
         this.m.a(this.a);
      }
   }
}
