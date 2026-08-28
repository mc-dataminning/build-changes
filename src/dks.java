import com.mojang.serialization.MapCodec;

public class dks extends dfi implements dfl {
   public static final MapCodec<dks> a = b(dks::new);

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   protected dks(dsk.d $$0) {
      super($$0);
   }

   private static boolean b(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.c();
      dsl $$4 = $$1.a_($$3);
      int $$5 = eoa.a($$1, $$0, $$2, $$4, $$3, jf.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfk.dV.o());
      }
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      dsl $$4 = $$0.a_($$2);
      ja $$5 = $$2.c();
      dui $$6 = $$0.l().g();
      jw<eay<?, ?>> $$7 = $$0.H_().d(lr.aH);
      if ($$4.a(dfk.ow)) {
         this.a($$7, rp.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dfk.on)) {
         this.a($$7, rp.j, $$0, $$6, $$1, $$5);
         this.a($$7, rp.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rp.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jw<eay<?, ?>> $$0, akj<eay<?, ?>> $$1, aqm $$2, dui $$3, ayo $$4, ja $$5) {
      $$0.b($$1).ifPresent($$4x -> ((eay)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dfl.a aq_() {
      return dfl.a.a;
   }
}
