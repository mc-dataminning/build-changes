import com.mojang.serialization.MapCodec;

public class dnw extends dgl {
   public static final MapCodec<dnw> n = b(dnw::new);

   @Override
   public MapCodec<dnw> a() {
      return n;
   }

   public dnw(dsk.d $$0) {
      super($$0, () -> dps.c);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new drk($$0, $$1);
   }

   @Override
   protected avo<akk> c() {
      return avr.i.b(avr.ai);
   }

   @Override
   protected boolean e_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return ayg.a(dpx.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$3 == jf.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
