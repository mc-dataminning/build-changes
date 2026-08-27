import com.mojang.serialization.MapCodec;

public class dkm extends dea {
   public static final MapCodec<dkm> h = b(dkm::new);
   public static final dsb<it.a> i = drt.I;

   @Override
   public MapCodec<? extends dkm> a() {
      return h;
   }

   public dkm(drc.d $$0) {
      super($$0);
      this.k(this.n().a(i, it.a.b));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return b($$0, $$1);
   }

   public static drd b(drd $$0, dkn $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((it.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, it.a.c);
               case c:
                  return $$0.a(i, it.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(i);
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(i, $$0.k().o());
   }
}
