import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dut extends dxa implements dnr, duz {
   public static final MapCodec<dut> a = b(dut::new);
   public static final int b = 4;
   public static final ecq c = ecg.aV;
   public static final ech d = ecg.I;
   private static final fgw e = dno.b(4.0, 0.0, 6.0);
   private static final fgw f = dno.b(10.0, 0.0, 6.0);
   private static final fgw g = dno.b(12.0, 0.0, 6.0);
   private static final fgw h = dno.b(12.0, 0.0, 7.0);

   @Override
   public MapCodec<dut> a() {
      return a;
   }

   protected dut(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eya $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eyb.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(ebq $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return !$$0.g($$1, $$2).a(jc.b).c() || $$0.c($$1, $$2, jc.b);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (!$$0.a($$1, $$3)) {
         return dnq.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, eyb.c, eyb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(ebq $$0, ded $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return switch ($$0.c(c)) {
         case 2 -> f;
         case 3 -> g;
         case 4 -> h;
         default -> e;
      };
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(d) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(axn.at);
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
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
               iw $$14 = new iw($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dnq.J)) {
                  ebq $$15 = $$0.a_($$14.e());
                  if ($$15.a(axn.at)) {
                     $$0.a($$14, dnq.nB.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
