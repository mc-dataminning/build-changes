import javax.annotation.Nullable;

public class cey extends cer {
   private static final bsj ca = bsm.w.n().a(0.5F).b(0.665F);

   public cey(bsm<? extends cey> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzt(this));
      this.bU.a(1, new cas(this, 2.0));
      this.bU.a(2, new bzl(this, 1.0));
      this.bU.a(3, new cbh(this, 1.25, $$0 -> $$0.a(awf.aa), false));
      this.bU.a(4, new bzy(this, 1.25));
      this.bU.a(5, new cbm(this, 1.0));
      this.bU.a(6, new cah(this, cmk.class, 6.0F));
      this.bU.a(7, new cau(this));
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.aa);
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 10.0).a(buj.v, 0.2F);
   }

   @Override
   protected avg v() {
      return avh.gb;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.gd;
   }

   @Override
   protected avg o_() {
      return avh.gc;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.a(cuf.qy) && !this.p_()) {
         $$0.a(avh.ge, 1.0F, 1.0F);
         cuc $$3 = cue.a($$2, $$0, cuf.qE.w());
         $$0.a($$1, $$3);
         return bqg.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cey b(aqm $$0, bsa $$1) {
      return bsm.w.a((dcf)$$0);
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? ca : super.e($$0);
   }
}
