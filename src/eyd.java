import java.util.function.Supplier;

public class eyd extends eym {
   private static final tn a = tn.c("options.skinCustomisation");
   private static final tn b = tn.c("options.sounds");
   private static final tn c = tn.c("options.video");
   private static final tn k = tn.c("options.controls");
   private static final tn l = tn.c("options.language");
   private static final tn m = tn.c("options.chat");
   private static final tn n = tn.c("options.resourcepack");
   private static final tn o = tn.c("options.accessibility");
   private static final tn p = tn.c("options.telemetry");
   private static final tn q = tn.c("options.credits_and_attribution");
   private static final int s = 2;
   private final eym t;
   private final erb u;
   private esz<bgx> v;
   private eti w;

   public eyd(eym $$0, erb $$1) {
      super(tn.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aH_() {
      ewa $$0 = new ewa();
      $$0.c().f(5).e(4).b();
      ewa.b $$1 = $$0.d(2);
      $$1.a(this.u.ad().a(this.f.m, 0, 0, 150));
      $$1.a(this.l());
      $$1.a(ewg.b(26), 2);
      $$1.a(this.a(a, () -> new eyp(this, this.u)));
      $$1.a(this.a(b, () -> new eyq(this, this.u)));
      $$1.a(this.a(c, () -> new eys(this, this.u)));
      $$1.a(this.a(k, () -> new ezd(this, this.u)));
      $$1.a(this.a(l, () -> new exv(this, this.u, this.f.ae())));
      $$1.a(this.a(m, () -> new exc(this, this.u)));
      $$1.a(this.a(n, () -> new fbr(this.f.aa(), this::a, this.f.ad(), tn.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new ewy(this, this.u)));
      $$1.a(this.a(p, () -> new fcx(this, this.u)));
      $$1.a(this.a(q, () -> new exj(this)));
      $$1.a(ess.a(tm.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      evz.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(ang $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private ewd l() {
      if (this.f.r != null && this.f.S()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().n()) {
            this.w = new eti(0, 0, $$0x -> this.f.a(new exf(this::c, tn.c("difficulty.lock.title"), tn.a("difficulty.lock.question", this.f.r.k().s().b()))));
            this.v.d(this.v.l() - this.w.l());
            this.w.b(this.f.r.k().t());
            this.w.i = !this.w.a();
            this.v.i = !this.w.a();
            evy $$0 = new evy(150, 0, evy.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.i = false;
            return this.v;
         }
      } else {
         return ess.a(tn.c("options.online"), $$0x -> this.f.a(eyc.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static esz<bgx> a(int $$0, int $$1, String $$2, eqx $$3) {
      return esz.a(bgx::b).a(bgx.values()).a($$3.r.ai()).a($$0, $$1, 150, 20, tn.c($$2), ($$1x, $$2x) -> $$3.J().b(new abj($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.J().b(new abz(true));
         this.w.b(true);
         this.w.i = false;
         this.v.i = false;
      }
   }

   @Override
   public void h() {
      this.u.ar();
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private ess a(tn $$0, Supplier<eym> $$1) {
      return ess.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
