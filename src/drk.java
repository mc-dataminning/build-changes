import com.mojang.serialization.MapCodec;

public class drk extends dqn {
   public static final MapCodec<drk> a = b(drk::new);
   private static final wy b = wy.c("container.loom");

   @Override
   public MapCodec<drk> a() {
      return a;
   }

   protected drk(ean.d $$0) {
      super($$0);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.ax);
      }

      return bug.a;
   }

   @Override
   protected bui b(eao $$0, djh $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cwj($$2x, $$3, cvp.a($$1, $$2)), b);
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(e);
   }
}
