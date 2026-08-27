import com.mojang.serialization.Codec;

public class dxt extends dyk {
   public static final Codec<dxt> a = jc.f.q().fieldOf("block").xmap(dxt::new, $$0 -> $$0.b).codec();
   private final csk b;

   public dxt(csk $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dey $$0, art $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyl<?> a() {
      return dyl.b;
   }
}
