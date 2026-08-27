import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfg extends cwq {
   public static final MapCodec<dfg> a = b(dfg::new);
   public static final dkb b = dal.aE;
   public static final djy c = djx.w;
   public static final djy d = djx.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final emm h = cwq.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final emm i = cwq.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final emm j = cwq.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final emm k = cwq.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public dfg(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      switch ((ic)$$0.c(b)) {
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
   public boolean a(djh $$0, cts $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      hx $$4 = $$2.a($$3.g());
      djh $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      cts $$2 = $$0.q();
      hx $$3 = $$0.a();
      ic[] $$4 = $$0.f();

      for (ic $$5 : $$4) {
         if ($$5.o().d()) {
            ic $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(ctp $$0, hx $$1, djh $$2, boolean $$3, boolean $$4, int $$5, @Nullable djh $$6) {
      Optional<ic> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ic $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         cwq $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         djh[] $$15 = new djh[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            hx $$17 = $$1.a($$8, $$16);
            djh $$18 = $$0.a_($$17);
            if ($$18.a(cws.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(cws.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (djh)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dff.d);
               boolean $$20 = $$18.c(dff.b);
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
         djh $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            hx $$22 = $$1.a($$8, $$14);
            ic $$23 = $$8.g();
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
               djh $$26 = $$15[$$24];
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
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(ctp $$0, hx $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, ars.yN, art.e, 0.4F, 0.6F);
         $$0.a(null, dnr.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, ars.yM, art.e, 0.4F, 0.5F);
         $$0.a(null, dnr.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, ars.yL, art.e, 0.4F, 0.7F);
         $$0.a(null, dnr.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, ars.yO, art.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dnr.g, $$1);
      }
   }

   private static void a(cwq $$0, ctp $$1, hx $$2, ic $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
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
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2, ic $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c, d);
   }
}
