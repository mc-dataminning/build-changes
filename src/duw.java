import com.mojang.serialization.Codec;

public class duw extends dvn {
   public static final Codec<duw> a = jb.f.q().fieldOf("block").xmap(duw::new, $$0 -> $$0.b).codec();
   private final cpn b;

   public duw(cpn $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dcb $$0, apf $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dvo<?> a() {
      return dvo.b;
   }
}
