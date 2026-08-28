import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dms extends dno implements dnr {
   public static final MapCodec<dms> a = b(dms::new);
   private static final fgw D = dno.b(6.0, 0.0, 16.0);
   private static final fgw R = dno.b(10.0, 0.0, 16.0);
   private static final fgw S = dno.b(3.0, 0.0, 16.0);
   public static final ecq b = ecg.at;
   public static final eco<ecc> c = ecg.bn;
   public static final ecq d = ecg.aX;
   public static final int e = 16;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 1;

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   public dms(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, ecc.a).b(d, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean e_(ebq $$0) {
      return true;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      fgw $$4 = $$0.c(c) == ecc.c ? R : D;
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return S.a($$0.a($$2));
   }

   @Override
   protected boolean a_(ebq $$0, djn $$1, iw $$2) {
      return false;
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         ebq $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axn.ax)) {
            if ($$2.a(dnq.nE)) {
               return this.m().b(b, Integer.valueOf(0));
            } else if ($$2.a(dnq.nF)) {
               int $$3 = $$2.c(b) > 0 ? 1 : 0;
               return this.m().b(b, Integer.valueOf($$3));
            } else {
               ebq $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dnq.nF) ? this.m().b(b, $$4.c(b)) : dnq.nE.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(ebq $$0) {
      return $$0.c(d) == 0;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(d) == 0) {
         if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return $$1.a_($$2.e()).a(axn.ax);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jc.b && $$6.a(dnq.nF) && $$6.c(b) > $$0.c(b) ? $$0.a(b) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iw $$9 = $$2.b($$4);
         ebq $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.v($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   protected void a(ebq $$0, dkj $$1, iw $$2, bai $$3, int $$4) {
      ebq $$5 = $$1.a_($$2.e());
      iw $$6 = $$2.c(2);
      ebq $$7 = $$1.a_($$6);
      ecc $$8 = ecc.a;
      if ($$4 >= 1) {
         if (!$$5.a(dnq.nF) || $$5.c(c) == ecc.a) {
            $$8 = ecc.b;
         } else if ($$5.a(dnq.nF) && $$5.c(c) != ecc.a) {
            $$8 = ecc.c;
            if ($$7.a(dnq.nF)) {
               $$1.a($$2.e(), $$5.b(c, ecc.b), 3);
               $$1.a($$6, $$7.b(c, ecc.a), 3);
            }
         }
      }

      int $$9 = $$0.c(b) != 1 && !$$7.a(dnq.nF) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(b, Integer.valueOf($$9)).b(c, $$8).b(d, Integer.valueOf($$10)), 3);
   }

   protected int a(djn $$0, iw $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dnq.nF)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(djn $$0, iw $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dnq.nF)) {
         $$2++;
      }

      return $$2;
   }
}
