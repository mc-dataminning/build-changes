import com.mojang.serialization.MapCodec;

public class dot extends diu {
   public static final MapCodec<dot> c = b(dot::new);
   protected static final ews g = dff.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dot> a() {
      return c;
   }

   public dot(dsg.d $$0) {
      super($$0, jf.a, g, false, 0.1);
   }

   @Override
   protected int a(aym $$0) {
      return dkl.a($$0);
   }

   @Override
   protected dff b() {
      return dfh.oA;
   }

   @Override
   protected boolean g(dsh $$0) {
      return dkl.a($$0);
   }
}
