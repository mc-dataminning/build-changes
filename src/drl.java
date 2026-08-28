import com.mojang.serialization.MapCodec;

public class drl extends dku {
   public static final MapCodec<drl> c = b(drl::new);
   public static final dzk<jo.a> d = dzc.K;

   @Override
   public MapCodec<? extends drl> a() {
      return c;
   }

   public drl(dyl.d $$0) {
      super($$0);
      this.l(this.m().b(d, jo.a.b));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return b($$0, $$1);
   }

   public static dym b(dym $$0, drm $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jo.a)$$0.c(d)) {
               case a:
                  return $$0.b(d, jo.a.c);
               case c:
                  return $$0.b(d, jo.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(d);
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(d, $$0.k().o());
   }
}
