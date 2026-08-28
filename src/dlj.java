import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlj extends dmf implements dmi {
   public static final MapCodec<dlj> a = b(dlj::new);
   private static final ffk D = dmf.b(6.0, 0.0, 16.0);
   private static final ffk R = dmf.b(10.0, 0.0, 16.0);
   private static final ffk S = dmf.b(3.0, 0.0, 16.0);
   public static final ebh b = eax.at;
   public static final ebf<eat> c = eax.bn;
   public static final ebh d = eax.aX;
   public static final int e = 16;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 1;

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   public dlj(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, eat.a).b(d, Integer.valueOf(0)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean e_(eah $$0) {
      return true;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      ffk $$4 = $$0.c(c) == eat.c ? R : D;
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return S.a($$0.a($$2));
   }

   @Override
   protected boolean a_(eah $$0, dig $$1, iu $$2) {
      return false;
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         eah $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axc.ax)) {
            if ($$2.a(dmh.nE)) {
               return this.m().b(b, Integer.valueOf(0));
            } else if ($$2.a(dmh.nF)) {
               int $$3 = $$2.c(b) > 0 ? 1 : 0;
               return this.m().b(b, Integer.valueOf($$3));
            } else {
               eah $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dmh.nF) ? this.m().b(b, $$4.c(b)) : dmh.nE.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(eah $$0) {
      return $$0.c(d) == 0;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
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
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return $$1.a_($$2.e()).a(axc.ax);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == ja.b && $$6.a(dmh.nF) && $$6.c(b) > $$0.c(b) ? $$0.a(b) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iu $$9 = $$2.b($$4);
         eah $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.v($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   protected void a(eah $$0, dja $$1, iu $$2, azv $$3, int $$4) {
      eah $$5 = $$1.a_($$2.e());
      iu $$6 = $$2.c(2);
      eah $$7 = $$1.a_($$6);
      eat $$8 = eat.a;
      if ($$4 >= 1) {
         if (!$$5.a(dmh.nF) || $$5.c(c) == eat.a) {
            $$8 = eat.b;
         } else if ($$5.a(dmh.nF) && $$5.c(c) != eat.a) {
            $$8 = eat.c;
            if ($$7.a(dmh.nF)) {
               $$1.a($$2.e(), $$5.b(c, eat.b), 3);
               $$1.a($$6, $$7.b(c, eat.a), 3);
            }
         }
      }

      int $$9 = $$0.c(b) != 1 && !$$7.a(dmh.nF) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(b, Integer.valueOf($$9)).b(c, $$8).b(d, Integer.valueOf($$10)), 3);
   }

   protected int a(dig $$0, iu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dmh.nF)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dig $$0, iu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dmh.nF)) {
         $$2++;
      }

      return $$2;
   }
}
