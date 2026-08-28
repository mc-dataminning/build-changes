import com.mojang.serialization.MapCodec;

public class dlb extends dnt implements dla {
   public static final MapCodec<dlb> c = b(dlb::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dlb> a() {
      return c;
   }

   public dlb(dxn.d $$0) {
      super($$0, jm.a, s_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(bac $$0) {
      return 1;
   }

   @Override
   protected boolean h(dxo $$0) {
      return $$0.l();
   }

   @Override
   protected dkd b() {
      return dkf.sY;
   }

   @Override
   protected dxo a(dxo $$0, dxo $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dxo a(dxo $$0, bac $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg(cxk.xw);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      return dla.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
