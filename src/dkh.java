import com.mojang.serialization.MapCodec;

public class dkh extends dex implements dfa {
   public static final MapCodec<dkh> a = b(dkh::new);

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   protected dkh(drz.d $$0) {
      super($$0);
   }

   private static boolean b(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.c();
      dsa $$4 = $$1.a_($$3);
      int $$5 = enk.a($$1, $$0, $$2, $$4, $$3, je.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dez.dV.o());
      }
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      dsa $$4 = $$0.a_($$2);
      iz $$5 = $$2.c();
      dtx $$6 = $$0.l().g();
      jv<eaj<?, ?>> $$7 = $$0.H_().d(lq.aC);
      if ($$4.a(dez.ow)) {
         this.a($$7, sj.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dez.on)) {
         this.a($$7, sj.j, $$0, $$6, $$1, $$5);
         this.a($$7, sj.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, sj.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jv<eaj<?, ?>> $$0, ald<eaj<?, ?>> $$1, are $$2, dtx $$3, azf $$4, iz $$5) {
      $$0.b($$1).ifPresent($$4x -> ((eaj)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dfa.a aq_() {
      return dfa.a.a;
   }
}
