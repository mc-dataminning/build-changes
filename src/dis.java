import com.mojang.serialization.MapCodec;

public class dis extends dch {
   public static final MapCodec<dis> h = b(dis::new);
   public static final dqg<ij.a> i = dpy.I;

   @Override
   public MapCodec<? extends dis> a() {
      return h;
   }

   public dis(dph.d $$0) {
      super($$0);
      this.k(this.n().a(i, ij.a.b));
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return b($$0, $$1);
   }

   public static dpi b(dpi $$0, dit $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ij.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ij.a.c);
               case c:
                  return $$0.a(i, ij.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(i);
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(i, $$0.k().o());
   }
}
