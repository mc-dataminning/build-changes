import com.mojang.serialization.Codec;

public class dtc extends dst {
   public static final Codec<dtc> b = dgb.b.fieldOf("state").xmap(dtc::new, $$0 -> $$0.c).codec();
   private final dgb c;

   protected dtc(dgb $$0) {
      this.c = $$0;
   }

   @Override
   protected dsu<?> a() {
      return dsu.a;
   }

   @Override
   public dgb a(ate $$0, ht $$1) {
      return this.c;
   }
}
