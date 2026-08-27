import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddu extends cvf {
   public static final MapCodec<ddu> a = b(ddu::new);
   public static final dih b = cza.aE;
   public static final die c = did.w;
   public static final die d = did.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final eks h = cvf.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final eks i = cvf.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final eks j = cvf.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eks k = cvf.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddu(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      switch ((ib)$$0.c(b)) {
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
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      ib $$3 = $$0.c(b);
      hx $$4 = $$2.a($$3.g());
      dhn $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      csi $$2 = $$0.q();
      hx $$3 = $$0.a();
      ib[] $$4 = $$0.f();

      for (ib $$5 : $$4) {
         if ($$5.o().d()) {
            ib $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(csf $$0, hx $$1, dhn $$2, boolean $$3, boolean $$4, int $$5, @Nullable dhn $$6) {
      Optional<ib> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ib $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         cvf $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dhn[] $$15 = new dhn[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            hx $$17 = $$1.a($$8, $$16);
            dhn $$18 = $$0.a_($$17);
            if ($$18.a(cvh.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(cvh.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dhn)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(ddt.d);
               boolean $$20 = $$18.c(ddt.b);
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
         dhn $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            hx $$22 = $$1.a($$8, $$14);
            ib $$23 = $$8.g();
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
               hx $$25 = $$1.a($$8, $$24);
               dhn $$26 = $$15[$$24];
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
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(csf $$0, hx $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, aqv.ys, aqw.e, 0.4F, 0.6F);
         $$0.a(null, dlx.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, aqv.yr, aqw.e, 0.4F, 0.5F);
         $$0.a(null, dlx.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, aqv.yq, aqw.e, 0.4F, 0.7F);
         $$0.a(null, dlx.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, aqv.yt, aqw.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dlx.g, $$1);
      }
   }

   private static void a(cvf $$0, csf $$1, hx $$2, ib $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
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
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c, d);
   }
}
