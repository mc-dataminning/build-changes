import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fpy extends fqd {
   private static final alc a = alc.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final xd v = xd.c("menu.returnToGame");
   private static final xd w = xd.c("gui.advancements");
   private static final xd x = xd.c("gui.stats");
   private static final xd y = xd.c("menu.sendFeedback");
   private static final xd z = xd.c("menu.reportBugs");
   private static final xd A = xd.c("menu.feedback");
   private static final xd B = xd.c("menu.server_links");
   private static final xd C = xd.c("menu.options");
   private static final xd D = xd.c("menu.shareToLan");
   private static final xd E = xd.c("menu.playerReporting");
   private static final xd F = xd.c("menu.returnToMenu");
   private static final xd G = xd.c("menu.savingLevel");
   private static final xd H = xd.c("menu.game");
   private static final xd I = xd.c("menu.paused");
   private final boolean J;
   @Nullable
   private fkk K;

   public fpy(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean m() {
      return this.J;
   }

   @Override
   protected void aR_() {
      if (this.J) {
         this.D();
      }

      this.c(new flr(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void D() {
      fnx $$0 = new fnx();
      $$0.c().a(4, 4, 4, 0);
      fnx.b $$1 = $$0.d(2);
      $$1.a(fkk.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fqn(this.m.t.cw.p(), this)));
      $$1.a(this.a(x, () -> new fqh(this, this.m.t.i())));
      alu $$2 = this.m.t.cw.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fpy.a(this)));
         $$1.a(this.a(B, () -> new fsu(this, $$2)));
      }

      $$1.a(this.a(C, () -> new ftf(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fqe(this)));
      } else {
         $$1.a(this.a(E, () -> new fuu(this)));
      }

      xd $$3 = this.m.T() ? F : xc.p;
      this.K = $$1.a(fkk.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.bb().a(this.m, this, this::E, true);
      }).a(204).a(), 2);
      $$0.a();
      fnw.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fqd $$0, fnx.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? axz.i : axz.h));
      $$1.a(a($$0, z, axz.j)).j = !ab.b().d().a();
   }

   private void E() {
      boolean $$0 = this.m.T();
      gbv $$1 = this.m.S();
      this.m.s.Z();
      if ($$0) {
         this.m.b(new fpo(G));
      } else {
         this.m.y();
      }

      fqf $$2 = new fqf();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fdp($$2));
      } else {
         this.m.a(new fss($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.bb().c() && this.K != null) {
         $$0.a(ghq::B, a, this.K.D() + this.K.y() - 17, this.K.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fjx $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fkk a(xd $$0, Supplier<fqd> $$1) {
      return fkk.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fkk a(fqd $$0, xd $$1, URI $$2) {
      return fkk.a($$1, fpa.b($$0, $$2)).a(98).a();
   }

   static class a extends fqd {
      private static final xd b = xd.c("menu.feedback.title");
      public final fqd a;
      private final fny c = new fny(this);

      protected a(fqd $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aR_() {
         this.c.a(b, this.p);
         fnx $$0 = this.c.c(new fnx());
         $$0.c().a(4, 4, 4, 0);
         fnx.b $$1 = $$0.d(2);
         fpy.a(this, $$1);
         this.c.b(fkk.a(xc.k, $$0x -> this.d()).a(200).a());
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
