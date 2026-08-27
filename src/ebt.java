import com.mojang.serialization.Codec;

public class ebt extends eci {
   public static final Codec<ebt> a = dip.b.fieldOf("block_state").xmap(ebt::new, $$0 -> $$0.b).codec();
   private final dip b;

   public ebt(dip $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dip $$0, auf $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ecj<?> a() {
      return ecj.c;
   }
}
