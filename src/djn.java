import com.mojang.serialization.MapCodec;

public class djn extends dhj {
   public static final MapCodec<djn> a = b(djn::new);
   protected static final ezm b = dkg.c;

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   protected djn(dun.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Override
   public duo a(czk $$0) {
      return !this.o().a((dej)$$0.q(), $$0.a()) ? dhj.a(this.o(), dhl.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == jj.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      dkg.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      duo $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dki;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
