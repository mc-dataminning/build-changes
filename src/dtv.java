import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class dtv<C extends dto> {
   public static final dtv<dtr> a = a("cave", new dts(dtr.a));
   public static final dtv<dtr> b = a("nether_cave", new dtu(dtr.a));
   public static final dtv<dtm> c = a("canyon", new dtn(dtm.a));
   protected static final dme d = czh.a.o();
   protected static final dme e = czh.nc.o();
   protected static final ehr f = ehs.c.g();
   protected static final ehr g = ehs.e.g();
   protected Set<ehq> h = ImmutableSet.of(ehs.c);
   private final Codec<dtt<C>> i;

   private static <C extends dto, F extends dtv<C>> F a(String $$0, F $$1) {
      return ix.a(kh.P, $$0, $$1);
   }

   public dtv(Codec<C> $$0) {
      this.i = $$0.fieldOf("config").xmap(this::a, dtt::b).codec();
   }

   public dtt<C> a(C $$0) {
      return new dtt<>(this, $$0);
   }

   public Codec<dtt<C>> c() {
      return this.i;
   }

   public int d() {
      return 4;
   }

   protected boolean a(
      dtq $$0, C $$1, doa $$2, Function<ib, il<cxd>> $$3, drc $$4, double $$5, double $$6, double $$7, double $$8, double $$9, dnz $$10, dtv.a $$11
   ) {
      cvl $$12 = $$2.f();
      double $$13 = (double)$$12.b();
      double $$14 = (double)$$12.c();
      double $$15 = 16.0 + $$8 * 2.0;
      if (!(Math.abs($$5 - $$13) > $$15) && !(Math.abs($$7 - $$14) > $$15)) {
         int $$16 = $$12.d();
         int $$17 = $$12.e();
         int $$18 = Math.max(awm.a($$5 - $$8) - $$16 - 1, 0);
         int $$19 = Math.min(awm.a($$5 + $$8) - $$16, 15);
         int $$20 = Math.max(awm.a($$6 - $$9) - 1, $$0.a() + 1);
         int $$21 = $$2.y() ? 0 : 7;
         int $$22 = Math.min(awm.a($$6 + $$9) + 1, $$0.a() + $$0.b() - 1 - $$21);
         int $$23 = Math.max(awm.a($$7 - $$8) - $$17 - 1, 0);
         int $$24 = Math.min(awm.a($$7 + $$8) - $$17, 15);
         boolean $$25 = false;
         ib.a $$26 = new ib.a();
         ib.a $$27 = new ib.a();

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

   protected boolean a(dtq $$0, C $$1, doa $$2, Function<ib, il<cxd>> $$3, dnz $$4, ib.a $$5, ib.a $$6, drc $$7, MutableBoolean $$8) {
      dme $$9 = $$2.a_($$5);
      if ($$9.a(czh.i) || $$9.a(czh.fl)) {
         $$8.setTrue();
      }

      if (!this.a($$1, $$9) && !b($$1)) {
         return false;
      } else {
         dme $$10 = this.a($$0, $$1, $$5, $$7);
         if ($$10 == null) {
            return false;
         } else {
            $$2.a($$5, $$10, false);
            if ($$7.a() && !$$10.u().c()) {
               $$2.e($$5);
            }

            if ($$8.isTrue()) {
               $$6.a($$5, ih.a);
               if ($$2.a_($$6).a(czh.j)) {
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
   private dme a(dtq $$0, C $$1, ib $$2, drc $$3) {
      if ($$2.v() <= $$1.g.a($$0)) {
         return g.g();
      } else {
         dme $$4 = $$3.a(new drj.e($$2.u(), $$2.v(), $$2.w()), 0.0);
         if ($$4 == null) {
            return b($$1) ? $$1.h.e() : null;
         } else {
            return b($$1) ? b($$1, $$4) : $$4;
         }
      }
   }

   private static dme b(dto $$0, dme $$1) {
      if ($$1.a(czh.a)) {
         return $$0.h.b();
      } else if ($$1.a(czh.G)) {
         dme $$2 = $$0.h.c();
         return $$2.b(dmu.C) ? $$2.a(dmu.C, Boolean.valueOf(true)) : $$2;
      } else {
         return $$1.a(czh.H) ? $$0.h.d() : $$1;
      }
   }

   public abstract boolean a(dtq var1, C var2, doa var3, Function<ib, il<cxd>> var4, awt var5, drc var6, cvl var7, dnz var8);

   public abstract boolean a(C var1, awt var2);

   protected boolean a(C $$0, dme $$1) {
      return $$1.a($$0.i);
   }

   protected static boolean a(cvl $$0, double $$1, double $$2, int $$3, int $$4, float $$5) {
      double $$6 = (double)$$0.b();
      double $$7 = (double)$$0.c();
      double $$8 = $$1 - $$6;
      double $$9 = $$2 - $$7;
      double $$10 = (double)($$4 - $$3);
      double $$11 = (double)($$5 + 2.0F + 16.0F);
      return $$8 * $$8 + $$9 * $$9 - $$10 * $$10 <= $$11 * $$11;
   }

   private static boolean b(dto $$0) {
      return $$0.h.a();
   }

   public interface a {
      boolean shouldSkip(dtq var1, double var2, double var4, double var6, int var8);
   }
}
