import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class dnp<C extends dni> {
   public static final dnp<dnl> a = a("cave", new dnm(dnl.a));
   public static final dnp<dnl> b = a("nether_cave", new dno(dnl.a));
   public static final dnp<dng> c = a("canyon", new dnh(dng.a));
   protected static final dgb d = cuc.a.o();
   protected static final dgb e = cuc.nc.o();
   protected static final ebe f = ebf.c.g();
   protected static final ebe g = ebf.e.g();
   protected Set<ebd> h = ImmutableSet.of(ebf.c);
   private final Codec<dnn<C>> i;

   private static <C extends dni, F extends dnp<C>> F a(String $$0, F $$1) {
      return io.a(jy.Q, $$0, $$1);
   }

   public dnp(Codec<C> $$0) {
      this.i = $$0.fieldOf("config").xmap(this::a, dnn::b).codec();
   }

   public dnn<C> a(C $$0) {
      return new dnn<>(this, $$0);
   }

   public Codec<dnn<C>> c() {
      return this.i;
   }

   public int d() {
      return 4;
   }

   protected boolean a(
      dnk $$0, C $$1, dhx $$2, Function<ht, ib<crx>> $$3, dkw $$4, double $$5, double $$6, double $$7, double $$8, double $$9, dhw $$10, dnp.a $$11
   ) {
      cqg $$12 = $$2.f();
      double $$13 = (double)$$12.b();
      double $$14 = (double)$$12.c();
      double $$15 = 16.0 + $$8 * 2.0;
      if (!(Math.abs($$5 - $$13) > $$15) && !(Math.abs($$7 - $$14) > $$15)) {
         int $$16 = $$12.d();
         int $$17 = $$12.e();
         int $$18 = Math.max(asy.a($$5 - $$8) - $$16 - 1, 0);
         int $$19 = Math.min(asy.a($$5 + $$8) - $$16, 15);
         int $$20 = Math.max(asy.a($$6 - $$9) - 1, $$0.a() + 1);
         int $$21 = $$2.y() ? 0 : 7;
         int $$22 = Math.min(asy.a($$6 + $$9) + 1, $$0.a() + $$0.b() - 1 - $$21);
         int $$23 = Math.max(asy.a($$7 - $$8) - $$17 - 1, 0);
         int $$24 = Math.min(asy.a($$7 + $$8) - $$17, 15);
         boolean $$25 = false;
         ht.a $$26 = new ht.a();
         ht.a $$27 = new ht.a();

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

   protected boolean a(dnk $$0, C $$1, dhx $$2, Function<ht, ib<crx>> $$3, dhw $$4, ht.a $$5, ht.a $$6, dkw $$7, MutableBoolean $$8) {
      dgb $$9 = $$2.a_($$5);
      if ($$9.a(cuc.i) || $$9.a(cuc.fl)) {
         $$8.setTrue();
      }

      if (!this.a($$1, $$9) && !b($$1)) {
         return false;
      } else {
         dgb $$10 = this.a($$0, $$1, $$5, $$7);
         if ($$10 == null) {
            return false;
         } else {
            $$2.a($$5, $$10, false);
            if ($$7.a() && !$$10.u().c()) {
               $$2.e($$5);
            }

            if ($$8.isTrue()) {
               $$6.a($$5, hx.a);
               if ($$2.a_($$6).a(cuc.j)) {
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
   private dgb a(dnk $$0, C $$1, ht $$2, dkw $$3) {
      if ($$2.v() <= $$1.g.a($$0)) {
         return g.g();
      } else {
         dgb $$4 = $$3.a(new dld.e($$2.u(), $$2.v(), $$2.w()), 0.0);
         if ($$4 == null) {
            return b($$1) ? $$1.h.e() : null;
         } else {
            return b($$1) ? b($$1, $$4) : $$4;
         }
      }
   }

   private static dgb b(dni $$0, dgb $$1) {
      if ($$1.a(cuc.a)) {
         return $$0.h.b();
      } else if ($$1.a(cuc.G)) {
         dgb $$2 = $$0.h.c();
         return $$2.b(dgr.C) ? $$2.a(dgr.C, Boolean.valueOf(true)) : $$2;
      } else {
         return $$1.a(cuc.H) ? $$0.h.d() : $$1;
      }
   }

   public abstract boolean a(dnk var1, C var2, dhx var3, Function<ht, ib<crx>> var4, ate var5, dkw var6, cqg var7, dhw var8);

   public abstract boolean a(C var1, ate var2);

   protected boolean a(C $$0, dgb $$1) {
      return $$1.a($$0.i);
   }

   protected static boolean a(cqg $$0, double $$1, double $$2, int $$3, int $$4, float $$5) {
      double $$6 = (double)$$0.b();
      double $$7 = (double)$$0.c();
      double $$8 = $$1 - $$6;
      double $$9 = $$2 - $$7;
      double $$10 = (double)($$4 - $$3);
      double $$11 = (double)($$5 + 2.0F + 16.0F);
      return $$8 * $$8 + $$9 * $$9 - $$10 * $$10 <= $$11 * $$11;
   }

   private static boolean b(dni $$0) {
      return $$0.h.a();
   }

   public interface a {
      boolean shouldSkip(dnk var1, double var2, double var4, double var6, int var8);
   }
}
