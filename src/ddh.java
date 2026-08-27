import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddh extends cut {
   public static final MapCodec<ddh> a = b(ddh::new);
   public static final dhq b = cyo.aE;
   public static final dhn c = dhm.w;
   public static final dhn d = dhm.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final ekb h = cut.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final ekb i = cut.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final ekb j = cut.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ekb k = cut.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   public ddh(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      switch ((hx)$$0.c(b)) {
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
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      hx $$3 = $$0.c(b);
      ht $$4 = $$2.a($$3.g());
      dgw $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      crv $$2 = $$0.q();
      ht $$3 = $$0.a();
      hx[] $$4 = $$0.f();

      for (hx $$5 : $$4) {
         if ($$5.o().d()) {
            hx $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(crs $$0, ht $$1, dgw $$2, boolean $$3, boolean $$4, int $$5, @Nullable dgw $$6) {
      Optional<hx> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         hx $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         cut $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dgw[] $$15 = new dgw[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            ht $$17 = $$1.a($$8, $$16);
            dgw $$18 = $$0.a_($$17);
            if ($$18.a(cuv.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(cuv.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dgw)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(ddg.d);
               boolean $$20 = $$18.c(ddg.b);
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
         dgw $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            ht $$22 = $$1.a($$8, $$14);
            hx $$23 = $$8.g();
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
               ht $$25 = $$1.a($$8, $$24);
               dgw $$26 = $$15[$$24];
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
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(crs $$0, ht $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, aqn.yb, aqo.e, 0.4F, 0.6F);
         $$0.a(null, dlg.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, aqn.ya, aqo.e, 0.4F, 0.5F);
         $$0.a(null, dlg.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, aqn.xZ, aqo.e, 0.4F, 0.7F);
         $$0.a(null, dlg.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, aqn.yc, aqo.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dlg.g, $$1);
      }
   }

   private static void a(cut $$0, crs $$1, ht $$2, hx $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
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
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c, d);
   }
}
