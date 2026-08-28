import com.mojang.serialization.MapCodec;

public abstract class dib extends dff implements dia {
   public dib(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dib> a();

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         ciq $$4 = ciq.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(ciq $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dsh $$0) {
      return $$0.i() || $$0.a(avu.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$3.a(16) == 0) {
         ja $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            ayi.a($$1, $$2, $$3, new lb(lj.C, $$0));
         }
      }
   }

   public int b(dsh $$0, dbj $$1, ja $$2) {
      return -16777216;
   }
}
