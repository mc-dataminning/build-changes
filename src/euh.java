import java.util.function.Supplier;

public class euh extends euq {
   private static final sw a = sw.c("options.skinCustomisation");
   private static final sw b = sw.c("options.sounds");
   private static final sw c = sw.c("options.video");
   private static final sw k = sw.c("options.controls");
   private static final sw l = sw.c("options.language");
   private static final sw m = sw.c("options.chat.title");
   private static final sw n = sw.c("options.resourcepack");
   private static final sw o = sw.c("options.accessibility.title");
   private static final sw p = sw.c("options.telemetry");
   private static final sw q = sw.c("options.credits_and_attribution");
   private static final int r = 2;
   private final euq s;
   private final enr t;
   private epp<bdu> u;
   private epw v;

   public euh(euq $$0, enr $$1) {
      super(sw.c("options.title"));
      this.s = $$0;
      this.t = $$1;
   }

   @Override
   protected void b() {
      esf $$0 = new esf();
      $$0.b().f(5).e(4).b();
      esf.b $$1 = $$0.d(2);
      $$1.a(this.t.ac().a(this.f.m, 0, 0, 150));
      $$1.a(this.l());
      $$1.a(esl.b(26), 2);
      $$1.a(this.a(a, () -> new eut(this, this.t)));
      $$1.a(this.a(b, () -> new euu(this, this.t)));
      $$1.a(this.a(c, () -> new eux(this, this.t)));
      $$1.a(this.a(k, () -> new evi(this, this.t)));
      $$1.a(this.a(l, () -> new eua(this, this.t, this.f.ad())));
      $$1.a(this.a(m, () -> new eth(this, this.t)));
      $$1.a(this.a(n, () -> new exv(this.f.Z(), this::a, this.f.ac(), sw.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new etd(this, this.t)));
      $$1.a(this.a(p, () -> new eyx(this, this.t)));
      $$1.a(this.a(q, () -> new eto(this)));
      $$1.a(epi.a(sv.d, $$0x -> this.f.a(this.s)).a(200).a(), 2, $$1.b().c(6));
      $$0.c();
      ese.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(aki $$0) {
      this.t.a($$0);
      this.f.a(this);
   }

   private esi l() {
      if (this.f.s != null && this.f.R()) {
         this.u = a(0, 0, "options.difficulty", this.f);
         if (!this.f.s.k().n()) {
            this.v = new epw(0, 0, $$0x -> this.f.a(new etk(this::c, sw.c("difficulty.lock.title"), sw.a("difficulty.lock.question", this.f.s.k().s().b()))));
            this.u.d(this.u.k() - this.v.k());
            this.v.b(this.f.s.k().t());
            this.v.r = !this.v.a();
            this.u.r = !this.v.a();
            esk $$0 = new esk(150, 0, esk.b.a);
            $$0.a(this.u);
            $$0.a(this.v);
            return $$0;
         } else {
            this.u.r = false;
            return this.u;
         }
      } else {
         return epi.a(sw.c("options.online"), $$0x -> this.f.a(eug.a(this.f, this, this.t))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static epp<bdu> a(int $$0, int $$1, String $$2, enn $$3) {
      return epp.a(bdu::b).a(bdu.values()).a($$3.s.ai()).a($$0, $$1, 150, 20, sw.c($$2), ($$1x, $$2x) -> $$3.I().a(new zf($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.s != null) {
         this.f.I().a(new zw(true));
         this.v.b(true);
         this.v.r = false;
         this.u.r = false;
      }
   }

   @Override
   public void ax_() {
      this.t.aq();
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
      super.a($$0, $$1, $$2, $$3);
   }

   private epi a(sw $$0, Supplier<euq> $$1) {
      return epi.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
