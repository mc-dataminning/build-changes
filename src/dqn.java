import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqn extends djv implements djo, dqr {
   public static final MapCodec<dqn> a = b(dqn::new);
   public static final int b = 4;
   public static final dxv c = dxm.aV;
   public static final dxn d = dxm.J;
   protected static final fbt e = djl.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final fbt f = djl.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final fbt g = djl.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final fbt h = djl.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   protected dqn(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dww $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         esy $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == esz.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(dww $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return !$$0.g($$1, $$2).a(jn.b).c() || $$0.c($$1, $$2, jn.b);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         return djn.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, esz.c, esz.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dww $$0, daf $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
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
   protected esy b_(dww $$0) {
      return $$0.c(d) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(awp.at);
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
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
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(djn.J)) {
                  dww $$15 = $$0.a_($$14.e());
                  if ($$15.a(awp.at)) {
                     $$0.a($$14, djn.nx.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
