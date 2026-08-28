import com.mojang.serialization.MapCodec;

public class dov extends dij {
   public static final MapCodec<dov> h = b(dov::new);
   public static final dwl<jm.a> i = dwe.I;

   @Override
   public MapCodec<? extends dov> a() {
      return h;
   }

   public dov(dvn.d $$0) {
      super($$0);
      this.l(this.m().b(i, jm.a.b));
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return b($$0, $$1);
   }

   public static dvo b(dvo $$0, dow $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jm.a)$$0.c(i)) {
               case a:
                  return $$0.b(i, jm.a.c);
               case c:
                  return $$0.b(i, jm.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(i);
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
