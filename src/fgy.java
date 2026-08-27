import java.util.function.Supplier;

public class fgy extends fhh {
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
   private final fhh t;
   private final ezm u;
   private fbp<bna> v;
   private fby w;

   public fgy(fhh $$0, ezm $$1) {
      super(vu.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aO_() {
      feu $$0 = new feu();
      $$0.c().f(5).e(4).b();
      feu.b $$1 = $$0.d(2);
      $$1.a(this.u.af().a(this.f.m, 0, 0, 150));
      $$1.a(this.o());
      $$1.a(ffa.b(26), 2);
      $$1.a(this.a(a, () -> new fhk(this, this.u)));
      $$1.a(this.a(b, () -> new fhl(this, this.u)));
      $$1.a(this.a(c, () -> new fho(this, this.u)));
      $$1.a(this.a(k, () -> new fhz(this, this.u)));
      $$1.a(this.a(l, () -> new fgq(this, this.u, this.f.ag())));
      $$1.a(this.a(m, () -> new ffw(this, this.u)));
      $$1.a(this.a(n, () -> new fko(this.f.ac(), this::a, this.f.af(), vu.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new ffs(this, this.u)));
      $$1.a(this.a(p, () -> new flu(this, this.u)));
      $$1.a(this.a(q, () -> new fgd(this)));
      $$1.a(fbi.a(vt.d, $$0x -> this.d()).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      fet.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
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

   private fex o() {
      if (this.f.r != null && this.f.U()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().l()) {
            this.w = new fby(0, 0, $$0x -> this.f.a(new ffz(this::c, vu.c("difficulty.lock.title"), vu.a("difficulty.lock.question", this.f.r.k().q().b()))));
            this.v.k(this.v.w() - this.w.w());
            this.w.b(this.f.r.k().r());
            this.w.j = !this.w.a();
            this.v.j = !this.w.a();
            fes $$0 = new fes(150, 0, fes.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.j = false;
            return this.v;
         }
      } else {
         return fbi.a(vu.c("options.online"), $$0x -> this.f.a(fgx.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fbp<bna> a(int $$0, int $$1, String $$2, ezi $$3) {
      return fbp.a(bna::b).a(bna.values()).a($$3.r.aj()).a($$0, $$1, 150, 20, vu.c($$2), ($$1x, $$2x) -> $$3.L().b(new afd($$2x)));
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
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private fbi a(vu $$0, Supplier<fhh> $$1) {
      return fbi.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
