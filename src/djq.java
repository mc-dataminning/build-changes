import com.mojang.serialization.MapCodec;

public class djq extends dde {
   public static final MapCodec<djq> h = b(djq::new);
   public static final drf<is.a> i = dqx.I;

   @Override
   public MapCodec<? extends djq> a() {
      return h;
   }

   public djq(dqg.d $$0) {
      super($$0);
      this.k(this.n().a(i, is.a.b));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return b($$0, $$1);
   }

   public static dqh b(dqh $$0, djr $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((is.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, is.a.c);
               case c:
                  return $$0.a(i, is.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(i);
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(i, $$0.k().o());
   }
}
