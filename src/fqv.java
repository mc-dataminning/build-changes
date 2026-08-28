import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqv extends fra {
   private static final ali a = ali.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final xi v = xi.c("menu.returnToGame");
   private static final xi w = xi.c("gui.advancements");
   private static final xi x = xi.c("gui.stats");
   private static final xi y = xi.c("menu.sendFeedback");
   private static final xi z = xi.c("menu.reportBugs");
   private static final xi A = xi.c("menu.feedback");
   private static final xi B = xi.c("menu.server_links");
   private static final xi C = xi.c("menu.options");
   private static final xi D = xi.c("menu.shareToLan");
   private static final xi E = xi.c("menu.playerReporting");
   private static final xi F = xi.c("menu.returnToMenu");
   private static final xi G = xi.c("menu.savingLevel");
   private static final xi H = xi.c("menu.game");
   private static final xi I = xi.c("menu.paused");
   private final boolean J;
   @Nullable
   private flh K;

   public fqv(boolean $$0) {
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

      this.c(new fmo(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void D() {
      fov $$0 = new fov();
      $$0.c().a(4, 4, 4, 0);
      fov.b $$1 = $$0.d(2);
      $$1.a(flh.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new frk(this.m.t.j.p(), this)));
      $$1.a(this.a(x, () -> new fre(this, this.m.t.i())));
      ama $$2 = this.m.t.j.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fqv.a(this)));
         $$1.a(this.a(B, () -> new ftr(this, $$2)));
      }

      $$1.a(this.a(C, () -> new fuc(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new frb(this)));
      } else {
         $$1.a(this.a(E, () -> new fvr(this)));
      }

      xi $$3 = this.m.T() ? F : xh.p;
      this.K = $$1.a(flh.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.bb().a(this.m, this, this::E, true);
      }).a(204).a(), 2);
      $$0.a();
      fou.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fra $$0, fov.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? ayg.i : ayg.h));
      $$1.a(a($$0, z, ayg.j)).j = !ab.b().d().a();
   }

   private void E() {
      boolean $$0 = this.m.T();
      gcw $$1 = this.m.S();
      this.m.s.Z();
      if ($$0) {
         this.m.b(new fql(G));
      } else {
         this.m.y();
      }

      frc $$2 = new frc();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fem($$2));
      } else {
         this.m.a(new ftp($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.bb().c() && this.K != null) {
         $$0.a(gir::B, a, this.K.D() + this.K.y() - 17, this.K.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private flh a(xi $$0, Supplier<fra> $$1) {
      return flh.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static flh a(fra $$0, xi $$1, URI $$2) {
      return flh.a($$1, fpx.b($$0, $$2)).a(98).a();
   }

   static class a extends fra {
      private static final xi b = xi.c("menu.feedback.title");
      public final fra a;
      private final fow c = new fow(this);

      protected a(fra $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aR_() {
         this.c.a(b, this.p);
         fov $$0 = this.c.c(new fov());
         $$0.c().a(4, 4, 4, 0);
         fov.b $$1 = $$0.d(2);
         fqv.a(this, $$1);
         this.c.b(flh.a(xh.k, $$0x -> this.d()).a(200).a());
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
