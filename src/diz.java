import com.mojang.serialization.MapCodec;

public class diz extends dgv {
   public static final MapCodec<diz> a = b(diz::new);
   protected static final eyx b = djs.c;

   @Override
   public MapCodec<diz> a() {
      return a;
   }

   protected diz(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Override
   public dua a(cyw $$0) {
      return !this.o().a((ddv)$$0.q(), $$0.a()) ? dgv.a(this.o(), dgx.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == jj.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      djs.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      dua $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dju;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
