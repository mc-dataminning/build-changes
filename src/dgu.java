import com.mojang.serialization.MapCodec;

public abstract class dgu extends ddy implements dgt {
   public dgu(dra.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgu> a();

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cif $$4 = cif.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cif $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(drb $$0) {
      return $$0.i() || $$0.a(avw.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$3.a(16) == 0) {
         io $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            ayg.a($$1, $$2, $$3, new kp(ky.C, $$0));
         }
      }
   }

   public int b(drb $$0, dad $$1, io $$2) {
      return -16777216;
   }
}
