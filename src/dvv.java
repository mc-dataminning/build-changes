import com.mojang.serialization.MapCodec;

public class dvv extends dqe {
   public static final MapCodec<dvv> c = b(dvv::new);
   private static final ffr e = dmm.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dvv> a() {
      return c;
   }

   public dvv(ean.d $$0) {
      super($$0, jb.b, e, false);
   }

   @Override
   protected dqf c() {
      return (dqf)dmo.ph;
   }
}
