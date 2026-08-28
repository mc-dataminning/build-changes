import com.mojang.serialization.Codec;

public class ehw implements eib {
   public static final Codec<ehw> a = bro.b(0, 256).fieldOf("count").xmap(ehw::new, ehw::a).codec();
   private final bro b;

   public ehw(int $$0) {
      this.b = brl.a($$0);
   }

   public ehw(bro $$0) {
      this.b = $$0;
   }

   public bro a() {
      return this.b;
   }
}
