import com.mojang.serialization.MapCodec;

public class dsa extends dlu {
   public static final MapCodec<dsa> a = b(dsa::new);
   public static final eaf b = dsd.b;

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   public dsa(dzn.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dzo $$0, dip $$1, iu $$2, cqs $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwa $$3) {
      if (!$$3.ce()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return (bty)($$0.h() instanceof cxa && new dcl($$4, $$5, $$0, $$6).b() ? bty.e : bty.a);
   }

   private static void d(dzo $$0, dip $$1, iu $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dzo $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, cys $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btj.a(1, 5));
      }
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dip $$0, iu $$1) {
      double $$2 = 0.5625;
      azt $$3 = $$0.A;

      for (ja $$4 : ja.values()) {
         iu $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            ja.a $$6 = $$4.o();
            double $$7 = $$6 == ja.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ja.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ja.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ls.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }
}
