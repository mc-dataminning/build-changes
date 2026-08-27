import com.mojang.serialization.MapCodec;

public class dcb extends cye {
   public static final MapCodec<dcb> a = b(dcb::new);
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
   public MapCodec<dcb> a() {
      return a;
   }

   public dcb(diz.d $$0) {
      super($$0);
   }

   @Override
   protected cth d() {
      return cmu.tZ;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b[this.g($$0)];
   }
}
