import com.mojang.serialization.MapCodec;

public class czm extends ctc {
   public static final MapCodec<czm> h = b(czm::new);
   public static final dgb<ha.a> i = dft.I;

   @Override
   public MapCodec<? extends czm> a() {
      return h;
   }

   public czm(dfc.d $$0) {
      super($$0);
      this.k(this.o().a(i, ha.a.b));
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return b($$0, $$1);
   }

   public static dfd b(dfd $$0, czn $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ha.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ha.a.c);
               case c:
                  return $$0.a(i, ha.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(i);
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
