import com.mojang.serialization.MapCodec;

public class dbl extends cva {
   public static final MapCodec<dbl> h = b(dbl::new);
   public static final dig<hx.a> i = dhy.I;

   @Override
   public MapCodec<? extends dbl> a() {
      return h;
   }

   public dbl(dhh.d $$0) {
      super($$0);
      this.k(this.o().a(i, hx.a.b));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return b($$0, $$1);
   }

   public static dhi b(dhi $$0, dbm $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((hx.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, hx.a.c);
               case c:
                  return $$0.a(i, hx.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(i);
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
