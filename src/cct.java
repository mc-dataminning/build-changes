import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cct {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bmn f = bmn.a(5, 16);
   private static final ImmutableList<bzy<? extends bzx<? super ccs>>> g = ImmutableList.of(bzy.c, bzy.f, bzy.t, bzy.o);
   private static final ImmutableList<byr<?>> h = ImmutableList.of(
      byr.Z, byr.x, byr.y, byr.m, byr.n, byr.E, byr.t, byr.h, byr.O, byr.P, byr.Q, byr.R, new byr[]{byr.r, byr.K}
   );

   protected static void a(ccs $$0, axd $$1) {
   }

   public static bqp.b<ccs> a() {
      return bqp.a(h, g);
   }

   protected static bqp<?> a(bqp<ccs> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ckh.a));
      $$0.b(ckh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqp<ccs> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new bua(0.8F), new cct.a(4.0F), new bsm(45, 90), new bsq(), new brm(byr.P), new brm(byr.Q)));
   }

   private static void c(bqp<ccs> $$0) {
      $$0.a(
         ckh.b,
         ImmutableList.of(
            Pair.of(0, btg.a(bpc.bx, 6.0F, bmn.a(30, 60))),
            Pair.of(1, new bra(bpc.o)),
            Pair.of(
               2,
               new btd(
                  ImmutableList.of(Pair.of(new brt($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(but.a(Predicate.not(ccs::s), brd.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bsx(bmn.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new btd(
                  ImmutableMap.of(byr.m, bys.b),
                  ImmutableList.of(
                     Pair.of(but.a(Predicate.not(ccs::s), bsy.a(2.0F)), 1),
                     Pair.of(but.a(Predicate.not(ccs::s), btn.a(2.0F, 3)), 1),
                     Pair.of(new cct.b(20), 1),
                     Pair.of(new brq(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(ccs $$0) {
      $$0.dP().a(ImmutableList.of(ckh.b));
   }

   public static ctk b() {
      return ccs.bX;
   }

   public static class a extends brb<ccs> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(apf $$0, ccs $$1, long $$2) {
         $$1.gA();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends brg<ccs> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(apf $$0, ccs $$1) {
         return !$$1.bc() && $$1.gB() >= (long)this.c && !$$1.gb() && $$1.aC() && !$$1.cO() && $$1.gn();
      }

      protected void a(apf $$0, ccs $$1, long $$2) {
         if ($$1.gv()) {
            $$1.gz();
         } else if (!$$1.gk()) {
            $$1.gy();
         }
      }
   }
}
