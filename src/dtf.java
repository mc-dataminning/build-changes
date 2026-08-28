import com.mojang.serialization.MapCodec;

public class dtf extends dmm {
   public static final MapCodec<dtf> c = b(dtf::new);
   public static final ebm<jb.a> d = ebe.K;

   @Override
   public MapCodec<? extends dtf> a() {
      return c;
   }

   public dtf(ean.d $$0) {
      super($$0);
      this.l(this.m().b(d, jb.a.b));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return b($$0, $$1);
   }

   public static eao b(eao $$0, dtg $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jb.a)$$0.c(d)) {
               case a:
                  return $$0.b(d, jb.a.c);
               case c:
                  return $$0.b(d, jb.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(d);
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(d, $$0.k().o());
   }
}
