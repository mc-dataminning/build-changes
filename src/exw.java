import java.util.function.Supplier;

public class exw extends eyf {
   private static final ti a = ti.c("options.skinCustomisation");
   private static final ti b = ti.c("options.sounds");
   private static final ti c = ti.c("options.video");
   private static final ti k = ti.c("options.controls");
   private static final ti l = ti.c("options.language");
   private static final ti m = ti.c("options.chat.title");
   private static final ti n = ti.c("options.resourcepack");
   private static final ti o = ti.c("options.accessibility.title");
   private static final ti p = ti.c("options.telemetry");
   private static final ti q = ti.c("options.credits_and_attribution");
   private static final int s = 2;
   private final eyf t;
   private final equ u;
   private ess<bgq> v;
   private etb w;

   public exw(eyf $$0, equ $$1) {
      super(ti.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aD_() {
      evt $$0 = new evt();
      $$0.c().f(5).e(4).b();
      evt.b $$1 = $$0.d(2);
      $$1.a(this.u.ad().a(this.f.m, 0, 0, 150));
      $$1.a(this.l());
      $$1.a(evz.b(26), 2);
      $$1.a(this.a(a, () -> new eyi(this, this.u)));
      $$1.a(this.a(b, () -> new eyj(this, this.u)));
      $$1.a(this.a(c, () -> new eyl(this, this.u)));
      $$1.a(this.a(k, () -> new eyw(this, this.u)));
      $$1.a(this.a(l, () -> new exo(this, this.u, this.f.ae())));
      $$1.a(this.a(m, () -> new ewv(this, this.u)));
      $$1.a(this.a(n, () -> new fbk(this.f.aa(), this::a, this.f.ad(), ti.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new ewr(this, this.u)));
      $$1.a(this.a(p, () -> new fcq(this, this.u)));
      $$1.a(this.a(q, () -> new exc(this)));
      $$1.a(esl.a(th.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      evs.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(ana $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private evw l() {
      if (this.f.r != null && this.f.S()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().n()) {
            this.w = new etb(0, 0, $$0x -> this.f.a(new ewy(this::c, ti.c("difficulty.lock.title"), ti.a("difficulty.lock.question", this.f.r.k().s().b()))));
            this.v.d(this.v.l() - this.w.l());
            this.w.b(this.f.r.k().t());
            this.w.i = !this.w.a();
            this.v.i = !this.w.a();
            evr $$0 = new evr(150, 0, evr.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.i = false;
            return this.v;
         }
      } else {
         return esl.a(ti.c("options.online"), $$0x -> this.f.a(exv.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static ess<bgq> a(int $$0, int $$1, String $$2, eqq $$3) {
      return ess.a(bgq::b).a(bgq.values()).a($$3.r.ai()).a($$0, $$1, 150, 20, ti.c($$2), ($$1x, $$2x) -> $$3.J().b(new abe($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.J().b(new abv(true));
         this.w.b(true);
         this.w.i = false;
         this.v.i = false;
      }
   }

   @Override
   public void av_() {
      this.u.ar();
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private esl a(ti $$0, Supplier<eyf> $$1) {
      return esl.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
