import com.mojang.serialization.MapCodec;

public class emx extends enn {
   public static final MapCodec<emx> a = dtc.b.fieldOf("block_state").xmap(emx::new, $$0 -> $$0.b);
   private final dtc b;

   public emx(dtc $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dtc $$0, ayw $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eno<?> a() {
      return eno.c;
   }
}
