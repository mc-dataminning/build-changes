import com.mojang.serialization.MapCodec;

public class dch extends cwp {
   public static final MapCodec<dch> c = b(dch::new);
   public static final eia e = ctc.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dch> a() {
      return c;
   }

   public dch(dfc.d $$0) {
      super($$0, ha.a, e, false);
   }

   @Override
   protected cwq c() {
      return (cwq)cte.oz;
   }
}
