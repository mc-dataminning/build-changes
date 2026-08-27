import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjs extends fjx {
   private static final ajv a = new ajv("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int o = 204;
   private static final int p = 98;
   private static final wi q = wi.c("menu.returnToGame");
   private static final wi r = wi.c("gui.advancements");
   private static final wi s = wi.c("gui.stats");
   private static final wi u = wi.c("menu.sendFeedback");
   private static final wi v = wi.c("menu.reportBugs");
   private static final wi w = wi.c("menu.options");
   private static final wi x = wi.c("menu.shareToLan");
   private static final wi y = wi.c("menu.playerReporting");
   private static final wi z = wi.c("menu.returnToMenu");
   private static final wi A = wi.c("menu.savingLevel");
   private static final wi B = wi.c("menu.game");
   private static final wi C = wi.c("menu.paused");
   private final boolean D;
   @Nullable
   private fdy E;

   public fjs(boolean $$0) {
      super($$0 ? B : C);
      this.D = $$0;
   }

   public boolean m() {
      return this.D;
   }

   @Override
   protected void aM_() {
      if (this.D) {
         this.C();
      }

      this.c(new fff(0, this.D ? 40 : 10, this.k, 9, this.i, this.m));
   }

   private void C() {
      fhk $$0 = new fhk();
      $$0.c().a(4, 4, 4, 0);
      fhk.b $$1 = $$0.d(2);
      $$1.a(fdy.a(q, $$0x -> {
         this.j.a(null);
         this.j.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(r, () -> new fkm(this.j.s.cv.q(), this)));
      $$1.a(this.a(s, () -> new fkg(this, this.j.s.j())));
      $$1.a(this.a(u, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(v, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(w, () -> new fjo(this, this.j.m)));
      if (this.j.U() && !this.j.V().r()) {
         $$1.a(this.a(x, () -> new fjy(this)));
      } else {
         $$1.a(this.a(y, () -> new fog(this)));
      }

      wi $$2 = this.j.T() ? z : wh.p;
      this.E = $$1.a(fdy.a($$2, $$0x -> {
         $$0x.j = false;
         this.j.ba().a(this.j, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      fhj.a($$0, 0, 0, this.k, this.l, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void D() {
      boolean $$0 = this.j.T();
      fve $$1 = this.j.S();
      this.j.r.X();
      if ($$0) {
         this.j.b(new fjd(A));
      } else {
         this.j.y();
      }

      fkc $$2 = new fkc();
      if ($$0) {
         this.j.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.j.a(new exc($$2));
      } else {
         this.j.a(new fmu($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.D && this.j != null && this.j.ba().c() && this.E != null) {
         $$0.a(a, this.E.C() + this.E.x() - 17, this.E.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      if (this.D) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fdy a(wi $$0, Supplier<fjx> $$1) {
      return fdy.a($$0, $$1x -> this.j.a($$1.get())).a(98).a();
   }

   private fdy a(wi $$0, String $$1) {
      return fdy.a($$0, fio.b(this, $$1)).a(98).a();
   }
}
