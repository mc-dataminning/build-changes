import com.mojang.serialization.Codec;

public class ehx implements eic {
   public static final Codec<ehx> a = bro.b(0, 256).fieldOf("count").xmap(ehx::new, ehx::a).codec();
   private final bro b;

   public ehx(int $$0) {
      this.b = brl.a($$0);
   }

   public ehx(bro $$0) {
      this.b = $$0;
   }

   public bro a() {
      return this.b;
   }
}
