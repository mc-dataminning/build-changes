import com.mojang.serialization.MapCodec;

public class czg extends daj {
   public static final MapCodec<czg> a = b(czg::new);
   private static final eol[] b = new eol[]{
      cyo.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<czg> a() {
      return a;
   }

   public czg(dle.d $$0) {
      super($$0);
   }

   @Override
   protected cvm d() {
      return cpc.ub;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b[this.g($$0)];
   }
}
