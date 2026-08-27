import com.mojang.serialization.MapCodec;

public class dao extends cvf implements cvi {
   public static final MapCodec<dao> a = b(dao::new);

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   protected dao(dhm.d $$0) {
      super($$0);
   }

   private static boolean b(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.c();
      dhn $$4 = $$1.a_($$3);
      int $$5 = eco.a($$1, $$0, $$2, $$4, $$3, ib.b, $$4.b($$1, $$3));
      return $$5 < $$1.N();
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cvh.dV.o());
      }
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      dhn $$4 = $$0.a_($$2);
      hx $$5 = $$2.c();
      djk $$6 = $$0.k().g();
      is<dpn<?, ?>> $$7 = $$0.I_().d(kd.au);
      if ($$4.a(cvh.ow)) {
         this.a($$7, qb.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cvh.on)) {
         this.a($$7, qb.j, $$0, $$6, $$1, $$5);
         this.a($$7, qb.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, qb.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(is<dpn<?, ?>> $$0, agl<dpn<?, ?>> $$1, ami $$2, djk $$3, atw $$4, hx $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dpn)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
