import com.mojang.serialization.MapCodec;

public class der extends cwy implements cws {
   public static final MapCodec<der> a = b(der::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dkg c = djw.as;
   private static final eml e = cwp.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eml f = cwp.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<der> a() {
      return a;
   }

   public der(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx(cna.wi);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(djg $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         djg $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dnq.c, $$2, dnq.a.a($$5));
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if ($$3 instanceof bmk && $$3.ai() != bly.O && $$3.ai() != bly.h) {
         $$3.a($$0, new els(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ac != $$3.dr() || $$3.ae != $$3.dx())) {
            double $$4 = Math.abs($$3.dr() - $$3.ac);
            double $$5 = Math.abs($$3.dx() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ai().s(), 1.0F);
            }
         }
      }
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      int $$6 = $$0.c(c);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(cna.rv)) {
         return bka.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new cmx(cna.wi, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, arr.yv, ars.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         djg $$9 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(dnq.c, $$2, dnq.a.a($$3, $$9));
         return bka.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
