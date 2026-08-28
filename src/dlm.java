import com.mojang.serialization.MapCodec;

public class dlm extends dfa {
   public static final MapCodec<dlm> h = b(dlm::new);
   public static final dtb<je.a> i = dst.I;

   @Override
   public MapCodec<? extends dlm> a() {
      return h;
   }

   public dlm(dsc.d $$0) {
      super($$0);
      this.k(this.o().a(i, je.a.b));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return b($$0, $$1);
   }

   public static dsd b(dsd $$0, dln $$1) {
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
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(i);
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
