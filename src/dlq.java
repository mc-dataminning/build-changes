import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlq extends dmm implements dmp {
   public static final MapCodec<dlq> a = b(dlq::new);
   private static final ffr D = dmm.b(6.0, 0.0, 16.0);
   private static final ffr R = dmm.b(10.0, 0.0, 16.0);
   private static final ffr S = dmm.b(3.0, 0.0, 16.0);
   public static final ebo b = ebe.at;
   public static final ebm<eba> c = ebe.bn;
   public static final ebo d = ebe.aX;
   public static final int e = 16;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 1;

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   public dlq(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, eba.a).b(d, Integer.valueOf(0)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean e_(eao $$0) {
      return true;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      ffr $$4 = $$0.c(c) == eba.c ? R : D;
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return S.a($$0.a($$2));
   }

   @Override
   protected boolean a_(eao $$0, din $$1, iv $$2) {
      return false;
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         eao $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axc.ax)) {
            if ($$2.a(dmo.nE)) {
               return this.m().b(b, Integer.valueOf(0));
            } else if ($$2.a(dmo.nF)) {
               int $$3 = $$2.c(b) > 0 ? 1 : 0;
               return this.m().b(b, Integer.valueOf($$3));
            } else {
               eao $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dmo.nF) ? this.m().b(b, $$4.c(b)) : dmo.nE.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(eao $$0) {
      return $$0.c(d) == 0;
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
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
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return $$1.a_($$2.e()).a(axc.ax);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jb.b && $$6.a(dmo.nF) && $$6.c(b) > $$0.c(b) ? $$0.a(b) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iv $$9 = $$2.b($$4);
         eao $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.v($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   protected void a(eao $$0, djh $$1, iv $$2, azv $$3, int $$4) {
      eao $$5 = $$1.a_($$2.e());
      iv $$6 = $$2.c(2);
      eao $$7 = $$1.a_($$6);
      eba $$8 = eba.a;
      if ($$4 >= 1) {
         if (!$$5.a(dmo.nF) || $$5.c(c) == eba.a) {
            $$8 = eba.b;
         } else if ($$5.a(dmo.nF) && $$5.c(c) != eba.a) {
            $$8 = eba.c;
            if ($$7.a(dmo.nF)) {
               $$1.a($$2.e(), $$5.b(c, eba.b), 3);
               $$1.a($$6, $$7.b(c, eba.a), 3);
            }
         }
      }

      int $$9 = $$0.c(b) != 1 && !$$7.a(dmo.nF) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(b, Integer.valueOf($$9)).b(c, $$8).b(d, Integer.valueOf($$10)), 3);
   }

   protected int a(din $$0, iv $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dmo.nF)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(din $$0, iv $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dmo.nF)) {
         $$2++;
      }

      return $$2;
   }
}
