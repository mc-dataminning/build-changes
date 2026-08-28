import com.mojang.serialization.MapCodec;

public class dkc extends dfg {
   public static final MapCodec<dkc> a = b(dkc::new);
   protected static final ewi b = dex.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   public dkc(drz.d $$0) {
      super($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.a(awo.aL) || $$0.a(dez.dX) || super.b($$0, $$1, $$2);
   }
}
