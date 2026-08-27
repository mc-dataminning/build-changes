import com.mojang.serialization.Codec;

public class ebw implements ecb {
   public static final Codec<ebw> a = boz.b(0, 256).fieldOf("count").xmap(ebw::new, ebw::a).codec();
   private final boz b;

   public ebw(int $$0) {
      this.b = bow.a($$0);
   }

   public ebw(boz $$0) {
      this.b = $$0;
   }

   public boz a() {
      return this.b;
   }
}
