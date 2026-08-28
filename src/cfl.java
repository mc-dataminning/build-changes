import javax.annotation.Nullable;

public class cfl extends cfe {
   private static final bsu ca = bsx.w.n().a(0.5F).b(0.665F);

   public cfl(bsx<? extends cfl> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bU.a(0, new cag(this));
      this.bU.a(1, new cbf(this, 2.0));
      this.bU.a(2, new bzy(this, 1.0));
      this.bU.a(3, new cbu(this, 1.25, $$0 -> $$0.a(awn.aa), false));
      this.bU.a(4, new cal(this, 1.25));
      this.bU.a(5, new cbz(this, 1.0));
      this.bU.a(6, new cau(this, cmx.class, 6.0F));
      this.bU.a(7, new cbh(this));
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.aa);
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 10.0).a(buw.v, 0.2F);
   }

   @Override
   protected avo v() {
      return avp.gb;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.gd;
   }

   @Override
   protected avo n_() {
      return avp.gc;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fa() {
      return 0.4F;
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.qy) && !this.o_()) {
         $$0.a(avp.ge, 1.0F, 1.0F);
         cuq $$3 = cus.a($$2, $$0, cut.qE.w());
         $$0.a($$1, $$3);
         return bqr.a(this.dO().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cfl b(aqu $$0, bsl $$1) {
      return bsx.w.a((dcw)$$0);
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? ca : super.e($$0);
   }
}
