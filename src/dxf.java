import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class dxf<C extends dwy> {
   public static final dxf<dxb> a = a("cave", new dxc(dxb.a));
   public static final dxf<dxb> b = a("nether_cave", new dxe(dxb.a));
   public static final dxf<dww> c = a("canyon", new dwx(dww.a));
   protected static final dpi d = dcj.a.n();
   protected static final dpi e = dcj.nc.n();
   protected static final elb f = elc.c.g();
   protected static final elb g = elc.e.g();
   protected Set<ela> h = ImmutableSet.of(elc.c);
   private final Codec<dxd<C>> i;

   private static <C extends dwy, F extends dxf<C>> F a(String $$0, F $$1) {
      return ja.a(kt.P, $$0, $$1);
   }

   public dxf(Codec<C> $$0) {
      this.i = $$0.fieldOf("config").xmap(this::a, dxd::b).codec();
   }

   public dxd<C> a(C $$0) {
      return new dxd<>(this, $$0);
   }

   public Codec<dxd<C>> c() {
      return this.i;
   }

   public int d() {
      return 4;
   }

   protected boolean a(
      dxa $$0, C $$1, dre $$2, Function<id, in<daf>> $$3, dum $$4, double $$5, double $$6, double $$7, double $$8, double $$9, drd $$10, dxf.a $$11
   ) {
      cyn $$12 = $$2.f();
      double $$13 = (double)$$12.b();
      double $$14 = (double)$$12.c();
      double $$15 = 16.0 + $$8 * 2.0;
      if (!(Math.abs($$5 - $$13) > $$15) && !(Math.abs($$7 - $$14) > $$15)) {
         int $$16 = $$12.d();
         int $$17 = $$12.e();
         int $$18 = Math.max(axm.a($$5 - $$8) - $$16 - 1, 0);
         int $$19 = Math.min(axm.a($$5 + $$8) - $$16, 15);
         int $$20 = Math.max(axm.a($$6 - $$9) - 1, $$0.a() + 1);
         int $$21 = $$2.y() ? 0 : 7;
         int $$22 = Math.min(axm.a($$6 + $$9) + 1, $$0.a() + $$0.b() - 1 - $$21);
         int $$23 = Math.max(axm.a($$7 - $$8) - $$17 - 1, 0);
         int $$24 = Math.min(axm.a($$7 + $$8) - $$17, 15);
         boolean $$25 = false;
         id.a $$26 = new id.a();
         id.a $$27 = new id.a();

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

   protected boolean a(dxa $$0, C $$1, dre $$2, Function<id, in<daf>> $$3, drd $$4, id.a $$5, id.a $$6, dum $$7, MutableBoolean $$8) {
      dpi $$9 = $$2.a_($$5);
      if ($$9.a(dcj.i) || $$9.a(dcj.fl)) {
         $$8.setTrue();
      }

      if (!this.a($$1, $$9) && !b($$1)) {
         return false;
      } else {
         dpi $$10 = this.a($$0, $$1, $$5, $$7);
         if ($$10 == null) {
            return false;
         } else {
            $$2.a($$5, $$10, false);
            if ($$7.a() && !$$10.u().c()) {
               $$2.e($$5);
            }

            if ($$8.isTrue()) {
               $$6.a($$5, ij.a);
               if ($$2.a_($$6).a(dcj.j)) {
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
   private dpi a(dxa $$0, C $$1, id $$2, dum $$3) {
      if ($$2.v() <= $$1.g.a($$0)) {
         return g.g();
      } else {
         dpi $$4 = $$3.a(new dut.e($$2.u(), $$2.v(), $$2.w()), 0.0);
         if ($$4 == null) {
            return b($$1) ? $$1.h.e() : null;
         } else {
            return b($$1) ? b($$1, $$4) : $$4;
         }
      }
   }

   private static dpi b(dwy $$0, dpi $$1) {
      if ($$1.a(dcj.a)) {
         return $$0.h.b();
      } else if ($$1.a(dcj.G)) {
         dpi $$2 = $$0.h.c();
         return $$2.b(dpy.C) ? $$2.a(dpy.C, Boolean.valueOf(true)) : $$2;
      } else {
         return $$1.a(dcj.H) ? $$0.h.d() : $$1;
      }
   }

   public abstract boolean a(dxa var1, C var2, dre var3, Function<id, in<daf>> var4, axt var5, dum var6, cyn var7, drd var8);

   public abstract boolean a(C var1, axt var2);

   protected boolean a(C $$0, dpi $$1) {
      return $$1.a($$0.i);
   }

   protected static boolean a(cyn $$0, double $$1, double $$2, int $$3, int $$4, float $$5) {
      double $$6 = (double)$$0.b();
      double $$7 = (double)$$0.c();
      double $$8 = $$1 - $$6;
      double $$9 = $$2 - $$7;
      double $$10 = (double)($$4 - $$3);
      double $$11 = (double)($$5 + 2.0F + 16.0F);
      return $$8 * $$8 + $$9 * $$9 - $$10 * $$10 <= $$11 * $$11;
   }

   private static boolean b(dwy $$0) {
      return $$0.h.a();
   }

   public interface a {
      boolean shouldSkip(dxa var1, double var2, double var4, double var6, int var8);
   }
}
