import com.mojang.serialization.Codec;

public class eej extends eey {
   public static final Codec<eej> a = dlf.b.fieldOf("block_state").xmap(eej::new, $$0 -> $$0.b).codec();
   private final dlf b;

   public eej(dlf $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dlf $$0, awo $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eez<?> a() {
      return eez.c;
   }
}
