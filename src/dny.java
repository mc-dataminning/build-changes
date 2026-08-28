import com.mojang.serialization.MapCodec;

public class dny extends diu {
   public static final MapCodec<dny> c = b(dny::new);
   public static final ews g = dff.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dny> a() {
      return c;
   }

   public dny(dsg.d $$0) {
      super($$0, jf.b, g, false, 0.1);
   }

   @Override
   protected int a(aym $$0) {
      return dkl.a($$0);
   }

   @Override
   protected dff b() {
      return dfh.oC;
   }

   @Override
   protected boolean g(dsh $$0) {
      return dkl.a($$0);
   }
}
