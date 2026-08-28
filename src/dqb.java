import com.mojang.serialization.MapCodec;

public class dqb extends dlz {
   public static final MapCodec<dqb> a = b(dqb::new);
   private static final fcl[] b = new fcl[]{
      dkd.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   public dqb(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected dgy d() {
      return cxk.vf;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b[this.h($$0)];
   }
}
