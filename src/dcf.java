import com.mojang.serialization.MapCodec;

public class dcf extends cyb {
   public static final MapCodec<dcf> a = b(dcf::new);
   public static final djg b = djf.s;
   public static final djp e = djf.aA;

   @Override
   public MapCodec<dcf> a() {
      return a;
   }

   protected dcf(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ia.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if (!$$3.fT().e) {
         return bjl.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bjl.a($$1.B);
      }
   }

   @Override
   protected int g(dip $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dip a(coq $$0) {
      dip $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == ia.a && !this.b($$3, $$5, $$2)) {
         return cwb.a.o();
      } else {
         return !$$3.y_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(ctb $$0, hv $$1, dip $$2) {
      return this.a((cto)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$0.c(d)) {
         ia $$4 = $$0.c(aE);
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
         $$1.a(jp.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(aE, e, b, d);
   }
}
