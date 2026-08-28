import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drq extends dmm implements dmp {
   public static final MapCodec<drq> a = b(drq::new);
   public static final ebf b = ebe.d;
   public static final ebm<ecb> c = ebe.aa;
   public static final ebm<ecb> d = ebe.Z;
   public static final ebm<ecb> e = ebe.ab;
   public static final ebm<ecb> f = ebe.ac;
   public static final Map<jb, ebm<ecb>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jb.c, c, jb.f, d, jb.d, e, jb.e, f)));
   private final Function<eao, ffr> h;

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   public drq(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, ecb.a).b(d, ecb.a).b(e, ecb.a).b(f, ecb.a));
      this.h = this.b();
   }

   @Override
   protected ffr d_(eao $$0) {
      return ffo.a();
   }

   public Function<eao, ffr> b() {
      Map<jb, ffr> $$0 = ffo.c(dmm.a(16.0, 0.0, 10.0, 0.0, 1.0));
      Map<jb, ffr> $$1 = ffo.d(dmm.c(16.0, 0.0, 1.0));
      return this.a($$2 -> {
         ffr $$3 = $$2.c(b) ? $$1.get(jb.a) : ffo.a();

         for (Entry<jb, ebm<ecb>> $$4 : g.entrySet()) {
            switch ((ecb)$$2.c($$4.getValue())) {
               case a:
               default:
                  break;
               case b:
                  $$3 = ffo.a($$3, $$0.get($$4.getKey()));
                  break;
               case c:
                  $$3 = ffo.a($$3, $$1.get($$4.getKey()));
            }
         }

         return $$3.c() ? ffo.b() : $$3;
      });
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return $$0.c(b) ? this.h.apply(this.m()) : ffo.a();
   }

   @Override
   protected boolean e_(eao $$0) {
      return true;
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      eao $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean o(eao $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (ebm<ecb> $$1 : g.values()) {
            if ($$0.c($$1) != ecb.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(din $$0, iv $$1, jb $$2) {
      return $$2 == jb.b ? false : drs.a($$0, $$1, $$2);
   }

   private static eao a(eao $$0, din $$1, iv $$2, boolean $$3) {
      eao $$4 = null;
      eao $$5 = null;
      $$3 |= $$0.c(b);

      for (jb $$6 : jb.c.a) {
         ebm<ecb> $$7 = a($$6);
         ecb $$8 = a($$1, $$2, $$6) ? ($$3 ? ecb.b : $$0.c($$7)) : ecb.a;
         if ($$8 == ecb.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dmo.uf) && $$4.c($$7) != ecb.a && !$$4.c(b)) {
               $$8 = ecb.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dmo.uf) && $$5.c($$7) == ecb.a) {
                  $$8 = ecb.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dji $$0, iv $$1, azv $$2, int $$3) {
      eao $$4 = dmo.uf.m();
      eao $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, $$3);
      eao $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
         eao $$7 = a($$5, $$0, $$1, true);
         $$0.a($$1, $$7, $$3);
      }
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, @Nullable bxj $$3, czk $$4) {
      if (!$$0.C) {
         azv $$5 = $$0.C_();
         eao $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static eao a(din $$0, iv $$1, BooleanSupplier $$2) {
      iv $$3 = $$1.d();
      eao $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dmo.uf);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         eao $$6 = dmo.uf.m().b(b, Boolean.valueOf(false));
         eao $$7 = a($$6, $$0, $$1.d(), true);

         for (jb $$8 : jb.c.a) {
            ebm<ecb> $$9 = a($$8);
            if ($$7.c($$9) != ecb.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, ecb.a);
            }
         }

         return o($$7) && $$7 != $$4 ? $$7 : dmo.a.m();
      } else {
         return dmo.a.m();
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dmo.a.m();
      } else {
         eao $$8 = a($$0, $$1, $$3, false);
         return !o($$8) ? dmo.a.m() : $$8;
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return switch ($$1) {
         case c -> (eao)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (eao)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (eao)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return switch ($$1) {
         case b -> (eao)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (eao)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static ebm<ecb> a(jb $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      eao $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
