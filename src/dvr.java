import com.mojang.serialization.Codec;

public class dvr implements dvw {
   public static final Codec<dvr> a = bkz.b(0, 256).fieldOf("count").xmap(dvr::new, dvr::a).codec();
   private final bkz b;

   public dvr(int $$0) {
      this.b = bkw.a($$0);
   }

   public dvr(bkz $$0) {
      this.b = $$0;
   }

   public bkz a() {
      return this.b;
   }
}
