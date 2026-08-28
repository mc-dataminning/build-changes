import com.mojang.serialization.MapCodec;

public class dra extends dkl {
   public static final MapCodec<dra> h = b(dra::new);
   public static final dyr<jm.a> i = dyk.J;

   @Override
   public MapCodec<? extends dra> a() {
      return h;
   }

   public dra(dxt.d $$0) {
      super($$0);
      this.l(this.m().b(i, jm.a.b));
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return b($$0, $$1);
   }

   public static dxu b(dxu $$0, drb $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jm.a)$$0.c(i)) {
               case a:
                  return $$0.b(i, jm.a.c);
               case c:
                  return $$0.b(i, jm.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(i);
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
