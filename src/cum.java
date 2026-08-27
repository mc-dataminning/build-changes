import com.mojang.serialization.MapCodec;

public class cum extends cua {
   public static final MapCodec<cum> a = b(cum::new);
   public static final int b = 6;
   public static final dhb c = dgr.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final eiy[] g = new eiy[]{
      cua.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cua.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cua.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cua.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cua.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cua.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cua.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cum> a() {
      return a;
   }

   protected cum(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return g[$$0.c(c)];
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ckj $$6 = $$3.b($$4);
      cke $$7 = $$6.d();
      if ($$6.a(ara.ai) && $$0.c(c) == 0) {
         cua $$8 = cua.a($$7);
         if ($$8 instanceof cup) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, aqd.cK, aqe.e, 1.0F, 1.0F);
            $$1.b($$2, cuq.a($$8));
            $$1.a($$3, dkl.c, $$2);
            $$3.b(aqn.c.b($$7));
            return bib.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bib.a;
         }

         if ($$6.b()) {
            return bib.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bib a(cra $$0, ht $$1, dgb $$2, ccx $$3) {
      if (!$$3.t(false)) {
         return bib.d;
      } else {
         $$3.a(aqn.U);
         $$3.gc().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dkl.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dkl.f, $$1);
         }

         return bib.a;
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
