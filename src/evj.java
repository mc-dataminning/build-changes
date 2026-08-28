import com.mojang.serialization.MapCodec;

public class evj extends evz {
   public static final MapCodec<evj> a = ebg.a.fieldOf("block_state").xmap(evj::new, $$0 -> $$0.b);
   private final ebg b;

   public evj(ebg $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(ebg $$0, azz $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ewa<?> a() {
      return ewa.c;
   }
}
