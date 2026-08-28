import com.mojang.serialization.MapCodec;

public class dql extends dkj {
   public static final MapCodec<dql> c = b(dql::new);
   public static final eyx e = dgv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dql> a() {
      return c;
   }

   public dql(dtz.d $$0) {
      super($$0, jj.a, e, false);
   }

   @Override
   protected dkk c() {
      return (dkk)dgx.oz;
   }
}
