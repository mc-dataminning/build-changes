import com.mojang.serialization.Codec;

public class elx implements emc {
   public static final Codec<elx> a = btl.b(0, 256).fieldOf("count").xmap(elx::new, elx::a).codec();
   private final btl b;

   public elx(int $$0) {
      this.b = bti.a($$0);
   }

   public elx(btl $$0) {
      this.b = $$0;
   }

   public btl a() {
      return this.b;
   }
}
