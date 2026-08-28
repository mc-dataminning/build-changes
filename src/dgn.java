import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgn extends dhj implements dhm {
   public static final MapCodec<dgn> a = b(dgn::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ezm e = dhj.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ezm f = dhj.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ezm g = dhj.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dvo h = dve.aq;
   public static final dvm<dva> i = dve.bk;
   public static final dvo j = dve.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   public dgn(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(h, Integer.valueOf(0)).b(i, dva.a).b(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean e_(duo $$0) {
      return true;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      ezm $$4 = $$0.c(i) == dva.c ? f : e;
      eys $$5 = $$0.a($$2);
      return $$4.a($$5.d, $$5.e, $$5.f);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      eys $$4 = $$0.a($$2);
      return g.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a_(duo $$0, ddl $$1, je $$2) {
      return false;
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         duo $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(awt.av)) {
            if ($$2.a(dhl.mY)) {
               return this.o().b(h, Integer.valueOf(0));
            } else if ($$2.a(dhl.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().b(h, Integer.valueOf($$3));
            } else {
               duo $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dhl.mZ) ? this.o().b(h, $$4.c(h)) : dhl.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(duo $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return $$1.a_($$2.e()).a(awt.av);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == jj.b && $$2.a(dhl.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         je $$9 = $$2.b($$4);
         duo $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(duo $$0, cnu $$1, ddl $$2, je $$3) {
      return $$1.eW().h() instanceof cxd ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(duo $$0, deg $$1, je $$2, azl $$3, int $$4) {
      duo $$5 = $$1.a_($$2.e());
      je $$6 = $$2.c(2);
      duo $$7 = $$1.a_($$6);
      dva $$8 = dva.a;
      if ($$4 >= 1) {
         if (!$$5.a(dhl.mZ) || $$5.c(i) == dva.a) {
            $$8 = dva.b;
         } else if ($$5.a(dhl.mZ) && $$5.c(i) != dva.a) {
            $$8 = dva.c;
            if ($$7.a(dhl.mZ)) {
               $$1.a($$2.e(), $$5.b(i, dva.b), 3);
               $$1.a($$6, $$7.b(i, dva.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dhl.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.o().b(h, Integer.valueOf($$9)).b(i, $$8).b(j, Integer.valueOf($$10)), 3);
   }

   protected int a(ddl $$0, je $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dhl.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(ddl $$0, je $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dhl.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
