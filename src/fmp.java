import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fmp extends fmy {
   private static final xl a = xl.c("options.title");
   private static final xl b = xl.c("options.skinCustomisation");
   private static final xl c = xl.c("options.sounds");
   private static final xl d = xl.c("options.video");
   private static final xl r = xl.c("options.controls");
   private static final xl s = xl.c("options.language");
   private static final xl u = xl.c("options.chat");
   private static final xl v = xl.c("options.resourcepack");
   private static final xl w = xl.c("options.accessibility");
   private static final xl x = xl.c("options.telemetry");
   private static final fik y = fik.a(xl.c("options.telemetry.disabled"));
   private static final xl z = xl.c("options.credits_and_attribution");
   private static final int A = 2;
   private final fkm B = new fkm(this, 61, 33);
   private final fmy C;
   private final ffe D;
   @Nullable
   private fhg<bqm> E;
   @Nullable
   private fhp F;

   public fmp(fmy $$0, ffe $$1) {
      super(a);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   protected void aN_() {
      fkq $$0 = this.B.a(fkq.d().a(8));
      $$0.a(new fig(a, this.p), fkp::b);
      fkq $$1 = $$0.a(fkq.e()).a(8);
      $$1.a(this.D.ah().a(this.m.m));
      $$1.a(this.m());
      fkl $$2 = new fkl();
      $$2.c().f(4).e(4).b();
      fkl.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fnb(this, this.D)));
      $$3.a(this.a(c, () -> new fnc(this, this.D)));
      $$3.a(this.a(d, () -> new fnf(this, this.D)));
      $$3.a(this.a(r, () -> new fnp(this, this.D)));
      $$3.a(this.a(s, () -> new fmh(this, this.D, this.m.ag())));
      $$3.a(this.a(u, () -> new fln(this, this.D)));
      $$3.a(this.a(v, () -> new fqe(this.m.ac(), this::a, this.m.af(), xl.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new flj(this, this.D)));
      fgz $$4 = $$3.a(this.a(x, () -> new frk(this, this.D)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(y);
      }

      $$3.a(this.a(z, () -> new flu(this)));
      this.B.c($$2);
      this.B.b(fgz.a(xk.d, $$0x -> this.d()).a(200).a());
      this.B.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
   }

   @Override
   public void d() {
      this.m.a(this.C);
   }

   private void a(atw $$0) {
      this.D.a($$0);
      this.m.a(this);
   }

   private fko m() {
      if (this.m.r != null && this.m.U()) {
         this.E = a(0, 0, "options.difficulty", this.m);
         if (!this.m.r.k().l()) {
            this.F = new fhp(0, 0, $$0x -> this.m.a(new flq(this::c, xl.c("difficulty.lock.title"), xl.a("difficulty.lock.question", this.m.r.k().q().b()))));
            this.E.k(this.E.x() - this.F.x());
            this.F.b(this.m.r.k().r());
            this.F.j = !this.F.a();
            this.E.j = !this.F.a();
            fkj $$0 = new fkj(150, 0, fkj.b.a);
            $$0.a(this.E);
            $$0.a(this.F);
            return $$0;
         } else {
            this.E.j = false;
            return this.E;
         }
      } else {
         return fgz.a(xl.c("options.online"), $$0x -> this.m.a(fmo.a(this.m, this, this.D))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fhg<bqm> a(int $$0, int $$1, String $$2, ffa $$3) {
      return fhg.a(bqm::b).a(bqm.values()).a($$3.r.al()).a($$0, $$1, 150, 20, xl.c($$2), ($$1x, $$2x) -> $$3.L().b(new agw($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.r != null && this.F != null && this.E != null) {
         this.m.L().b(new ahp(true));
         this.F.b(true);
         this.F.j = false;
         this.E.j = false;
      }
   }

   @Override
   public void j() {
      this.D.av();
   }

   private fgz a(xl $$0, Supplier<fmy> $$1) {
      return fgz.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
