import com.mojang.serialization.MapCodec;

public class dfp extends dgs {
   public static final MapCodec<dfp> a = b(dfp::new);
   private static final ewi[] b = new ewi[]{
      dex.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dex.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dex.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dex.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dex.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dex.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dex.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dex.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dfp> a() {
      return a;
   }

   public dfp(drz.d $$0) {
      super($$0);
   }

   @Override
   protected dbv d() {
      return cuq.uf;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b[this.g($$0)];
   }
}
