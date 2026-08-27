import com.mojang.serialization.MapCodec;

public class dbj extends ctn {
   public static final MapCodec<dbj> c = b(dbj::new);

   @Override
   public MapCodec<dbj> a() {
      return c;
   }

   public dbj(dga.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cuc.a.o();
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return h($$1.a_($$2.d()));
   }

   public static boolean h(dgb $$0) {
      return $$0.a(aqs.aS);
   }

   @Override
   protected boolean f(dgb $$0) {
      return true;
   }
}
