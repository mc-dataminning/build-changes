import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class djp<C extends dji> {
   public static final djp<djl> a = a("cave", new djm(djl.a));
   public static final djp<djl> b = a("nether_cave", new djo(djl.a));
   public static final djp<djg> c = a("canyon", new djh(djg.a));
   protected static final dcb d = cpo.a.n();
   protected static final dcb e = cpo.nc.n();
   protected static final dxe f = dxf.c.g();
   protected static final dxe g = dxf.e.g();
   protected Set<dxd> h = ImmutableSet.of(dxf.c);
   private final Codec<djn<C>> i;

   private static <C extends dji, F extends djp<C>> F a(String $$0, F $$1) {
      return hr.a(jb.Q, $$0, $$1);
   }

   public djp(Codec<C> $$0) {
      this.i = $$0.fieldOf("config").xmap(this::a, djn::b).codec();
   }

   public djn<C> a(C $$0) {
      return new djn<>(this, $$0);
   }

   public Codec<djn<C>> c() {
      return this.i;
   }

   public int d() {
      return 4;
   }

   protected boolean a(
      djk $$0, C $$1, ddx $$2, Function<gu, he<cnk>> $$3, dgw $$4, double $$5, double $$6, double $$7, double $$8, double $$9, ddw $$10, djp.a $$11
   ) {
      clt $$12 = $$2.f();
      double $$13 = (double)$$12.b();
      double $$14 = (double)$$12.c();
      double $$15 = 16.0 + $$8 * 2.0;
      if (!(Math.abs($$5 - $$13) > $$15) && !(Math.abs($$7 - $$14) > $$15)) {
         int $$16 = $$12.d();
         int $$17 = $$12.e();
         int $$18 = Math.max(apa.a($$5 - $$8) - $$16 - 1, 0);
         int $$19 = Math.min(apa.a($$5 + $$8) - $$16, 15);
         int $$20 = Math.max(apa.a($$6 - $$9) - 1, $$0.a() + 1);
         int $$21 = $$2.y() ? 0 : 7;
         int $$22 = Math.min(apa.a($$6 + $$9) + 1, $$0.a() + $$0.b() - 1 - $$21);
         int $$23 = Math.max(apa.a($$7 - $$8) - $$17 - 1, 0);
         int $$24 = Math.min(apa.a($$7 + $$8) - $$17, 15);
         boolean $$25 = false;
         gu.a $$26 = new gu.a();
         gu.a $$27 = new gu.a();

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

   protected boolean a(djk $$0, C $$1, ddx $$2, Function<gu, he<cnk>> $$3, ddw $$4, gu.a $$5, gu.a $$6, dgw $$7, MutableBoolean $$8) {
      dcb $$9 = $$2.a_($$5);
      if ($$9.a(cpo.i) || $$9.a(cpo.fl)) {
         $$8.setTrue();
      }

      if (!this.a($$1, $$9) && !b($$1)) {
         return false;
      } else {
         dcb $$10 = this.a($$0, $$1, $$5, $$7);
         if ($$10 == null) {
            return false;
         } else {
            $$2.a($$5, $$10, false);
            if ($$7.a() && !$$10.u().c()) {
               $$2.e($$5);
            }

            if ($$8.isTrue()) {
               $$6.a($$5, ha.a);
               if ($$2.a_($$6).a(cpo.j)) {
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
   private dcb a(djk $$0, C $$1, gu $$2, dgw $$3) {
      if ($$2.v() <= $$1.g.a($$0)) {
         return g.g();
      } else {
         dcb $$4 = $$3.a(new dhd.e($$2.u(), $$2.v(), $$2.w()), 0.0);
         if ($$4 == null) {
            return b($$1) ? $$1.h.e() : null;
         } else {
            return b($$1) ? b($$1, $$4) : $$4;
         }
      }
   }

   private static dcb b(dji $$0, dcb $$1) {
      if ($$1.a(cpo.a)) {
         return $$0.h.b();
      } else if ($$1.a(cpo.G)) {
         dcb $$2 = $$0.h.c();
         return $$2.b(dcr.C) ? $$2.a(dcr.C, Boolean.valueOf(true)) : $$2;
      } else {
         return $$1.a(cpo.H) ? $$0.h.d() : $$1;
      }
   }

   public abstract boolean a(djk var1, C var2, ddx var3, Function<gu, he<cnk>> var4, apf var5, dgw var6, clt var7, ddw var8);

   public abstract boolean a(C var1, apf var2);

   protected boolean a(C $$0, dcb $$1) {
      return $$1.a($$0.i);
   }

   protected static boolean a(clt $$0, double $$1, double $$2, int $$3, int $$4, float $$5) {
      double $$6 = (double)$$0.b();
      double $$7 = (double)$$0.c();
      double $$8 = $$1 - $$6;
      double $$9 = $$2 - $$7;
      double $$10 = (double)($$4 - $$3);
      double $$11 = (double)($$5 + 2.0F + 16.0F);
      return $$8 * $$8 + $$9 * $$9 - $$10 * $$10 <= $$11 * $$11;
   }

   private static boolean b(dji $$0) {
      return $$0.h.a();
   }

   public interface a {
      boolean shouldSkip(djk var1, double var2, double var4, double var6, int var8);
   }
}
