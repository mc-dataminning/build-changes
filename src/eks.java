import com.mojang.serialization.Codec;

public class eks implements ekx {
   public static final Codec<eks> a = btd.b(0, 256).fieldOf("count").xmap(eks::new, eks::a).codec();
   private final btd b;

   public eks(int $$0) {
      this.b = bta.a($$0);
   }

   public eks(btd $$0) {
      this.b = $$0;
   }

   public btd a() {
      return this.b;
   }
}
