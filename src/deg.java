import com.mojang.serialization.MapCodec;

public class deg extends daj {
   public static final MapCodec<deg> a = b(deg::new);
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
   public MapCodec<deg> a() {
      return a;
   }

   public deg(dle.d $$0) {
      super($$0);
   }

   @Override
   protected cvm d() {
      return cpc.uc;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b[this.g($$0)];
   }
}
