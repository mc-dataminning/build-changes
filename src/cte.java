import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cte extends cua implements cud {
   public static final MapCodec<cte> a = b(cte::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final eiy e = cua.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final eiy f = cua.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final eiy g = cua.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dhb h = dgr.aq;
   public static final dgz<dgn> i = dgr.bk;
   public static final dhb j = dgr.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<cte> a() {
      return a;
   }

   public cte(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dgn.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return true;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      eiy $$4 = $$0.c(i) == dgn.c ? f : e;
      eif $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      eif $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a_(dgb $$0, cqf $$1, ht $$2) {
      return false;
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dgb $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(aqs.at)) {
            if ($$2.a(cuc.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(cuc.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dgb $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(cuc.mZ) ? this.o().a(h, $$4.c(h)) : cuc.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dgb $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
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
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return $$1.a_($$2.d()).a(aqs.at);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == hx.b && $$2.a(cuc.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ht $$9 = $$2.b($$4);
         dgb $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.t($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(dgb $$0, ccx $$1, cqf $$2, ht $$3) {
      return $$1.eS().d() instanceof clu ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dgb $$0, cqz $$1, ht $$2, ate $$3, int $$4) {
      dgb $$5 = $$1.a_($$2.d());
      ht $$6 = $$2.c(2);
      dgb $$7 = $$1.a_($$6);
      dgn $$8 = dgn.a;
      if ($$4 >= 1) {
         if (!$$5.a(cuc.mZ) || $$5.c(i) == dgn.a) {
            $$8 = dgn.b;
         } else if ($$5.a(cuc.mZ) && $$5.c(i) != dgn.a) {
            $$8 = dgn.c;
            if ($$7.a(cuc.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dgn.b), 3);
               $$1.a($$6, $$7.a(i, dgn.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(cuc.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(cqf $$0, ht $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cuc.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cqf $$0, ht $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cuc.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
