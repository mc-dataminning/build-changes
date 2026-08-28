import com.mojang.serialization.MapCodec;

public class eur extends evj {
   public static final MapCodec<eur> a = mg.e.q().fieldOf("block").xmap(eur::new, $$0 -> $$0.b);
   private final dmr b;

   public eur(dmr $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eat $$0, azv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected evk<?> a() {
      return evk.b;
   }
}
