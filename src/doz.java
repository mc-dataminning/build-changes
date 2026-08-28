import com.mojang.serialization.MapCodec;

public class doz extends djm implements djp {
   public static final MapCodec<doz> a = b(doz::new);

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   protected doz(dww.d $$0) {
      super($$0);
   }

   private static boolean b(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.d();
      dwx $$4 = $$1.a_($$3);
      int $$5 = esq.a($$0, $$4, jn.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, djo.ei.m());
      }
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      dwx $$4 = $$0.a_($$2);
      ji $$5 = $$2.d();
      dyt $$6 = $$0.m().g();
      ke<efk<?, ?>> $$7 = $$0.K_().e(mc.aL);
      if ($$4.a(djo.oY)) {
         this.a($$7, rh.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(djo.oP)) {
         this.a($$7, rh.j, $$0, $$6, $$1, $$5);
         this.a($$7, rh.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rh.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ke<efk<?, ?>> $$0, akt<efk<?, ?>> $$1, arc $$2, dyt $$3, azh $$4, ji $$5) {
      $$0.a($$1).ifPresent($$4x -> ((efk)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public djp.a aq_() {
      return djp.a.a;
   }
}
