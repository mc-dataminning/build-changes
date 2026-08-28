import com.mojang.serialization.MapCodec;

public class eoh extends eny {
   public static final MapCodec<eoh> b = eao.a.fieldOf("state").xmap(eoh::new, $$0 -> $$0.c);
   private final eao c;

   protected eoh(eao $$0) {
      this.c = $$0;
   }

   @Override
   protected enz<?> a() {
      return enz.a;
   }

   @Override
   public eao a(azv $$0, iv $$1) {
      return this.c;
   }
}
