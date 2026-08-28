import com.mojang.serialization.MapCodec;

public class eph extends epx {
   public static final MapCodec<eph> a = dvo.a.fieldOf("block_state").xmap(eph::new, $$0 -> $$0.b);
   private final dvo b;

   public eph(dvo $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvo $$0, azv $$1) {
      return $$0 == this.b;
   }

   @Override
   protected epy<?> a() {
      return epy.c;
   }
}
