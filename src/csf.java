import com.mojang.serialization.MapCodec;

public class csf extends ctc implements ctf {
   public static final MapCodec<csf> a = b(csf::new);
   protected static final float b = 4.0F;
   protected static final eia c = ctc.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<csf> a() {
      return a;
   }

   public csf(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      ehh $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return $$1.a_($$2.d()).a(apv.at);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         return cte.a.o();
      } else {
         if ($$1 == ha.b && $$2.a(cte.mZ)) {
            $$3.a($$4, cte.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl(cjo.dv);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dfd $$0, cca $$1, cph $$2, gw $$3) {
      return $$1.eS().d() instanceof ckw ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cqb $$0, gw $$1) {
      $$0.a($$1.c(), cte.mZ.o().a(csg.i, dfp.b), 3);
   }
}
