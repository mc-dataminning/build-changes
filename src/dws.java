import com.mojang.serialization.MapCodec;

public class dws extends dqe {
   public static final MapCodec<dws> c = b(dws::new);
   private static final ffr e = dmm.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dws> a() {
      return c;
   }

   public dws(ean.d $$0) {
      super($$0, jb.a, e, false);
   }

   @Override
   protected dqf c() {
      return (dqf)dmo.pf;
   }
}
