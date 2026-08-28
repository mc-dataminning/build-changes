import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjk {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bsj f = bsj.a(5, 16);
   private static final ImmutableList<cgj<? extends cgi<? super cjj>>> g = ImmutableList.of(cgj.c, cgj.f, cgj.t, cgj.o);
   private static final ImmutableList<cfc<?>> h = ImmutableList.of(
      cfc.Z, cfc.x, cfc.y, cfc.m, cfc.n, cfc.E, cfc.t, cfc.h, cfc.O, cfc.P, cfc.Q, cfc.R, new cfc[]{cfc.r, cfc.K}
   );

   protected static void a(cjj $$0, azh $$1) {
   }

   public static bxa.b<cjj> a() {
      return bxa.a(h, g);
   }

   protected static bxa<?> a(bxa<cjj> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cri.a));
      $$0.b(cri.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxa<cjj> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new cal(0.8F), new cjk.a(4.0F), new byx(45, 90), new bzb(), new bxx(cfc.P), new bxx(cfc.Q)));
   }

   private static void c(bxa<cjj> $$0) {
      $$0.a(
         cri.b,
         ImmutableList.of(
            Pair.of(0, bzr.a(bvi.bR, 6.0F, bsj.a(30, 60))),
            Pair.of(1, new bxl(bvi.t)),
            Pair.of(
               2,
               new bzo(
                  ImmutableList.of(Pair.of(new bye($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(cbe.a(Predicate.not(cjj::t), bxo.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bzi(bsj.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bzo(
                  ImmutableMap.of(cfc.m, cfd.b),
                  ImmutableList.of(
                     Pair.of(cbe.a(Predicate.not(cjj::t), bzj.a(2.0F)), 1),
                     Pair.of(cbe.a(Predicate.not(cjj::t), bzy.a(2.0F, 3)), 1),
                     Pair.of(new cjk.b(20), 1),
                     Pair.of(new byb(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cjj $$0) {
      $$0.ea().a(ImmutableList.of(cri.b));
   }

   public static Predicate<cxh> b() {
      return $$0 -> $$0.a(awy.ak);
   }

   public static class a extends bxm<cjj> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(ard $$0, cjj $$1, long $$2) {
         $$1.gH();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bxr<cjj> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ard $$0, cjj $$1) {
         return !$$1.bj() && $$1.gI() >= (long)this.c && !$$1.O_() && $$1.aJ() && !$$1.cW() && $$1.gs();
      }

      protected void a(ard $$0, cjj $$1, long $$2) {
         if ($$1.gv()) {
            $$1.gG();
         } else if (!$$1.gp()) {
            $$1.gF();
         }
      }
   }
}
