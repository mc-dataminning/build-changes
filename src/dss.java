import com.mojang.serialization.MapCodec;

public class dss extends dma {
   public static final MapCodec<dss> c = b(dss::new);
   public static final eax<ja.a> d = eap.K;

   @Override
   public MapCodec<? extends dss> a() {
      return c;
   }

   public dss(dzy.d $$0) {
      super($$0);
      this.l(this.m().b(d, ja.a.b));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return b($$0, $$1);
   }

   public static dzz b(dzz $$0, dst $$1) {
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
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(d);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(d, $$0.k().o());
   }
}
