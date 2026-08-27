import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cfw {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bpf f = bpf.a(5, 16);
   private static final ImmutableList<ccz<? extends ccy<? super cfv>>> g = ImmutableList.of(ccz.c, ccz.f, ccz.t, ccz.o);
   private static final ImmutableList<cbs<?>> h = ImmutableList.of(
      cbs.Z, cbs.x, cbs.y, cbs.m, cbs.n, cbs.E, cbs.t, cbs.h, cbs.O, cbs.P, cbs.Q, cbs.R, new cbs[]{cbs.r, cbs.K}
   );

   protected static void a(cfv $$0, ayk $$1) {
   }

   public static btq.b<cfv> a() {
      return btq.a(h, g);
   }

   protected static btq<?> a(btq<cfv> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnl.a));
      $$0.b(cnl.b);
      $$0.f();
      return $$0;
   }

   private static void b(btq<cfv> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new bxb(0.8F), new cfw.a(4.0F), new bvn(45, 90), new bvr(), new bun(cbs.P), new bun(cbs.Q)));
   }

   private static void c(btq<cfv> $$0) {
      $$0.a(
         cnl.b,
         ImmutableList.of(
            Pair.of(0, bwh.a(bsa.by, 6.0F, bpf.a(30, 60))),
            Pair.of(1, new bub(bsa.o)),
            Pair.of(
               2,
               new bwe(
                  ImmutableList.of(Pair.of(new buu($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(bxu.a(Predicate.not(cfv::u), bue.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bvy(bpf.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bwe(
                  ImmutableMap.of(cbs.m, cbt.b),
                  ImmutableList.of(
                     Pair.of(bxu.a(Predicate.not(cfv::u), bvz.a(2.0F)), 1),
                     Pair.of(bxu.a(Predicate.not(cfv::u), bwo.a(2.0F, 3)), 1),
                     Pair.of(new cfw.b(20), 1),
                     Pair.of(new bur(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cfv $$0) {
      $$0.dS().a(ImmutableList.of(cnl.b));
   }

   public static Predicate<cto> b() {
      return $$0 -> $$0.a(awe.ah);
   }

   public static class a extends buc<cfv> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aqm $$0, cfv $$1, long $$2) {
         $$1.gC();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends buh<cfv> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aqm $$0, cfv $$1) {
         return !$$1.be() && $$1.gD() >= (long)this.c && !$$1.gc() && $$1.aE() && !$$1.cR() && $$1.gp();
      }

      protected void a(aqm $$0, cfv $$1, long $$2) {
         if ($$1.gx()) {
            $$1.gB();
         } else if (!$$1.gm()) {
            $$1.gA();
         }
      }
   }
}
