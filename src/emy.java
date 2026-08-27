import com.mojang.serialization.Codec;

public class emy extends enn {
   public static final Codec<emy> a = dtc.b.fieldOf("block_state").xmap(emy::new, $$0 -> $$0.b).codec();
   private final dtc b;

   public emy(dtc $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dtc $$0, ayt $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eno<?> a() {
      return eno.c;
   }
}
