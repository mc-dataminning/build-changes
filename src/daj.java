import com.mojang.serialization.MapCodec;

public class daj extends cva implements cvd {
   public static final MapCodec<daj> a = b(daj::new);

   @Override
   public MapCodec<daj> a() {
      return a;
   }

   protected daj(dhh.d $$0) {
      super($$0);
   }

   private static boolean b(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.c();
      dhi $$4 = $$1.a_($$3);
      int $$5 = ecj.a($$1, $$0, $$2, $$4, $$3, hx.b, $$4.b($$1, $$3));
      return $$5 < $$1.N();
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cvc.dV.o());
      }
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      dhi $$4 = $$0.a_($$2);
      ht $$5 = $$2.c();
      djf $$6 = $$0.k().g();
      io<dpi<?, ?>> $$7 = $$0.H_().d(jz.au);
      if ($$4.a(cvc.ow)) {
         this.a($$7, px.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cvc.on)) {
         this.a($$7, px.j, $$0, $$6, $$1, $$5);
         this.a($$7, px.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, px.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(io<dpi<?, ?>> $$0, agh<dpi<?, ?>> $$1, ame $$2, djf $$3, ats $$4, ht $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dpi)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
