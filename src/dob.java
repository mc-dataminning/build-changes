import com.mojang.serialization.MapCodec;

public class dob extends dix {
   public static final MapCodec<dob> c = b(dob::new);
   public static final exa g = dfi.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dob> a() {
      return c;
   }

   public dob(dsk.d $$0) {
      super($$0, jf.b, g, false, 0.1);
   }

   @Override
   protected int a(ayo $$0) {
      return dko.a($$0);
   }

   @Override
   protected dfi b() {
      return dfk.oC;
   }

   @Override
   protected boolean g(dsl $$0) {
      return dko.a($$0);
   }
}
