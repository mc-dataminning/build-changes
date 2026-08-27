import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dep extends cvz {
   public static final MapCodec<dep> a = b(dep::new);
   public static final djj b = czu.aE;
   public static final djg c = djf.w;
   public static final djg d = djf.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final elu h = cvz.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final elu i = cvz.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final elu j = cvz.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final elu k = cvz.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   public dep(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      switch ((ia)$$0.c(b)) {
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
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      ia $$3 = $$0.c(b);
      hv $$4 = $$2.a($$3.g());
      dip $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      ctb $$2 = $$0.q();
      hv $$3 = $$0.a();
      ia[] $$4 = $$0.f();

      for (ia $$5 : $$4) {
         if ($$5.o().d()) {
            ia $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(csy $$0, hv $$1, dip $$2, boolean $$3, boolean $$4, int $$5, @Nullable dip $$6) {
      Optional<ia> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ia $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         cvz $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dip[] $$15 = new dip[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            hv $$17 = $$1.a($$8, $$16);
            dip $$18 = $$0.a_($$17);
            if ($$18.a(cwb.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(cwb.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dip)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(deo.d);
               boolean $$20 = $$18.c(deo.b);
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
         dip $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            hv $$22 = $$1.a($$8, $$14);
            ia $$23 = $$8.g();
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
               hv $$25 = $$1.a($$8, $$24);
               dip $$26 = $$15[$$24];
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
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(csy $$0, hv $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, arc.yN, ard.e, 0.4F, 0.6F);
         $$0.a(null, dmz.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, arc.yM, ard.e, 0.4F, 0.5F);
         $$0.a(null, dmz.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, arc.yL, ard.e, 0.4F, 0.7F);
         $$0.a(null, dmz.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, arc.yO, ard.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dmz.g, $$1);
      }
   }

   private static void a(cvz $$0, csy $$1, hv $$2, ia $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
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
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c, d);
   }
}
