import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends dne implements dnh {
   public static final MapCodec<dmi> a = b(dmi::new);
   private static final fgm D = dne.b(6.0, 0.0, 16.0);
   private static final fgm R = dne.b(10.0, 0.0, 16.0);
   private static final fgm S = dne.b(3.0, 0.0, 16.0);
   public static final ecg b = ebw.at;
   public static final ece<ebs> c = ebw.bn;
   public static final ecg d = ebw.aX;
   public static final int e = 16;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 1;

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   public dmi(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, ebs.a).b(d, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean e_(ebg $$0) {
      return true;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      fgm $$4 = $$0.c(c) == ebs.c ? R : D;
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return S.a($$0.a($$2));
   }

   @Override
   protected boolean a_(ebg $$0, djd $$1, iw $$2) {
      return false;
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         ebg $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axg.ax)) {
            if ($$2.a(dng.nE)) {
               return this.m().b(b, Integer.valueOf(0));
            } else if ($$2.a(dng.nF)) {
               int $$3 = $$2.c(b) > 0 ? 1 : 0;
               return this.m().b(b, Integer.valueOf($$3));
            } else {
               ebg $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dng.nF) ? this.m().b(b, $$4.c(b)) : dng.nE.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(ebg $$0) {
      return $$0.c(d) == 0;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
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
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return $$1.a_($$2.e()).a(axg.ax);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jc.b && $$6.a(dng.nF) && $$6.c(b) > $$0.c(b) ? $$0.a(b) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iw $$9 = $$2.b($$4);
         ebg $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.v($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   protected void a(ebg $$0, djz $$1, iw $$2, azz $$3, int $$4) {
      ebg $$5 = $$1.a_($$2.e());
      iw $$6 = $$2.c(2);
      ebg $$7 = $$1.a_($$6);
      ebs $$8 = ebs.a;
      if ($$4 >= 1) {
         if (!$$5.a(dng.nF) || $$5.c(c) == ebs.a) {
            $$8 = ebs.b;
         } else if ($$5.a(dng.nF) && $$5.c(c) != ebs.a) {
            $$8 = ebs.c;
            if ($$7.a(dng.nF)) {
               $$1.a($$2.e(), $$5.b(c, ebs.b), 3);
               $$1.a($$6, $$7.b(c, ebs.a), 3);
            }
         }
      }

      int $$9 = $$0.c(b) != 1 && !$$7.a(dng.nF) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(b, Integer.valueOf($$9)).b(c, $$8).b(d, Integer.valueOf($$10)), 3);
   }

   protected int a(djd $$0, iw $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dng.nF)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(djd $$0, iw $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dng.nF)) {
         $$2++;
      }

      return $$2;
   }
}
