import com.mojang.serialization.MapCodec;

public class dll extends dez {
   public static final MapCodec<dll> h = b(dll::new);
   public static final dta<je.a> i = dss.I;

   @Override
   public MapCodec<? extends dll> a() {
      return h;
   }

   public dll(dsb.d $$0) {
      super($$0);
      this.k(this.o().a(i, je.a.b));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return b($$0, $$1);
   }

   public static dsc b(dsc $$0, dlm $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((je.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, je.a.c);
               case c:
                  return $$0.a(i, je.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(i);
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
