import com.mojang.serialization.MapCodec;

public class dmc extends dfc {
   public static final MapCodec<dmc> h = b(dmc::new);
   public static final dua<iw.a> i = dts.I;

   @Override
   public MapCodec<? extends dmc> a() {
      return h;
   }

   public dmc(dtb.d $$0) {
      super($$0);
      this.k(this.n().a(i, iw.a.b));
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return b($$0, $$1);
   }

   public static dtc b(dtc $$0, dmd $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((iw.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, iw.a.c);
               case c:
                  return $$0.a(i, iw.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(i);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(i, $$0.k().o());
   }
}
