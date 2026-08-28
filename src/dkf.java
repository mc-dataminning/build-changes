import com.mojang.serialization.MapCodec;

public class dkf extends dfj {
   public static final MapCodec<dkf> a = b(dkf::new);
   protected static final ewl b = dfa.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   public dkf(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.a(awp.aL) || $$0.a(dfc.dX) || super.b($$0, $$1, $$2);
   }
}
