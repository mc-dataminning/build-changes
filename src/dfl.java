import com.mojang.serialization.MapCodec;

public class dfl extends dez {
   public static final MapCodec<dfl> a = b(dfl::new);
   public static final int b = 6;
   public static final dtc c = dss.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ewk[] g = new ewk[]{
      dez.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dez.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dez.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dez.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dez.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dez.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dez.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   protected dfl(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      cuk $$7 = $$0.g();
      if ($$0.a(awy.aJ) && $$1.c(c) == 0 && dez.a($$7) instanceof dfo $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, awa.dr, awb.e, 1.0F, 1.0F);
         $$2.b($$3, dfp.a($$8));
         $$2.a($$4, dwv.c, $$3);
         $$4.b(awk.c.b($$7));
         return bqw.a;
      } else {
         return bqw.d;
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqu.a;
         }

         if ($$3.b(bqt.a).e()) {
            return bqu.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqu a(dbz $$0, iz $$1, dsc $$2, cmx $$3) {
      if (!$$3.t(false)) {
         return bqu.e;
      } else {
         $$3.a(awk.U);
         $$3.gm().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dwv.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dwv.f, $$1);
         }

         return bqu.a;
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
