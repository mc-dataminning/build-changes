import com.mojang.serialization.MapCodec;

public class djy extends dlz {
   public static final MapCodec<djy> a = b(djy::new);
   public static final int b = 3;
   public static final dyn c = dye.av;
   private static final fcl[] g = new fcl[]{
      dkd.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected dyn b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dgy d() {
      return cxk.wl;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgz $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return g[this.h($$0)];
   }
}
