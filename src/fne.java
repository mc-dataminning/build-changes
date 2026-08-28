import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fne extends fnj {
   private static final akk a = new akk("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int q = 4;
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
   private fhs H;

   public fne(boolean $$0) {
      super($$0 ? E : F);
      this.G = $$0;
   }

   public boolean m() {
      return this.G;
   }

   @Override
   protected void aP_() {
      if (this.G) {
         this.E();
      }

      this.c(new fiz(0, this.G ? 40 : 10, this.m, 9, this.k, this.o));
   }

   private void E() {
      fle $$0 = new fle();
      $$0.c().a(4, 4, 4, 0);
      fle.b $$1 = $$0.d(2);
      $$1.a(fhs.a(u, $$0x -> {
         this.l.a(null);
         this.l.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(v, () -> new fnt(this.l.s.cB.p(), this)));
      $$1.a(this.a(w, () -> new fnn(this, this.l.s.j())));
      $$1.a(this.a(x, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(y, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(z, () -> new fqk(this, this.l.m)));
      if (this.l.U() && !this.l.V().r()) {
         $$1.a(this.a(A, () -> new fnk(this)));
      } else {
         $$1.a(this.a(B, () -> new fsa(this)));
      }

      wu $$2 = this.l.T() ? C : wt.p;
      this.H = $$1.a(fhs.a($$2, $$0x -> {
         $$0x.j = false;
         this.l.aZ().a(this.l, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      fld.a($$0, 0, 0, this.m, this.n, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void F() {
      boolean $$0 = this.l.T();
      fyx $$1 = this.l.S();
      this.l.r.Y();
      if ($$0) {
         this.l.b(new fmu(D));
      } else {
         this.l.y();
      }

      fnl $$2 = new fnl();
      if ($$0) {
         this.l.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.l.a(new fax($$2));
      } else {
         this.l.a(new fpy($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.G && this.l != null && this.l.aZ().c() && this.H != null) {
         $$0.a(a, this.H.D() + this.H.y() - 17, this.H.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      if (this.G) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fhs a(wu $$0, Supplier<fnj> $$1) {
      return fhs.a($$0, $$1x -> this.l.a($$1.get())).a(98).a();
   }

   private fhs a(wu $$0, String $$1) {
      return fhs.a($$0, fmg.b(this, $$1)).a(98).a();
   }
}
