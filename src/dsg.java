import com.mojang.serialization.MapCodec;

public class dsg extends dnx {
   public static final MapCodec<dsg> a = b(dsg::new);
   public static final eaf b = eae.v;
   public static final eao d = eae.aD;

   @Override
   public MapCodec<dsg> a() {
      return a;
   }

   protected dsg(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, ja.c).b(d, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$3.gj().e) {
         return bty.e;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return bty.a;
      }
   }

   @Override
   protected int h(dzo $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.b($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4 == ja.a && !this.a($$1, $$5, $$6)) {
         return dlw.a.m();
      } else {
         return !$$1.w_() && $$4.o() != $$0.c(e).o() ? $$0.b(b, Boolean.valueOf(this.b($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dis $$0, iu $$1, dzo $$2) {
      return this.a((djh)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$0.c(c)) {
         ja $$4 = $$0.c(e);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(d) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(ls.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e, d, b, c);
   }
}
