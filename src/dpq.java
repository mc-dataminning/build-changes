import com.mojang.serialization.MapCodec;

public class dpq extends dhv implements dhp {
   public static final MapCodec<dpq> a = b(dpq::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dvs c = dvi.as;
   private static final ezq e = dhm.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ezq f = dhm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   public dpq(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs(cvw.wx);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dus $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dus $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dzp.c, $$2, dzp.a.a($$5));
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if ($$3 instanceof bun && $$3.ao() != bty.Q && $$3.ao() != bty.h) {
         $$3.a($$0, new eyw(0.8F, 0.75, 0.8F));
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
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (brs)(!$$8 && $$0.a(cvw.rz) ? brs.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cvs(cvw.wx, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awg.zy, awh.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dus $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dzp.c, $$2, dzp.a.a($$3, $$8));
         return brs.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
