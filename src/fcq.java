import java.util.function.Supplier;

public class fcq extends fcz {
   private static final vf a = vf.c("options.skinCustomisation");
   private static final vf b = vf.c("options.sounds");
   private static final vf c = vf.c("options.video");
   private static final vf k = vf.c("options.controls");
   private static final vf l = vf.c("options.language");
   private static final vf m = vf.c("options.chat");
   private static final vf n = vf.c("options.resourcepack");
   private static final vf o = vf.c("options.accessibility");
   private static final vf p = vf.c("options.telemetry");
   private static final vf q = vf.c("options.credits_and_attribution");
   private static final int r = 2;
   private final fcz t;
   private final evk u;
   private exl<bjx> v;
   private exu w;

   public fcq(fcz $$0, evk $$1) {
      super(vf.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aN_() {
      fan $$0 = new fan();
      $$0.c().f(5).e(4).b();
      fan.b $$1 = $$0.d(2);
      $$1.a(this.u.ae().a(this.f.m, 0, 0, 150));
      $$1.a(this.n());
      $$1.a(fat.b(26), 2);
      $$1.a(this.a(a, () -> new fdc(this, this.u)));
      $$1.a(this.a(b, () -> new fdd(this, this.u)));
      $$1.a(this.a(c, () -> new fdg(this, this.u)));
      $$1.a(this.a(k, () -> new fdr(this, this.u)));
      $$1.a(this.a(l, () -> new fci(this, this.u, this.f.ae())));
      $$1.a(this.a(m, () -> new fbp(this, this.u)));
      $$1.a(this.a(n, () -> new fgg(this.f.aa(), this::a, this.f.ad(), vf.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new fbl(this, this.u)));
      $$1.a(this.a(p, () -> new fhm(this, this.u)));
      $$1.a(this.a(q, () -> new fbw(this)));
      $$1.a(exe.a(ve.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      fam.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(aps $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private faq n() {
      if (this.f.r != null && this.f.S()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().n()) {
            this.w = new exu(0, 0, $$0x -> this.f.a(new fbs(this::c, vf.c("difficulty.lock.title"), vf.a("difficulty.lock.question", this.f.r.k().s().b()))));
            this.v.l(this.v.w() - this.w.w());
            this.w.b(this.f.r.k().t());
            this.w.j = !this.w.a();
            this.v.j = !this.w.a();
            fal $$0 = new fal(150, 0, fal.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.j = false;
            return this.v;
         }
      } else {
         return exe.a(vf.c("options.online"), $$0x -> this.f.a(fcp.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static exl<bjx> a(int $$0, int $$1, String $$2, evg $$3) {
      return exl.a(bjx::b).a(bjx.values()).a($$3.r.ak()).a($$0, $$1, 150, 20, vf.c($$2), ($$1x, $$2x) -> $$3.J().b(new ado($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.J().b(new aef(true));
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
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private exe a(vf $$0, Supplier<fcz> $$1) {
      return exe.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
