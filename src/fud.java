import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fud extends fui {
   private static final aku a = aku.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final wo v = wo.c("menu.returnToGame");
   private static final wo w = wo.c("gui.advancements");
   private static final wo x = wo.c("gui.stats");
   private static final wo y = wo.c("menu.sendFeedback");
   private static final wo z = wo.c("menu.reportBugs");
   private static final wo A = wo.c("menu.feedback");
   private static final wo B = wo.c("menu.server_links");
   private static final wo C = wo.c("menu.options");
   private static final wo D = wo.c("menu.shareToLan");
   private static final wo E = wo.c("menu.playerReporting");
   private static final wo F = wo.c("menu.returnToMenu");
   private static final wo G = wo.c("menu.savingLevel");
   private static final wo H = wo.c("menu.game");
   private static final wo I = wo.c("menu.paused");
   private final boolean J;
   @Nullable
   private fop K;

   public fud(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean m() {
      return this.J;
   }

   @Override
   protected void aR_() {
      if (this.J) {
         this.E();
      }

      this.c(new fpx(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      fsd $$0 = new fsd();
      $$0.c().a(4, 4, 4, 0);
      fsd.b $$1 = $$0.d(2);
      $$1.a(fop.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fus(this.m.t.j.p(), this)));
      $$1.a(this.a(x, () -> new fum(this, this.m.t.m())));
      alm $$2 = this.m.t.j.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fud.a(this)));
         $$1.a(this.a(B, () -> new fxa(this, $$2)));
      }

      $$1.a(this.a(C, () -> new fxl(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fuj(this)));
      } else {
         $$1.a(this.a(E, () -> new fza(this)));
      }

      wo $$3 = this.m.T() ? F : wn.p;
      this.K = $$1.a(fop.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      fsc.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fui $$0, fsd.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? axu.i : axu.h));
      $$1.a(a($$0, z, axu.j)).j = !ab.b().d().a();
   }

   private void F() {
      boolean $$0 = this.m.T();
      ggl $$1 = this.m.S();
      this.m.s.ac();
      if ($$0) {
         this.m.b(new ftt(G));
      } else {
         this.m.y();
      }

      fuk $$2 = new fuk();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fgd($$2));
      } else {
         this.m.a(new fwy($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.ba().c() && this.K != null) {
         $$0.a(gmf::H, a, this.K.F() + this.K.A() - 17, this.K.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(fob $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fop a(wo $$0, Supplier<fui> $$1) {
      return fop.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fop a(fui $$0, wo $$1, URI $$2) {
      return fop.a($$1, ftf.b($$0, $$2)).a(98).a();
   }

   static class a extends fui {
      private static final wo b = wo.c("menu.feedback.title");
      public final fui a;
      private final fse c = new fse(this);

      protected a(fui $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aR_() {
         this.c.a(b, this.p);
         fsd $$0 = this.c.c(new fsd());
         $$0.c().a(4, 4, 4, 0);
         fsd.b $$1 = $$0.d(2);
         fud.a(this, $$1);
         this.c.b(fop.a(wn.k, $$0x -> this.aO_()).a(200).a());
         this.c.a(this::c);
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void aO_() {
         this.m.a(this.a);
      }
   }
}
