import com.mojang.serialization.MapCodec;

public class dfh extends dae {
   public static final MapCodec<dfh> c = b(dfh::new);
   public static final eml g = cwp.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dfh> a() {
      return c;
   }

   public dfh(djf.d $$0) {
      super($$0, ic.b, g, false, 0.1);
   }

   @Override
   protected int a(auu $$0) {
      return dbu.a($$0);
   }

   @Override
   protected cwp b() {
      return cwr.oC;
   }

   @Override
   protected boolean g(djg $$0) {
      return dbu.a($$0);
   }
}
