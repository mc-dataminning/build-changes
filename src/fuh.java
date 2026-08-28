import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fuh extends fum {
   private static final akv a = akv.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final wp v = wp.c("menu.returnToGame");
   private static final wp w = wp.c("gui.advancements");
   private static final wp x = wp.c("gui.stats");
   private static final wp y = wp.c("menu.sendFeedback");
   private static final wp z = wp.c("menu.reportBugs");
   private static final wp A = wp.c("menu.feedback");
   private static final wp B = wp.c("menu.server_links");
   private static final wp C = wp.c("menu.options");
   private static final wp D = wp.c("menu.shareToLan");
   private static final wp E = wp.c("menu.playerReporting");
   private static final wp F = wp.c("menu.returnToMenu");
   private static final wp G = wp.c("menu.savingLevel");
   private static final wp H = wp.c("menu.game");
   private static final wp I = wp.c("menu.paused");
   private final boolean J;
   @Nullable
   private fou K;

   public fuh(boolean $$0) {
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

      this.c(new fqb(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      fsh $$0 = new fsh();
      $$0.c().a(4, 4, 4, 0);
      fsh.b $$1 = $$0.d(2);
      $$1.a(fou.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fuw(this.m.t.j.p(), this)));
      $$1.a(this.a(x, () -> new fuq(this, this.m.t.m())));
      aln $$2 = this.m.t.j.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fuh.a(this)));
         $$1.a(this.a(B, () -> new fxe(this, $$2)));
      }

      $$1.a(this.a(C, () -> new fxp(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fun(this)));
      } else {
         $$1.a(this.a(E, () -> new fze(this)));
      }

      wp $$3 = this.m.T() ? F : wo.p;
      this.K = $$1.a(fou.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      fsg.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fum $$0, fsh.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? axv.i : axv.h));
      $$1.a(a($$0, z, axv.j)).j = !ab.b().d().a();
   }

   private void F() {
      boolean $$0 = this.m.T();
      ggp $$1 = this.m.S();
      this.m.s.ac();
      if ($$0) {
         this.m.b(new ftx(G));
      } else {
         this.m.y();
      }

      fuo $$2 = new fuo();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fgg($$2));
      } else {
         this.m.a(new fxc($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.ba().c() && this.K != null) {
         $$0.a(gmj::H, a, this.K.F() + this.K.A() - 17, this.K.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(fof $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fou a(wp $$0, Supplier<fum> $$1) {
      return fou.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fou a(fum $$0, wp $$1, URI $$2) {
      return fou.a($$1, ftj.b($$0, $$2)).a(98).a();
   }

   static class a extends fum {
      private static final wp b = wp.c("menu.feedback.title");
      public final fum a;
      private final fsi c = new fsi(this);

      protected a(fum $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aR_() {
         this.c.a(b, this.p);
         fsh $$0 = this.c.c(new fsh());
         $$0.c().a(4, 4, 4, 0);
         fsh.b $$1 = $$0.d(2);
         fuh.a(this, $$1);
         this.c.b(fou.a(wo.k, $$0x -> this.aO_()).a(200).a());
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
