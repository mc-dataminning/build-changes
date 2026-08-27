import com.mojang.serialization.MapCodec;

public class daw extends cys {
   public static final MapCodec<daw> a = b(daw::new);
   protected static final eos b = dbp.c;

   @Override
   public MapCodec<daw> a() {
      return a;
   }

   protected daw(dli.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Override
   public dlj a(crk $$0) {
      return !this.o().a((cvu)$$0.q(), $$0.a()) ? cys.a(this.o(), cyu.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$1 == ie.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      dbp.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      dlj $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dbr;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
