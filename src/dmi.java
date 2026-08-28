import com.mojang.serialization.MapCodec;

public class dmi extends dek {
   public static final MapCodec<dmi> c = b(dmi::new);

   @Override
   public MapCodec<dmi> a() {
      return c;
   }

   public dmi(drz.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dez.a.o();
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dsa $$0) {
      return $$0.a(awo.aT);
   }

   @Override
   protected boolean f(dsa $$0) {
      return true;
   }
}
