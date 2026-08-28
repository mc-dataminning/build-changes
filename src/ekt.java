import com.mojang.serialization.MapCodec;

public class ekt extends eli {
   public static final MapCodec<ekt> a = bri.b(0, 256).fieldOf("count").xmap(ekt::new, $$0 -> $$0.c);
   private final bri c;

   private ekt(bri $$0) {
      this.c = $$0;
   }

   public static ekt a(bri $$0) {
      return new ekt($$0);
   }

   public static ekt a(int $$0) {
      return a(brf.a($$0));
   }

   @Override
   protected int a(azs $$0, jh $$1) {
      return this.c.a($$0);
   }

   @Override
   public elf<?> b() {
      return elf.f;
   }
}
