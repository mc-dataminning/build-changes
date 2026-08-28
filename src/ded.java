import com.mojang.serialization.MapCodec;

public class ded extends dfa implements dfd {
   public static final MapCodec<ded> a = b(ded::new);
   protected static final float b = 4.0F;
   protected static final ewl c = dfa.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public ded(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      evs $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awp.au);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfc.a.o();
      } else {
         if ($$1 == je.b && $$2.a(dfc.mZ)) {
            $$3.a($$4, dfc.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq(cut.dR);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dsd $$0, cmy $$1, dbf $$2, iz $$3) {
      return $$1.eX().g() instanceof cwd ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dbz $$0, iz $$1) {
      $$0.a($$1.c(), dfc.mZ.o().a(dee.i, dsp.b), 3);
   }
}
