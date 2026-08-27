import com.mojang.serialization.MapCodec;

public class dfj extends daa implements dad {
   public static final MapCodec<dfj> a = b(dfj::new);

   @Override
   public MapCodec<dfj> a() {
      return a;
   }

   protected dfj(dmy.d $$0) {
      super($$0);
   }

   private static boolean b(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.c();
      dmz $$4 = $$1.a_($$3);
      int $$5 = eie.a($$1, $$0, $$2, $$4, $$3, ih.b, $$4.b($$1, $$3));
      return $$5 < $$1.O();
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dac.dV.o());
      }
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      dmz $$4 = $$0.a_($$2);
      ib $$5 = $$2.c();
      dow $$6 = $$0.l().g();
      iy<dvd<?, ?>> $$7 = $$0.H_().d(kj.ax);
      if ($$4.a(dac.ow)) {
         this.a($$7, qs.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dac.on)) {
         this.a($$7, qs.j, $$0, $$6, $$1, $$5);
         this.a($$7, qs.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, qs.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(iy<dvd<?, ?>> $$0, ajg<dvd<?, ?>> $$1, apf $$2, dow $$3, axd $$4, ib $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dvd)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dad.a at_() {
      return dad.a.a;
   }
}
