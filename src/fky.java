import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fky extends fld {
   private static final akh a = new akh("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int r = 204;
   private static final int s = 98;
   private static final wu u = wu.c("menu.returnToGame");
   private static final wu v = wu.c("gui.advancements");
   private static final wu w = wu.c("gui.stats");
   private static final wu x = wu.c("menu.sendFeedback");
   private static final wu y = wu.c("menu.reportBugs");
   private static final wu z = wu.c("menu.options");
   private static final wu A = wu.c("menu.shareToLan");
   private static final wu B = wu.c("menu.playerReporting");
   private static final wu C = wu.c("menu.returnToMenu");
   private static final wu D = wu.c("menu.savingLevel");
   private static final wu E = wu.c("menu.game");
   private static final wu F = wu.c("menu.paused");
   private final boolean G;
   @Nullable
   private ffe H;

   public fky(boolean $$0) {
      super($$0 ? E : F);
      this.G = $$0;
   }

   public boolean m() {
      return this.G;
   }

   @Override
   protected void aM_() {
      if (this.G) {
         this.C();
      }

      this.c(new fgl(0, this.G ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void C() {
      fiq $$0 = new fiq();
      $$0.c().a(4, 4, 4, 0);
      fiq.b $$1 = $$0.d(2);
      $$1.a(ffe.a(u, $$0x -> {
         this.m.a(null);
         this.m.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(v, () -> new fls(this.m.s.h.q(), this)));
      $$1.a(this.a(w, () -> new flm(this, this.m.s.j())));
      $$1.a(this.a(x, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(y, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(z, () -> new fku(this, this.m.m)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(A, () -> new fle(this)));
      } else {
         $$1.a(this.a(B, () -> new fpn(this)));
      }

      wu $$2 = this.m.T() ? C : wt.p;
      this.H = $$1.a(ffe.a($$2, $$0x -> {
         $$0x.j = false;
         this.m.bb().a(this.m, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      fip.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void D() {
      boolean $$0 = this.m.T();
      fwk $$1 = this.m.S();
      this.m.r.X();
      if ($$0) {
         this.m.b(new fkj(D));
      } else {
         this.m.y();
      }

      fli $$2 = new fli();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new eyi($$2));
      } else {
         this.m.a(new foa($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.G && this.m != null && this.m.bb().c() && this.H != null) {
         $$0.a(a, this.H.C() + this.H.x() - 17, this.H.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
      if (this.G) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private ffe a(wu $$0, Supplier<fld> $$1) {
      return ffe.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private ffe a(wu $$0, String $$1) {
      return ffe.a($$0, fju.b(this, $$1)).a(98).a();
   }
}
