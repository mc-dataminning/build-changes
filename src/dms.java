import com.mojang.serialization.MapCodec;

public class dms extends deu {
   public static final MapCodec<dms> c = b(dms::new);

   @Override
   public MapCodec<dms> a() {
      return c;
   }

   public dms(dsj.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dfj.a.o();
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dsk $$0) {
      return $$0.a(avw.aT);
   }

   @Override
   protected boolean f(dsk $$0) {
      return true;
   }
}
