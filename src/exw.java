import java.util.function.Supplier;

public class exw extends eye {
   private static final tl a = tl.c("options.skinCustomisation");
   private static final tl b = tl.c("options.sounds");
   private static final tl c = tl.c("options.video");
   private static final tl k = tl.c("options.controls");
   private static final tl l = tl.c("options.language");
   private static final tl m = tl.c("options.chat");
   private static final tl n = tl.c("options.resourcepack");
   private static final tl o = tl.c("options.accessibility");
   private static final tl p = tl.c("options.telemetry");
   private static final tl q = tl.c("options.credits_and_attribution");
   private static final int s = 2;
   private final eye t;
   private final eqt u;
   private esr<bhb> v;
   private eta w;

   public exw(eye $$0, eqt $$1) {
      super(tl.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aH_() {
      evt $$0 = new evt();
      $$0.c().f(5).e(4).b();
      evt.b $$1 = $$0.d(2);
      $$1.a(this.u.ad().a(this.f.m, 0, 0, 150));
      $$1.a(this.l());
      $$1.a(evz.b(26), 2);
      $$1.a(this.a(a, () -> new eyh(this, this.u)));
      $$1.a(this.a(b, () -> new eyi(this, this.u)));
      $$1.a(this.a(c, () -> new eyl(this, this.u)));
      $$1.a(this.a(k, () -> new eyw(this, this.u)));
      $$1.a(this.a(l, () -> new exo(this, this.u, this.f.ae())));
      $$1.a(this.a(m, () -> new ewv(this, this.u)));
      $$1.a(this.a(n, () -> new fbk(this.f.aa(), this::a, this.f.ad(), tl.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new ewr(this, this.u)));
      $$1.a(this.a(p, () -> new fcq(this, this.u)));
      $$1.a(this.a(q, () -> new exc(this)));
      $$1.a(esk.a(tk.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      evs.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(anh $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private evw l() {
      if (this.f.r != null && this.f.S()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().n()) {
            this.w = new eta(0, 0, $$0x -> this.f.a(new ewy(this::c, tl.c("difficulty.lock.title"), tl.a("difficulty.lock.question", this.f.r.k().s().b()))));
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
         return esk.a(tl.c("options.online"), $$0x -> this.f.a(exv.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static esr<bhb> a(int $$0, int $$1, String $$2, eqp $$3) {
      return esr.a(bhb::b).a(bhb.values()).a($$3.r.ai()).a($$0, $$1, 150, 20, tl.c($$2), ($$1x, $$2x) -> $$3.J().b(new abi($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.J().b(new aby(true));
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
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private esk a(tl $$0, Supplier<eye> $$1) {
      return esk.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
