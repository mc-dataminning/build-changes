import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddc extends ddy implements deb {
   public static final MapCodec<ddc> a = b(ddc::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final evd e = ddy.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final evd f = ddy.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final evd g = ddy.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dsb h = drr.aq;
   public static final drz<drn> i = drr.bk;
   public static final dsb j = drr.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<ddc> a() {
      return a;
   }

   public ddc(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, drn.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return true;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      evd $$4 = $$0.c(i) == drn.c ? f : e;
      euk $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      euk $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(drb $$0, dad $$1, io $$2) {
      return false;
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         drb $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(avw.au)) {
            if ($$2.a(dea.mY)) {
               return this.n().a(h, Integer.valueOf(0));
            } else if ($$2.a(dea.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.n().a(h, Integer.valueOf($$3));
            } else {
               drb $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dea.mZ) ? this.n().a(h, $$4.c(h)) : dea.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(drb $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
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
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return $$1.a_($$2.d()).a(avw.au);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == it.b && $$2.a(dea.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         io $$9 = $$2.b($$4);
         drb $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(drb $$0, clw $$1, dad $$2, io $$3) {
      return $$1.eX().g() instanceof cvb ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(drb $$0, dax $$1, io $$2, ayk $$3, int $$4) {
      drb $$5 = $$1.a_($$2.d());
      io $$6 = $$2.c(2);
      drb $$7 = $$1.a_($$6);
      drn $$8 = drn.a;
      if ($$4 >= 1) {
         if (!$$5.a(dea.mZ) || $$5.c(i) == drn.a) {
            $$8 = drn.b;
         } else if ($$5.a(dea.mZ) && $$5.c(i) != drn.a) {
            $$8 = drn.c;
            if ($$7.a(dea.mZ)) {
               $$1.a($$2.d(), $$5.a(i, drn.b), 3);
               $$1.a($$6, $$7.a(i, drn.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dea.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dad $$0, io $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dea.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dad $$0, io $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dea.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
