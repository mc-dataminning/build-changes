import com.mojang.serialization.MapCodec;

public class dtx extends dne {
   public static final MapCodec<dtx> c = b(dtx::new);
   public static final ece<jc.a> d = ebw.K;

   @Override
   public MapCodec<? extends dtx> a() {
      return c;
   }

   public dtx(ebf.d $$0) {
      super($$0);
      this.l(this.m().b(d, jc.a.b));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return b($$0, $$1);
   }

   public static ebg b(ebg $$0, dty $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jc.a)$$0.c(d)) {
               case a:
                  return $$0.b(d, jc.a.c);
               case c:
                  return $$0.b(d, jc.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(d);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(d, $$0.k().o());
   }
}
