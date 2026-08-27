import com.mojang.serialization.Codec;

public class eim extends ejb {
   public static final Codec<eim> a = doz.b.fieldOf("block_state").xmap(eim::new, $$0 -> $$0.b).codec();
   private final doz b;

   public eim(doz $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(doz $$0, axr $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ejc<?> a() {
      return ejc.c;
   }
}
