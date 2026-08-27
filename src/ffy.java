import java.util.function.Supplier;

public class ffy extends fgh {
   private static final vs a = vs.c("options.skinCustomisation");
   private static final vs b = vs.c("options.sounds");
   private static final vs c = vs.c("options.video");
   private static final vs k = vs.c("options.controls");
   private static final vs l = vs.c("options.language");
   private static final vs m = vs.c("options.chat");
   private static final vs n = vs.c("options.resourcepack");
   private static final vs o = vs.c("options.accessibility");
   private static final vs p = vs.c("options.telemetry");
   private static final vs q = vs.c("options.credits_and_attribution");
   private static final int r = 2;
   private final fgh t;
   private final eyo u;
   private far<bmi> v;
   private fba w;

   public ffy(fgh $$0, eyo $$1) {
      super(vs.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aP_() {
      fdv $$0 = new fdv();
      $$0.c().f(5).e(4).b();
      fdv.b $$1 = $$0.d(2);
      $$1.a(this.u.ae().a(this.f.m, 0, 0, 150));
      $$1.a(this.o());
      $$1.a(feb.b(26), 2);
      $$1.a(this.a(a, () -> new fgk(this, this.u)));
      $$1.a(this.a(b, () -> new fgl(this, this.u)));
      $$1.a(this.a(c, () -> new fgo(this, this.u)));
      $$1.a(this.a(k, () -> new fgz(this, this.u)));
      $$1.a(this.a(l, () -> new ffq(this, this.u, this.f.af())));
      $$1.a(this.a(m, () -> new fex(this, this.u)));
      $$1.a(this.a(n, () -> new fjo(this.f.ab(), this::a, this.f.ae(), vs.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new fet(this, this.u)));
      $$1.a(this.a(p, () -> new fku(this, this.u)));
      $$1.a(this.a(q, () -> new ffe(this)));
      $$1.a(fak.a(vr.d, $$0x -> this.d()).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      fdu.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::c);
   }

   @Override
   public void d() {
      this.f.a(this.t);
   }

   private void a(arq $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private fdy o() {
      if (this.f.r != null && this.f.T()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().l()) {
            this.w = new fba(0, 0, $$0x -> this.f.a(new ffa(this::c, vs.c("difficulty.lock.title"), vs.a("difficulty.lock.question", this.f.r.k().q().b()))));
            this.v.k(this.v.w() - this.w.w());
            this.w.b(this.f.r.k().r());
            this.w.j = !this.w.a();
            this.v.j = !this.w.a();
            fdt $$0 = new fdt(150, 0, fdt.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.j = false;
            return this.v;
         }
      } else {
         return fak.a(vs.c("options.online"), $$0x -> this.f.a(ffx.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static far<bmi> a(int $$0, int $$1, String $$2, eyk $$3) {
      return far.a(bmi::b).a(bmi.values()).a($$3.r.aj()).a($$0, $$1, 150, 20, vs.c($$2), ($$1x, $$2x) -> $$3.K().b(new aez($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.K().b(new afr(true));
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
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private fak a(vs $$0, Supplier<fgh> $$1) {
      return fak.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
