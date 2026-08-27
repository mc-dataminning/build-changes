import com.mojang.serialization.Codec;

public class dyd extends dyr {
   public static final Codec<dyd> a = bjg.b(0, 256).fieldOf("count").xmap(dyd::new, $$0 -> $$0.c).codec();
   private final bjg c;

   private dyd(bjg $$0) {
      this.c = $$0;
   }

   public static dyd a(bjg $$0) {
      return new dyd($$0);
   }

   public static dyd a(int $$0) {
      return a(bjd.a($$0));
   }

   @Override
   protected int a(auv $$0, hx $$1) {
      return this.c.a($$0);
   }

   @Override
   public dyo<?> b() {
      return dyo.f;
   }
}
