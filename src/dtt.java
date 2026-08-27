import com.mojang.serialization.Codec;

public class dtt implements dty {
   public static final Codec<dtt> a = bjg.b(0, 256).fieldOf("count").xmap(dtt::new, dtt::a).codec();
   private final bjg b;

   public dtt(int $$0) {
      this.b = bjd.a($$0);
   }

   public dtt(bjg $$0) {
      this.b = $$0;
   }

   public bjg a() {
      return this.b;
   }
}
