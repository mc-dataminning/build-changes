import com.mojang.serialization.MapCodec;

public class drg extends dmx {
   public static final MapCodec<drg> a = b(drg::new);
   public static final dzd b = dzc.v;
   public static final dzm d = dzc.aD;

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   protected drg(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, jo.c).b(d, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$3.gj().e) {
         return btq.e;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return btq.a;
      }
   }

   @Override
   protected int h(dym $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public dym a(dbn $$0) {
      dym $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.b($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == jo.a && !this.a($$1, $$5, $$6)) {
         return dkw.a.m();
      } else {
         return !$$1.w_() && $$4.o() != $$0.c(e).o() ? $$0.b(b, Boolean.valueOf(this.b($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dhs $$0, jj $$1, dym $$2) {
      return this.a((dih)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$0.c(c)) {
         jo $$4 = $$0.c(e);
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
         $$1.a(lq.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e, d, b, c);
   }
}
