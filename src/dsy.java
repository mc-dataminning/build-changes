import com.mojang.serialization.MapCodec;

public class dsy extends dmf {
   public static final MapCodec<dsy> c = b(dsy::new);
   public static final ebf<ja.a> d = eax.K;

   @Override
   public MapCodec<? extends dsy> a() {
      return c;
   }

   public dsy(eag.d $$0) {
      super($$0);
      this.l(this.m().b(d, ja.a.b));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return b($$0, $$1);
   }

   public static eah b(eah $$0, dsz $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ja.a)$$0.c(d)) {
               case a:
                  return $$0.b(d, ja.a.c);
               case c:
                  return $$0.b(d, ja.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(d);
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(d, $$0.k().o());
   }
}
