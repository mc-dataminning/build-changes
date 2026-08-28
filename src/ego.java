import com.mojang.serialization.MapCodec;

public class ego extends egf {
   public static final MapCodec<ego> b = dta.b.fieldOf("state").xmap(ego::new, $$0 -> $$0.c);
   private final dta c;

   protected ego(dta $$0) {
      this.c = $$0;
   }

   @Override
   protected egg<?> a() {
      return egg.a;
   }

   @Override
   public dta a(ayv $$0, jd $$1) {
      return this.c;
   }
}
