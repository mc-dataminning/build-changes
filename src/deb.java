import com.mojang.serialization.MapCodec;

public class deb extends dey implements dfb {
   public static final MapCodec<deb> a = b(deb::new);
   protected static final float b = 4.0F;
   protected static final ewj c = dey.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public deb(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      evq $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awo.au);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfa.a.o();
      } else {
         if ($$1 == je.b && $$2.a(dfa.mZ)) {
            $$3.a($$4, dfa.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo(cur.dR);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dsb $$0, cmw $$1, dbd $$2, iz $$3) {
      return $$1.eX().g() instanceof cwb ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dbx $$0, iz $$1) {
      $$0.a($$1.c(), dfa.mZ.o().a(dec.i, dsn.b), 3);
   }
}
