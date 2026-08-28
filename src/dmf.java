import com.mojang.serialization.MapCodec;

public class dmf extends dgv implements dgy {
   public static final MapCodec<dmf> a = b(dmf::new);

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   protected dmf(dtz.d $$0) {
      super($$0);
   }

   private static boolean b(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.d();
      dua $$4 = $$1.a_($$3);
      int $$5 = eps.a($$0, $$4, jj.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dgx.dV.o());
      }
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      dua $$4 = $$0.a_($$2);
      je $$5 = $$2.d();
      dvx $$6 = $$0.l().g();
      ka<eco<?, ?>> $$7 = $$0.F_().d(lv.aI);
      if ($$4.a(dgx.ow)) {
         this.a($$7, rw.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dgx.on)) {
         this.a($$7, rw.j, $$0, $$6, $$1, $$5);
         this.a($$7, rw.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rw.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ka<eco<?, ?>> $$0, ala<eco<?, ?>> $$1, arg $$2, dvx $$3, azk $$4, je $$5) {
      $$0.b($$1).ifPresent($$4x -> ((eco)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dgy.a at_() {
      return dgy.a.a;
   }
}
