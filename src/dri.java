import com.mojang.serialization.Codec;

public class dri implements drn {
   public static final Codec<dri> a = bhv.b(0, 256).fieldOf("count").xmap(dri::new, dri::a).codec();
   private final bhv b;

   public dri(int $$0) {
      this.b = bhs.a($$0);
   }

   public dri(bhv $$0) {
      this.b = $$0;
   }

   public bhv a() {
      return this.b;
   }
}
