import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlm extends dcv {
   public static final MapCodec<dlm> a = b(dlm::new);
   public static final dqs b = dgr.aE;
   public static final dqp c = dqo.w;
   public static final dqp d = dqo.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final ety h = dcv.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final ety i = dcv.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final ety j = dcv.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ety k = dcv.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      switch ((ir)$$0.c(b)) {
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
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      ir $$3 = $$0.c(b);
      im $$4 = $$2.a($$3.g());
      dpy $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = this.n().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      czx $$2 = $$0.q();
      im $$3 = $$0.a();
      ir[] $$4 = $$0.f();

      for (ir $$5 : $$4) {
         if ($$5.o().d()) {
            ir $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bre $$3, csd $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(czu $$0, im $$1, dpy $$2, boolean $$3, boolean $$4, int $$5, @Nullable dpy $$6) {
      Optional<ir> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ir $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dcv $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dpy[] $$15 = new dpy[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            im $$17 = $$1.a($$8, $$16);
            dpy $$18 = $$0.a_($$17);
            if ($$18.a(dcx.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dcx.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dpy)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dll.d);
               boolean $$20 = $$18.c(dll.b);
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
         dpy $$21 = $$11.n().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            im $$22 = $$1.a($$8, $$14);
            ir $$23 = $$8.g();
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
               im $$25 = $$1.a($$8, $$24);
               dpy $$26 = $$15[$$24];
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
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(czu $$0, im $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, auz.zv, ava.e, 0.4F, 0.6F);
         $$0.a(null, dur.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, auz.zu, ava.e, 0.4F, 0.5F);
         $$0.a(null, dur.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, auz.zt, ava.e, 0.4F, 0.7F);
         $$0.a(null, dur.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, auz.zw, ava.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dur.g, $$1);
      }
   }

   private static void a(dcv $$0, czu $$1, im $$2, ir $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
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
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c, d);
   }
}
