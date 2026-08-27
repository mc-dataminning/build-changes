import com.mojang.serialization.MapCodec;

public class dcq extends cyt {
   public static final MapCodec<dcq> a = b(dcq::new);
   private static final emv[] b = new emv[]{
      cwy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dcq> a() {
      return a;
   }

   public dcq(djo.d $$0) {
      super($$0);
   }

   @Override
   protected ctw d() {
      return cnj.uc;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b[this.g($$0)];
   }
}
