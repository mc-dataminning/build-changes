import com.mojang.serialization.MapCodec;

public class dlj extends dex {
   public static final MapCodec<dlj> h = b(dlj::new);
   public static final dsy<je.a> i = dsq.I;

   @Override
   public MapCodec<? extends dlj> a() {
      return h;
   }

   public dlj(drz.d $$0) {
      super($$0);
      this.k(this.o().a(i, je.a.b));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return b($$0, $$1);
   }

   public static dsa b(dsa $$0, dlk $$1) {
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
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(i);
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
