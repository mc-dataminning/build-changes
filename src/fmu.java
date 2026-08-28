import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fmu extends fnd {
   private static final xp a = xp.c("options.title");
   private static final xp b = xp.c("options.skinCustomisation");
   private static final xp c = xp.c("options.sounds");
   private static final xp d = xp.c("options.video");
   private static final xp r = xp.c("options.controls");
   private static final xp s = xp.c("options.language");
   private static final xp u = xp.c("options.chat");
   private static final xp v = xp.c("options.resourcepack");
   private static final xp w = xp.c("options.accessibility");
   private static final xp x = xp.c("options.telemetry");
   private static final fip y = fip.a(xp.c("options.telemetry.disabled"));
   private static final xp z = xp.c("options.credits_and_attribution");
   private static final int A = 2;
   private final fkr B = new fkr(this, 61, 33);
   private final fnd C;
   private final ffj D;
   @Nullable
   private fhl<bqr> E;
   @Nullable
   private fhu F;

   public fmu(fnd $$0, ffj $$1) {
      super(a);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   protected void aM_() {
      fkv $$0 = this.B.a(fkv.d().a(8));
      $$0.a(new fil(a, this.p), fku::b);
      fkv $$1 = $$0.a(fkv.e()).a(8);
      $$1.a(this.D.ah().a(this.m.m));
      $$1.a(this.m());
      fkq $$2 = new fkq();
      $$2.c().f(4).e(4).b();
      fkq.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fng(this, this.D)));
      $$3.a(this.a(c, () -> new fnh(this, this.D)));
      $$3.a(this.a(d, () -> new fnk(this, this.D)));
      $$3.a(this.a(r, () -> new fnu(this, this.D)));
      $$3.a(this.a(s, () -> new fmm(this, this.D, this.m.ag())));
      $$3.a(this.a(u, () -> new fls(this, this.D)));
      $$3.a(this.a(v, () -> new fqj(this.m.ac(), this::a, this.m.af(), xp.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new flo(this, this.D)));
      fhe $$4 = $$3.a(this.a(x, () -> new frp(this, this.D)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(y);
      }

      $$3.a(this.a(z, () -> new flz(this)));
      this.B.c($$2);
      this.B.b(fhe.a(xo.d, $$0x -> this.d()).a(200).a());
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

   private void a(aua $$0) {
      this.D.a($$0);
      this.m.a(this);
   }

   private fkt m() {
      if (this.m.r != null && this.m.U()) {
         this.E = a(0, 0, "options.difficulty", this.m);
         if (!this.m.r.k().l()) {
            this.F = new fhu(0, 0, $$0x -> this.m.a(new flv(this::c, xp.c("difficulty.lock.title"), xp.a("difficulty.lock.question", this.m.r.k().q().b()))));
            this.E.k(this.E.x() - this.F.x());
            this.F.b(this.m.r.k().r());
            this.F.j = !this.F.a();
            this.E.j = !this.F.a();
            fko $$0 = new fko(150, 0, fko.b.a);
            $$0.a(this.E);
            $$0.a(this.F);
            return $$0;
         } else {
            this.E.j = false;
            return this.E;
         }
      } else {
         return fhe.a(xp.c("options.online"), $$0x -> this.m.a(fmt.a(this.m, this, this.D))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fhl<bqr> a(int $$0, int $$1, String $$2, fff $$3) {
      return fhl.a(bqr::b).a(bqr.values()).a($$3.r.al()).a($$0, $$1, 150, 20, xp.c($$2), ($$1x, $$2x) -> $$3.L().b(new aha($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.r != null && this.F != null && this.E != null) {
         this.m.L().b(new aht(true));
         this.F.b(true);
         this.F.j = false;
         this.E.j = false;
      }
   }

   @Override
   public void j() {
      this.D.av();
   }

   private fhe a(xp $$0, Supplier<fnd> $$1) {
      return fhe.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
