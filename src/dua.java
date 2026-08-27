import com.mojang.serialization.Codec;

public class dua extends duo {
   public static final Codec<dua> a = bfy.b(0, 256).fieldOf("count").xmap(dua::new, $$0 -> $$0.c).codec();
   private final bfy c;

   private dua(bfy $$0) {
      this.c = $$0;
   }

   public static dua a(bfy $$0) {
      return new dua($$0);
   }

   public static dua a(int $$0) {
      return a(bfv.a($$0));
   }

   @Override
   protected int a(arx $$0, gw $$1) {
      return this.c.a($$0);
   }

   @Override
   public dul<?> b() {
      return dul.f;
   }
}
