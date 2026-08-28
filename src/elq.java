import com.mojang.serialization.MapCodec;

public class elq extends emf {
   public static final MapCodec<elq> a = dsd.b.fieldOf("block_state").xmap(elq::new, $$0 -> $$0.b);
   private final dsd b;

   public elq(dsd $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsd $$0, azh $$1) {
      return $$0 == this.b;
   }

   @Override
   protected emg<?> a() {
      return emg.c;
   }
}
