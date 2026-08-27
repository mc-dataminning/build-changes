import java.util.function.Supplier;

public class fbt extends fcc {
   private static final vb a = vb.c("options.skinCustomisation");
   private static final vb b = vb.c("options.sounds");
   private static final vb c = vb.c("options.video");
   private static final vb k = vb.c("options.controls");
   private static final vb l = vb.c("options.language");
   private static final vb m = vb.c("options.chat");
   private static final vb n = vb.c("options.resourcepack");
   private static final vb o = vb.c("options.accessibility");
   private static final vb p = vb.c("options.telemetry");
   private static final vb q = vb.c("options.credits_and_attribution");
   private static final int r = 2;
   private final fcc t;
   private final euo u;
   private ewo<bji> v;
   private ewx w;

   public fbt(fcc $$0, euo $$1) {
      super(vb.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aP_() {
      ezq $$0 = new ezq();
      $$0.c().f(5).e(4).b();
      ezq.b $$1 = $$0.d(2);
      $$1.a(this.u.ae().a(this.f.m, 0, 0, 150));
      $$1.a(this.l());
      $$1.a(ezw.b(26), 2);
      $$1.a(this.a(a, () -> new fcf(this, this.u)));
      $$1.a(this.a(b, () -> new fcg(this, this.u)));
      $$1.a(this.a(c, () -> new fcj(this, this.u)));
      $$1.a(this.a(k, () -> new fcu(this, this.u)));
      $$1.a(this.a(l, () -> new fbl(this, this.u, this.f.ad())));
      $$1.a(this.a(m, () -> new fas(this, this.u)));
      $$1.a(this.a(n, () -> new ffj(this.f.Z(), this::a, this.f.ac(), vb.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new fao(this, this.u)));
      $$1.a(this.a(p, () -> new fgp(this, this.u)));
      $$1.a(this.a(q, () -> new faz(this)));
      $$1.a(ewh.a(va.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      ezp.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(apd $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private ezt l() {
      if (this.f.r != null && this.f.R()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().n()) {
            this.w = new ewx(0, 0, $$0x -> this.f.a(new fav(this::c, vb.c("difficulty.lock.title"), vb.a("difficulty.lock.question", this.f.r.k().s().b()))));
            this.v.d(this.v.k() - this.w.k());
            this.w.b(this.f.r.k().t());
            this.w.i = !this.w.a();
            this.v.i = !this.w.a();
            ezo $$0 = new ezo(150, 0, ezo.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.i = false;
            return this.v;
         }
      } else {
         return ewh.a(vb.c("options.online"), $$0x -> this.f.a(fbs.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static ewo<bji> a(int $$0, int $$1, String $$2, euk $$3) {
      return ewo.a(bji::b).a(bji.values()).a($$3.r.aj()).a($$0, $$1, 150, 20, vb.c($$2), ($$1x, $$2x) -> $$3.I().b(new adb($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.I().b(new ads(true));
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
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private ewh a(vb $$0, Supplier<fcc> $$1) {
      return ewh.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
