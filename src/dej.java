import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dej extends dff implements dfi {
   public static final MapCodec<dej> a = b(dej::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ews e = dff.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ews f = dff.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ews g = dff.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dth h = dsx.aq;
   public static final dtf<dst> i = dsx.bk;
   public static final dth j = dsx.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   public dej(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dst.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return true;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      ews $$4 = $$0.c(i) == dst.c ? f : e;
      evz $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      evz $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dsh $$0, dbj $$1, ja $$2) {
      return false;
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dsh $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(avu.au)) {
            if ($$2.a(dfh.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(dfh.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dsh $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dfh.mZ) ? this.o().a(h, $$4.c(h)) : dfh.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dsh $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return $$1.a_($$2.d()).a(avu.au);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == jf.b && $$2.a(dfh.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ja $$9 = $$2.b($$4);
         dsh $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dsh $$0, cmh $$1, dbj $$2, ja $$3) {
      return $$1.eT().g() instanceof cvn ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dsh $$0, dcd $$1, ja $$2, aym $$3, int $$4) {
      dsh $$5 = $$1.a_($$2.d());
      ja $$6 = $$2.c(2);
      dsh $$7 = $$1.a_($$6);
      dst $$8 = dst.a;
      if ($$4 >= 1) {
         if (!$$5.a(dfh.mZ) || $$5.c(i) == dst.a) {
            $$8 = dst.b;
         } else if ($$5.a(dfh.mZ) && $$5.c(i) != dst.a) {
            $$8 = dst.c;
            if ($$7.a(dfh.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dst.b), 3);
               $$1.a($$6, $$7.a(i, dst.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dfh.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dbj $$0, ja $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dfh.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dbj $$0, ja $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dfh.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
