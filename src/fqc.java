import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqc extends fqh {
   private static final ale a = ale.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final xe v = xe.c("menu.returnToGame");
   private static final xe w = xe.c("gui.advancements");
   private static final xe x = xe.c("gui.stats");
   private static final xe y = xe.c("menu.sendFeedback");
   private static final xe z = xe.c("menu.reportBugs");
   private static final xe A = xe.c("menu.feedback");
   private static final xe B = xe.c("menu.server_links");
   private static final xe C = xe.c("menu.options");
   private static final xe D = xe.c("menu.shareToLan");
   private static final xe E = xe.c("menu.playerReporting");
   private static final xe F = xe.c("menu.returnToMenu");
   private static final xe G = xe.c("menu.savingLevel");
   private static final xe H = xe.c("menu.game");
   private static final xe I = xe.c("menu.paused");
   private final boolean J;
   @Nullable
   private fko K;

   public fqc(boolean $$0) {
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

      this.c(new flv(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void D() {
      fob $$0 = new fob();
      $$0.c().a(4, 4, 4, 0);
      fob.b $$1 = $$0.d(2);
      $$1.a(fko.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fqr(this.m.t.cw.p(), this)));
      $$1.a(this.a(x, () -> new fql(this, this.m.t.i())));
      alw $$2 = this.m.t.cw.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fqc.a(this)));
         $$1.a(this.a(B, () -> new fsy(this, $$2)));
      }

      $$1.a(this.a(C, () -> new ftj(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fqi(this)));
      } else {
         $$1.a(this.a(E, () -> new fuy(this)));
      }

      xe $$3 = this.m.T() ? F : xd.p;
      this.K = $$1.a(fko.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.bb().a(this.m, this, this::E, true);
      }).a(204).a(), 2);
      $$0.a();
      foa.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fqh $$0, fob.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? ayb.i : ayb.h));
      $$1.a(a($$0, z, ayb.j)).j = !ab.b().d().a();
   }

   private void E() {
      boolean $$0 = this.m.T();
      gca $$1 = this.m.S();
      this.m.s.Z();
      if ($$0) {
         this.m.b(new fps(G));
      } else {
         this.m.y();
      }

      fqj $$2 = new fqj();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fdt($$2));
      } else {
         this.m.a(new fsw($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.bb().c() && this.K != null) {
         $$0.a(ghv::B, a, this.K.D() + this.K.y() - 17, this.K.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fko a(xe $$0, Supplier<fqh> $$1) {
      return fko.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fko a(fqh $$0, xe $$1, URI $$2) {
      return fko.a($$1, fpe.b($$0, $$2)).a(98).a();
   }

   static class a extends fqh {
      private static final xe b = xe.c("menu.feedback.title");
      public final fqh a;
      private final foc c = new foc(this);

      protected a(fqh $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aS_() {
         this.c.a(b, this.p);
         fob $$0 = this.c.c(new fob());
         $$0.c().a(4, 4, 4, 0);
         fob.b $$1 = $$0.d(2);
         fqc.a(this, $$1);
         this.c.b(fko.a(xd.k, $$0x -> this.d()).a(200).a());
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
