import com.mojang.serialization.MapCodec;

public class czc extends cua {
   public static final MapCodec<czc> a = b(czc::new);
   public static final dgz<hx.a> b = dgr.H;
   protected static final int c = 2;
   protected static final eiy d = cua.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eiy e = cua.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   public czc(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.a.a));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      switch ((hx.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$1.D_().j() && $$1.X().b(cqv.e) && $$3.a(2000) < $$1.ai().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bjx.bs)) {
            bjt $$4 = bjx.bs.a($$1, $$2.c(), bkn.d);
            if ($$4 != null) {
               $$4.as();
            }
         }
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      hx.a $$6 = $$1.o();
      hx.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new ecc($$3, $$4, $$7).c() ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if ($$3.cs()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqd.sW, aqe.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for (int $$4 = 0; $$4 < 4; $$4++) {
         double $$5 = (double)$$2.u() + $$3.j();
         double $$6 = (double)$$2.v() + $$3.j();
         double $$7 = (double)$$2.w() + $$3.j();
         double $$8 = ((double)$$3.i() - 0.5) * 0.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         double $$10 = ((double)$$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.g()).a(this) && !$$1.a_($$2.h()).a(this)) {
            $$5 = (double)$$2.u() + 0.5 + 0.25 * (double)$$11;
            $$8 = (double)($$3.i() * 2.0F * (float)$$11);
         } else {
            $$7 = (double)$$2.w() + 0.5 + 0.25 * (double)$$11;
            $$10 = (double)($$3.i() * 2.0F * (float)$$11);
         }

         $$1.a(js.X, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return ckj.b;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((hx.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, hx.a.a);
               case a:
                  return $$0.a(b, hx.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }
}
