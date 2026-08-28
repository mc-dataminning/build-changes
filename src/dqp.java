import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqp extends djx implements djq, dqt {
   public static final MapCodec<dqp> a = b(dqp::new);
   public static final int b = 4;
   public static final dxx c = dxo.aV;
   public static final dxp d = dxo.J;
   protected static final fbv e = djn.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final fbv f = djn.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final fbv g = djn.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final fbv h = djn.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dqp> a() {
      return a;
   }

   protected dqp(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eta $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == etb.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(dwy $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return !$$0.g($$1, $$2).a(jn.b).c() || $$0.c($$1, $$2, jn.b);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         return djp.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, etb.c, etb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dwy $$0, dah $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      switch ($$0.c(c)) {
         case 1:
         default:
            return e;
         case 2:
            return f;
         case 3:
            return g;
         case 4:
            return h;
      }
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(d) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(awp.at);
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      int $$4 = 5;
      int $$5 = 1;
      int $$6 = 2;
      int $$7 = 0;
      int $$8 = $$2.u() - 2;
      int $$9 = 0;

      for (int $$10 = 0; $$10 < 5; $$10++) {
         for (int $$11 = 0; $$11 < $$5; $$11++) {
            int $$12 = 2 + $$2.v() - 1;

            for (int $$13 = $$12 - 2; $$13 < $$12; $$13++) {
               ji $$14 = new ji($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(djp.J)) {
                  dwy $$15 = $$0.a_($$14.e());
                  if ($$15.a(awp.at)) {
                     $$0.a($$14, djp.nx.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
                  }
               }
            }
         }

         if ($$7 < 2) {
            $$5 += 2;
            $$9++;
         } else {
            $$5 -= 2;
            $$9--;
         }

         $$7++;
      }

      $$0.a($$2, $$3.b(c, Integer.valueOf(4)), 2);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
