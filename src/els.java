import com.mojang.serialization.Codec;

public class els implements elx {
   public static final Codec<els> a = btl.b(0, 256).fieldOf("count").xmap(els::new, els::a).codec();
   private final btl b;

   public els(int $$0) {
      this.b = bti.a($$0);
   }

   public els(btl $$0) {
      this.b = $$0;
   }

   public btl a() {
      return this.b;
   }
}
