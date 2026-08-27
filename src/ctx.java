import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ctx extends cut implements cuw {
   public static final MapCodec<ctx> a = b(ctx::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ekb e = cut.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ekb f = cut.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ekb g = cut.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dhw h = dhm.aq;
   public static final dhu<dhi> i = dhm.bk;
   public static final dhw j = dhm.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<ctx> a() {
      return a;
   }

   public ctx(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dhi.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   public boolean c(dgw $$0, cqy $$1, ht $$2) {
      return true;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      ekb $$4 = $$0.c(i) == dhi.c ? f : e;
      eji $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      eji $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a_(dgw $$0, cqy $$1, ht $$2) {
      return false;
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dgw $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(arc.at)) {
            if ($$2.a(cuv.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(cuv.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dgw $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(cuv.mZ) ? this.o().a(h, $$4.c(h)) : cuv.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dgw $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return $$1.a_($$2.d()).a(arc.at);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == hx.b && $$2.a(cuv.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ht $$9 = $$2.b($$4);
         dgw $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.t($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(dgw $$0, cdm $$1, cqy $$2, ht $$3) {
      return $$1.eS().d() instanceof cmm ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dgw $$0, crs $$1, ht $$2, ato $$3, int $$4) {
      dgw $$5 = $$1.a_($$2.d());
      ht $$6 = $$2.c(2);
      dgw $$7 = $$1.a_($$6);
      dhi $$8 = dhi.a;
      if ($$4 >= 1) {
         if (!$$5.a(cuv.mZ) || $$5.c(i) == dhi.a) {
            $$8 = dhi.b;
         } else if ($$5.a(cuv.mZ) && $$5.c(i) != dhi.a) {
            $$8 = dhi.c;
            if ($$7.a(cuv.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dhi.b), 3);
               $$1.a($$6, $$7.a(i, dhi.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(cuv.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(cqy $$0, ht $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cuv.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cqy $$0, ht $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cuv.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
