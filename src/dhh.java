import com.mojang.serialization.MapCodec;

public class dhh extends dby implements dcb {
   public static final MapCodec<dhh> a = b(dhh::new);

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   protected dhh(doy.d $$0) {
      super($$0);
   }

   private static boolean b(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.c();
      doz $$4 = $$1.a_($$3);
      int $$5 = ekj.a($$1, $$0, $$2, $$4, $$3, ih.b, $$4.b($$1, $$3));
      return $$5 < $$1.P();
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dca.dV.n());
      }
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      doz $$4 = $$0.a_($$2);
      ib $$5 = $$2.c();
      dqw $$6 = $$0.l().g();
      iy<dxi<?, ?>> $$7 = $$0.H_().d(ks.ay);
      if ($$4.a(dca.ow)) {
         this.a($$7, re.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dca.on)) {
         this.a($$7, re.j, $$0, $$6, $$1, $$5);
         this.a($$7, re.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, re.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(iy<dxi<?, ?>> $$0, ajs<dxi<?, ?>> $$1, aps $$2, dqw $$3, axr $$4, ib $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dxi)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dcb.a ar_() {
      return dcb.a.a;
   }
}
