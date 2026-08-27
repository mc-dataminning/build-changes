import java.util.function.Supplier;

public class fal extends fau {
   private static final ur a = ur.c("options.skinCustomisation");
   private static final ur b = ur.c("options.sounds");
   private static final ur c = ur.c("options.video");
   private static final ur k = ur.c("options.controls");
   private static final ur l = ur.c("options.language");
   private static final ur m = ur.c("options.chat");
   private static final ur n = ur.c("options.resourcepack");
   private static final ur o = ur.c("options.accessibility");
   private static final ur p = ur.c("options.telemetry");
   private static final ur q = ur.c("options.credits_and_attribution");
   private static final int r = 2;
   private final fau t;
   private final eth u;
   private evg<biu> v;
   private evp w;

   public fal(fau $$0, eth $$1) {
      super(ur.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aP_() {
      eyi $$0 = new eyi();
      $$0.c().f(5).e(4).b();
      eyi.b $$1 = $$0.d(2);
      $$1.a(this.u.ae().a(this.f.m, 0, 0, 150));
      $$1.a(this.l());
      $$1.a(eyo.b(26), 2);
      $$1.a(this.a(a, () -> new fax(this, this.u)));
      $$1.a(this.a(b, () -> new fay(this, this.u)));
      $$1.a(this.a(c, () -> new fbb(this, this.u)));
      $$1.a(this.a(k, () -> new fbm(this, this.u)));
      $$1.a(this.a(l, () -> new fad(this, this.u, this.f.ad())));
      $$1.a(this.a(m, () -> new ezk(this, this.u)));
      $$1.a(this.a(n, () -> new feb(this.f.Z(), this::a, this.f.ac(), ur.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new ezg(this, this.u)));
      $$1.a(this.a(p, () -> new ffh(this, this.u)));
      $$1.a(this.a(q, () -> new ezr(this)));
      $$1.a(euz.a(uq.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      eyh.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(aos $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private eyl l() {
      if (this.f.r != null && this.f.R()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().n()) {
            this.w = new evp(0, 0, $$0x -> this.f.a(new ezn(this::c, ur.c("difficulty.lock.title"), ur.a("difficulty.lock.question", this.f.r.k().s().b()))));
            this.v.d(this.v.k() - this.w.k());
            this.w.b(this.f.r.k().t());
            this.w.i = !this.w.a();
            this.v.i = !this.w.a();
            eyg $$0 = new eyg(150, 0, eyg.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.i = false;
            return this.v;
         }
      } else {
         return euz.a(ur.c("options.online"), $$0x -> this.f.a(fak.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static evg<biu> a(int $$0, int $$1, String $$2, etd $$3) {
      return evg.a(biu::b).a(biu.values()).a($$3.r.aj()).a($$0, $$1, 150, 20, ur.c($$2), ($$1x, $$2x) -> $$3.I().b(new acq($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.I().b(new adh(true));
         this.w.b(true);
         this.w.i = false;
         this.v.i = false;
      }
   }

   @Override
   public void aG_() {
      this.u.as();
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private euz a(ur $$0, Supplier<fau> $$1) {
      return euz.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
