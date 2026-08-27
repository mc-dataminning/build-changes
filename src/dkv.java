import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkv extends deh implements deb, dkz {
   public static final MapCodec<dkv> a = b(dkv::new);
   public static final int b = 4;
   public static final dsb c = drr.aS;
   public static final drs d = drr.C;
   protected static final evd e = ddy.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final evd f = ddy.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final evd g = ddy.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final evd h = ddy.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   protected dkv(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         emu $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == emv.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(drb $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return !$$0.k($$1, $$2).a(it.b).c() || $$0.d($$1, $$2, it.b);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if (!$$0.a($$3, $$4)) {
         return dea.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, emv.c, emv.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(drb $$0, cwz $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      switch ($$0.c(c)) {
         case 1:
         default:
            return e;
         case 2:
            return f;
         case 3:
            return g;
         case 4:
            return h;
      }
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(d) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return true;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(avw.aq)) {
         int $$4 = 5;
         int $$5 = 1;
         int $$6 = 2;
         int $$7 = 0;
         int $$8 = $$2.u() - 2;
         int $$9 = 0;

         for (int $$10 = 0; $$10 < 5; $$10++) {
            for (int $$11 = 0; $$11 < $$5; $$11++) {
               int $$12 = 2 + $$2.v() - 1;

               for (int $$13 = $$12 - 2; $$13 < $$12; $$13++) {
                  io $$14 = new io($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dea.G)) {
                     drb $$15 = $$0.a_($$14.d());
                     if ($$15.a(avw.aq)) {
                        $$0.a($$14, dea.mV.n().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
                     }
                  }
               }
            }

            if ($$7 < 2) {
               $$5 += 2;
               $$9++;
            } else {
               $$5 -= 2;
               $$9--;
            }

            $$7++;
         }

         $$0.a($$2, $$3.a(c, Integer.valueOf(4)), 2);
      }
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
