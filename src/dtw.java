import com.mojang.serialization.Codec;

public class dtw extends duk {
   public static final Codec<dtw> a = bfv.b(0, 256).fieldOf("count").xmap(dtw::new, $$0 -> $$0.c).codec();
   private final bfv c;

   private dtw(bfv $$0) {
      this.c = $$0;
   }

   public static dtw a(bfv $$0) {
      return new dtw($$0);
   }

   public static dtw a(int $$0) {
      return a(bfs.a($$0));
   }

   @Override
   protected int a(aru $$0, gu $$1) {
      return this.c.a($$0);
   }

   @Override
   public duh<?> b() {
      return duh.f;
   }
}
