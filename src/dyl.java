import com.mojang.serialization.Codec;

public class dyl extends dyz {
   public static final Codec<dyl> a = bjh.b(0, 256).fieldOf("count").xmap(dyl::new, $$0 -> $$0.c).codec();
   private final bjh c;

   private dyl(bjh $$0) {
      this.c = $$0;
   }

   public static dyl a(bjh $$0) {
      return new dyl($$0);
   }

   public static dyl a(int $$0) {
      return a(bje.a($$0));
   }

   @Override
   protected int a(auw $$0, hx $$1) {
      return this.c.a($$0);
   }

   @Override
   public dyw<?> b() {
      return dyw.f;
   }
}
