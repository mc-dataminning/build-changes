import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class clf {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final buc f = buc.a(5, 16);
   private static final ImmutableList<cid<? extends cic<? super cle>>> g = ImmutableList.of(cid.c, cid.f, cid.t, cid.o);
   private static final ImmutableList<cgw<?>> h = ImmutableList.of(
      cgw.aa, cgw.y, cgw.z, cgw.n, cgw.o, cgw.F, cgw.u, cgw.h, cgw.P, cgw.Q, cgw.R, cgw.S, new cgw[]{cgw.s, cgw.L}
   );

   protected static void a(cle $$0, azx $$1) {
   }

   public static byu.b<cle> a() {
      return byu.a(h, g);
   }

   protected static byu<?> a(byu<cle> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ctr.a));
      $$0.b(ctr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byu<cle> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new ccf(0.8F), new clf.a(4.0F), new car(45, 90), new cav(), new bzr(cgw.Q), new bzr(cgw.R)));
   }

   private static void c(byu<cle> $$0) {
      $$0.a(
         ctr.b,
         ImmutableList.of(
            Pair.of(0, cbl.a(bxc.bT, 6.0F, buc.a(30, 60))),
            Pair.of(1, new bzf(bxc.u)),
            Pair.of(
               2,
               new cbi(
                  ImmutableList.of(Pair.of(new bzy($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(ccy.a(Predicate.not(cle::t), bzi.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new cbc(buc.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new cbi(
                  ImmutableMap.of(cgw.n, cgx.b),
                  ImmutableList.of(
                     Pair.of(ccy.a(Predicate.not(cle::t), cbd.a(2.0F)), 1),
                     Pair.of(ccy.a(Predicate.not(cle::t), cbs.a(2.0F, 3)), 1),
                     Pair.of(new clf.b(20), 1),
                     Pair.of(new bzv(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cle $$0) {
      $$0.ec().a(ImmutableList.of(ctr.b));
   }

   public static Predicate<czy> b() {
      return $$0 -> $$0.a(axm.al);
   }

   public static class a extends bzg<cle> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(ars $$0, cle $$1, long $$2) {
         $$1.gJ();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bzl<cle> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ars $$0, cle $$1) {
         return !$$1.bi() && $$1.gK() >= (long)this.c && !$$1.S_() && $$1.aH() && !$$1.cX() && $$1.gu();
      }

      protected void a(ars $$0, cle $$1, long $$2) {
         if ($$1.gx()) {
            $$1.gI();
         } else if (!$$1.gr()) {
            $$1.gH();
         }
      }
   }
}
