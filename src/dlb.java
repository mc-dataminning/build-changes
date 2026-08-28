import com.mojang.serialization.MapCodec;

public class dlb extends dgw {
   public static final MapCodec<dlb> a = b(dlb::new);
   public static final dso b = dsn.s;
   public static final dsx e = dsn.aA;

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   protected dlb(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, je.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if (!$$3.gd().e) {
         return bqp.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bqp.a($$1.B);
      }
   }

   @Override
   protected int g(drx $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public drx a(cxv $$0) {
      drx $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !this.b($$3, $$5, $$2)) {
         return dew.a.n();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dbw $$0, iz $$1, drx $$2) {
      return this.a((dcj)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$0.c(d)) {
         je $$4 = $$0.c(aE);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(ld.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(aE, e, b, d);
   }
}
