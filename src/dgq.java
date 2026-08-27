import com.mojang.serialization.MapCodec;

public class dgq extends cyx implements cyr {
   public static final MapCodec<dgq> a = b(dgq::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dmf c = dlv.as;
   private static final eol e = cyo.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eol f = cyo.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public dgq(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz(cpc.wl);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dlf $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dlf $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dpp.c, $$2, dpp.a.a($$5));
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if ($$3 instanceof bog && $$3.ai() != bnu.P && $$3.ai() != bnu.i) {
         $$3.a($$0, new ens(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ab != $$3.dr() || $$3.ad != $$3.dx())) {
            double $$4 = Math.abs($$3.dr() - $$3.ab);
            double $$5 = Math.abs($$3.dx() - $$3.ad);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ai().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cpc.rx) ? blw.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new coz(cpc.wl, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, atk.yK, atl.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dlf $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dpp.c, $$2, dpp.a.a($$3, $$8));
         return blu.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
