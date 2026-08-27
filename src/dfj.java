import com.mojang.serialization.MapCodec;

public class dfj extends dae {
   public static final MapCodec<dfj> c = b(dfj::new);
   public static final emm e = cwq.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dfj> a() {
      return c;
   }

   public dfj(djg.d $$0) {
      super($$0, ic.b, e, false);
   }

   @Override
   protected daf c() {
      return (daf)cws.oB;
   }
}
