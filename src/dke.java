import com.mojang.serialization.MapCodec;

public class dke extends deu implements dex {
   public static final MapCodec<dke> a = b(dke::new);

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   protected dke(drw.d $$0) {
      super($$0);
   }

   private static boolean b(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.c();
      drx $$4 = $$1.a_($$3);
      int $$5 = enh.a($$1, $$0, $$2, $$4, $$3, je.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dew.dV.n());
      }
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      drx $$4 = $$0.a_($$2);
      iz $$5 = $$2.c();
      dtu $$6 = $$0.l().g();
      jv<eag<?, ?>> $$7 = $$0.H_().d(lq.aC);
      if ($$4.a(dew.ow)) {
         this.a($$7, sj.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dew.on)) {
         this.a($$7, sj.j, $$0, $$6, $$1, $$5);
         this.a($$7, sj.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, sj.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jv<eag<?, ?>> $$0, ala<eag<?, ?>> $$1, arb $$2, dtu $$3, azc $$4, iz $$5) {
      $$0.b($$1).ifPresent($$4x -> ((eag)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dex.a ar_() {
      return dex.a.a;
   }
}
