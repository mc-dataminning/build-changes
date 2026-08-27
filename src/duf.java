import com.mojang.serialization.Codec;

public class duf extends dut {
   public static final Codec<duf> a = bgd.b(0, 256).fieldOf("count").xmap(duf::new, $$0 -> $$0.c).codec();
   private final bgd c;

   private duf(bgd $$0) {
      this.c = $$0;
   }

   public static duf a(bgd $$0) {
      return new duf($$0);
   }

   public static duf a(int $$0) {
      return a(bga.a($$0));
   }

   @Override
   protected int a(asc $$0, gw $$1) {
      return this.c.a($$0);
   }

   @Override
   public duq<?> b() {
      return duq.f;
   }
}
