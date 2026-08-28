import com.mojang.serialization.MapCodec;

public class dlc extends dns implements dla {
   public static final MapCodec<dlc> c = b(dlc::new);

   @Override
   public MapCodec<dlc> a() {
      return c;
   }

   public dlc(dxn.d $$0) {
      super($$0, jm.a, s_, false);
      this.l(this.F.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected dnt c() {
      return (dnt)dkf.sX;
   }

   @Override
   protected dxo a(dxo $$0, dxo $$1) {
      return $$1.b(t_, $$0.c(t_));
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
