import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class dzx<C extends dzq> {
   public static final dzx<dzt> a = a("cave", new dzu(dzt.a));
   public static final dzx<dzt> b = a("nether_cave", new dzw(dzt.a));
   public static final dzx<dzo> c = a("canyon", new dzp(dzo.a));
   protected static final dsa d = dez.a.o();
   protected static final dsa e = dez.nc.o();
   protected static final ent f = enu.c.g();
   protected static final ent g = enu.e.g();
   protected Set<ens> h = ImmutableSet.of(enu.c);
   private final MapCodec<dzv<C>> i;

   private static <C extends dzq, F extends dzx<C>> F a(String $$0, F $$1) {
      return jv.a(lp.P, $$0, $$1);
   }

   public dzx(Codec<C> $$0) {
      this.i = $$0.fieldOf("config").xmap(this::a, dzv::b);
   }

   public dzv<C> a(C $$0) {
      return new dzv<>(this, $$0);
   }

   public MapCodec<dzv<C>> c() {
      return this.i;
   }

   public int d() {
      return 4;
   }

   protected boolean a(
      dzs $$0, C $$1, dtw $$2, Function<iz, ji<dcv>> $$3, dxe $$4, double $$5, double $$6, double $$7, double $$8, double $$9, dtv $$10, dzx.a $$11
   ) {
      dbd $$12 = $$2.f();
      double $$13 = (double)$$12.b();
      double $$14 = (double)$$12.c();
      double $$15 = 16.0 + $$8 * 2.0;
      if (!(Math.abs($$5 - $$13) > $$15) && !(Math.abs($$7 - $$14) > $$15)) {
         int $$16 = $$12.d();
         int $$17 = $$12.e();
         int $$18 = Math.max(ayx.a($$5 - $$8) - $$16 - 1, 0);
         int $$19 = Math.min(ayx.a($$5 + $$8) - $$16, 15);
         int $$20 = Math.max(ayx.a($$6 - $$9) - 1, $$0.a() + 1);
         int $$21 = $$2.y() ? 0 : 7;
         int $$22 = Math.min(ayx.a($$6 + $$9) + 1, $$0.a() + $$0.b() - 1 - $$21);
         int $$23 = Math.max(ayx.a($$7 - $$8) - $$17 - 1, 0);
         int $$24 = Math.min(ayx.a($$7 + $$8) - $$17, 15);
         boolean $$25 = false;
         iz.a $$26 = new iz.a();
         iz.a $$27 = new iz.a();

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

   protected boolean a(dzs $$0, C $$1, dtw $$2, Function<iz, ji<dcv>> $$3, dtv $$4, iz.a $$5, iz.a $$6, dxe $$7, MutableBoolean $$8) {
      dsa $$9 = $$2.a_($$5);
      if ($$9.a(dez.i) || $$9.a(dez.fl)) {
         $$8.setTrue();
      }

      if (!this.a($$1, $$9) && !b($$1)) {
         return false;
      } else {
         dsa $$10 = this.a($$0, $$1, $$5, $$7);
         if ($$10 == null) {
            return false;
         } else {
            $$2.a($$5, $$10, false);
            if ($$7.a() && !$$10.u().c()) {
               $$2.e($$5);
            }

            if ($$8.isTrue()) {
               $$6.a($$5, je.a);
               if ($$2.a_($$6).a(dez.j)) {
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
   private dsa a(dzs $$0, C $$1, iz $$2, dxe $$3) {
      if ($$2.v() <= $$1.g.a($$0)) {
         return g.g();
      } else {
         dsa $$4 = $$3.a(new dxl.e($$2.u(), $$2.v(), $$2.w()), 0.0);
         if ($$4 == null) {
            return b($$1) ? $$1.h.e() : null;
         } else {
            return b($$1) ? b($$1, $$4) : $$4;
         }
      }
   }

   private static dsa b(dzq $$0, dsa $$1) {
      if ($$1.a(dez.a)) {
         return $$0.h.b();
      } else if ($$1.a(dez.G)) {
         dsa $$2 = $$0.h.c();
         return $$2.b(dsq.C) ? $$2.a(dsq.C, Boolean.valueOf(true)) : $$2;
      } else {
         return $$1.a(dez.H) ? $$0.h.d() : $$1;
      }
   }

   public abstract boolean a(dzs var1, C var2, dtw var3, Function<iz, ji<dcv>> var4, azf var5, dxe var6, dbd var7, dtv var8);

   public abstract boolean a(C var1, azf var2);

   protected boolean a(C $$0, dsa $$1) {
      return $$1.a($$0.i);
   }

   protected static boolean a(dbd $$0, double $$1, double $$2, int $$3, int $$4, float $$5) {
      double $$6 = (double)$$0.b();
      double $$7 = (double)$$0.c();
      double $$8 = $$1 - $$6;
      double $$9 = $$2 - $$7;
      double $$10 = (double)($$4 - $$3);
      double $$11 = (double)($$5 + 2.0F + 16.0F);
      return $$8 * $$8 + $$9 * $$9 - $$10 * $$10 <= $$11 * $$11;
   }

   private static boolean b(dzq $$0) {
      return $$0.h.a();
   }

   public interface a {
      boolean shouldSkip(dzs var1, double var2, double var4, double var6, int var8);
   }
}
