import com.mojang.serialization.MapCodec;

public class dlr extends dff {
   public static final MapCodec<dlr> h = b(dlr::new);
   public static final dtf<jf.a> i = dsx.I;

   @Override
   public MapCodec<? extends dlr> a() {
      return h;
   }

   public dlr(dsg.d $$0) {
      super($$0);
      this.k(this.o().a(i, jf.a.b));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return b($$0, $$1);
   }

   public static dsh b(dsh $$0, dls $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jf.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, jf.a.c);
               case c:
                  return $$0.a(i, jf.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(i);
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
