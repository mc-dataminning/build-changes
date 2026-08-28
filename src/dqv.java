import com.mojang.serialization.MapCodec;

public class dqv extends dke {
   public static final MapCodec<dqv> c = b(dqv::new);
   public static final dyo<jn.a> d = dyg.K;

   @Override
   public MapCodec<? extends dqv> a() {
      return c;
   }

   public dqv(dxp.d $$0) {
      super($$0);
      this.l(this.m().b(d, jn.a.b));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return b($$0, $$1);
   }

   public static dxq b(dxq $$0, dqw $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jn.a)$$0.c(d)) {
               case a:
                  return $$0.b(d, jn.a.c);
               case c:
                  return $$0.b(d, jn.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(d);
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(d, $$0.k().o());
   }
}
