import com.mojang.serialization.MapCodec;

public class dnk extends dfl {
   public static final MapCodec<dnk> c = b(dnk::new);

   @Override
   public MapCodec<dnk> a() {
      return c;
   }

   public dnk(dtb.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dga.a.o();
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return m($$1.a_($$2.e()));
   }

   public static boolean m(dtc $$0) {
      return $$0.a(awe.aT);
   }

   @Override
   protected boolean f(dtc $$0) {
      return true;
   }
}
