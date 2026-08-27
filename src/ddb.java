import com.mojang.serialization.MapCodec;

public class ddb extends ddy implements deb {
   public static final MapCodec<ddb> a = b(ddb::new);
   protected static final float b = 4.0F;
   protected static final evd c = ddy.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<ddb> a() {
      return a;
   }

   public ddb(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      euk $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return $$1.a_($$2.d()).a(avw.au);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if (!$$0.a($$3, $$4)) {
         return dea.a.n();
      } else {
         if ($$1 == it.b && $$2.a(dea.mZ)) {
            $$3.a($$4, dea.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto(ctr.dR);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(drb $$0, clw $$1, dad $$2, io $$3) {
      return $$1.eX().g() instanceof cvb ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dax $$0, io $$1) {
      $$0.a($$1.c(), dea.mZ.n().a(ddc.i, drn.b), 3);
   }
}
