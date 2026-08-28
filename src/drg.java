import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drg extends dko implements dkh, drl {
   public static final MapCodec<drg> a = b(drg::new);
   public static final int b = 4;
   public static final dyq c = dyg.aV;
   public static final dyh d = dyg.I;
   private static final fcr e = dke.b(4.0, 0.0, 6.0);
   private static final fcr f = dke.b(10.0, 0.0, 6.0);
   private static final fcr g = dke.b(12.0, 0.0, 6.0);
   private static final fcr h = dke.b(12.0, 0.0, 7.0);

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   protected drg(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         etw $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == etx.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(dxq $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return !$$0.g($$1, $$2).a(jn.b).c() || $$0.c($$1, $$2, jn.b);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, etx.c, etx.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dxq $$0, dax $$1) {
      return !$$1.h() && $$1.n().a(this.i()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return switch ($$0.c(c)) {
         case 2 -> f;
         case 3 -> g;
         case 4 -> h;
         default -> e;
      };
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(awp.at);
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
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
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dkg.J)) {
                  dxq $$15 = $$0.a_($$14.e());
                  if ($$15.a(awp.at)) {
                     $$0.a($$14, dkg.nx.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
