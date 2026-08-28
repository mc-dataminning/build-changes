import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class ejj<C extends ejc> {
   public static final ejj<ejf> a = a("cave", new ejg(ejf.a));
   public static final ejj<ejf> b = a("nether_cave", new eji(ejf.a));
   public static final ejj<eja> c = a("canyon", new ejb(eja.a));
   protected static final ebe d = dne.a.m();
   protected static final ebe e = dne.nI.m();
   protected static final exo f = exp.c.g();
   protected static final exo g = exp.e.g();
   protected Set<exn> h = ImmutableSet.of(exp.c);
   private final MapCodec<ejh<C>> i;

   private static <C extends ejc, F extends ejj<C>> F a(String $$0, F $$1) {
      return js.a(mg.N, $$0, $$1);
   }

   public ejj(Codec<C> $$0) {
      this.i = $$0.fieldOf("config").xmap(this::a, ejh::b);
   }

   public ejh<C> a(C $$0) {
      return new ejh<>(this, $$0);
   }

   public MapCodec<ejh<C>> c() {
      return this.i;
   }

   public int d() {
      return 4;
   }

   protected boolean a(
      eje $$0, C $$1, edb $$2, Function<iv, jf<dla>> $$3, egp $$4, double $$5, double $$6, double $$7, double $$8, double $$9, eda $$10, ejj.a $$11
   ) {
      djc $$12 = $$2.f();
      double $$13 = (double)$$12.b();
      double $$14 = (double)$$12.c();
      double $$15 = 16.0 + $$8 * 2.0;
      if (!(Math.abs($$5 - $$13) > $$15) && !(Math.abs($$7 - $$14) > $$15)) {
         int $$16 = $$12.d();
         int $$17 = $$12.e();
         int $$18 = Math.max(azo.a($$5 - $$8) - $$16 - 1, 0);
         int $$19 = Math.min(azo.a($$5 + $$8) - $$16, 15);
         int $$20 = Math.max(azo.a($$6 - $$9) - 1, $$0.a() + 1);
         int $$21 = $$2.A() ? 0 : 7;
         int $$22 = Math.min(azo.a($$6 + $$9) + 1, $$0.a() + $$0.b() - 1 - $$21);
         int $$23 = Math.max(azo.a($$7 - $$8) - $$17 - 1, 0);
         int $$24 = Math.min(azo.a($$7 + $$8) - $$17, 15);
         boolean $$25 = false;
         iv.a $$26 = new iv.a();
         iv.a $$27 = new iv.a();

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

   protected boolean a(eje $$0, C $$1, edb $$2, Function<iv, jf<dla>> $$3, eda $$4, iv.a $$5, iv.a $$6, egp $$7, MutableBoolean $$8) {
      ebe $$9 = $$2.a_($$5);
      if ($$9.a(dne.i) || $$9.a(dne.fE)) {
         $$8.setTrue();
      }

      if (!this.a($$1, $$9) && !b($$1)) {
         return false;
      } else {
         ebe $$10 = this.a($$0, $$1, $$5, $$7);
         if ($$10 == null) {
            return false;
         } else {
            $$2.a($$5, $$10);
            if ($$7.a() && !$$10.y().c()) {
               $$2.e($$5);
            }

            if ($$8.isTrue()) {
               $$6.a($$5, jb.a);
               if ($$2.a_($$6).a(dne.j)) {
                  $$0.a($$3, $$2, $$6, !$$10.y().c()).ifPresent($$2x -> {
                     $$2.a($$6, $$2x);
                     if (!$$2x.y().c()) {
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
   private ebe a(eje $$0, C $$1, iv $$2, egp $$3) {
      if ($$2.v() <= $$1.g.a($$0)) {
         return g.g();
      } else {
         ebe $$4 = $$3.a(new egw.e($$2.u(), $$2.v(), $$2.w()), 0.0);
         if ($$4 == null) {
            return b($$1) ? $$1.h.e() : null;
         } else {
            return b($$1) ? b($$1, $$4) : $$4;
         }
      }
   }

   private static ebe b(ejc $$0, ebe $$1) {
      if ($$1.a(dne.a)) {
         return $$0.h.b();
      } else if ($$1.a(dne.J)) {
         ebe $$2 = $$0.h.c();
         return $$2.b(ebu.I) ? $$2.b(ebu.I, Boolean.valueOf(true)) : $$2;
      } else {
         return $$1.a(dne.K) ? $$0.h.d() : $$1;
      }
   }

   public abstract boolean a(eje var1, C var2, edb var3, Function<iv, jf<dla>> var4, azx var5, egp var6, djc var7, eda var8);

   public abstract boolean a(C var1, azx var2);

   protected boolean a(C $$0, ebe $$1) {
      return $$1.a($$0.i);
   }

   protected static boolean a(djc $$0, double $$1, double $$2, int $$3, int $$4, float $$5) {
      double $$6 = (double)$$0.b();
      double $$7 = (double)$$0.c();
      double $$8 = $$1 - $$6;
      double $$9 = $$2 - $$7;
      double $$10 = (double)($$4 - $$3);
      double $$11 = (double)($$5 + 2.0F + 16.0F);
      return $$8 * $$8 + $$9 * $$9 - $$10 * $$10 <= $$11 * $$11;
   }

   private static boolean b(ejc $$0) {
      return $$0.h.a();
   }

   public interface a {
      boolean shouldSkip(eje var1, double var2, double var4, double var6, int var8);
   }
}
