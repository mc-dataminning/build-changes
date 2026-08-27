import java.util.function.Supplier;

public class exq extends exz {
   private static final tf a = tf.c("options.skinCustomisation");
   private static final tf b = tf.c("options.sounds");
   private static final tf c = tf.c("options.video");
   private static final tf k = tf.c("options.controls");
   private static final tf l = tf.c("options.language");
   private static final tf m = tf.c("options.chat.title");
   private static final tf n = tf.c("options.resourcepack");
   private static final tf o = tf.c("options.accessibility.title");
   private static final tf p = tf.c("options.telemetry");
   private static final tf q = tf.c("options.credits_and_attribution");
   private static final int s = 2;
   private final exz t;
   private final eqq u;
   private eso<bgn> v;
   private esx w;

   public exq(exz $$0, eqq $$1) {
      super(tf.c("options.title"));
      this.t = $$0;
      this.u = $$1;
   }

   @Override
   protected void aE_() {
      evn $$0 = new evn();
      $$0.c().f(5).e(4).b();
      evn.b $$1 = $$0.d(2);
      $$1.a(this.u.ac().a(this.f.m, 0, 0, 150));
      $$1.a(this.l());
      $$1.a(evt.b(26), 2);
      $$1.a(this.a(a, () -> new eyc(this, this.u)));
      $$1.a(this.a(b, () -> new eyd(this, this.u)));
      $$1.a(this.a(c, () -> new eyf(this, this.u)));
      $$1.a(this.a(k, () -> new eyq(this, this.u)));
      $$1.a(this.a(l, () -> new exi(this, this.u, this.f.ae())));
      $$1.a(this.a(m, () -> new ewp(this, this.u)));
      $$1.a(this.a(n, () -> new fbe(this.f.aa(), this::a, this.f.ad(), tf.c("resourcePack.title"))));
      $$1.a(this.a(o, () -> new ewl(this, this.u)));
      $$1.a(this.a(p, () -> new fcg(this, this.u)));
      $$1.a(this.a(q, () -> new eww(this)));
      $$1.a(esh.a(te.d, $$0x -> this.f.a(this.t)).a(200).a(), 2, $$1.b().c(6));
      $$0.a();
      evm.a($$0, 0, this.h / 6 - 12, this.g, this.h, 0.5F, 0.0F);
      $$0.a(this::d);
   }

   private void a(amx $$0) {
      this.u.a($$0);
      this.f.a(this);
   }

   private evq l() {
      if (this.f.u != null && this.f.S()) {
         this.v = a(0, 0, "options.difficulty", this.f);
         if (!this.f.u.k().n()) {
            this.w = new esx(0, 0, $$0x -> this.f.a(new ews(this::c, tf.c("difficulty.lock.title"), tf.a("difficulty.lock.question", this.f.u.k().s().b()))));
            this.v.d(this.v.k() - this.w.k());
            this.w.b(this.f.u.k().t());
            this.w.i = !this.w.a();
            this.v.i = !this.w.a();
            evl $$0 = new evl(150, 0, evl.b.a);
            $$0.a(this.v);
            $$0.a(this.w);
            return $$0;
         } else {
            this.v.i = false;
            return this.v;
         }
      } else {
         return esh.a(tf.c("options.online"), $$0x -> this.f.a(exp.a(this.f, this, this.u))).a(this.g / 2 + 5, this.h / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static eso<bgn> a(int $$0, int $$1, String $$2, eqm $$3) {
      return eso.a(bgn::b).a(bgn.values()).a($$3.u.ai()).a($$0, $$1, 150, 20, tf.c($$2), ($$1x, $$2x) -> $$3.J().b(new abb($$2x)));
   }

   private void c(boolean $$0) {
      this.f.a(this);
      if ($$0 && this.f.u != null) {
         this.f.J().b(new abs(true));
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
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }

   private esh a(tf $$0, Supplier<exz> $$1) {
      return esh.a($$0, $$1x -> this.f.a($$1.get())).a();
   }
}
