import com.mojang.serialization.MapCodec;

public class ern extends esf {
   public static final MapCodec<ern> a = mb.e.q().fieldOf("block").xmap(ern::new, $$0 -> $$0.b);
   private final dke b;

   public ern(dke $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxq $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected esg<?> a() {
      return esg.b;
   }
}
