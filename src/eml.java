import com.mojang.serialization.Codec;

public class eml implements emr {
   public static final Codec<eml> a = bty.b(0, 256).fieldOf("count").xmap(eml::new, eml::a).codec();
   private final bty b;

   public eml(int $$0) {
      this.b = btv.a($$0);
   }

   public eml(bty $$0) {
      this.b = $$0;
   }

   public bty a() {
      return this.b;
   }
}
