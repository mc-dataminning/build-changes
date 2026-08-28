import com.mojang.serialization.MapCodec;

public class dmt extends dhj implements dhm {
   public static final MapCodec<dmt> a = b(dmt::new);

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(dun.d $$0) {
      super($$0);
   }

   private static boolean b(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.d();
      duo $$4 = $$1.a_($$3);
      int $$5 = eqg.a($$0, $$4, jj.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dhl.dV.o());
      }
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      duo $$4 = $$0.a_($$2);
      je $$5 = $$2.d();
      dwl $$6 = $$0.l().g();
      ka<edc<?, ?>> $$7 = $$0.F_().d(lv.aJ);
      if ($$4.a(dhl.ow)) {
         this.a($$7, rw.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dhl.on)) {
         this.a($$7, rw.j, $$0, $$6, $$1, $$5);
         this.a($$7, rw.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rw.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ka<edc<?, ?>> $$0, alb<edc<?, ?>> $$1, arh $$2, dwl $$3, azl $$4, je $$5) {
      $$0.b($$1).ifPresent($$4x -> ((edc)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dhm.a ar_() {
      return dhm.a.a;
   }
}
