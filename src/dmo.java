import com.mojang.serialization.MapCodec;

public class dmo extends dhs {
   public static final MapCodec<dmo> a = b(dmo::new);
   protected static final ezm b = dhj.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   public dmo(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(awt.aM) || $$0.a(dhl.dX) || super.b($$0, $$1, $$2);
   }
}
