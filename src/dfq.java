import com.mojang.serialization.MapCodec;

public class dfq extends czf {
   public static final MapCodec<dfq> h = b(dfq::new);
   public static final dnc<ih.a> i = dmu.I;

   @Override
   public MapCodec<? extends dfq> a() {
      return h;
   }

   public dfq(dmd.d $$0) {
      super($$0);
      this.k(this.o().a(i, ih.a.b));
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return b($$0, $$1);
   }

   public static dme b(dme $$0, dfr $$1) {
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
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(i);
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
