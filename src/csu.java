import javax.annotation.Nullable;

public class csu extends csd implements cvh {
   private static final dge b = dfu.bv;
   public static final int a = 2;
   private final csq c;
   private final aoy d;
   private final aoy e;

   public csu(csq $$0, dfd.d $$1, aoy $$2, aoy $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.e = $$3;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b);
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$1.c_($$2) instanceof dcu $$4) {
         $$4.c();
      }

      if (cvi.h($$1.a_($$2.d())) && $$2.v() >= $$1.C_()) {
         byh $$5 = byh.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, byh $$2) {
      ehi $$3 = $$2.cG().f();
      $$0.c(2001, gw.a($$3), csq.i($$2.o()));
      $$0.a($$2, djo.f, $$3);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$3.a(16) == 0) {
         gw $$4 = $$2.d();
         if (cvi.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ip(ix.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dcu($$0, $$1);
   }

   public csq a() {
      return this.c;
   }

   public aoy b() {
      return this.d;
   }

   public aoy c() {
      return this.e;
   }
}
