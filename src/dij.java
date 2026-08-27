import com.mojang.serialization.MapCodec;

public class dij extends dby {
   public static final MapCodec<dij> h = b(dij::new);
   public static final dpx<ih.a> i = dpp.I;

   @Override
   public MapCodec<? extends dij> a() {
      return h;
   }

   public dij(doy.d $$0) {
      super($$0);
      this.k(this.n().a(i, ih.a.b));
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return b($$0, $$1);
   }

   public static doz b(doz $$0, dik $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ih.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ih.a.c);
               case c:
                  return $$0.a(i, ih.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(i);
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(i, $$0.k().o());
   }
}
