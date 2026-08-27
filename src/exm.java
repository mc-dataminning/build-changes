import java.util.function.Supplier;

public class exm extends exv {
   private static final te a = te.c("options.skinCustomisation");
   private static final te b = te.c("options.sounds");
   private static final te c = te.c("options.video");
   private static final te k = te.c("options.controls");
   private static final te l = te.c("options.language");
   private static final te m = te.c("options.chat.title");
   private static final te n = te.c("options.resourcepack");
   private static final te o = te.c("options.accessibility.title");
   private static final te p = te.c("options.telemetry");
   private static final te q = te.c("options.credits_and_attribution");
   private static final int s = 2;
   private final exv t;
   private final eqr u;
   private esp<bgl> v;
   private esy w;

   public exm(exv $$0, eqr $$1) {
      super(te.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aE_() {
      evj $$0 = new evj();
      $$0.c().f(5).e(4).b();
      evj.b $$1 = $$0.d(2);
      $$1.a(this.u.ac().a(this.f.m, 0, 0, 150));
      $$1.a(this.l());
      $$1.a(evp.b(26), 2);
      $$1.a(this.a(a, () -> new exy(this, this.u)));
      $$1.a(this.a(b, () -> new exz(this, this.u)));
      $$1.a(this.a(c, () -> new eyb(this, this.u)));
      $$1.a(this.a(k, () -> new eym(this, this.u)));
      $$1.a(this.a(l, () -> new exe(this, this.u, this.f.ad())));
      $$1.a(this.a(m, () -> new ewl(this, this.u)));
      $$1.a(this.a(n, () -> new fba(this.f.Z(), this::a, this.f.ac(), te.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new ewh(this, this.u)));
      $$1.a(this.a(p, () -> new fcc(this, this.u)));
      $$1.a(this.a(q, () -> new ews(this)));
      $$1.a(esi.a(td.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      evi.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(amv $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private evm l() {
      if (this.f.s != null && this.f.R()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.s.k().n()) {
            this.w = new esy(0, 0, $$0x -> this.f.a(new ewo(this::c, te.c("difficulty.lock.title"), te.a("difficulty.lock.question", this.f.s.k().s().b()))));
            this.v.d(this.v.k() - this.w.k());
            this.w.b(this.f.s.k().t());
            this.w.i = !this.w.a();
            this.v.i = !this.w.a();
            evh $$0 = new evh(150, 0, evh.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.i = false;
            return this.v;
         }
      } else {
         return esi.a(te.c("options.online"), $$0x -> this.f.a(exl.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static esp<bgl> a(int $$0, int $$1, String $$2, eqn $$3) {
      return esp.a(bgl::b).a(bgl.values()).a($$3.s.ai()).a($$0, $$1, 150, 20, te.c($$2), ($$1x, $$2x) -> $$3.I().b(new aaz($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.s != null) {
         this.f.I().b(new abq(true));
         this.w.b(true);
         this.w.i = false;
         this.v.i = false;
      }
   }

   @Override
   public void h() {
      this.u.aq();
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private esi a(te $$0, Supplier<exv> $$1) {
      return esi.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
