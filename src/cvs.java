import com.mojang.serialization.MapCodec;

public class cvs extends cwp implements cws {
   public static final MapCodec<cvs> a = b(cvs::new);
   protected static final float b = 4.0F;
   protected static final eml c = cwp.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<cvs> a() {
      return a;
   }

   public cvs(djf.d $$0) {
      super($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      els $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return $$1.a_($$2.d()).a(asg.at);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         return cwr.a.o();
      } else {
         if ($$1 == ic.b && $$2.a(cwr.mZ)) {
            $$3.a($$4, cwr.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx(cna.dQ);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(djg $$0, cfh $$1, csu $$2, hx $$3) {
      return $$1.eT().d() instanceof coi ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cto $$0, hx $$1) {
      $$0.a($$1.c(), cwr.mZ.o().a(cvt.i, djs.b), 3);
   }
}
