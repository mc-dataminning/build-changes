import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dpd extends dkd implements dkg {
   public static final MapCodec<dpd> a = b(dpd::new);
   public static final dyf b = dye.e;
   private static final dyl<dyz> c = dye.aa;
   private static final dyl<dyz> d = dye.Z;
   private static final dyl<dyz> e = dye.ab;
   private static final dyl<dyz> f = dye.ac;
   private static final Map<jm, dyl<dyz>> g = ImmutableMap.copyOf(ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, c);
      $$0.put(jm.f, d);
      $$0.put(jm.d, e);
      $$0.put(jm.e, f);
   }));
   private static final float h = 1.0F;
   private static final fcl i = dkd.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fcl j = dkd.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcl k = dkd.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcl l = dkd.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcl m = dkd.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final int n = 10;
   private static final fcl o = dkd.a(0.0, 0.0, 0.0, 1.0, 10.0, 16.0);
   private static final fcl G = dkd.a(15.0, 0.0, 0.0, 16.0, 10.0, 16.0);
   private static final fcl H = dkd.a(0.0, 0.0, 0.0, 16.0, 10.0, 1.0);
   private static final fcl I = dkd.a(0.0, 0.0, 15.0, 16.0, 10.0, 16.0);
   private final Map<dxo, fcl> J;

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   public dpd(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(c, dyz.a).b(d, dyz.a).b(e, dyz.a).b(f, dyz.a));
      this.J = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dpd::o)));
   }

   @Override
   protected fcl d_(dxo $$0) {
      return fci.a();
   }

   private static fcl o(dxo $$0) {
      fcl $$1 = fci.a();
      if ($$0.c(b)) {
         $$1 = i;
      }
      $$1 = switch ((dyz)$$0.c(c)) {
         case a -> $$1;
         case b -> fci.a($$1, H);
         case c -> fci.a($$1, l);
      };

      $$1 = switch ((dyz)$$0.c(e)) {
         case a -> $$1;
         case b -> fci.a($$1, I);
         case c -> fci.a($$1, m);
      };

      $$1 = switch ((dyz)$$0.c(d)) {
         case a -> $$1;
         case b -> fci.a($$1, G);
         case c -> fci.a($$1, k);
      };

      $$1 = switch ((dyz)$$0.c(f)) {
         case a -> $$1;
         case b -> fci.a($$1, o);
         case c -> fci.a($$1, j);
      };
      return $$1.c() ? fci.b() : $$1;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.J.get($$0);
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return $$0.c(b) ? i : fci.a();
   }

   @Override
   protected boolean e_(dxo $$0) {
      return true;
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      dxo $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean q(dxo $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (dyl<dyz> $$1 : g.values()) {
            if ($$0.c($$1) != dyz.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dge $$0, jh $$1, jm $$2) {
      return $$2 == jm.b ? false : dpf.a($$0, $$1, $$2);
   }

   private static dxo a(dxo $$0, dge $$1, jh $$2, boolean $$3) {
      dxo $$4 = null;
      dxo $$5 = null;
      $$3 |= $$0.c(b);

      for (jm $$6 : jm.c.a) {
         dyl<dyz> $$7 = a($$6);
         dyz $$8 = a($$1, $$2, $$6) ? ($$3 ? dyz.b : $$0.c($$7)) : dyz.a;
         if ($$8 == dyz.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dkf.tX) && $$4.c($$7) != dyz.a && !$$4.c(b)) {
               $$8 = dyz.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dkf.tX) && $$5.c($$7) == dyz.a) {
                  $$8 = dyz.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dha $$0, jh $$1, bac $$2, int $$3) {
      dxo $$4 = dkf.tX.m();
      dxo $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, 3);
      dxo $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
      }
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, @Nullable bvx $$3, cxg $$4) {
      if (!$$0.C) {
         bac $$5 = $$0.H_();
         dxo $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dxo a(dge $$0, jh $$1, BooleanSupplier $$2) {
      jh $$3 = $$1.d();
      dxo $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dkf.tX);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dxo $$6 = dkf.tX.m().b(b, Boolean.valueOf(false));
         dxo $$7 = a($$6, $$0, $$1.d(), true);

         for (jm $$8 : jm.c.a) {
            dyl<dyz> $$9 = a($$8);
            if ($$7.c($$9) != dyz.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, dyz.a);
            }
         }

         return q($$7) && $$7 != $$4 ? $$7 : dkf.a.m();
      } else {
         return dkf.a.m();
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkf.a.m();
      } else {
         dxo $$8 = a($$0, $$1, $$3, false);
         return !q($$8) ? dkf.a.m() : $$8;
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return switch ($$1) {
         case c -> (dxo)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dxo)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dxo)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return switch ($$1) {
         case b -> (dxo)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dxo)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static dyl<dyz> a(jm $$0) {
      return g.get($$0);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      dxo $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
