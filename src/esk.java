import com.mojang.serialization.MapCodec;

public class esk extends etc {
   public static final MapCodec<esk> a = md.e.q().fieldOf("block").xmap(esk::new, $$0 -> $$0.b);
   private final dku b;

   public esk(dku $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dym $$0, azs $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected etd<?> a() {
      return etd.b;
   }
}
