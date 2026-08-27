import com.mojang.serialization.Codec;

public class ebc implements ebh {
   public static final Codec<ebc> a = bor.b(0, 256).fieldOf("count").xmap(ebc::new, ebc::a).codec();
   private final bor b;

   public ebc(int $$0) {
      this.b = boo.a($$0);
   }

   public ebc(bor $$0) {
      this.b = $$0;
   }

   public bor a() {
      return this.b;
   }
}
