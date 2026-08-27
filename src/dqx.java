import com.mojang.serialization.Codec;

public class dqx extends drl {
   public static final Codec<dqx> a = bdc.b(0, 256).fieldOf("count").xmap(dqx::new, $$0 -> $$0.c).codec();
   private final bdc c;

   private dqx(bdc $$0) {
      this.c = $$0;
   }

   public static dqx a(bdc $$0) {
      return new dqx($$0);
   }

   public static dqx a(int $$0) {
      return a(bcz.a($$0));
   }

   @Override
   protected int a(apf $$0, gu $$1) {
      return this.c.a($$0);
   }

   @Override
   public dri<?> b() {
      return dri.f;
   }
}
