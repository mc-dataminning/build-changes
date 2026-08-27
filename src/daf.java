import com.mojang.serialization.MapCodec;

public class daf extends cwa {
   public static final MapCodec<daf> a = b(daf::new);
   public static final dgs b = dgr.s;
   public static final dhb e = dgr.aA;

   @Override
   public MapCodec<daf> a() {
      return a;
   }

   protected daf(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, hx.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if (!$$3.fT().e) {
         return bib.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bib.a($$1.B);
      }
   }

   @Override
   protected int g(dgb $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a && !this.b($$3, $$5, $$2)) {
         return cuc.a.o();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(crc $$0, ht $$1, dgb $$2) {
      return this.a((crp)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$0.c(d)) {
         hx $$4 = $$0.c(aE);
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
         $$1.a(jm.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(aE, e, b, d);
   }
}
