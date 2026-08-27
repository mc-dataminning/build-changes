import java.util.function.Supplier;
import javax.annotation.Nullable;

public class foh extends fon {
   private static final akt a = new akt("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int r = 204;
   private static final int s = 98;
   private static final xe u = xe.c("menu.returnToGame");
   private static final xe v = xe.c("gui.advancements");
   private static final xe w = xe.c("gui.stats");
   private static final xe x = xe.c("menu.sendFeedback");
   private static final xe y = xe.c("menu.reportBugs");
   private static final xe z = xe.c("menu.options");
   private static final xe A = xe.c("menu.shareToLan");
   private static final xe B = xe.c("menu.playerReporting");
   private static final xe C = xe.c("menu.returnToMenu");
   private static final xe D = xe.c("menu.savingLevel");
   private static final xe E = xe.c("menu.game");
   private static final xe F = xe.c("menu.paused");
   private final boolean G;
   @Nullable
   private fin H;

   public foh(boolean $$0) {
      super($$0 ? E : F);
      this.G = $$0;
   }

   public boolean m() {
      return this.G;
   }

   @Override
   protected void aN_() {
      if (this.G) {
         this.B();
      }

      this.c(new fju(0, this.G ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void B() {
      flz $$0 = new flz();
      $$0.c().a(4, 4, 4, 0);
      flz.b $$1 = $$0.d(2);
      $$1.a(fin.a(u, $$0x -> {
         this.m.a(null);
         this.m.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(v, () -> new fpe(this.m.s.h.q(), this)));
      $$1.a(this.a(w, () -> new foy(this, this.m.s.j())));
      $$1.a(this.a(x, ab.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(y, "https://aka.ms/snapshotbugs?ref=game")).j = !ab.b().d().a();
      $$1.a(this.a(z, () -> new fod(this, this.m.m)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(A, () -> new foo(this)));
      } else {
         $$1.a(this.a(B, () -> new ftb(this)));
      }

      xe $$2 = this.m.T() ? C : xd.p;
      this.H = $$1.a(fin.a($$2, $$0x -> {
         $$0x.j = false;
         this.m.bb().a(this.m, this, this::C, true);
      }).a(204).a(), 2);
      $$0.a();
      fly.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void C() {
      boolean $$0 = this.m.T();
      gab $$1 = this.m.S();
      this.m.r.Y();
      if ($$0) {
         this.m.b(new fns(D));
      } else {
         this.m.y();
      }

      fou $$2 = new fou();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fbn($$2));
      } else {
         this.m.a(new frp($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.G && this.m != null && this.m.bb().c() && this.H != null) {
         $$0.a(a, this.H.C() + this.H.x() - 17, this.H.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      if (this.G) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fin a(xe $$0, Supplier<fon> $$1) {
      return fin.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private fin a(xe $$0, String $$1) {
      return fin.a($$0, fnd.b(this, $$1)).a(98).a();
   }
}
