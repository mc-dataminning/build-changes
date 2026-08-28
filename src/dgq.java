import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgq extends dhm implements dhp {
   public static final MapCodec<dgq> a = b(dgq::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ezq e = dhm.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ezq f = dhm.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ezq g = dhm.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dvs h = dvi.aq;
   public static final dvq<dve> i = dvi.bk;
   public static final dvs j = dvi.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public dgq(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(h, Integer.valueOf(0)).b(i, dve.a).b(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean e_(dus $$0) {
      return true;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      ezq $$4 = $$0.c(i) == dve.c ? f : e;
      eyw $$5 = $$0.a($$2);
      return $$4.a($$5.d, $$5.e, $$5.f);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      eyw $$4 = $$0.a($$2);
      return g.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a_(dus $$0, ddo $$1, jf $$2) {
      return false;
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dus $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(awv.av)) {
            if ($$2.a(dho.mY)) {
               return this.n().b(h, Integer.valueOf(0));
            } else if ($$2.a(dho.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.n().b(h, Integer.valueOf($$3));
            } else {
               dus $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dho.mZ) ? this.n().b(h, $$4.c(h)) : dho.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dus $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
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
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return $$1.a_($$2.e()).a(awv.av);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == jk.b && $$2.a(dho.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jf $$9 = $$2.b($$4);
         dus $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dus $$0, cnx $$1, ddo $$2, jf $$3) {
      return $$1.eW().h() instanceof cxg ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dus $$0, dej $$1, jf $$2, azn $$3, int $$4) {
      dus $$5 = $$1.a_($$2.e());
      jf $$6 = $$2.c(2);
      dus $$7 = $$1.a_($$6);
      dve $$8 = dve.a;
      if ($$4 >= 1) {
         if (!$$5.a(dho.mZ) || $$5.c(i) == dve.a) {
            $$8 = dve.b;
         } else if ($$5.a(dho.mZ) && $$5.c(i) != dve.a) {
            $$8 = dve.c;
            if ($$7.a(dho.mZ)) {
               $$1.a($$2.e(), $$5.b(i, dve.b), 3);
               $$1.a($$6, $$7.b(i, dve.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dho.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.n().b(h, Integer.valueOf($$9)).b(i, $$8).b(j, Integer.valueOf($$10)), 3);
   }

   protected int a(ddo $$0, jf $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dho.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(ddo $$0, jf $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dho.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
