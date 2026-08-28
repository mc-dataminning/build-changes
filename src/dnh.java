import com.mojang.serialization.MapCodec;

public class dnh extends dhy implements dib {
   public static final MapCodec<dnh> a = b(dnh::new);

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   protected dnh(dvc.d $$0) {
      super($$0);
   }

   private static boolean b(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.d();
      dvd $$4 = $$1.a_($$3);
      int $$5 = eqv.a($$0, $$4, jl.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dia.dV.m());
      }
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      dvd $$4 = $$0.a_($$2);
      jg $$5 = $$2.d();
      dxa $$6 = $$0.l().g();
      kc<edr<?, ?>> $$7 = $$0.H_().e(ly.aJ);
      if ($$4.a(dia.ow)) {
         this.a($$7, sa.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dia.on)) {
         this.a($$7, sa.j, $$0, $$6, $$1, $$5);
         this.a($$7, sa.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, sa.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(kc<edr<?, ?>> $$0, alg<edr<?, ?>> $$1, arm $$2, dxa $$3, azr $$4, jg $$5) {
      $$0.a($$1).ifPresent($$4x -> ((edr)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dib.a as_() {
      return dib.a.a;
   }
}
