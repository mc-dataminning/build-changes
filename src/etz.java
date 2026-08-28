import com.mojang.serialization.MapCodec;

public class etz extends eup {
   public static final MapCodec<etz> a = dzz.a.fieldOf("block_state").xmap(etz::new, $$0 -> $$0.b);
   private final dzz b;

   public etz(dzz $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dzz $$0, azv $$1) {
      return $$0 == this.b;
   }

   @Override
   protected euq<?> a() {
      return euq.c;
   }
}
