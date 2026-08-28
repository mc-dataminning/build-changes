import com.mojang.serialization.MapCodec;

public class dkr extends dgt {
   public static final MapCodec<dkr> a = b(dkr::new);
   private static final ewj[] b = new ewj[]{
      dey.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected dbw d() {
      return cur.ug;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b[this.g($$0)];
   }
}
