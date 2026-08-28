import com.mojang.serialization.Codec;

public class ell implements elq {
   public static final Codec<ell> a = bti.b(0, 256).fieldOf("count").xmap(ell::new, ell::a).codec();
   private final bti b;

   public ell(int $$0) {
      this.b = btf.a($$0);
   }

   public ell(bti $$0) {
      this.b = $$0;
   }

   public bti a() {
      return this.b;
   }
}
