import com.mojang.serialization.Codec;

public class drz implements dse {
   public static final Codec<drz> a = big.b(0, 256).fieldOf("count").xmap(drz::new, drz::a).codec();
   private final big b;

   public drz(int $$0) {
      this.b = bid.a($$0);
   }

   public drz(big $$0) {
      this.b = $$0;
   }

   public big a() {
      return this.b;
   }
}
