import com.mojang.serialization.MapCodec;

public class dcp extends cxo {
   public static final MapCodec<dcp> c = b(dcp::new);
   public static final eiy g = cua.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dcp> a() {
      return c;
   }

   public dcp(dga.d $$0) {
      super($$0, hx.b, g, false, 0.1);
   }

   @Override
   protected int a(ate $$0) {
      return cze.a($$0);
   }

   @Override
   protected cua b() {
      return cuc.oC;
   }

   @Override
   protected boolean g(dgb $$0) {
      return cze.a($$0);
   }
}
