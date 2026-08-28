import com.mojang.serialization.MapCodec;

public class evh extends evz {
   public static final MapCodec<evh> a = mh.e.q().fieldOf("block").xmap(evh::new, $$0 -> $$0.b);
   private final dne b;

   public evh(dne $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(ebg $$0, azz $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ewa<?> a() {
      return ewa.b;
   }
}
