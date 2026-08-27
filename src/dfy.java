import com.mojang.serialization.MapCodec;

public class dfy extends cyb {
   public static final MapCodec<dfy> c = b(dfy::new);

   @Override
   public MapCodec<dfy> a() {
      return c;
   }

   public dfy(dle.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cyq.a.o();
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dlf $$0) {
      return $$0.a(atz.aS);
   }

   @Override
   protected boolean f(dlf $$0) {
      return true;
   }
}
