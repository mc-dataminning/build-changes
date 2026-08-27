import com.mojang.serialization.MapCodec;

public class dgd extends dae {
   public static final MapCodec<dgd> c = b(dgd::new);
   public static final emm e = cwq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dgd> a() {
      return c;
   }

   public dgd(djg.d $$0) {
      super($$0, ic.a, e, false);
   }

   @Override
   protected daf c() {
      return (daf)cws.oz;
   }
}
