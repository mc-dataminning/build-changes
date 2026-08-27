import com.mojang.serialization.MapCodec;

public class dfd extends cys {
   public static final MapCodec<dfd> h = b(dfd::new);
   public static final dmh<ie.a> i = dlz.I;

   @Override
   public MapCodec<? extends dfd> a() {
      return h;
   }

   public dfd(dli.d $$0) {
      super($$0);
      this.k(this.o().a(i, ie.a.b));
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return b($$0, $$1);
   }

   public static dlj b(dlj $$0, dfe $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ie.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ie.a.c);
               case c:
                  return $$0.a(i, ie.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(i);
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
