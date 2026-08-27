import com.mojang.serialization.Codec;

public class dtm implements dtr {
   public static final Codec<dtm> a = bja.b(0, 256).fieldOf("count").xmap(dtm::new, dtm::a).codec();
   private final bja b;

   public dtm(int $$0) {
      this.b = bix.a($$0);
   }

   public dtm(bja $$0) {
      this.b = $$0;
   }

   public bja a() {
      return this.b;
   }
}
