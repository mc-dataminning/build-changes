import java.util.function.Supplier;

public class fgw extends fhf {
   private static final vu a = vu.c("options.skinCustomisation");
   private static final vu b = vu.c("options.sounds");
   private static final vu c = vu.c("options.video");
   private static final vu k = vu.c("options.controls");
   private static final vu l = vu.c("options.language");
   private static final vu m = vu.c("options.chat");
   private static final vu n = vu.c("options.resourcepack");
   private static final vu o = vu.c("options.accessibility");
   private static final vu p = vu.c("options.telemetry");
   private static final vu q = vu.c("options.credits_and_attribution");
   private static final int r = 2;
   private final fhf t;
   private final ezk u;
   private fbn<bmz> v;
   private fbw w;

   public fgw(fhf $$0, ezk $$1) {
      super(vu.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aO_() {
      fes $$0 = new fes();
      $$0.c().f(5).e(4).b();
      fes.b $$1 = $$0.d(2);
      $$1.a(this.u.af().a(this.f.m, 0, 0, 150));
      $$1.a(this.o());
      $$1.a(fey.b(26), 2);
      $$1.a(this.a(a, () -> new fhi(this, this.u)));
      $$1.a(this.a(b, () -> new fhj(this, this.u)));
      $$1.a(this.a(c, () -> new fhm(this, this.u)));
      $$1.a(this.a(k, () -> new fhx(this, this.u)));
      $$1.a(this.a(l, () -> new fgo(this, this.u, this.f.ag())));
      $$1.a(this.a(m, () -> new ffu(this, this.u)));
      $$1.a(this.a(n, () -> new fkm(this.f.ac(), this::a, this.f.af(), vu.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new ffq(this, this.u)));
      $$1.a(this.a(p, () -> new fls(this, this.u)));
      $$1.a(this.a(q, () -> new fgb(this)));
      $$1.a(fbg.a(vt.d, $$0x -> this.d()).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      fer.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::c);
   }

   @Override
   public void d() {
      this.f.a(this.t);
   }

   private void a(arz $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private fev o() {
      if (this.f.r != null && this.f.U()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().l()) {
            this.w = new fbw(0, 0, $$0x -> this.f.a(new ffx(this::c, vu.c("difficulty.lock.title"), vu.a("difficulty.lock.question", this.f.r.k().q().b()))));
            this.v.k(this.v.w() - this.w.w());
            this.w.b(this.f.r.k().r());
            this.w.j = !this.w.a();
            this.v.j = !this.w.a();
            feq $$0 = new feq(150, 0, feq.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.j = false;
            return this.v;
         }
      } else {
         return fbg.a(vu.c("options.online"), $$0x -> this.f.a(fgv.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fbn<bmz> a(int $$0, int $$1, String $$2, ezg $$3) {
      return fbn.a(bmz::b).a(bmz.values()).a($$3.r.aj()).a($$0, $$1, 150, 20, vu.c($$2), ($$1x, $$2x) -> $$3.L().b(new afd($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.L().b(new afv(true));
         this.w.b(true);
         this.w.j = false;
         this.v.j = false;
      }
   }

   @Override
   public void k() {
      this.u.at();
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private fbg a(vu $$0, Supplier<fhf> $$1) {
      return fbg.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
