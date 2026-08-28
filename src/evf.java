import com.mojang.serialization.MapCodec;

public class evf extends evx {
   public static final MapCodec<evf> a = mg.e.q().fieldOf("block").xmap(evf::new, $$0 -> $$0.b);
   private final dnc b;

   public evf(dnc $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(ebe $$0, azx $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected evy<?> a() {
      return evy.b;
   }
}
