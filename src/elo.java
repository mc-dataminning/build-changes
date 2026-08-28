import com.mojang.serialization.MapCodec;

public class elo extends emf {
   public static final MapCodec<elo> a = lp.e.q().fieldOf("block").xmap(elo::new, $$0 -> $$0.b);
   private final dfa b;

   public elo(dfa $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsd $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emg<?> a() {
      return emg.b;
   }
}
