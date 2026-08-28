import com.mojang.serialization.MapCodec;

public class emv extends enl {
   public static final MapCodec<emv> a = dtc.b.fieldOf("block_state").xmap(emv::new, $$0 -> $$0.b);
   private final dtc b;

   public emv(dtc $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dtc $$0, ayw $$1) {
      return $$0 == this.b;
   }

   @Override
   protected enm<?> a() {
      return enm.c;
   }
}
