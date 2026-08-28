import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class frk extends frp {
   private static final all a = all.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final xl v = xl.c("menu.returnToGame");
   private static final xl w = xl.c("gui.advancements");
   private static final xl x = xl.c("gui.stats");
   private static final xl y = xl.c("menu.sendFeedback");
   private static final xl z = xl.c("menu.reportBugs");
   private static final xl A = xl.c("menu.feedback");
   private static final xl B = xl.c("menu.server_links");
   private static final xl C = xl.c("menu.options");
   private static final xl D = xl.c("menu.shareToLan");
   private static final xl E = xl.c("menu.playerReporting");
   private static final xl F = xl.c("menu.returnToMenu");
   private static final xl G = xl.c("menu.savingLevel");
   private static final xl H = xl.c("menu.game");
   private static final xl I = xl.c("menu.paused");
   private final boolean J;
   @Nullable
   private flw K;

   public frk(boolean $$0) {
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

      this.c(new fnd(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void D() {
      fpk $$0 = new fpk();
      $$0.c().a(4, 4, 4, 0);
      fpk.b $$1 = $$0.d(2);
      $$1.a(flw.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new frz(this.m.t.j.p(), this)));
      $$1.a(this.a(x, () -> new frt(this, this.m.t.i())));
      amd $$2 = this.m.t.j.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new frk.a(this)));
         $$1.a(this.a(B, () -> new fug(this, $$2)));
      }

      $$1.a(this.a(C, () -> new fur(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new frq(this)));
      } else {
         $$1.a(this.a(E, () -> new fwg(this)));
      }

      xl $$3 = this.m.T() ? F : xk.p;
      this.K = $$1.a(flw.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.bb().a(this.m, this, this::E, true);
      }).a(204).a(), 2);
      $$0.a();
      fpj.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(frp $$0, fpk.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? ayj.i : ayj.h));
      $$1.a(a($$0, z, ayj.j)).j = !ab.b().d().a();
   }

   private void E() {
      boolean $$0 = this.m.T();
      gdm $$1 = this.m.S();
      this.m.s.Z();
      if ($$0) {
         this.m.b(new fra(G));
      } else {
         this.m.y();
      }

      frr $$2 = new frr();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fev($$2));
      } else {
         this.m.a(new fue($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.bb().c() && this.K != null) {
         $$0.a(gjh::B, a, this.K.D() + this.K.y() - 17, this.K.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private flw a(xl $$0, Supplier<frp> $$1) {
      return flw.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static flw a(frp $$0, xl $$1, URI $$2) {
      return flw.a($$1, fqm.b($$0, $$2)).a(98).a();
   }

   static class a extends frp {
      private static final xl b = xl.c("menu.feedback.title");
      public final frp a;
      private final fpl c = new fpl(this);

      protected a(frp $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aS_() {
         this.c.a(b, this.p);
         fpk $$0 = this.c.c(new fpk());
         $$0.c().a(4, 4, 4, 0);
         fpk.b $$1 = $$0.d(2);
         frk.a(this, $$1);
         this.c.b(flw.a(xk.k, $$0x -> this.aP_()).a(200).a());
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
