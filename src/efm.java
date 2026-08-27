import com.mojang.serialization.Codec;

public class efm extends ega {
   public static final Codec<efm> a = bor.b(0, 256).fieldOf("count").xmap(efm::new, $$0 -> $$0.c).codec();
   private final bor c;

   private efm(bor $$0) {
      this.c = $$0;
   }

   public static efm a(bor $$0) {
      return new efm($$0);
   }

   public static efm a(int $$0) {
      return a(boo.a($$0));
   }

   @Override
   protected int a(ayg $$0, in $$1) {
      return this.c.a($$0);
   }

   @Override
   public efx<?> b() {
      return efx.f;
   }
}
