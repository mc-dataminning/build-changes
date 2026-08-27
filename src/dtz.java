import com.mojang.serialization.Codec;

public class dtz extends dun {
   public static final Codec<dtz> a = bgj.b(0, 256).fieldOf("count").xmap(dtz::new, $$0 -> $$0.c).codec();
   private final bgj c;

   private dtz(bgj $$0) {
      this.c = $$0;
   }

   public static dtz a(bgj $$0) {
      return new dtz($$0);
   }

   public static dtz a(int $$0) {
      return a(bgg.a($$0));
   }

   @Override
   protected int a(ash $$0, gw $$1) {
      return this.c.a($$0);
   }

   @Override
   public duk<?> b() {
      return duk.f;
   }
}
