import com.mojang.serialization.Codec;

public class eci extends ecz {
   public static final Codec<eci> a = kd.e.q().fieldOf("block").xmap(eci::new, $$0 -> $$0.b).codec();
   private final cwp b;

   public eci(cwp $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(djg $$0, auu $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eda<?> a() {
      return eda.b;
   }
}
