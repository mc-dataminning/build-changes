import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dpe extends dke implements dkh {
   public static final MapCodec<dpe> a = b(dpe::new);
   public static final dye b = dyd.b;
   private static final dyk<dyy> c = dyd.Y;
   private static final dyk<dyy> d = dyd.X;
   private static final dyk<dyy> e = dyd.Z;
   private static final dyk<dyy> f = dyd.aa;
   private static final Map<jm, dyk<dyy>> g = ImmutableMap.copyOf(ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, c);
      $$0.put(jm.f, d);
      $$0.put(jm.d, e);
      $$0.put(jm.e, f);
   }));
   private static final float h = 1.0F;
   private static final fcm i = dke.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fcm j = dke.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcm k = dke.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcm l = dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcm m = dke.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final int n = 10;
   private static final fcm o = dke.a(0.0, 0.0, 0.0, 1.0, 10.0, 16.0);
   private static final fcm G = dke.a(15.0, 0.0, 0.0, 16.0, 10.0, 16.0);
   private static final fcm H = dke.a(0.0, 0.0, 0.0, 16.0, 10.0, 1.0);
   private static final fcm I = dke.a(0.0, 0.0, 15.0, 16.0, 10.0, 16.0);
   private final Map<dxn, fcm> J;

   @Override
   public MapCodec<dpe> a() {
      return a;
   }

   public dpe(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, dyy.a).b(d, dyy.a).b(e, dyy.a).b(f, dyy.a));
      this.J = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dpe::o)));
   }

   @Override
   protected fcm d_(dxn $$0) {
      return fcj.a();
   }

   private static fcm o(dxn $$0) {
      fcm $$1 = fcj.a();
      if ($$0.c(b)) {
         $$1 = i;
      }
      $$1 = switch ((dyy)$$0.c(c)) {
         case a -> $$1;
         case b -> fcj.a($$1, H);
         case c -> fcj.a($$1, l);
      };

      $$1 = switch ((dyy)$$0.c(e)) {
         case a -> $$1;
         case b -> fcj.a($$1, I);
         case c -> fcj.a($$1, m);
      };

      $$1 = switch ((dyy)$$0.c(d)) {
         case a -> $$1;
         case b -> fcj.a($$1, G);
         case c -> fcj.a($$1, k);
      };

      $$1 = switch ((dyy)$$0.c(f)) {
         case a -> $$1;
         case b -> fcj.a($$1, o);
         case c -> fcj.a($$1, j);
      };
      return $$1.c() ? fcj.b() : $$1;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.J.get($$0);
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return $$0.c(b) ? i : fcj.a();
   }

   @Override
   protected boolean e_(dxn $$0) {
      return true;
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return !$$1.u($$2.e());
   }

   private static boolean q(dxn $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (dyk<dyy> $$1 : g.values()) {
            if ($$0.c($$1) != dyy.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dgf $$0, jh $$1, jm $$2) {
      if ($$2 == jm.b) {
         return false;
      } else {
         jh $$3 = $$1.a($$2);
         return dpg.a($$0, $$2, $$3, $$0.a_($$3));
      }
   }

   private static dxn a(dxn $$0, dgf $$1, jh $$2, boolean $$3) {
      dxn $$4 = null;
      dxn $$5 = null;
      $$3 |= $$0.c(b);

      for (jm $$6 : jm.c.a) {
         dyk<dyy> $$7 = a($$6);
         dyy $$8 = a($$1, $$2, $$6) ? ($$3 ? dyy.b : $$0.c($$7)) : dyy.a;
         if ($$8 == dyy.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dkg.tQ) && $$4.c($$7) != dyy.a && !$$4.c(b)) {
               $$8 = dyy.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dkg.tQ) && $$5.c($$7) == dyy.a) {
                  $$8 = dyy.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      return a(this.m().b(b, Boolean.valueOf(true)), $$0.q(), $$0.a(), true);
   }

   public static void a(dhb $$0, jh $$1, bam $$2, int $$3) {
      dxn $$4 = dkg.tQ.m().b(b, Boolean.valueOf(true));
      dxn $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, 3);
      dxn $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
      }
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, @Nullable bwb $$3, cxk $$4) {
      if (!$$0.C) {
         bam $$5 = $$0.H_();
         dxn $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dxn a(dgf $$0, jh $$1, BooleanSupplier $$2) {
      jh $$3 = $$1.d();
      dxn $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dkg.tQ);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dxn $$6 = dkg.tQ.m();
         dxn $$7 = a($$6, $$0, $$1.d(), true);

         for (jm $$8 : jm.c.a) {
            dyk<dyy> $$9 = a($$8);
            if ($$7.c($$9) != dyy.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, dyy.a);
            }
         }

         return q($$7) && $$7 != $$4 ? $$7 : dkg.a.m();
      } else {
         return dkg.a.m();
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         dxn $$8 = a($$0, $$1, $$3, false);
         return !q($$8) ? dkg.a.m() : $$8;
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return switch ($$1) {
         case c -> (dxn)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dxn)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dxn)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return switch ($$1) {
         case b -> (dxn)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dxn)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static dyk<dyy> a(jm $$0) {
      return g.get($$0);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return $$2.c(b);
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return !a($$0, $$2, () -> true).l();
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      dxn $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
