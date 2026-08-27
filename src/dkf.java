import com.mojang.serialization.MapCodec;

public class dkf extends dga {
   public static final MapCodec<dkf> a = b(dkf::new);
   public static final drs b = drr.s;
   public static final dsb e = drr.aA;

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   protected dkf(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, it.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if (!$$3.gd().e) {
         return bpu.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bpu.a($$1.B);
      }
   }

   @Override
   protected int g(drb $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public drb a(cwz $$0) {
      drb $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1 == it.a && !this.b($$3, $$5, $$2)) {
         return dea.a.n();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dba $$0, io $$1, drb $$2) {
      return this.a((dbn)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$0.c(d)) {
         it $$4 = $$0.c(aE);
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
         $$1.a(ks.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(aE, e, b, d);
   }
}
