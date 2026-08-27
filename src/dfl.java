import com.mojang.serialization.MapCodec;

public class dfl extends dac implements daf {
   public static final MapCodec<dfl> a = b(dfl::new);

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   protected dfl(dna.d $$0) {
      super($$0);
   }

   private static boolean b(dnb $$0, cxe $$1, ib $$2) {
      ib $$3 = $$2.c();
      dnb $$4 = $$1.a_($$3);
      int $$5 = eig.a($$1, $$0, $$2, $$4, $$3, ih.b, $$4.b($$1, $$3));
      return $$5 < $$1.O();
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dae.dV.o());
      }
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      dnb $$4 = $$0.a_($$2);
      ib $$5 = $$2.c();
      doy $$6 = $$0.l().g();
      iy<dvf<?, ?>> $$7 = $$0.H_().d(kj.ax);
      if ($$4.a(dae.ow)) {
         this.a($$7, qs.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dae.on)) {
         this.a($$7, qs.j, $$0, $$6, $$1, $$5);
         this.a($$7, qs.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, qs.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(iy<dvf<?, ?>> $$0, ajg<dvf<?, ?>> $$1, apf $$2, doy $$3, axd $$4, ib $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dvf)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public daf.a at_() {
      return daf.a.a;
   }
}
