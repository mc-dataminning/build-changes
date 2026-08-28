import com.mojang.serialization.MapCodec;

public class dmj extends dfw {
   public static final MapCodec<dmj> h = b(dmj::new);
   public static final dty<ji.a> i = dtq.I;

   @Override
   public MapCodec<? extends dmj> a() {
      return h;
   }

   public dmj(dsz.d $$0) {
      super($$0);
      this.k(this.o().a(i, ji.a.b));
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return b($$0, $$1);
   }

   public static dta b(dta $$0, dmk $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ji.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ji.a.c);
               case c:
                  return $$0.a(i, ji.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(i);
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
