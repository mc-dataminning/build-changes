import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmp extends ddy {
   public static final MapCodec<dmp> a = b(dmp::new);
   public static final drv b = dhu.aE;
   public static final drs c = drr.w;
   public static final drs d = drr.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final evd h = ddy.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final evd i = ddy.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final evd j = ddy.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final evd k = ddy.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      switch ((it)$$0.c(b)) {
         case f:
         default:
            return k;
         case e:
            return j;
         case d:
            return i;
         case c:
            return h;
      }
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      it $$3 = $$0.c(b);
      io $$4 = $$2.a($$3.g());
      drb $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = this.n().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      dba $$2 = $$0.q();
      io $$3 = $$0.a();
      it[] $$4 = $$0.f();

      for (it $$5 : $$4) {
         if ($$5.o().d()) {
            it $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bso $$3, cto $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dax $$0, io $$1, drb $$2, boolean $$3, boolean $$4, int $$5, @Nullable drb $$6) {
      Optional<it> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         it $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         ddy $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         drb[] $$15 = new drb[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            io $$17 = $$1.a($$8, $$16);
            drb $$18 = $$0.a_($$17);
            if ($$18.a(dea.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dea.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (drb)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dmo.d);
               boolean $$20 = $$18.c(dmo.b);
               $$13 |= $$19 && $$20;
               $$15[$$16] = $$18;
               if ($$16 == $$5) {
                  $$0.a($$1, $$11, 10);
                  $$12 &= $$19;
               }
            }
         }

         $$12 &= $$14 > 1;
         $$13 &= $$12;
         drb $$21 = $$11.n().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            io $$22 = $$1.a($$8, $$14);
            it $$23 = $$8.g();
            $$0.a($$22, $$21.a(b, $$23), 3);
            a($$11, $$0, $$22, $$23);
            a($$0, $$22, $$12, $$13, $$9, $$10);
         }

         a($$0, $$1, $$12, $$13, $$9, $$10);
         if (!$$3) {
            $$0.a($$1, $$21.a(b, $$8), 3);
            if ($$4) {
               a($$11, $$0, $$1, $$8);
            }
         }

         if ($$9 != $$12) {
            for (int $$24 = 1; $$24 < $$14; $$24++) {
               io $$25 = $$1.a($$8, $$24);
               drb $$26 = $$15[$$24];
               if ($$26 != null) {
                  $$0.a($$25, $$26.b(d, Boolean.valueOf($$12)), 3);
                  if (!$$0.a_($$25).i()) {
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dax $$0, io $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, avh.zH, avi.e, 0.4F, 0.6F);
         $$0.a(null, dvu.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, avh.zG, avi.e, 0.4F, 0.5F);
         $$0.a(null, dvu.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, avh.zF, avi.e, 0.4F, 0.7F);
         $$0.a(null, dvu.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, avh.zI, avi.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dvu.g, $$1);
      }
   }

   private static void a(ddy $$0, dax $$1, io $$2, it $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         boolean $$5 = $$0.c(d);
         boolean $$6 = $$0.c(c);
         if ($$5 || $$6) {
            a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$6) {
            $$1.a($$2, this);
            $$1.a($$2.a($$0.c(b).g()), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(drb $$0, dad $$1, io $$2, it $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c, d);
   }
}
