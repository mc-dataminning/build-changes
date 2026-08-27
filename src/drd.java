import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class drd<C extends dqw> {
   public static final drd<dqz> a = a("cave", new dra(dqz.a));
   public static final drd<dqz> b = a("nether_cave", new drc(dqz.a));
   public static final drd<dqu> c = a("canyon", new dqv(dqu.a));
   protected static final djp d = cxa.a.o();
   protected static final djp e = cxa.nc.o();
   protected static final eez f = efa.c.g();
   protected static final eez g = efa.e.g();
   protected Set<eey> h = ImmutableSet.of(efa.c);
   private final Codec<drb<C>> i;

   private static <C extends dqw, F extends drd<C>> F a(String $$0, F $$1) {
      return it.a(kd.P, $$0, $$1);
   }

   public drd(Codec<C> $$0) {
      this.i = $$0.fieldOf("config").xmap(this::a, drb::b).codec();
   }

   public drb<C> a(C $$0) {
      return new drb<>(this, $$0);
   }

   public Codec<drb<C>> c() {
      return this.i;
   }

   public int d() {
      return 4;
   }

   protected boolean a(
      dqy $$0, C $$1, dll $$2, Function<hx, ih<cuw>> $$3, dok $$4, double $$5, double $$6, double $$7, double $$8, double $$9, dlk $$10, drd.a $$11
   ) {
      cte $$12 = $$2.f();
      double $$13 = (double)$$12.b();
      double $$14 = (double)$$12.c();
      double $$15 = 16.0 + $$8 * 2.0;
      if (!(Math.abs($$5 - $$13) > $$15) && !(Math.abs($$7 - $$14) > $$15)) {
         int $$16 = $$12.d();
         int $$17 = $$12.e();
         int $$18 = Math.max(aup.a($$5 - $$8) - $$16 - 1, 0);
         int $$19 = Math.min(aup.a($$5 + $$8) - $$16, 15);
         int $$20 = Math.max(aup.a($$6 - $$9) - 1, $$0.a() + 1);
         int $$21 = $$2.y() ? 0 : 7;
         int $$22 = Math.min(aup.a($$6 + $$9) + 1, $$0.a() + $$0.b() - 1 - $$21);
         int $$23 = Math.max(aup.a($$7 - $$8) - $$17 - 1, 0);
         int $$24 = Math.min(aup.a($$7 + $$8) - $$17, 15);
         boolean $$25 = false;
         hx.a $$26 = new hx.a();
         hx.a $$27 = new hx.a();

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

   protected boolean a(dqy $$0, C $$1, dll $$2, Function<hx, ih<cuw>> $$3, dlk $$4, hx.a $$5, hx.a $$6, dok $$7, MutableBoolean $$8) {
      djp $$9 = $$2.a_($$5);
      if ($$9.a(cxa.i) || $$9.a(cxa.fl)) {
         $$8.setTrue();
      }

      if (!this.a($$1, $$9) && !b($$1)) {
         return false;
      } else {
         djp $$10 = this.a($$0, $$1, $$5, $$7);
         if ($$10 == null) {
            return false;
         } else {
            $$2.a($$5, $$10, false);
            if ($$7.a() && !$$10.u().c()) {
               $$2.e($$5);
            }

            if ($$8.isTrue()) {
               $$6.a($$5, ic.a);
               if ($$2.a_($$6).a(cxa.j)) {
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
   private djp a(dqy $$0, C $$1, hx $$2, dok $$3) {
      if ($$2.v() <= $$1.g.a($$0)) {
         return g.g();
      } else {
         djp $$4 = $$3.a(new dor.e($$2.u(), $$2.v(), $$2.w()), 0.0);
         if ($$4 == null) {
            return b($$1) ? $$1.h.e() : null;
         } else {
            return b($$1) ? b($$1, $$4) : $$4;
         }
      }
   }

   private static djp b(dqw $$0, djp $$1) {
      if ($$1.a(cxa.a)) {
         return $$0.h.b();
      } else if ($$1.a(cxa.G)) {
         djp $$2 = $$0.h.c();
         return $$2.b(dkf.C) ? $$2.a(dkf.C, Boolean.valueOf(true)) : $$2;
      } else {
         return $$1.a(cxa.H) ? $$0.h.d() : $$1;
      }
   }

   public abstract boolean a(dqy var1, C var2, dll var3, Function<hx, ih<cuw>> var4, auw var5, dok var6, cte var7, dlk var8);

   public abstract boolean a(C var1, auw var2);

   protected boolean a(C $$0, djp $$1) {
      return $$1.a($$0.i);
   }

   protected static boolean a(cte $$0, double $$1, double $$2, int $$3, int $$4, float $$5) {
      double $$6 = (double)$$0.b();
      double $$7 = (double)$$0.c();
      double $$8 = $$1 - $$6;
      double $$9 = $$2 - $$7;
      double $$10 = (double)($$4 - $$3);
      double $$11 = (double)($$5 + 2.0F + 16.0F);
      return $$8 * $$8 + $$9 * $$9 - $$10 * $$10 <= $$11 * $$11;
   }

   private static boolean b(dqw $$0) {
      return $$0.h.a();
   }

   public interface a {
      boolean shouldSkip(dqy var1, double var2, double var4, double var6, int var8);
   }
}
