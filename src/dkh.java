import com.mojang.serialization.MapCodec;

public class dkh extends dgc {
   public static final MapCodec<dkh> a = b(dkh::new);
   public static final dru b = drt.s;
   public static final dsd e = drt.aA;

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   protected dkh(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, it.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if (!$$3.gd().e) {
         return bpw.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bpw.a($$1.B);
      }
   }

   @Override
   protected int g(drd $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public drd a(cxb $$0) {
      drd $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == it.a && !this.b($$3, $$5, $$2)) {
         return dec.a.n();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dbc $$0, io $$1, drd $$2) {
      return this.a((dbp)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
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
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(aE, e, b, d);
   }
}
