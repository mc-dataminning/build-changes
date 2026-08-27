import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djd extends dcq implements dck, djh {
   public static final MapCodec<djd> a = b(djd::new);
   public static final int b = 4;
   public static final dqi c = dpy.aS;
   public static final dpz d = dpy.C;
   protected static final etc e = dch.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final etc f = dch.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final etc g = dch.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final etc h = dch.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   protected djd(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         elb $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == elc.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dpi $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return !$$0.k($$1, $$2).a(ij.b).c() || $$0.d($$1, $$2, ij.b);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if (!$$0.a($$3, $$4)) {
         return dcj.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, elc.c, elc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dpi $$0, cux $$1) {
      return !$$1.h() && $$1.n().a(this.p()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
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
   protected elb c_(dpi $$0) {
      return $$0.c(d) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return true;
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(ave.aq)) {
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
                  id $$14 = new id($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dcj.G)) {
                     dpi $$15 = $$0.a_($$14.d());
                     if ($$15.a(ave.aq)) {
                        $$0.a($$14, dcj.mV.n().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
