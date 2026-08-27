import java.util.function.Supplier;

public class eyb extends eyk {
   private static final tl a = tl.c("options.skinCustomisation");
   private static final tl b = tl.c("options.sounds");
   private static final tl c = tl.c("options.video");
   private static final tl k = tl.c("options.controls");
   private static final tl l = tl.c("options.language");
   private static final tl m = tl.c("options.chat.title");
   private static final tl n = tl.c("options.resourcepack");
   private static final tl o = tl.c("options.accessibility.title");
   private static final tl p = tl.c("options.telemetry");
   private static final tl q = tl.c("options.credits_and_attribution");
   private static final int s = 2;
   private final eyk t;
   private final eqz u;
   private esx<bgv> v;
   private etg w;

   public eyb(eyk $$0, eqz $$1) {
      super(tl.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aI_() {
      evy $$0 = new evy();
      $$0.c().f(5).e(4).b();
      evy.b $$1 = $$0.d(2);
      $$1.a(this.u.ad().a(this.f.m, 0, 0, 150));
      $$1.a(this.l());
      $$1.a(ewe.b(26), 2);
      $$1.a(this.a(a, () -> new eyn(this, this.u)));
      $$1.a(this.a(b, () -> new eyo(this, this.u)));
      $$1.a(this.a(c, () -> new eyq(this, this.u)));
      $$1.a(this.a(k, () -> new ezb(this, this.u)));
      $$1.a(this.a(l, () -> new ext(this, this.u, this.f.ae())));
      $$1.a(this.a(m, () -> new exa(this, this.u)));
      $$1.a(this.a(n, () -> new fbp(this.f.aa(), this::a, this.f.ad(), tl.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new eww(this, this.u)));
      $$1.a(this.a(p, () -> new fcv(this, this.u)));
      $$1.a(this.a(q, () -> new exh(this)));
      $$1.a(esq.a(tk.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      evx.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(anf $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private ewb l() {
      if (this.f.r != null && this.f.S()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().n()) {
            this.w = new etg(0, 0, $$0x -> this.f.a(new exd(this::c, tl.c("difficulty.lock.title"), tl.a("difficulty.lock.question", this.f.r.k().s().b()))));
            this.v.d(this.v.l() - this.w.l());
            this.w.b(this.f.r.k().t());
            this.w.i = !this.w.a();
            this.v.i = !this.w.a();
            evw $$0 = new evw(150, 0, evw.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.i = false;
            return this.v;
         }
      } else {
         return esq.a(tl.c("options.online"), $$0x -> this.f.a(eya.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static esx<bgv> a(int $$0, int $$1, String $$2, eqv $$3) {
      return esx.a(bgv::b).a(bgv.values()).a($$3.r.ai()).a($$0, $$1, 150, 20, tl.c($$2), ($$1x, $$2x) -> $$3.J().b(new abi($$2x)));
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
   public void aA_() {
      this.u.ar();
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private esq a(tl $$0, Supplier<eyk> $$1) {
      return esq.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
