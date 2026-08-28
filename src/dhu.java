import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhu extends diq implements dit {
   public static final MapCodec<dhu> a = b(dhu::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final fas e = diq.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final fas f = diq.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final fas g = diq.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dwu h = dwl.aq;
   public static final dws<dwh> i = dwl.bk;
   public static final dwu j = dwl.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   public dhu(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(h, Integer.valueOf(0)).b(i, dwh.a).b(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean e_(dvv $$0) {
      return true;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      fas $$4 = $$0.c(i) == dwh.c ? f : e;
      ezy $$5 = $$0.a($$2);
      return $$4.a($$5.d, $$5.e, $$5.f);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      ezy $$4 = $$0.a($$2);
      return g.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a_(dvv $$0, der $$1, jh $$2) {
      return false;
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dvv $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axc.aw)) {
            if ($$2.a(dis.mY)) {
               return this.m().b(h, Integer.valueOf(0));
            } else if ($$2.a(dis.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.m().b(h, Integer.valueOf($$3));
            } else {
               dvv $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dis.mZ) ? this.m().b(h, $$4.c(h)) : dis.mY.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dvv $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
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
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axc.aw);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jm.b && $$6.a(dis.mZ) && $$6.c(h) > $$0.c(h) ? $$0.a(h) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jh $$9 = $$2.b($$4);
         dvv $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dvv $$0, cou $$1, der $$2, jh $$3) {
      return $$1.eX().h() instanceof cya ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dvv $$0, dfm $$1, jh $$2, azu $$3, int $$4) {
      dvv $$5 = $$1.a_($$2.e());
      jh $$6 = $$2.c(2);
      dvv $$7 = $$1.a_($$6);
      dwh $$8 = dwh.a;
      if ($$4 >= 1) {
         if (!$$5.a(dis.mZ) || $$5.c(i) == dwh.a) {
            $$8 = dwh.b;
         } else if ($$5.a(dis.mZ) && $$5.c(i) != dwh.a) {
            $$8 = dwh.c;
            if ($$7.a(dis.mZ)) {
               $$1.a($$2.e(), $$5.b(i, dwh.b), 3);
               $$1.a($$6, $$7.b(i, dwh.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dis.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(h, Integer.valueOf($$9)).b(i, $$8).b(j, Integer.valueOf($$10)), 3);
   }

   protected int a(der $$0, jh $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dis.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(der $$0, jh $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dis.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
