import com.mojang.serialization.Codec;

public class dru implements drz {
   public static final Codec<dru> a = bic.b(0, 256).fieldOf("count").xmap(dru::new, dru::a).codec();
   private final bic b;

   public dru(int $$0) {
      this.b = bhz.a($$0);
   }

   public dru(bic $$0) {
      this.b = $$0;
   }

   public bic a() {
      return this.b;
   }
}
