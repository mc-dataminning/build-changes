import com.mojang.serialization.MapCodec;

public class dmt extends dev {
   public static final MapCodec<dmt> c = b(dmt::new);

   @Override
   public MapCodec<dmt> a() {
      return c;
   }

   public dmt(dsk.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dfk.a.o();
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dsl $$0) {
      return $$0.a(avw.aT);
   }

   @Override
   protected boolean f(dsl $$0) {
      return true;
   }
}
