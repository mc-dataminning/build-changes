import com.mojang.serialization.MapCodec;

public class dtm extends dne {
   public static final MapCodec<dtm> a = b(dtm::new);
   public static final ebx b = dtp.b;

   @Override
   public MapCodec<dtm> a() {
      return a;
   }

   public dtm(ebf.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(ebg $$0, djz $$1, iw $$2, crz $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bwv $$3) {
      if (!$$3.cd()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return (but)($$0.h() instanceof cyi && new ddt($$4, $$5, $$0, $$6).b() ? but.e : but.a);
   }

   private static void d(ebg $$0, djz $$1, iw $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(ebg $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, daa $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bue.a(1, 5));
      }
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(djz $$0, iw $$1) {
      double $$2 = 0.5625;
      azz $$3 = $$0.A;

      for (jc $$4 : jc.values()) {
         iw $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jc.a $$6 = $$4.o();
            double $$7 = $$6 == jc.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jc.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jc.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(lu.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }
}
