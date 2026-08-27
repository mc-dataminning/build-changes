import java.util.function.Supplier;

public class fdd extends fdm {
   private static final vg a = vg.c("options.skinCustomisation");
   private static final vg b = vg.c("options.sounds");
   private static final vg c = vg.c("options.video");
   private static final vg k = vg.c("options.controls");
   private static final vg l = vg.c("options.language");
   private static final vg m = vg.c("options.chat");
   private static final vg n = vg.c("options.resourcepack");
   private static final vg o = vg.c("options.accessibility");
   private static final vg p = vg.c("options.telemetry");
   private static final vg q = vg.c("options.credits_and_attribution");
   private static final int r = 2;
   private final fdm t;
   private final evv u;
   private exy<bjz> v;
   private eyh w;

   public fdd(fdm $$0, evv $$1) {
      super(vg.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aP_() {
      fba $$0 = new fba();
      $$0.c().f(5).e(4).b();
      fba.b $$1 = $$0.d(2);
      $$1.a(this.u.ae().a(this.f.m, 0, 0, 150));
      $$1.a(this.o());
      $$1.a(fbg.b(26), 2);
      $$1.a(this.a(a, () -> new fdp(this, this.u)));
      $$1.a(this.a(b, () -> new fdq(this, this.u)));
      $$1.a(this.a(c, () -> new fdt(this, this.u)));
      $$1.a(this.a(k, () -> new fee(this, this.u)));
      $$1.a(this.a(l, () -> new fcv(this, this.u, this.f.ae())));
      $$1.a(this.a(m, () -> new fcc(this, this.u)));
      $$1.a(this.a(n, () -> new fgt(this.f.aa(), this::a, this.f.ad(), vg.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new fby(this, this.u)));
      $$1.a(this.a(p, () -> new fhz(this, this.u)));
      $$1.a(this.a(q, () -> new fcj(this)));
      $$1.a(exr.a(vf.d, $$0x -> this.d()).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      faz.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   @Override
   public void d() {
      this.f.a(this.t);
   }

   private void a(apu $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private fbd o() {
      if (this.f.r != null && this.f.S()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().n()) {
            this.w = new eyh(0, 0, $$0x -> this.f.a(new fcf(this::c, vg.c("difficulty.lock.title"), vg.a("difficulty.lock.question", this.f.r.k().s().b()))));
            this.v.l(this.v.w() - this.w.w());
            this.w.b(this.f.r.k().t());
            this.w.j = !this.w.a();
            this.v.j = !this.w.a();
            fay $$0 = new fay(150, 0, fay.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.j = false;
            return this.v;
         }
      } else {
         return exr.a(vg.c("options.online"), $$0x -> this.f.a(fdc.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static exy<bjz> a(int $$0, int $$1, String $$2, evr $$3) {
      return exy.a(bjz::b).a(bjz.values()).a($$3.r.ak()).a($$0, $$1, 150, 20, vg.c($$2), ($$1x, $$2x) -> $$3.J().b(new adp($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.J().b(new aeg(true));
         this.w.b(true);
         this.w.j = false;
         this.v.j = false;
      }
   }

   @Override
   public void k() {
      this.u.as();
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private exr a(vg $$0, Supplier<fdm> $$1) {
      return exr.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
