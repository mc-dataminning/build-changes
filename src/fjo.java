import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjo extends fjx {
   private static final wi a = wi.c("options.title");
   private static final wi b = wi.c("options.skinCustomisation");
   private static final wi c = wi.c("options.sounds");
   private static final wi d = wi.c("options.video");
   private static final wi o = wi.c("options.controls");
   private static final wi p = wi.c("options.language");
   private static final wi q = wi.c("options.chat");
   private static final wi r = wi.c("options.resourcepack");
   private static final wi s = wi.c("options.accessibility");
   private static final wi u = wi.c("options.telemetry");
   private static final wi v = wi.c("options.credits_and_attribution");
   private static final int w = 2;
   private final fhl x = new fhl(this, 61, 33);
   private final fjx y;
   private final fcc z;
   @Nullable
   private fef<boc> A;
   @Nullable
   private feo B;

   public fjo(fjx $$0, fcc $$1) {
      super(a);
      this.y = $$0;
      this.z = $$1;
   }

   @Override
   protected void aM_() {
      fhp $$0 = this.x.a(fhp.d().a(8));
      $$0.a(new fff(a, this.m), fho::b);
      fhp $$1 = $$0.a(fhp.e()).a(8);
      $$1.a(this.z.ah().a(this.j.m));
      $$1.a(this.m());
      fhk $$2 = new fhk();
      $$2.c().f(4).e(4).b();
      fhk.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fka(this, this.z)));
      $$3.a(this.a(c, () -> new fkb(this, this.z)));
      $$3.a(this.a(d, () -> new fke(this, this.z)));
      $$3.a(this.a(o, () -> new fko(this, this.z)));
      $$3.a(this.a(p, () -> new fjg(this, this.z, this.j.ag())));
      $$3.a(this.a(q, () -> new fim(this, this.z)));
      $$3.a(this.a(r, () -> new fnd(this.j.ac(), this::a, this.j.af(), wi.c("resourcePack.title"))));
      $$3.a(this.a(s, () -> new fii(this, this.z)));
      $$3.a(this.a(u, () -> new foj(this, this.z)));
      $$3.a(this.a(v, () -> new fit(this)));
      this.x.c($$2);
      this.x.b(fdy.a(wh.d, $$0x -> this.d()).a(200).a());
      this.x.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
   }

   @Override
   public void d() {
      this.j.a(this.y);
   }

   private void a(asp $$0) {
      this.z.a($$0);
      this.j.a(this);
   }

   private fhn m() {
      if (this.j.r != null && this.j.U()) {
         this.A = a(0, 0, "options.difficulty", this.j);
         if (!this.j.r.k().l()) {
            this.B = new feo(0, 0, $$0x -> this.j.a(new fip(this::c, wi.c("difficulty.lock.title"), wi.a("difficulty.lock.question", this.j.r.k().q().b()))));
            this.A.k(this.A.x() - this.B.x());
            this.B.b(this.j.r.k().r());
            this.B.j = !this.B.a();
            this.A.j = !this.B.a();
            fhi $$0 = new fhi(150, 0, fhi.b.a);
            $$0.a(this.A);
            $$0.a(this.B);
            return $$0;
         } else {
            this.A.j = false;
            return this.A;
         }
      } else {
         return fdy.a(wi.c("options.online"), $$0x -> this.j.a(fjn.a(this.j, this, this.z))).a(this.k / 2 + 5, this.l / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fef<boc> a(int $$0, int $$1, String $$2, fby $$3) {
      return fef.a(boc::b).a(boc.values()).a($$3.r.ak()).a($$0, $$1, 150, 20, wi.c($$2), ($$1x, $$2x) -> $$3.L().b(new afr($$2x)));
   }

   private void c(boolean $$0) {
      this.j.a(this);
      if ($$0 && this.j.r != null && this.B != null && this.A != null) {
         this.j.L().b(new agj(true));
         this.B.b(true);
         this.B.j = false;
         this.A.j = false;
      }
   }

   @Override
   public void j() {
      this.z.av();
   }

   private fdy a(wi $$0, Supplier<fjx> $$1) {
      return fdy.a($$0, $$1x -> this.j.a($$1.get())).a();
   }
}
