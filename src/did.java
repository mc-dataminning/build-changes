import com.mojang.serialization.MapCodec;

public abstract class did extends dfh implements dic {
   public did(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends did> a();

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cit $$4 = cit.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cit $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dsk $$0) {
      return $$0.i() || $$0.a(avw.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      if ($$3.a(16) == 0) {
         ja $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            ayk.a($$1, $$2, $$3, new lb(lj.C, $$0));
         }
      }
   }

   public int b(dsk $$0, dbl $$1, ja $$2) {
      return -16777216;
   }
}
