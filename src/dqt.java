import com.mojang.serialization.MapCodec;

public class dqt extends diz implements dit {
   public static final MapCodec<dqt> a = b(dqt::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dwu c = dwl.as;
   private static final fas e = diq.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fas f = diq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   public dqt(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm(cwq.wN);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dvv $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dvv $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(ear.c, $$2, ear.a.a($$5));
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if ($$3 instanceof bvh && $$3.aq() != bus.Z && $$3.aq() != bus.l) {
         $$3.a($$0, new ezy(0.8F, 0.75, 0.8F));
         if ($$1 instanceof arp $$4 && $$0.c(c) != 0) {
            ezy $$6 = $$3 instanceof arq ? $$3.ah() : $$3.bC().d($$3.dt());
            if ($$6.j() > 0.0) {
               double $$7 = Math.abs($$6.a());
               double $$8 = Math.abs($$6.c());
               if ($$7 >= 0.003F || $$8 >= 0.003F) {
                  $$3.a($$4, $$1.ai().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bsk)(!$$8 && $$0.a(cwq.rP) ? bsk.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cwm(cwq.wN, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awn.zw, awo.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dvv $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(ear.c, $$2, ear.a.a($$3, $$8));
         return bsk.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
