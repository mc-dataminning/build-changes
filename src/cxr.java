import com.mojang.serialization.MapCodec;

public class cxr extends cyo implements cyr {
   public static final MapCodec<cxr> a = b(cxr::new);
   protected static final float b = 4.0F;
   protected static final eol c = cyo.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<cxr> a() {
      return a;
   }

   public cxr(dle.d $$0) {
      super($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      ens $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return $$1.a_($$2.d()).a(atz.at);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if (!$$0.a($$3, $$4)) {
         return cyq.a.o();
      } else {
         if ($$1 == ie.b && $$2.a(cyq.mZ)) {
            $$3.a($$4, cyq.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz(cpc.dQ);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dlf $$0, chh $$1, cut $$2, hz $$3) {
      return $$1.eT().d() instanceof cqk ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cvn $$0, hz $$1) {
      $$0.a($$1.c(), cyq.mZ.o().a(cxs.i, dlr.b), 3);
   }
}
