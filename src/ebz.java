import com.mojang.serialization.Codec;

public class ebz extends ecn {
   public static final Codec<ebz> a = bmh.b(0, 256).fieldOf("count").xmap(ebz::new, $$0 -> $$0.c).codec();
   private final bmh c;

   private ebz(bmh $$0) {
      this.c = $$0;
   }

   public static ebz a(bmh $$0) {
      return new ebz($$0);
   }

   public static ebz a(int $$0) {
      return a(bme.a($$0));
   }

   @Override
   protected int a(axd $$0, ib $$1) {
      return this.c.a($$0);
   }

   @Override
   public eck<?> b() {
      return eck.f;
   }
}
