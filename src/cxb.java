import com.mojang.serialization.MapCodec;

public class cxb extends cye {
   public static final MapCodec<cxb> a = b(cxb::new);
   private static final emf[] b = new emf[]{
      cwj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<cxb> a() {
      return a;
   }

   public cxb(diz.d $$0) {
      super($$0);
   }

   @Override
   protected cth d() {
      return cmu.tY;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b[this.g($$0)];
   }
}
