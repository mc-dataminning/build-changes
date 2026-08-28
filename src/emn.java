import com.mojang.serialization.MapCodec;

public class emn extends emf {
   public static final MapCodec<emn> a = axf.a(lq.f).fieldOf("tag").xmap(emn::new, $$0 -> $$0.b);
   private final axf<dfa> b;

   public emn(axf<dfa> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsd $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emg<?> a() {
      return emg.d;
   }
}
