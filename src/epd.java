import com.mojang.serialization.MapCodec;

public class epd extends ept {
   public static final MapCodec<epd> a = dvj.a.fieldOf("block_state").xmap(epd::new, $$0 -> $$0.b);
   private final dvj b;

   public epd(dvj $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvj $$0, azs $$1) {
      return $$0 == this.b;
   }

   @Override
   protected epu<?> a() {
      return epu.c;
   }
}
