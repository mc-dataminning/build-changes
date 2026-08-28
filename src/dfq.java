import com.mojang.serialization.MapCodec;

public class dfq extends dgt {
   public static final MapCodec<dfq> a = b(dfq::new);
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
   public MapCodec<dfq> a() {
      return a;
   }

   public dfq(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected dbw d() {
      return cur.uf;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b[this.g($$0)];
   }
}
