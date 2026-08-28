import com.mojang.serialization.MapCodec;

public class dgy extends dkg {
   public static final MapCodec<dgy> a = b(dgy::new);

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   public dgy(dsz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         jd $$4 = $$2.d();
         dta $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ji.b)) {
            ayr.a($$1, $$2, $$3, lm.H);
         }
      }
   }
}
