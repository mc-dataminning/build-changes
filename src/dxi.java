import com.mojang.serialization.MapCodec;

public class dxi extends dqu {
   public static final MapCodec<dxi> c = b(dxi::new);
   private static final fgk e = dnc.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dxi> a() {
      return c;
   }

   public dxi(ebd.d $$0) {
      super($$0, jb.a, e, false);
   }

   @Override
   protected dqv c() {
      return (dqv)dne.pf;
   }
}
