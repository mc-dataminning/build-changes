import java.util.List;

public class ccl extends ccs {
   public static final float b = bmc.C.k() / bmc.X.k();
   private static final int e = 1200;
   private static final int bU = 50;
   private static final int bV = 6000;
   private static final int bW = 2;
   private static final int bX = 1200;

   public ccl(bmc<? extends ccl> $$0, ctx $$1) {
      super($$0, $$1);
      this.fK();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bnt.a u() {
      return ccs.gf().a(bnu.o, 0.3F).a(bnu.c, 8.0).a(bnu.n, 80.0);
   }

   @Override
   public int w() {
      return 60;
   }

   @Override
   protected ars y() {
      return this.bc() ? art.hz : art.hA;
   }

   @Override
   protected ars d(bkv $$0) {
      return this.bc() ? art.hF : art.hG;
   }

   @Override
   protected ars n_() {
      return this.bc() ? art.hC : art.hD;
   }

   @Override
   protected ars A() {
      return art.hE;
   }

   @Override
   protected void aa() {
      super.aa();
      if ((this.ah + this.aj()) % 1200 == 0) {
         blj $$0 = new blj(bll.d, 6000, 2);
         List<anf> $$1 = blk.a((ane)this.dL(), this, this.dj(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new aag(aag.k, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fR()) {
         this.a(this.dl(), 16);
      }
   }
}
