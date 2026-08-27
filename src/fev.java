import java.util.function.Supplier;

public class fev extends ffe {
   private static final vq a = vq.c("options.skinCustomisation");
   private static final vq b = vq.c("options.sounds");
   private static final vq c = vq.c("options.video");
   private static final vq k = vq.c("options.controls");
   private static final vq l = vq.c("options.language");
   private static final vq m = vq.c("options.chat");
   private static final vq n = vq.c("options.resourcepack");
   private static final vq o = vq.c("options.accessibility");
   private static final vq p = vq.c("options.telemetry");
   private static final vq q = vq.c("options.credits_and_attribution");
   private static final int r = 2;
   private final ffe t;
   private final exl u;
   private ezo<blr> v;
   private ezx w;

   public fev(ffe $$0, exl $$1) {
      super(vq.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aQ_() {
      fcs $$0 = new fcs();
      $$0.c().f(5).e(4).b();
      fcs.b $$1 = $$0.d(2);
      $$1.a(this.u.ae().a(this.f.m, 0, 0, 150));
      $$1.a(this.o());
      $$1.a(fcy.b(26), 2);
      $$1.a(this.a(a, () -> new ffh(this, this.u)));
      $$1.a(this.a(b, () -> new ffi(this, this.u)));
      $$1.a(this.a(c, () -> new ffl(this, this.u)));
      $$1.a(this.a(k, () -> new ffw(this, this.u)));
      $$1.a(this.a(l, () -> new fen(this, this.u, this.f.ae())));
      $$1.a(this.a(m, () -> new fdu(this, this.u)));
      $$1.a(this.a(n, () -> new fil(this.f.aa(), this::a, this.f.ad(), vq.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new fdq(this, this.u)));
      $$1.a(this.a(p, () -> new fjr(this, this.u)));
      $$1.a(this.a(q, () -> new feb(this)));
      $$1.a(ezh.a(vp.d, $$0x -> this.d()).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      fcr.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   @Override
   public void d() {
      this.f.a(this.t);
   }

   private void a(arl $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private fcv o() {
      if (this.f.r != null && this.f.S()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().l()) {
            this.w = new ezx(0, 0, $$0x -> this.f.a(new fdx(this::c, vq.c("difficulty.lock.title"), vq.a("difficulty.lock.question", this.f.r.k().q().b()))));
            this.v.k(this.v.w() - this.w.w());
            this.w.b(this.f.r.k().r());
            this.w.j = !this.w.a();
            this.v.j = !this.w.a();
            fcq $$0 = new fcq(150, 0, fcq.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.j = false;
            return this.v;
         }
      } else {
         return ezh.a(vq.c("options.online"), $$0x -> this.f.a(feu.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static ezo<blr> a(int $$0, int $$1, String $$2, exh $$3) {
      return ezo.a(blr::b).a(blr.values()).a($$3.r.ak()).a($$0, $$1, 150, 20, vq.c($$2), ($$1x, $$2x) -> $$3.J().b(new aew($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.J().b(new afn(true));
         this.w.b(true);
         this.w.j = false;
         this.v.j = false;
      }
   }

   @Override
   public void k() {
      this.u.as();
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private ezh a(vq $$0, Supplier<ffe> $$1) {
      return ezh.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
