import com.mojang.serialization.Codec;

public class ead implements eai {
   public static final Codec<ead> a = bnk.b(0, 256).fieldOf("count").xmap(ead::new, ead::a).codec();
   private final bnk b;

   public ead(int $$0) {
      this.b = bnh.a($$0);
   }

   public ead(bnk $$0) {
      this.b = $$0;
   }

   public bnk a() {
      return this.b;
   }
}
