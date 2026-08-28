import com.mojang.serialization.MapCodec;

public class dlt extends dfh {
   public static final MapCodec<dlt> h = b(dlt::new);
   public static final dti<jf.a> i = dta.I;

   @Override
   public MapCodec<? extends dlt> a() {
      return h;
   }

   public dlt(dsj.d $$0) {
      super($$0);
      this.k(this.o().a(i, jf.a.b));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return b($$0, $$1);
   }

   public static dsk b(dsk $$0, dlu $$1) {
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
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(i);
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
