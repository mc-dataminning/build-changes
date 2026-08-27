import com.mojang.serialization.Codec;

public class ecj extends eca {
   public static final Codec<ecj> b = doz.b.fieldOf("state").xmap(ecj::new, $$0 -> $$0.c).codec();
   private final doz c;

   protected ecj(doz $$0) {
      this.c = $$0;
   }

   @Override
   protected ecb<?> a() {
      return ecb.a;
   }

   @Override
   public doz a(axr $$0, ib $$1) {
      return this.c;
   }
}
