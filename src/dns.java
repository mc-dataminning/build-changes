import com.mojang.serialization.MapCodec;

public class dns extends dij implements dim {
   public static final MapCodec<dns> a = b(dns::new);

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   protected dns(dvn.d $$0) {
      super($$0);
   }

   private static boolean b(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.d();
      dvo $$4 = $$1.a_($$3);
      int $$5 = erf.a($$0, $$4, jm.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dil.dV.m());
      }
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      dvo $$4 = $$0.a_($$2);
      jh $$5 = $$2.d();
      dxk $$6 = $$0.l().g();
      kd<eeb<?, ?>> $$7 = $$0.H_().e(ma.aJ);
      if ($$4.a(dil.ow)) {
         this.a($$7, se.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dil.on)) {
         this.a($$7, se.j, $$0, $$6, $$1, $$5);
         this.a($$7, se.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, se.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(kd<eeb<?, ?>> $$0, alk<eeb<?, ?>> $$1, arq $$2, dxk $$3, azv $$4, jh $$5) {
      $$0.a($$1).ifPresent($$4x -> ((eeb)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dim.a ar_() {
      return dim.a.a;
   }
}
