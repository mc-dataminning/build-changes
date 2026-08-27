import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class dqd<C extends dpw> {
   public static final dqd<dpz> a = a("cave", new dqa(dpz.a));
   public static final dqd<dpz> b = a("nether_cave", new dqc(dpz.a));
   public static final dqd<dpu> c = a("canyon", new dpv(dpu.a));
   protected static final dip d = cwb.a.o();
   protected static final dip e = cwb.nc.o();
   protected static final edz f = eea.c.g();
   protected static final edz g = eea.e.g();
   protected Set<edy> h = ImmutableSet.of(eea.c);
   private final Codec<dqb<C>> i;

   private static <C extends dpw, F extends dqd<C>> F a(String $$0, F $$1) {
      return ir.a(kb.P, $$0, $$1);
   }

   public dqd(Codec<C> $$0) {
      this.i = $$0.fieldOf("config").xmap(this::a, dqb::b).codec();
   }

   public dqb<C> a(C $$0) {
      return new dqb<>(this, $$0);
   }

   public Codec<dqb<C>> c() {
      return this.i;
   }

   public int d() {
      return 4;
   }

   protected boolean a(
      dpy $$0, C $$1, dkl $$2, Function<hv, ie<ctx>> $$3, dnk $$4, double $$5, double $$6, double $$7, double $$8, double $$9, dkk $$10, dqd.a $$11
   ) {
      csf $$12 = $$2.f();
      double $$13 = (double)$$12.b();
      double $$14 = (double)$$12.c();
      double $$15 = 16.0 + $$8 * 2.0;
      if (!(Math.abs($$5 - $$13) > $$15) && !(Math.abs($$7 - $$14) > $$15)) {
         int $$16 = $$12.d();
         int $$17 = $$12.e();
         int $$18 = Math.max(aty.a($$5 - $$8) - $$16 - 1, 0);
         int $$19 = Math.min(aty.a($$5 + $$8) - $$16, 15);
         int $$20 = Math.max(aty.a($$6 - $$9) - 1, $$0.a() + 1);
         int $$21 = $$2.y() ? 0 : 7;
         int $$22 = Math.min(aty.a($$6 + $$9) + 1, $$0.a() + $$0.b() - 1 - $$21);
         int $$23 = Math.max(aty.a($$7 - $$8) - $$17 - 1, 0);
         int $$24 = Math.min(aty.a($$7 + $$8) - $$17, 15);
         boolean $$25 = false;
         hv.a $$26 = new hv.a();
         hv.a $$27 = new hv.a();

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

   protected boolean a(dpy $$0, C $$1, dkl $$2, Function<hv, ie<ctx>> $$3, dkk $$4, hv.a $$5, hv.a $$6, dnk $$7, MutableBoolean $$8) {
      dip $$9 = $$2.a_($$5);
      if ($$9.a(cwb.i) || $$9.a(cwb.fl)) {
         $$8.setTrue();
      }

      if (!this.a($$1, $$9) && !b($$1)) {
         return false;
      } else {
         dip $$10 = this.a($$0, $$1, $$5, $$7);
         if ($$10 == null) {
            return false;
         } else {
            $$2.a($$5, $$10, false);
            if ($$7.a() && !$$10.u().c()) {
               $$2.e($$5);
            }

            if ($$8.isTrue()) {
               $$6.a($$5, ia.a);
               if ($$2.a_($$6).a(cwb.j)) {
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
   private dip a(dpy $$0, C $$1, hv $$2, dnk $$3) {
      if ($$2.v() <= $$1.g.a($$0)) {
         return g.g();
      } else {
         dip $$4 = $$3.a(new dnr.e($$2.u(), $$2.v(), $$2.w()), 0.0);
         if ($$4 == null) {
            return b($$1) ? $$1.h.e() : null;
         } else {
            return b($$1) ? b($$1, $$4) : $$4;
         }
      }
   }

   private static dip b(dpw $$0, dip $$1) {
      if ($$1.a(cwb.a)) {
         return $$0.h.b();
      } else if ($$1.a(cwb.G)) {
         dip $$2 = $$0.h.c();
         return $$2.b(djf.C) ? $$2.a(djf.C, Boolean.valueOf(true)) : $$2;
      } else {
         return $$1.a(cwb.H) ? $$0.h.d() : $$1;
      }
   }

   public abstract boolean a(dpy var1, C var2, dkl var3, Function<hv, ie<ctx>> var4, auf var5, dnk var6, csf var7, dkk var8);

   public abstract boolean a(C var1, auf var2);

   protected boolean a(C $$0, dip $$1) {
      return $$1.a($$0.i);
   }

   protected static boolean a(csf $$0, double $$1, double $$2, int $$3, int $$4, float $$5) {
      double $$6 = (double)$$0.b();
      double $$7 = (double)$$0.c();
      double $$8 = $$1 - $$6;
      double $$9 = $$2 - $$7;
      double $$10 = (double)($$4 - $$3);
      double $$11 = (double)($$5 + 2.0F + 16.0F);
      return $$8 * $$8 + $$9 * $$9 - $$10 * $$10 <= $$11 * $$11;
   }

   private static boolean b(dpw $$0) {
      return $$0.h.a();
   }

   public interface a {
      boolean shouldSkip(dpy var1, double var2, double var4, double var6, int var8);
   }
}
