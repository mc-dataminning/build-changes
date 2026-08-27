import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class eaz<C extends eas> {
   public static final eaz<eav> a = a("cave", new eaw(eav.a));
   public static final eaz<eav> b = a("nether_cave", new eay(eav.a));
   public static final eaz<eaq> c = a("canyon", new ear(eaq.a));
   protected static final dtc d = dfe.a.n();
   protected static final dtc e = dfe.oa.n();
   protected static final epe f = epf.c.g();
   protected static final epe g = epf.e.g();
   protected Set<epd> h = ImmutableSet.of(epf.c);
   private final Codec<eax<C>> i;

   private static <C extends eas, F extends eaz<C>> F a(String $$0, F $$1) {
      return jn.a(lh.P, $$0, $$1);
   }

   public eaz(Codec<C> $$0) {
      this.i = $$0.fieldOf("config").xmap(this::a, eax::b).codec();
   }

   public eax<C> a(C $$0) {
      return new eax<>(this, $$0);
   }

   public Codec<eax<C>> c() {
      return this.i;
   }

   public int d() {
      return 4;
   }

   protected boolean a(
      eau $$0, C $$1, duy $$2, Function<ir, ja<dcz>> $$3, dyg $$4, double $$5, double $$6, double $$7, double $$8, double $$9, dux $$10, eaz.a $$11
   ) {
      dbh $$12 = $$2.g();
      double $$13 = (double)$$12.b();
      double $$14 = (double)$$12.c();
      double $$15 = 16.0 + $$8 * 2.0;
      if (!(Math.abs($$5 - $$13) > $$15) && !(Math.abs($$7 - $$14) > $$15)) {
         int $$16 = $$12.d();
         int $$17 = $$12.e();
         int $$18 = Math.max(aym.a($$5 - $$8) - $$16 - 1, 0);
         int $$19 = Math.min(aym.a($$5 + $$8) - $$16, 15);
         int $$20 = Math.max(aym.a($$6 - $$9) - 1, $$0.a() + 1);
         int $$21 = $$2.z() ? 0 : 7;
         int $$22 = Math.min(aym.a($$6 + $$9) + 1, $$0.a() + $$0.b() - 1 - $$21);
         int $$23 = Math.max(aym.a($$7 - $$8) - $$17 - 1, 0);
         int $$24 = Math.min(aym.a($$7 + $$8) - $$17, 15);
         boolean $$25 = false;
         ir.a $$26 = new ir.a();
         ir.a $$27 = new ir.a();

         for (int $$28 = $$18; $$28 <= $$19; $$28++) {
            int $$29 = $$12.a($$28);
            double $$30 = ((double)$$29 + 0.5 - $$5) / $$8;

            for (int $$31 = $$23; $$31 <= $$24; $$31++) {
               int $$32 = $$12.b($$31);
               double $$33 = ((double)$$32 + 0.5 - $$7) / $$8;
               if (!($$30 * $$30 + $$33 * $$33 >= 1.0)) {
                  MutableBoolean $$34 = new MutableBoolean(false);

                  for (int $$35 = $$22; $$35 > $$20; $$35--) {
                     double $$36 = ((double)$$35 - 0.5 - $$6) / $$9;
                     if (!$$11.shouldSkip($$0, $$30, $$36, $$33, $$35) && (!$$10.b($$28, $$35, $$31) || b($$1))) {
                        $$10.a($$28, $$35, $$31);
                        $$26.d($$29, $$35, $$32);
                        $$25 |= this.a($$0, $$1, $$2, $$3, $$10, $$26, $$27, $$4, $$34);
                     }
                  }
               }
            }
         }

         return $$25;
      } else {
         return false;
      }
   }

   protected boolean a(eau $$0, C $$1, duy $$2, Function<ir, ja<dcz>> $$3, dux $$4, ir.a $$5, ir.a $$6, dyg $$7, MutableBoolean $$8) {
      dtc $$9 = $$2.a_($$5);
      if ($$9.a(awe.bZ) || $$9.a(dfe.gd)) {
         $$8.setTrue();
      }

      if (!this.a($$1, $$9) && !b($$1)) {
         return false;
      } else {
         dtc $$10 = $$2.z_() ? dfe.oa.n() : this.a($$0, $$1, $$5, $$7);
         if ($$10 == null) {
            return false;
         } else {
            $$2.a($$5, $$10, false);
            if ($$7.a() && !$$10.u().c()) {
               $$2.e($$5);
            }

            if ($$8.isTrue()) {
               $$6.a($$5, iw.a);
               dtc $$11 = $$2.a_($$6);
               if ($$11.a(dfe.m) || $$11.a(dfe.n)) {
                  $$0.a($$3, $$2, $$6, !$$10.u().c()).ifPresent($$2x -> {
                     $$2.a($$6, $$2x, false);
                     if (!$$2x.u().c()) {
                        $$2.e($$6);
                     }
                  });
               }
            }

            return true;
         }
      }
   }

   @Nullable
   private dtc a(eau $$0, C $$1, ir $$2, dyg $$3) {
      if ($$2.v() <= $$1.g.a($$0)) {
         return g.g();
      } else {
         dtc $$4 = $$3.a(new dyn.e($$2.u(), $$2.v(), $$2.w()), 0.0);
         if ($$4 == null) {
            return b($$1) ? $$1.h.e() : null;
         } else {
            return b($$1) ? b($$1, $$4) : $$4;
         }
      }
   }

   private static dtc b(eas $$0, dtc $$1) {
      if ($$1.a(dfe.a)) {
         return $$0.h.b();
      } else if ($$1.a(dfe.al)) {
         dtc $$2 = $$0.h.c();
         return $$2.b(dts.C) ? $$2.a(dts.C, Boolean.valueOf(true)) : $$2;
      } else {
         return $$1.a(dfe.am) ? $$0.h.d() : $$1;
      }
   }

   public abstract boolean a(eau var1, C var2, duy var3, Function<ir, ja<dcz>> var4, ayt var5, dyg var6, dbh var7, dux var8);

   public abstract boolean a(C var1, ayt var2);

   protected boolean a(C $$0, dtc $$1) {
      return $$1.a($$0.i);
   }

   protected static boolean a(dbh $$0, double $$1, double $$2, int $$3, int $$4, float $$5) {
      double $$6 = (double)$$0.b();
      double $$7 = (double)$$0.c();
      double $$8 = $$1 - $$6;
      double $$9 = $$2 - $$7;
      double $$10 = (double)($$4 - $$3);
      double $$11 = (double)($$5 + 2.0F + 16.0F);
      return $$8 * $$8 + $$9 * $$9 - $$10 * $$10 <= $$11 * $$11;
   }

   private static boolean b(eas $$0) {
      return $$0.h.a();
   }

   public interface a {
      boolean shouldSkip(eau var1, double var2, double var4, double var6, int var8);
   }
}
