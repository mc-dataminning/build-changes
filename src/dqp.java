import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqp extends dhy {
   public static final MapCodec<dqp> a = b(dqp::new);
   public static final dvx b = dlt.aF;
   public static final dvu c = dvt.w;
   public static final dvu d = dvt.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final fab h = dhy.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final fab i = dhy.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final fab j = dhy.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fab k = dhy.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dqp> a() {
      return a;
   }

   public dqp(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      switch ((jl)$$0.c(b)) {
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
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jl $$3 = $$0.c(b);
      jg $$4 = $$2.a($$3.g());
      dvd $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dey $$2 = $$0.q();
      jg $$3 = $$0.a();
      jl[] $$4 = $$0.f();

      for (jl $$5 : $$4) {
         if ($$5.o().d()) {
            jl $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, buv $$3, cvx $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dev $$0, jg $$1, dvd $$2, boolean $$3, boolean $$4, int $$5, @Nullable dvd $$6) {
      Optional<jl> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jl $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dhy $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dvd[] $$15 = new dvd[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            jg $$17 = $$1.a($$8, $$16);
            dvd $$18 = $$0.a_($$17);
            if ($$18.a(dia.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dia.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dvd)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dqo.d);
               boolean $$20 = $$18.c(dqo.b);
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
         dvd $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            jg $$22 = $$1.a($$8, $$14);
            jl $$23 = $$8.g();
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
               jg $$25 = $$1.a($$8, $$24);
               dvd $$26 = $$15[$$24];
               if ($$26 != null) {
                  dvd $$27 = $$0.a_($$25);
                  if ($$27.a(dia.fI) || $$27.a(dia.fH)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dev $$0, jg $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awk.zO, awl.e, 0.4F, 0.6F);
         $$0.a(null, eaa.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awk.zN, awl.e, 0.4F, 0.5F);
         $$0.a(null, eaa.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awk.zM, awl.e, 0.4F, 0.7F);
         $$0.a(null, eaa.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awk.zP, awl.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, eaa.g, $$1);
      }
   }

   private static void a(dhy $$0, dev $$1, jg $$2, jl $$3) {
      jl $$4 = $$3.g();
      esm $$5 = esi.a($$1, $$4, jl.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
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
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c, d);
   }
}
