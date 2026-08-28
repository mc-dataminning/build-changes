import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgx {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bqf f = bqf.a(5, 16);
   private static final ImmutableList<cea<? extends cdz<? super cgw>>> g = ImmutableList.of(cea.c, cea.f, cea.t, cea.o);
   private static final ImmutableList<cct<?>> h = ImmutableList.of(
      cct.Z, cct.x, cct.y, cct.m, cct.n, cct.E, cct.t, cct.h, cct.O, cct.P, cct.Q, cct.R, new cct[]{cct.r, cct.K}
   );

   protected static void a(cgw $$0, azh $$1) {
   }

   public static bur.b<cgw> a() {
      return bur.a(h, g);
   }

   protected static bur<?> a(bur<cgw> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(bur<cgw> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byc(0.8F), new cgx.a(4.0F), new bwo(45, 90), new bws(), new bvo(cct.P), new bvo(cct.Q)));
   }

   private static void c(bur<cgw> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxi.a(bta.by, 6.0F, bqf.a(30, 60))),
            Pair.of(1, new bvc(bta.o)),
            Pair.of(
               2,
               new bxf(
                  ImmutableList.of(Pair.of(new bvv($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(byv.a(Predicate.not(cgw::u), bvf.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bwz(bqf.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bxf(
                  ImmutableMap.of(cct.m, ccu.b),
                  ImmutableList.of(
                     Pair.of(byv.a(Predicate.not(cgw::u), bxa.a(2.0F)), 1),
                     Pair.of(byv.a(Predicate.not(cgw::u), bxp.a(2.0F, 3)), 1),
                     Pair.of(new cgx.b(20), 1),
                     Pair.of(new bvs(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cgw $$0) {
      $$0.dS().a(ImmutableList.of(com.b));
   }

   public static Predicate<cup> b() {
      return $$0 -> $$0.a(awy.ah);
   }

   public static class a extends bvd<cgw> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arf $$0, cgw $$1, long $$2) {
         $$1.gD();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bvi<cgw> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arf $$0, cgw $$1) {
         return !$$1.be() && $$1.gE() >= (long)this.c && !$$1.gd() && $$1.aE() && !$$1.cR() && $$1.gq();
      }

      protected void a(arf $$0, cgw $$1, long $$2) {
         if ($$1.gy()) {
            $$1.gC();
         } else if (!$$1.gn()) {
            $$1.gB();
         }
      }
   }
}
