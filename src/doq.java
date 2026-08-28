import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class doq extends dfy {
   public static final MapCodec<doq> a = b(doq::new);
   public static final dtw b = dju.aE;
   public static final dtt c = dts.w;
   public static final dtt d = dts.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final ext h = dfy.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final ext i = dfy.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final ext j = dfy.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ext k = dfy.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   public doq(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      switch ((ji)$$0.c(b)) {
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
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      ji $$3 = $$0.c(b);
      jd $$4 = $$2.a($$3.g());
      dtc $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      dcz $$2 = $$0.q();
      jd $$3 = $$0.a();
      ji[] $$4 = $$0.f();

      for (ji $$5 : $$4) {
         if ($$5.o().d()) {
            ji $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, btn $$3, cuq $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, boolean $$3, boolean $$4, int $$5, @Nullable dtc $$6) {
      Optional<ji> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ji $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dfy $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dtc[] $$15 = new dtc[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            jd $$17 = $$1.a($$8, $$16);
            dtc $$18 = $$0.a_($$17);
            if ($$18.a(dga.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dga.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dtc)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dop.d);
               boolean $$20 = $$18.c(dop.b);
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
         dtc $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            jd $$22 = $$1.a($$8, $$14);
            ji $$23 = $$8.g();
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
               jd $$25 = $$1.a($$8, $$24);
               dtc $$26 = $$15[$$24];
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
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dcw $$0, jd $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, avp.zK, avq.e, 0.4F, 0.6F);
         $$0.a(null, dxz.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, avp.zJ, avq.e, 0.4F, 0.5F);
         $$0.a(null, dxz.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, avp.zI, avq.e, 0.4F, 0.7F);
         $$0.a(null, dxz.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, avp.zL, avq.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dxz.g, $$1);
      }
   }

   private static void a(dfy $$0, dcw $$1, jd $$2, ji $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
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
   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c, d);
   }
}
