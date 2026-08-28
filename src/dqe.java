import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqe extends dhm {
   public static final MapCodec<dqe> a = b(dqe::new);
   public static final dvm b = dli.aF;
   public static final dvj c = dvi.w;
   public static final dvj d = dvi.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final ezq h = dhm.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final ezq i = dhm.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final ezq j = dhm.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ezq k = dhm.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dqe> a() {
      return a;
   }

   public dqe(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      switch ((jk)$$0.c(b)) {
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
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jk $$3 = $$0.c(b);
      jf $$4 = $$2.a($$3.g());
      dus $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = this.n().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dem $$2 = $$0.q();
      jf $$3 = $$0.a();
      jk[] $$4 = $$0.f();

      for (jk $$5 : $$4) {
         if ($$5.o().d()) {
            jk $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, bun $$3, cvs $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dej $$0, jf $$1, dus $$2, boolean $$3, boolean $$4, int $$5, @Nullable dus $$6) {
      Optional<jk> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jk $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dhm $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dus[] $$15 = new dus[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            jf $$17 = $$1.a($$8, $$16);
            dus $$18 = $$0.a_($$17);
            if ($$18.a(dho.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dho.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dus)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dqd.d);
               boolean $$20 = $$18.c(dqd.b);
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
         dus $$21 = $$11.n().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            jf $$22 = $$1.a($$8, $$14);
            jk $$23 = $$8.g();
            $$0.a($$22, $$21.b(b, $$23), 3);
            a($$11, $$0, $$22, $$23);
            a($$0, $$22, $$12, $$13, $$9, $$10);
         }

         a($$0, $$1, $$12, $$13, $$9, $$10);
         if (!$$3) {
            $$0.a($$1, $$21.b(b, $$8), 3);
            if ($$4) {
               a($$11, $$0, $$1, $$8);
            }
         }

         if ($$9 != $$12) {
            for (int $$24 = 1; $$24 < $$14; $$24++) {
               jf $$25 = $$1.a($$8, $$24);
               dus $$26 = $$15[$$24];
               if ($$26 != null && !$$0.a_($$25).l()) {
                  $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
               }
            }
         }
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dej $$0, jf $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awg.zQ, awh.e, 0.4F, 0.6F);
         $$0.a(null, dzp.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awg.zP, awh.e, 0.4F, 0.5F);
         $$0.a(null, dzp.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awg.zO, awh.e, 0.4F, 0.7F);
         $$0.a(null, dzp.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awg.zR, awh.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dzp.g, $$1);
      }
   }

   private static void a(dhm $$0, dej $$1, jf $$2, jk $$3) {
      jk $$4 = $$3.g();
      esb $$5 = erx.a($$1, $$4, jk.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         boolean $$5 = $$0.c(d);
         boolean $$6 = $$0.c(c);
         if ($$5 || $$6) {
            a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$6) {
            a(this, $$1, $$2, $$0.c(b));
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c, d);
   }
}
