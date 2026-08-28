import com.mojang.serialization.MapCodec;

public class dni extends dfj {
   public static final MapCodec<dni> c = b(dni::new);

   @Override
   public MapCodec<dni> a() {
      return c;
   }

   public dni(dsz.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dfy.a.o();
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dta $$0) {
      return $$0.a(awd.aT);
   }

   @Override
   protected boolean f(dta $$0) {
      return true;
   }
}
