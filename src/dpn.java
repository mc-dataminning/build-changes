import com.mojang.serialization.MapCodec;

public class dpn extends dhs implements dhm {
   public static final MapCodec<dpn> a = b(dpn::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dvo c = dve.as;
   private static final ezm e = dhj.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ezm f = dhj.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   public dpn(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp(cvt.wx);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(duo $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         duo $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dzl.c, $$2, dzl.a.a($$5));
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if ($$3 instanceof buk && $$3.ao() != btv.Q && $$3.ao() != btv.h) {
         $$3.a($$0, new eys(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ab != $$3.dx() || $$3.ad != $$3.dD())) {
            double $$4 = Math.abs($$3.dx() - $$3.ab);
            double $$5 = Math.abs($$3.dD() - $$3.ad);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ak().u(), 1.0F);
            }
         }
      }
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (brp)(!$$8 && $$0.a(cvt.rz) ? brp.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cvp(cvt.wx, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awe.zy, awf.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         duo $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dzl.c, $$2, dzl.a.a($$3, $$8));
         return brp.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
