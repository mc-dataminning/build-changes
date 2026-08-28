import com.mojang.serialization.MapCodec;

public class drq extends dma implements dmd {
   public static final MapCodec<drq> a = b(drq::new);

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   protected drq(dzy.d $$0) {
      super($$0);
   }

   private static boolean b(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.d();
      dzz $$4 = $$1.a_($$3);
      int $$5 = evx.a($$0, $$4, ja.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dmc.ej.m());
      }
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      dzz $$4 = $$0.a_($$2);
      iu $$5 = $$2.d();
      ebx $$6 = $$0.m().g();
      jr<eiq<?, ?>> $$7 = $$0.F_().f(mg.aK);
      if ($$4.a(dmc.oZ)) {
         this.a($$7, rk.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dmc.oQ)) {
         this.a($$7, rk.j, $$0, $$6, $$1, $$5);
         this.a($$7, rk.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rk.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jr<eiq<?, ?>> $$0, alf<eiq<?, ?>> $$1, arq $$2, ebx $$3, azv $$4, iu $$5) {
      $$0.a($$1).ifPresent($$4x -> ((eiq)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dmd.a am_() {
      return dmd.a.a;
   }
}
