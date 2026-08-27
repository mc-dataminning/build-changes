import com.mojang.serialization.MapCodec;

public class cxb extends cwp {
   public static final MapCodec<cxb> a = b(cxb::new);
   public static final int b = 6;
   public static final dkg c = djw.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final eml[] g = new eml[]{
      cwp.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwp.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwp.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwp.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwp.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwp.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwp.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cxb> a() {
      return a;
   }

   protected cxb(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return g[$$0.c(c)];
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      cmx $$6 = $$3.b($$4);
      cms $$7 = $$6.d();
      if ($$6.a(aso.ai) && $$0.c(c) == 0) {
         cwp $$8 = cwp.a($$7);
         if ($$8 instanceof cxe) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, arr.cT, ars.e, 1.0F, 1.0F);
            $$1.b($$2, cxf.a($$8));
            $$1.a($$3, dnq.c, $$2);
            $$3.b(asb.c.b($$7));
            return bka.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bka.a;
         }

         if ($$6.b()) {
            return bka.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bka a(ctp $$0, hx $$1, djg $$2, cfh $$3) {
      if (!$$3.t(false)) {
         return bka.d;
      } else {
         $$3.a(asb.U);
         $$3.gc().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dnq.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dnq.f, $$1);
         }

         return bka.a;
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
