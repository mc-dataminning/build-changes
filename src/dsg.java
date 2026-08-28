import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsg extends dnc implements dnf {
   public static final MapCodec<dsg> a = b(dsg::new);
   public static final ebv b = ebu.d;
   public static final ecc<ecr> c = ebu.aa;
   public static final ecc<ecr> d = ebu.Z;
   public static final ecc<ecr> e = ebu.ab;
   public static final ecc<ecr> f = ebu.ac;
   public static final Map<jb, ecc<ecr>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jb.c, c, jb.f, d, jb.d, e, jb.e, f)));
   private final Function<ebe, fgk> h;

   @Override
   public MapCodec<dsg> a() {
      return a;
   }

   public dsg(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, ecr.a).b(d, ecr.a).b(e, ecr.a).b(f, ecr.a));
      this.h = this.b();
   }

   @Override
   protected fgk d_(ebe $$0) {
      return fgh.a();
   }

   public Function<ebe, fgk> b() {
      Map<jb, fgk> $$0 = fgh.c(dnc.a(16.0, 0.0, 10.0, 0.0, 1.0));
      Map<jb, fgk> $$1 = fgh.d(dnc.c(16.0, 0.0, 1.0));
      return this.a($$2 -> {
         fgk $$3 = $$2.c(b) ? $$1.get(jb.a) : fgh.a();

         for (Entry<jb, ecc<ecr>> $$4 : g.entrySet()) {
            switch ((ecr)$$2.c($$4.getValue())) {
               case a:
               default:
                  break;
               case b:
                  $$3 = fgh.a($$3, $$0.get($$4.getKey()));
                  break;
               case c:
                  $$3 = fgh.a($$3, $$1.get($$4.getKey()));
            }
         }

         return $$3.c() ? fgh.b() : $$3;
      });
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return $$0.c(b) ? this.h.apply(this.m()) : fgh.a();
   }

   @Override
   protected boolean e_(ebe $$0) {
      return true;
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean o(ebe $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (ecc<ecr> $$1 : g.values()) {
            if ($$0.c($$1) != ecr.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(djb $$0, iv $$1, jb $$2) {
      return $$2 == jb.b ? false : dsi.a($$0, $$1, $$2);
   }

   private static ebe a(ebe $$0, djb $$1, iv $$2, boolean $$3) {
      ebe $$4 = null;
      ebe $$5 = null;
      $$3 |= $$0.c(b);

      for (jb $$6 : jb.c.a) {
         ecc<ecr> $$7 = a($$6);
         ecr $$8 = a($$1, $$2, $$6) ? ($$3 ? ecr.b : $$0.c($$7)) : ecr.a;
         if ($$8 == ecr.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dne.uf) && $$4.c($$7) != ecr.a && !$$4.c(b)) {
               $$8 = ecr.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dne.uf) && $$5.c($$7) == ecr.a) {
                  $$8 = ecr.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(djy $$0, iv $$1, azx $$2, int $$3) {
      ebe $$4 = dne.uf.m();
      ebe $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, $$3);
      ebe $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
         ebe $$7 = a($$5, $$0, $$1, true);
         $$0.a($$1, $$7, $$3);
      }
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, @Nullable bxu $$3, czy $$4) {
      if (!$$0.C) {
         azx $$5 = $$0.G_();
         ebe $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static ebe a(djb $$0, iv $$1, BooleanSupplier $$2) {
      iv $$3 = $$1.d();
      ebe $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dne.uf);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         ebe $$6 = dne.uf.m().b(b, Boolean.valueOf(false));
         ebe $$7 = a($$6, $$0, $$1.d(), true);

         for (jb $$8 : jb.c.a) {
            ecc<ecr> $$9 = a($$8);
            if ($$7.c($$9) != ecr.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, ecr.a);
            }
         }

         return o($$7) && $$7 != $$4 ? $$7 : dne.a.m();
      } else {
         return dne.a.m();
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (!$$0.a($$1, $$3)) {
         return dne.a.m();
      } else {
         ebe $$8 = a($$0, $$1, $$3, false);
         return !o($$8) ? dne.a.m() : $$8;
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return switch ($$1) {
         case c -> (ebe)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (ebe)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (ebe)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return switch ($$1) {
         case b -> (ebe)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (ebe)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static ecc<ecr> a(jb $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      ebe $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
