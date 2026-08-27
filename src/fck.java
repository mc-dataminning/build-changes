import java.util.function.Supplier;

public class fck extends fct {
   private static final vd a = vd.c("options.skinCustomisation");
   private static final vd b = vd.c("options.sounds");
   private static final vd c = vd.c("options.video");
   private static final vd k = vd.c("options.controls");
   private static final vd l = vd.c("options.language");
   private static final vd m = vd.c("options.chat");
   private static final vd n = vd.c("options.resourcepack");
   private static final vd o = vd.c("options.accessibility");
   private static final vd p = vd.c("options.telemetry");
   private static final vd q = vd.c("options.credits_and_attribution");
   private static final int r = 2;
   private final fct t;
   private final eve u;
   private exf<bjs> v;
   private exo w;

   public fck(fct $$0, eve $$1) {
      super(vd.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aN_() {
      fah $$0 = new fah();
      $$0.c().f(5).e(4).b();
      fah.b $$1 = $$0.d(2);
      $$1.a(this.u.ae().a(this.f.m, 0, 0, 150));
      $$1.a(this.n());
      $$1.a(fan.b(26), 2);
      $$1.a(this.a(a, () -> new fcw(this, this.u)));
      $$1.a(this.a(b, () -> new fcx(this, this.u)));
      $$1.a(this.a(c, () -> new fda(this, this.u)));
      $$1.a(this.a(k, () -> new fdl(this, this.u)));
      $$1.a(this.a(l, () -> new fcc(this, this.u, this.f.ad())));
      $$1.a(this.a(m, () -> new fbj(this, this.u)));
      $$1.a(this.a(n, () -> new fga(this.f.Z(), this::a, this.f.ac(), vd.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new fbf(this, this.u)));
      $$1.a(this.a(p, () -> new fhg(this, this.u)));
      $$1.a(this.a(q, () -> new fbq(this)));
      $$1.a(ewy.a(vc.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      fag.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(apn $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private fak n() {
      if (this.f.r != null && this.f.R()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().n()) {
            this.w = new exo(0, 0, $$0x -> this.f.a(new fbm(this::c, vd.c("difficulty.lock.title"), vd.a("difficulty.lock.question", this.f.r.k().s().b()))));
            this.v.l(this.v.w() - this.w.w());
            this.w.b(this.f.r.k().t());
            this.w.j = !this.w.a();
            this.v.j = !this.w.a();
            faf $$0 = new faf(150, 0, faf.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.j = false;
            return this.v;
         }
      } else {
         return ewy.a(vd.c("options.online"), $$0x -> this.f.a(fcj.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static exf<bjs> a(int $$0, int $$1, String $$2, eva $$3) {
      return exf.a(bjs::b).a(bjs.values()).a($$3.r.ak()).a($$0, $$1, 150, 20, vd.c($$2), ($$1x, $$2x) -> $$3.I().b(new adl($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.I().b(new aec(true));
         this.w.b(true);
         this.w.j = false;
         this.v.j = false;
      }
   }

   @Override
   public void j() {
      this.u.as();
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private ewy a(vd $$0, Supplier<fct> $$1) {
      return ewy.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
