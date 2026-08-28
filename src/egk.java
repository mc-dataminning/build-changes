import com.mojang.serialization.Codec;

public class egk implements egp {
   public static final Codec<egk> a = bri.b(0, 256).fieldOf("count").xmap(egk::new, egk::a).codec();
   private final bri b;

   public egk(int $$0) {
      this.b = brf.a($$0);
   }

   public egk(bri $$0) {
      this.b = $$0;
   }

   public bri a() {
      return this.b;
   }
}
