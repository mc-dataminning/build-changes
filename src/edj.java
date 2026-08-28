import com.mojang.serialization.Codec;

public class edj implements edo {
   public static final Codec<edj> a = bpl.b(0, 256).fieldOf("count").xmap(edj::new, edj::a).codec();
   private final bpl b;

   public edj(int $$0) {
      this.b = bpi.a($$0);
   }

   public edj(bpl $$0) {
      this.b = $$0;
   }

   public bpl a() {
      return this.b;
   }
}
