import com.mojang.serialization.MapCodec;

public class ern extends esf {
   public static final MapCodec<ern> a = ma.e.q().fieldOf("block").xmap(ern::new, $$0 -> $$0.b);
   private final dkl b;

   public ern(dkl $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxu $$0, bam $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected esg<?> a() {
      return esg.b;
   }
}
