import com.mojang.serialization.MapCodec;

public class dki extends dey implements dfb {
   public static final MapCodec<dki> a = b(dki::new);

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   protected dki(dsa.d $$0) {
      super($$0);
   }

   private static boolean b(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.c();
      dsb $$4 = $$1.a_($$3);
      int $$5 = enl.a($$1, $$0, $$2, $$4, $$3, je.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfa.dV.o());
      }
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
      dsb $$4 = $$0.a_($$2);
      iz $$5 = $$2.c();
      dty $$6 = $$0.l().g();
      jv<eak<?, ?>> $$7 = $$0.H_().d(lq.aC);
      if ($$4.a(dfa.ow)) {
         this.a($$7, sj.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dfa.on)) {
         this.a($$7, sj.j, $$0, $$6, $$1, $$5);
         this.a($$7, sj.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, sj.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jv<eak<?, ?>> $$0, ald<eak<?, ?>> $$1, are $$2, dty $$3, azg $$4, iz $$5) {
      $$0.b($$1).ifPresent($$4x -> ((eak)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dfb.a ap_() {
      return dfb.a.a;
   }
}
