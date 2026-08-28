import com.mojang.serialization.MapCodec;

public class eln extends eme {
   public static final MapCodec<eln> a = lp.e.q().fieldOf("block").xmap(eln::new, $$0 -> $$0.b);
   private final dez b;

   public eln(dez $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsc $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emf<?> a() {
      return emf.b;
   }
}
