import javax.annotation.Nullable;

public class cez extends ces {
   private static final bsk ca = bsn.w.n().a(0.5F).b(0.665F);

   public cez(bsn<? extends cez> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzu(this));
      this.bU.a(1, new cat(this, 2.0));
      this.bU.a(2, new bzm(this, 1.0));
      this.bU.a(3, new cbi(this, 1.25, $$0 -> $$0.a(awf.aa), false));
      this.bU.a(4, new bzz(this, 1.25));
      this.bU.a(5, new cbn(this, 1.0));
      this.bU.a(6, new cai(this, cml.class, 6.0F));
      this.bU.a(7, new cav(this));
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.aa);
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 10.0).a(buk.v, 0.2F);
   }

   @Override
   protected avg v() {
      return avh.gb;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.gd;
   }

   @Override
   protected avg n_() {
      return avh.gc;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.a(cug.qy) && !this.o_()) {
         $$0.a(avh.ge, 1.0F, 1.0F);
         cud $$3 = cuf.a($$2, $$0, cug.qE.w());
         $$0.a($$1, $$3);
         return bqh.a(this.dR().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cez b(aqm $$0, bsb $$1) {
      return bsn.w.a((dcg)$$0);
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? ca : super.e($$0);
   }
}
