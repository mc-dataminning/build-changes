import com.mojang.serialization.MapCodec;

public class dfx extends dha {
   public static final MapCodec<dfx> a = b(dfx::new);
   private static final ews[] b = new ews[]{
      dff.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dfx> a() {
      return a;
   }

   public dfx(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected dcc d() {
      return cud.uf;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b[this.g($$0)];
   }
}
