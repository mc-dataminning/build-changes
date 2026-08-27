import java.util.function.Supplier;

public class eyv extends ezd {
   private static final ui a = ui.c("options.skinCustomisation");
   private static final ui b = ui.c("options.sounds");
   private static final ui c = ui.c("options.video");
   private static final ui k = ui.c("options.controls");
   private static final ui l = ui.c("options.language");
   private static final ui m = ui.c("options.chat");
   private static final ui n = ui.c("options.resourcepack");
   private static final ui o = ui.c("options.accessibility");
   private static final ui p = ui.c("options.telemetry");
   private static final ui q = ui.c("options.credits_and_attribution");
   private static final int s = 2;
   private final ezd t;
   private final ers u;
   private etq<bhy> v;
   private etz w;

   public eyv(ezd $$0, ers $$1) {
      super(ui.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aM_() {
      ews $$0 = new ews();
      $$0.c().f(5).e(4).b();
      ews.b $$1 = $$0.d(2);
      $$1.a(this.u.ad().a(this.f.m, 0, 0, 150));
      $$1.a(this.l());
      $$1.a(ewy.b(26), 2);
      $$1.a(this.a(a, () -> new ezg(this, this.u)));
      $$1.a(this.a(b, () -> new ezh(this, this.u)));
      $$1.a(this.a(c, () -> new ezk(this, this.u)));
      $$1.a(this.a(k, () -> new ezv(this, this.u)));
      $$1.a(this.a(l, () -> new eyn(this, this.u, this.f.ae())));
      $$1.a(this.a(m, () -> new exu(this, this.u)));
      $$1.a(this.a(n, () -> new fcj(this.f.aa(), this::a, this.f.ad(), ui.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new exq(this, this.u)));
      $$1.a(this.a(p, () -> new fdp(this, this.u)));
      $$1.a(this.a(q, () -> new eyb(this)));
      $$1.a(etj.a(uh.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      ewr.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(aoe $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private ewv l() {
      if (this.f.r != null && this.f.S()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.r.k().n()) {
            this.w = new etz(0, 0, $$0x -> this.f.a(new exx(this::c, ui.c("difficulty.lock.title"), ui.a("difficulty.lock.question", this.f.r.k().s().b()))));
            this.v.d(this.v.k() - this.w.k());
            this.w.b(this.f.r.k().t());
            this.w.i = !this.w.a();
            this.v.i = !this.w.a();
            ewq $$0 = new ewq(150, 0, ewq.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.i = false;
            return this.v;
         }
      } else {
         return etj.a(ui.c("options.online"), $$0x -> this.f.a(eyu.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static etq<bhy> a(int $$0, int $$1, String $$2, ero $$3) {
      return etq.a(bhy::b).a(bhy.values()).a($$3.r.ai()).a($$0, $$1, 150, 20, ui.c($$2), ($$1x, $$2x) -> $$3.J().b(new acf($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.r != null) {
         this.f.J().b(new acv(true));
         this.w.b(true);
         this.w.i = false;
         this.v.i = false;
      }
   }

   @Override
   public void aD_() {
      this.u.ar();
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private etj a(ui $$0, Supplier<ezd> $$1) {
      return etj.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
