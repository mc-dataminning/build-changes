import com.mojang.serialization.MapCodec;

public class cxk extends cwy {
   public static final MapCodec<cxk> a = b(cxk::new);
   public static final int b = 6;
   public static final dkp c = dkf.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final emv[] g = new emv[]{
      cwy.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwy.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwy.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwy.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwy.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwy.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwy.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cxk> a() {
      return a;
   }

   protected cxk(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return g[$$0.c(c)];
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      cnb $$7 = $$0.d();
      if ($$0.a(asq.ai) && $$1.c(c) == 0 && cwy.a($$7) instanceof cxn $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, art.di, aru.e, 1.0F, 1.0F);
         $$2.b($$3, cxo.a($$8));
         $$2.a($$4, dnz.c, $$3);
         $$4.b(asd.c.b($$7));
         return bke.a;
      } else {
         return bke.d;
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bkc.a;
         }

         if ($$3.b(bkb.a).b()) {
            return bkc.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bkc a(cty $$0, hx $$1, djp $$2, cfq $$3) {
      if (!$$3.t(false)) {
         return bkc.d;
      } else {
         $$3.a(asd.U);
         $$3.gc().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dnz.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dnz.f, $$1);
         }

         return bkc.a;
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
