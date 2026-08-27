import com.mojang.serialization.MapCodec;

public class dde extends cxo {
   public static final MapCodec<dde> c = b(dde::new);
   protected static final eiy g = cua.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dde> a() {
      return c;
   }

   public dde(dga.d $$0) {
      super($$0, hx.a, g, false, 0.1);
   }

   @Override
   protected int a(ate $$0) {
      return cze.a($$0);
   }

   @Override
   protected cua b() {
      return cuc.oA;
   }

   @Override
   protected boolean g(dgb $$0) {
      return cze.a($$0);
   }
}
