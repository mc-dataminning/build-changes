import java.util.List;

public class cfn extends cfu {
   public static final float b = bpc.D.k() / bpc.Y.k();
   private static final int e = 1200;
   private static final int bX = 50;
   private static final int bY = 6000;
   private static final int bZ = 2;
   private static final int ca = 1200;

   public cfn(bpc<? extends cfn> $$0, cwz $$1) {
      super($$0, $$1);
      this.fS();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bqu.a r() {
      return cfu.gn().a(bqv.r, 0.3F).a(bqv.c, 8.0).a(bqv.q, 80.0);
   }

   @Override
   public int s() {
      return 60;
   }

   @Override
   protected atx v() {
      return this.bf() ? aty.hD : aty.hE;
   }

   @Override
   protected atx d(bnv $$0) {
      return this.bf() ? aty.hJ : aty.hK;
   }

   @Override
   protected atx n_() {
      return this.bf() ? aty.hG : aty.hH;
   }

   @Override
   protected atx y() {
      return aty.hI;
   }

   @Override
   protected void Y() {
      super.Y();
      if ((this.ah + this.aj()) % 1200 == 0) {
         boj $$0 = new boj(bol.d, 6000, 2);
         List<apg> $$1 = bok.a((apf)this.dM(), this, this.dk(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.d.b(new abt(abt.l, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fZ()) {
         this.a(this.dm(), 16);
      }
   }
}
