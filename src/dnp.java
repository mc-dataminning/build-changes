import com.mojang.serialization.MapCodec;

public class dnp extends dho {
   public static final MapCodec<dnp> c = b(dnp::new);
   public static final evf e = dea.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dnp> a() {
      return c;
   }

   public dnp(drc.d $$0) {
      super($$0, it.a, e, false);
   }

   @Override
   protected dhp c() {
      return (dhp)dec.oz;
   }
}
