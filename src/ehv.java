import com.mojang.serialization.Codec;

public class ehv implements eia {
   public static final Codec<ehv> a = brn.b(0, 256).fieldOf("count").xmap(ehv::new, ehv::a).codec();
   private final brn b;

   public ehv(int $$0) {
      this.b = brk.a($$0);
   }

   public ehv(brn $$0) {
      this.b = $$0;
   }

   public brn a() {
      return this.b;
   }
}
