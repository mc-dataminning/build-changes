import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ftr extends ftw {
   private static final alz a = alz.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final xv v = xv.c("menu.returnToGame");
   private static final xv w = xv.c("gui.advancements");
   private static final xv x = xv.c("gui.stats");
   private static final xv y = xv.c("menu.sendFeedback");
   private static final xv z = xv.c("menu.reportBugs");
   private static final xv A = xv.c("menu.feedback");
   private static final xv B = xv.c("menu.server_links");
   private static final xv C = xv.c("menu.options");
   private static final xv D = xv.c("menu.shareToLan");
   private static final xv E = xv.c("menu.playerReporting");
   private static final xv F = xv.c("menu.returnToMenu");
   private static final xv G = xv.c("menu.savingLevel");
   private static final xv H = xv.c("menu.game");
   private static final xv I = xv.c("menu.paused");
   private final boolean J;
   @Nullable
   private fod K;

   public ftr(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean l() {
      return this.J;
   }

   @Override
   protected void aT_() {
      if (this.J) {
         this.E();
      }

      this.c(new fpl(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      frr $$0 = new frr();
      $$0.c().a(4, 4, 4, 0);
      frr.b $$1 = $$0.d(2);
      $$1.a(fod.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fug(this.m.t.i.p(), this)));
      $$1.a(this.a(x, () -> new fua(this, this.m.t.m())));
      amr $$2 = this.m.t.i.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new ftr.a(this)));
         $$1.a(this.a(B, () -> new fwo(this, $$2)));
      }

      $$1.a(this.a(C, () -> new fwz(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new ftx(this)));
      } else {
         $$1.a(this.a(E, () -> new fyo(this)));
      }

      xv $$3 = this.m.T() ? F : xu.p;
      this.K = $$1.a(fod.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.bb().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      frq.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(ftw $$0, frr.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? aza.i : aza.h));
      $$1.a(a($$0, z, aza.j)).j = !ab.b().d().a();
   }

   private void F() {
      boolean $$0 = this.m.T();
      gfx $$1 = this.m.S();
      this.m.s.ab();
      if ($$0) {
         this.m.b(new fth(G));
      } else {
         this.m.y();
      }

      fty $$2 = new fty();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fhb($$2));
      } else {
         this.m.a(new fwm($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.bb().c() && this.K != null) {
         $$0.a(glt::B, a, this.K.D() + this.K.y() - 17, this.K.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fnq $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fod a(xv $$0, Supplier<ftw> $$1) {
      return fod.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fod a(ftw $$0, xv $$1, URI $$2) {
      return fod.a($$1, fst.b($$0, $$2)).a(98).a();
   }

   static class a extends ftw {
      private static final xv b = xv.c("menu.feedback.title");
      public final ftw a;
      private final frs c = new frs(this);

      protected a(ftw $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aT_() {
         this.c.a(b, this.p);
         frr $$0 = this.c.c(new frr());
         $$0.c().a(4, 4, 4, 0);
         frr.b $$1 = $$0.d(2);
         ftr.a(this, $$1);
         this.c.b(fod.a(xu.k, $$0x -> this.aP_()).a(200).a());
         this.c.a(this::c);
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void aP_() {
         this.m.a(this.a);
      }
   }
}
