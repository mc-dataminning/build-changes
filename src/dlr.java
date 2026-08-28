import com.mojang.serialization.MapCodec;

public class dlr extends dme {
   public static final MapCodec<dlr> a = b(dlr::new);

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(aF);
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}
