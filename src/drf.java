import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drf extends dkn implements dkg, drj {
   public static final MapCodec<drf> a = b(drf::new);
   public static final int b = 4;
   public static final dyn c = dye.aV;
   public static final dyf d = dye.J;
   protected static final fcl e = dkd.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final fcl f = dkd.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final fcl g = dkd.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final fcl h = dkd.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<drf> a() {
      return a;
   }

   protected drf(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         etq $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == etr.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(dxo $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return !$$0.g($$1, $$2).a(jm.b).c() || $$0.c($$1, $$2, jm.b);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkf.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, etr.c, etr.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dxo $$0, dax $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
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
   protected etq b_(dxo $$0) {
      return $$0.c(d) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(axk.at);
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
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
               jh $$14 = new jh($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dkf.J)) {
                  dxo $$15 = $$0.a_($$14.e());
                  if ($$15.a(axk.at)) {
                     $$0.a($$14, dkf.nx.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
