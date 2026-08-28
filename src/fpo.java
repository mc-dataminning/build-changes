import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fpo extends fpt {
   private static final alb a = alb.b("icon/draft_report");
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
   private fka K;

   public fpo(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean m() {
      return this.J;
   }

   @Override
   protected void aT_() {
      if (this.J) {
         this.D();
      }

      this.c(new flh(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void D() {
      fnn $$0 = new fnn();
      $$0.c().a(4, 4, 4, 0);
      fnn.b $$1 = $$0.d(2);
      $$1.a(fka.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fqd(this.m.t.cx.p(), this)));
      $$1.a(this.a(x, () -> new fpx(this, this.m.t.i())));
      alt $$2 = this.m.t.cx.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fpo.a(this)));
         $$1.a(this.a(B, () -> new fsk(this, $$2)));
      }

      $$1.a(this.a(C, () -> new fsv(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fpu(this)));
      } else {
         $$1.a(this.a(E, () -> new fuk(this)));
      }

      xd $$3 = this.m.T() ? F : xc.p;
      this.K = $$1.a(fka.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::E, true);
      }).a(204).a(), 2);
      $$0.a();
      fnm.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fpt $$0, fnn.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? axy.i : axy.h));
      $$1.a(a($$0, z, axy.j)).j = !ab.b().d().a();
   }

   private void E() {
      boolean $$0 = this.m.T();
      gbl $$1 = this.m.S();
      this.m.s.Z();
      if ($$0) {
         this.m.b(new fpe(G));
      } else {
         this.m.y();
      }

      fpv $$2 = new fpv();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fdf($$2));
      } else {
         this.m.a(new fsi($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.ba().c() && this.K != null) {
         $$0.a(ghe::C, a, this.K.D() + this.K.y() - 17, this.K.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fka a(xd $$0, Supplier<fpt> $$1) {
      return fka.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fka a(fpt $$0, xd $$1, URI $$2) {
      return fka.a($$1, fop.b($$0, $$2)).a(98).a();
   }

   static class a extends fpt {
      private static final xd b = xd.c("menu.feedback.title");
      public final fpt a;
      private final fno c = new fno(this);

      protected a(fpt $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aT_() {
         this.c.a(b, this.p);
         fnn $$0 = this.c.c(new fnn());
         $$0.c().a(4, 4, 4, 0);
         fnn.b $$1 = $$0.d(2);
         fpo.a(this, $$1);
         this.c.b(fka.a(xc.k, $$0x -> this.d()).a(200).a());
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
