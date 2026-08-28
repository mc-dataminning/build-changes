import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlv extends dmr implements dmu {
   public static final MapCodec<dlv> a = b(dlv::new);
   private static final ffw D = dmr.b(6.0, 0.0, 16.0);
   private static final ffw R = dmr.b(10.0, 0.0, 16.0);
   private static final ffw S = dmr.b(3.0, 0.0, 16.0);
   public static final ebt b = ebj.at;
   public static final ebr<ebf> c = ebj.bn;
   public static final ebt d = ebj.aX;
   public static final int e = 16;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 1;

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   public dlv(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, ebf.a).b(d, Integer.valueOf(0)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean e_(eat $$0) {
      return true;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      ffw $$4 = $$0.c(c) == ebf.c ? R : D;
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return S.a($$0.a($$2));
   }

   @Override
   protected boolean a_(eat $$0, diq $$1, iv $$2) {
      return false;
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         eat $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axc.ax)) {
            if ($$2.a(dmt.nE)) {
               return this.m().b(b, Integer.valueOf(0));
            } else if ($$2.a(dmt.nF)) {
               int $$3 = $$2.c(b) > 0 ? 1 : 0;
               return this.m().b(b, Integer.valueOf($$3));
            } else {
               eat $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dmt.nF) ? this.m().b(b, $$4.c(b)) : dmt.nE.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(eat $$0) {
      return $$0.c(d) == 0;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
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
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return $$1.a_($$2.e()).a(axc.ax);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jb.b && $$6.a(dmt.nF) && $$6.c(b) > $$0.c(b) ? $$0.a(b) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iv $$9 = $$2.b($$4);
         eat $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.v($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   protected void a(eat $$0, djm $$1, iv $$2, azv $$3, int $$4) {
      eat $$5 = $$1.a_($$2.e());
      iv $$6 = $$2.c(2);
      eat $$7 = $$1.a_($$6);
      ebf $$8 = ebf.a;
      if ($$4 >= 1) {
         if (!$$5.a(dmt.nF) || $$5.c(c) == ebf.a) {
            $$8 = ebf.b;
         } else if ($$5.a(dmt.nF) && $$5.c(c) != ebf.a) {
            $$8 = ebf.c;
            if ($$7.a(dmt.nF)) {
               $$1.a($$2.e(), $$5.b(c, ebf.b), 3);
               $$1.a($$6, $$7.b(c, ebf.a), 3);
            }
         }
      }

      int $$9 = $$0.c(b) != 1 && !$$7.a(dmt.nF) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(b, Integer.valueOf($$9)).b(c, $$8).b(d, Integer.valueOf($$10)), 3);
   }

   protected int a(diq $$0, iv $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dmt.nF)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(diq $$0, iv $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dmt.nF)) {
         $$2++;
      }

      return $$2;
   }
}
