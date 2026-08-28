import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dpl extends dkl implements dko {
   public static final MapCodec<dpl> a = b(dpl::new);
   public static final dyl b = dyk.b;
   private static final dyr<dzf> c = dyk.Y;
   private static final dyr<dzf> d = dyk.X;
   private static final dyr<dzf> e = dyk.Z;
   private static final dyr<dzf> f = dyk.aa;
   private static final Map<jm, dyr<dzf>> g = ImmutableMap.copyOf(ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, c);
      $$0.put(jm.f, d);
      $$0.put(jm.d, e);
      $$0.put(jm.e, f);
   }));
   private static final float h = 1.0F;
   private static final fcr i = dkl.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fcr j = dkl.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcr k = dkl.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcr l = dkl.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcr m = dkl.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final int n = 10;
   private static final fcr o = dkl.a(0.0, 0.0, 0.0, 1.0, 10.0, 16.0);
   private static final fcr G = dkl.a(15.0, 0.0, 0.0, 16.0, 10.0, 16.0);
   private static final fcr H = dkl.a(0.0, 0.0, 0.0, 16.0, 10.0, 1.0);
   private static final fcr I = dkl.a(0.0, 0.0, 15.0, 16.0, 10.0, 16.0);
   private final Map<dxu, fcr> J;

   @Override
   public MapCodec<dpl> a() {
      return a;
   }

   public dpl(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(c, dzf.a).b(d, dzf.a).b(e, dzf.a).b(f, dzf.a));
      this.J = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dpl::o)));
   }

   @Override
   protected fcr d_(dxu $$0) {
      return fco.a();
   }

   private static fcr o(dxu $$0) {
      fcr $$1 = fco.a();
      if ($$0.c(b)) {
         $$1 = i;
      }
      $$1 = switch ((dzf)$$0.c(c)) {
         case a -> $$1;
         case b -> fco.a($$1, H);
         case c -> fco.a($$1, l);
      };

      $$1 = switch ((dzf)$$0.c(e)) {
         case a -> $$1;
         case b -> fco.a($$1, I);
         case c -> fco.a($$1, m);
      };

      $$1 = switch ((dzf)$$0.c(d)) {
         case a -> $$1;
         case b -> fco.a($$1, G);
         case c -> fco.a($$1, k);
      };

      $$1 = switch ((dzf)$$0.c(f)) {
         case a -> $$1;
         case b -> fco.a($$1, o);
         case c -> fco.a($$1, j);
      };
      return $$1.c() ? fco.b() : $$1;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.J.get($$0);
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return $$0.c(b) ? i : fco.a();
   }

   @Override
   protected boolean e_(dxu $$0) {
      return true;
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      dxu $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean q(dxu $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (dyr<dzf> $$1 : g.values()) {
            if ($$0.c($$1) != dzf.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dgm $$0, jh $$1, jm $$2) {
      if ($$2 == jm.b) {
         return false;
      } else {
         jh $$3 = $$1.a($$2);
         return dpn.a($$0, $$2, $$3, $$0.a_($$3));
      }
   }

   private static dxu a(dxu $$0, dgm $$1, jh $$2, boolean $$3) {
      dxu $$4 = null;
      dxu $$5 = null;
      $$3 |= $$0.c(b);

      for (jm $$6 : jm.c.a) {
         dyr<dzf> $$7 = a($$6);
         dzf $$8 = a($$1, $$2, $$6) ? ($$3 ? dzf.b : $$0.c($$7)) : dzf.a;
         if ($$8 == dzf.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dkn.tQ) && $$4.c($$7) != dzf.a && !$$4.c(b)) {
               $$8 = dzf.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dkn.tQ) && $$5.c($$7) == dzf.a) {
                  $$8 = dzf.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dhi $$0, jh $$1, bam $$2, int $$3) {
      dxu $$4 = dkn.tQ.m();
      dxu $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, 3);
      dxu $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
      }
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, @Nullable bwf $$3, cxo $$4) {
      if (!$$0.C) {
         bam $$5 = $$0.H_();
         dxu $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dxu a(dgm $$0, jh $$1, BooleanSupplier $$2) {
      jh $$3 = $$1.d();
      dxu $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dkn.tQ);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dxu $$6 = dkn.tQ.m().b(b, Boolean.valueOf(false));
         dxu $$7 = a($$6, $$0, $$1.d(), true);

         for (jm $$8 : jm.c.a) {
            dyr<dzf> $$9 = a($$8);
            if ($$7.c($$9) != dzf.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, dzf.a);
            }
         }

         return q($$7) && $$7 != $$4 ? $$7 : dkn.a.m();
      } else {
         return dkn.a.m();
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkn.a.m();
      } else {
         dxu $$8 = a($$0, $$1, $$3, false);
         return !q($$8) ? dkn.a.m() : $$8;
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return switch ($$1) {
         case c -> (dxu)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dxu)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dxu)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return switch ($$1) {
         case b -> (dxu)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dxu)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static dyr<dzf> a(jm $$0) {
      return g.get($$0);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return $$2.c(b);
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return !a($$0, $$2, () -> true).l();
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      dxu $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
