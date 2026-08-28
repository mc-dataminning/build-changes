import com.mojang.serialization.MapCodec;

public class evr extends ewj {
   public static final MapCodec<evr> a = mh.e.q().fieldOf("block").xmap(evr::new, $$0 -> $$0.b);
   private final dno b;

   public evr(dno $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(ebq $$0, bai $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ewk<?> a() {
      return ewk.b;
   }
}
