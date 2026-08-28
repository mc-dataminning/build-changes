import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duj extends dwq implements dnh, dup {
   public static final MapCodec<duj> a = b(duj::new);
   public static final int b = 4;
   public static final ecg c = ebw.aV;
   public static final ebx d = ebw.I;
   private static final fgm e = dne.b(4.0, 0.0, 6.0);
   private static final fgm f = dne.b(10.0, 0.0, 6.0);
   private static final fgm g = dne.b(12.0, 0.0, 6.0);
   private static final fgm h = dne.b(12.0, 0.0, 7.0);

   @Override
   public MapCodec<duj> a() {
      return a;
   }

   protected duj(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         exq $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == exr.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(ebg $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return !$$0.g($$1, $$2).a(jc.b).c() || $$0.c($$1, $$2, jc.b);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (!$$0.a($$1, $$3)) {
         return dng.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, exr.c, exr.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(ebg $$0, ddt $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return switch ($$0.c(c)) {
         case 2 -> f;
         case 3 -> g;
         case 4 -> h;
         default -> e;
      };
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(d) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(axg.at);
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
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
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dng.J)) {
                  ebg $$15 = $$0.a_($$14.e());
                  if ($$15.a(axg.at)) {
                     $$0.a($$14, dng.nB.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
