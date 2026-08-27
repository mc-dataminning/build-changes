import com.mojang.serialization.MapCodec;

public class djh extends dcv {
   public static final MapCodec<djh> h = b(djh::new);
   public static final dqw<ir.a> i = dqo.I;

   @Override
   public MapCodec<? extends djh> a() {
      return h;
   }

   public djh(dpx.d $$0) {
      super($$0);
      this.k(this.n().a(i, ir.a.b));
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return b($$0, $$1);
   }

   public static dpy b(dpy $$0, dji $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ir.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ir.a.c);
               case c:
                  return $$0.a(i, ir.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(i);
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(i, $$0.k().o());
   }
}
