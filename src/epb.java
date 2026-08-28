import com.mojang.serialization.MapCodec;

public class epb extends ept {
   public static final MapCodec<epb> a = ly.e.q().fieldOf("block").xmap(epb::new, $$0 -> $$0.b);
   private final die b;

   public epb(die $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvj $$0, azs $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected epu<?> a() {
      return epu.b;
   }
}
