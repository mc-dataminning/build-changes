import com.mojang.serialization.MapCodec;

public class dly extends dml {
   public static final MapCodec<dly> a = b(dly::new);

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   public dly(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(aF);
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}
