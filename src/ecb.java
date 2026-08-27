import com.mojang.serialization.Codec;

public class ecb extends ecp {
   public static final Codec<ecb> a = bmi.b(0, 256).fieldOf("count").xmap(ecb::new, $$0 -> $$0.c).codec();
   private final bmi c;

   private ecb(bmi $$0) {
      this.c = $$0;
   }

   public static ecb a(bmi $$0) {
      return new ecb($$0);
   }

   public static ecb a(int $$0) {
      return a(bmf.a($$0));
   }

   @Override
   protected int a(axd $$0, ib $$1) {
      return this.c.a($$0);
   }

   @Override
   public ecm<?> b() {
      return ecm.f;
   }
}
