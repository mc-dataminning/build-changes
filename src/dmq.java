import com.mojang.serialization.MapCodec;

public class dmq extends des {
   public static final MapCodec<dmq> c = b(dmq::new);

   @Override
   public MapCodec<dmq> a() {
      return c;
   }

   public dmq(dsg.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dfh.a.o();
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dsh $$0) {
      return $$0.a(avu.aT);
   }

   @Override
   protected boolean f(dsh $$0) {
      return true;
   }
}
