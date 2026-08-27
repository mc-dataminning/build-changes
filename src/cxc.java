import com.mojang.serialization.MapCodec;

public class cxc extends cwq {
   public static final MapCodec<cxc> a = b(cxc::new);
   public static final int b = 6;
   public static final dkh c = djx.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final emm[] g = new emm[]{
      cwq.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwq.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwq.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwq.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwq.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwq.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwq.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cxc> a() {
      return a;
   }

   protected cxc(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return g[$$0.c(c)];
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      cmy $$6 = $$3.b($$4);
      cmt $$7 = $$6.d();
      if ($$6.a(asp.ai) && $$0.c(c) == 0) {
         cwq $$8 = cwq.a($$7);
         if ($$8 instanceof cxf) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, ars.cT, art.e, 1.0F, 1.0F);
            $$1.b($$2, cxg.a($$8));
            $$1.a($$3, dnr.c, $$2);
            $$3.b(asc.c.b($$7));
            return bkb.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bkb.a;
         }

         if ($$6.b()) {
            return bkb.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bkb a(ctq $$0, hx $$1, djh $$2, cfi $$3) {
      if (!$$3.t(false)) {
         return bkb.d;
      } else {
         $$3.a(asc.U);
         $$3.gc().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dnr.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dnr.f, $$1);
         }

         return bkb.a;
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
