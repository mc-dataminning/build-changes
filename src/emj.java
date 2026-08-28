import com.mojang.serialization.MapCodec;

public class emj extends emy {
   public static final MapCodec<emj> a = brq.b(0, 256).fieldOf("count").xmap(emj::new, $$0 -> $$0.c);
   private final brq c;

   private emj(brq $$0) {
      this.c = $$0;
   }

   public static emj a(brq $$0) {
      return new emj($$0);
   }

   public static emj a(int $$0) {
      return a(brn.a($$0));
   }

   @Override
   protected int a(azh $$0, ji $$1) {
      return this.c.a($$0);
   }

   @Override
   public emv<?> b() {
      return emv.f;
   }
}
