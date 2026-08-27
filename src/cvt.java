import com.mojang.serialization.MapCodec;

public class cvt extends cwq implements cwt {
   public static final MapCodec<cvt> a = b(cvt::new);
   protected static final float b = 4.0F;
   protected static final emm c = cwq.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<cvt> a() {
      return a;
   }

   public cvt(djg.d $$0) {
      super($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      elt $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return $$1.a_($$2.d()).a(ash.at);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         return cws.a.o();
      } else {
         if ($$1 == ic.b && $$2.a(cws.mZ)) {
            $$3.a($$4, cws.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy(cnb.dQ);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(djh $$0, cfi $$1, csv $$2, hx $$3) {
      return $$1.eT().d() instanceof coj ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(ctp $$0, hx $$1) {
      $$0.a($$1.c(), cws.mZ.o().a(cvu.i, djt.b), 3);
   }
}
