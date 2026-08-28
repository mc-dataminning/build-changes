import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class frr extends frw {
   private static final alj a = alj.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final xj v = xj.c("menu.returnToGame");
   private static final xj w = xj.c("gui.advancements");
   private static final xj x = xj.c("gui.stats");
   private static final xj y = xj.c("menu.sendFeedback");
   private static final xj z = xj.c("menu.reportBugs");
   private static final xj A = xj.c("menu.feedback");
   private static final xj B = xj.c("menu.server_links");
   private static final xj C = xj.c("menu.options");
   private static final xj D = xj.c("menu.shareToLan");
   private static final xj E = xj.c("menu.playerReporting");
   private static final xj F = xj.c("menu.returnToMenu");
   private static final xj G = xj.c("menu.savingLevel");
   private static final xj H = xj.c("menu.game");
   private static final xj I = xj.c("menu.paused");
   private final boolean J;
   @Nullable
   private fmd K;

   public frr(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean m() {
      return this.J;
   }

   @Override
   protected void aR_() {
      if (this.J) {
         this.F();
      }

      this.c(new fnk(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void F() {
      fpr $$0 = new fpr();
      $$0.c().a(4, 4, 4, 0);
      fpr.b $$1 = $$0.d(2);
      $$1.a(fmd.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fsg(this.m.t.i.p(), this)));
      $$1.a(this.a(x, () -> new fsa(this, this.m.t.m())));
      amb $$2 = this.m.t.i.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new frr.a(this)));
         $$1.a(this.a(B, () -> new fuo(this, $$2)));
      }

      $$1.a(this.a(C, () -> new fuz(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new frx(this)));
      } else {
         $$1.a(this.a(E, () -> new fwo(this)));
      }

      xj $$3 = this.m.T() ? F : xi.p;
      this.K = $$1.a(fmd.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.bb().a(this.m, this, this::G, true);
      }).a(204).a(), 2);
      $$0.a();
      fpq.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(frw $$0, fpr.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? ayi.i : ayi.h));
      $$1.a(a($$0, z, ayi.j)).j = !ab.b().d().a();
   }

   private void G() {
      boolean $$0 = this.m.T();
      gdv $$1 = this.m.S();
      this.m.s.aa();
      if ($$0) {
         this.m.b(new frh(G));
      } else {
         this.m.y();
      }

      fry $$2 = new fry();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new ffc($$2));
      } else {
         this.m.a(new fum($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.bb().c() && this.K != null) {
         $$0.a(gjq::B, a, this.K.D() + this.K.y() - 17, this.K.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fmd a(xj $$0, Supplier<frw> $$1) {
      return fmd.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fmd a(frw $$0, xj $$1, URI $$2) {
      return fmd.a($$1, fqt.b($$0, $$2)).a(98).a();
   }

   static class a extends frw {
      private static final xj b = xj.c("menu.feedback.title");
      public final frw a;
      private final fps c = new fps(this);

      protected a(frw $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aR_() {
         this.c.a(b, this.p);
         fpr $$0 = this.c.c(new fpr());
         $$0.c().a(4, 4, 4, 0);
         fpr.b $$1 = $$0.d(2);
         frr.a(this, $$1);
         this.c.b(fmd.a(xi.k, $$0x -> this.aO_()).a(200).a());
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
