import java.util.function.Supplier;

public class faq extends faz {
   private static final uv a = uv.c("options.skinCustomisation");
   private static final uv b = uv.c("options.sounds");
   private static final uv c = uv.c("options.video");
   private static final uv k = uv.c("options.controls");
   private static final uv l = uv.c("options.language");
   private static final uv m = uv.c("options.chat");
   private static final uv n = uv.c("options.resourcepack");
   private static final uv o = uv.c("options.accessibility");
   private static final uv p = uv.c("options.telemetry");
   private static final uv q = uv.c("options.credits_and_attribution");
   private static final int r = 2;
   private final faz t;
   private final etm u;
   private evl<biy> v;
   private evu w;

   public faq(faz $$0, etm $$1) {
      super(uv.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aQ_() {
      eyn $$0 = new eyn();
      $$0.c().f(5).e(4).b();
      eyn.b $$1 = $$0.d(2);
      $$1.a(this.u.ae().a(this.f.m, 0, 0, 150));
      $$1.a(this.l());
      $$1.a(eyt.b(26), 2);
      $$1.a(this.a(a, () -> new fbc(this, this.u)));
      $$1.a(this.a(b, () -> new fbd(this, this.u)));
      $$1.a(this.a(c, () -> new fbg(this, this.u)));
      $$1.a(this.a(k, () -> new fbr(this, this.u)));
      $$1.a(this.a(l, () -> new fai(this, this.u, this.f.ad())));
      $$1.a(this.a(m, () -> new ezp(this, this.u)));
      $$1.a(this.a(n, () -> new feg(this.f.Z(), this::a, this.f.ac(), uv.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new ezl(this, this.u)));
      $$1.a(this.a(p, () -> new ffm(this, this.u)));
      $$1.a(this.a(q, () -> new ezw(this)));
      $$1.a(eve.a(uu.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      eym.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(aow $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private eyq l() {
      if (this.f.r != null && this.f.R()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().n()) {
            this.w = new evu(0, 0, $$0x -> this.f.a(new ezs(this::c, uv.c("difficulty.lock.title"), uv.a("difficulty.lock.question", this.f.r.k().s().b()))));
            this.v.d(this.v.k() - this.w.k());
            this.w.b(this.f.r.k().t());
            this.w.i = !this.w.a();
            this.v.i = !this.w.a();
            eyl $$0 = new eyl(150, 0, eyl.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.i = false;
            return this.v;
         }
      } else {
         return eve.a(uv.c("options.online"), $$0x -> this.f.a(fap.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static evl<biy> a(int $$0, int $$1, String $$2, eti $$3) {
      return evl.a(biy::b).a(biy.values()).a($$3.r.aj()).a($$0, $$1, 150, 20, uv.c($$2), ($$1x, $$2x) -> $$3.I().b(new acu($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.I().b(new adl(true));
         this.w.b(true);
         this.w.i = false;
         this.v.i = false;
      }
   }

   @Override
   public void aH_() {
      this.u.as();
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private eve a(uv $$0, Supplier<faz> $$1) {
      return eve.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
