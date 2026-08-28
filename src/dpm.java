import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dpm extends dkm implements dkp {
   public static final MapCodec<dpm> a = b(dpm::new);
   public static final dym b = dyl.b;
   private static final dys<dzg> c = dyl.Y;
   private static final dys<dzg> d = dyl.X;
   private static final dys<dzg> e = dyl.Z;
   private static final dys<dzg> f = dyl.aa;
   private static final Map<jm, dys<dzg>> g = ImmutableMap.copyOf(ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, c);
      $$0.put(jm.f, d);
      $$0.put(jm.d, e);
      $$0.put(jm.e, f);
   }));
   private static final float h = 1.0F;
   private static final fcs i = dkm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fcs j = dkm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcs k = dkm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcs l = dkm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcs m = dkm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final int n = 10;
   private static final fcs o = dkm.a(0.0, 0.0, 0.0, 1.0, 10.0, 16.0);
   private static final fcs G = dkm.a(15.0, 0.0, 0.0, 16.0, 10.0, 16.0);
   private static final fcs H = dkm.a(0.0, 0.0, 0.0, 16.0, 10.0, 1.0);
   private static final fcs I = dkm.a(0.0, 0.0, 15.0, 16.0, 10.0, 16.0);
   private final Map<dxv, fcs> J;

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(c, dzg.a).b(d, dzg.a).b(e, dzg.a).b(f, dzg.a));
      this.J = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dpm::o)));
   }

   @Override
   protected fcs d_(dxv $$0) {
      return fcp.a();
   }

   private static fcs o(dxv $$0) {
      fcs $$1 = fcp.a();
      if ($$0.c(b)) {
         $$1 = i;
      }
      $$1 = switch ((dzg)$$0.c(c)) {
         case a -> $$1;
         case b -> fcp.a($$1, H);
         case c -> fcp.a($$1, l);
      };

      $$1 = switch ((dzg)$$0.c(e)) {
         case a -> $$1;
         case b -> fcp.a($$1, I);
         case c -> fcp.a($$1, m);
      };

      $$1 = switch ((dzg)$$0.c(d)) {
         case a -> $$1;
         case b -> fcp.a($$1, G);
         case c -> fcp.a($$1, k);
      };

      $$1 = switch ((dzg)$$0.c(f)) {
         case a -> $$1;
         case b -> fcp.a($$1, o);
         case c -> fcp.a($$1, j);
      };
      return $$1.c() ? fcp.b() : $$1;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.J.get($$0);
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return $$0.c(b) ? i : fcp.a();
   }

   @Override
   protected boolean e_(dxv $$0) {
      return true;
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      dxv $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean q(dxv $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (dys<dzg> $$1 : g.values()) {
            if ($$0.c($$1) != dzg.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dgn $$0, jh $$1, jm $$2) {
      if ($$2 == jm.b) {
         return false;
      } else {
         jh $$3 = $$1.a($$2);
         return dpo.a($$0, $$2, $$3, $$0.a_($$3));
      }
   }

   private static dxv a(dxv $$0, dgn $$1, jh $$2, boolean $$3) {
      dxv $$4 = null;
      dxv $$5 = null;
      $$3 |= $$0.c(b);

      for (jm $$6 : jm.c.a) {
         dys<dzg> $$7 = a($$6);
         dzg $$8 = a($$1, $$2, $$6) ? ($$3 ? dzg.b : $$0.c($$7)) : dzg.a;
         if ($$8 == dzg.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dko.tQ) && $$4.c($$7) != dzg.a && !$$4.c(b)) {
               $$8 = dzg.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dko.tQ) && $$5.c($$7) == dzg.a) {
                  $$8 = dzg.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dhj $$0, jh $$1, bam $$2, int $$3) {
      dxv $$4 = dko.tQ.m();
      dxv $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, 3);
      dxv $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
      }
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, @Nullable bwg $$3, cxp $$4) {
      if (!$$0.C) {
         bam $$5 = $$0.H_();
         dxv $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dxv a(dgn $$0, jh $$1, BooleanSupplier $$2) {
      jh $$3 = $$1.d();
      dxv $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dko.tQ);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dxv $$6 = dko.tQ.m().b(b, Boolean.valueOf(false));
         dxv $$7 = a($$6, $$0, $$1.d(), true);

         for (jm $$8 : jm.c.a) {
            dys<dzg> $$9 = a($$8);
            if ($$7.c($$9) != dzg.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, dzg.a);
            }
         }

         return q($$7) && $$7 != $$4 ? $$7 : dko.a.m();
      } else {
         return dko.a.m();
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if (!$$0.a($$1, $$3)) {
         return dko.a.m();
      } else {
         dxv $$8 = a($$0, $$1, $$3, false);
         return !q($$8) ? dko.a.m() : $$8;
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return switch ($$1) {
         case c -> (dxv)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dxv)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dxv)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return switch ($$1) {
         case b -> (dxv)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dxv)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static dys<dzg> a(jm $$0) {
      return g.get($$0);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return $$2.c(b);
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return !a($$0, $$2, () -> true).l();
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      dxv $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
