import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chv {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final brd f = brd.a(5, 16);
   private static final ImmutableList<cex<? extends cew<? super chu>>> g = ImmutableList.of(cex.c, cex.f, cex.t, cex.o);
   private static final ImmutableList<cdq<?>> h = ImmutableList.of(
      cdq.Z, cdq.x, cdq.y, cdq.m, cdq.n, cdq.E, cdq.t, cdq.h, cdq.O, cdq.P, cdq.Q, cdq.R, new cdq[]{cdq.r, cdq.K}
   );

   protected static void a(chu $$0, azn $$1) {
   }

   public static bvo.b<chu> a() {
      return bvo.a(h, g);
   }

   protected static bvo<?> a(bvo<chu> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cpp.a));
      $$0.b(cpp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvo<chu> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new byz(0.8F), new chv.a(4.0F), new bxl(45, 90), new bxp(), new bwl(cdq.P), new bwl(cdq.Q)));
   }

   private static void c(bvo<chu> $$0) {
      $$0.a(
         cpp.b,
         ImmutableList.of(
            Pair.of(0, byf.a(bty.by, 6.0F, brd.a(30, 60))),
            Pair.of(1, new bvz(bty.o)),
            Pair.of(
               2,
               new byc(
                  ImmutableList.of(Pair.of(new bws($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(bzs.a(Predicate.not(chu::t), bwc.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bxw(brd.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new byc(
                  ImmutableMap.of(cdq.m, cdr.b),
                  ImmutableList.of(
                     Pair.of(bzs.a(Predicate.not(chu::t), bxx.a(2.0F)), 1),
                     Pair.of(bzs.a(Predicate.not(chu::t), bym.a(2.0F, 3)), 1),
                     Pair.of(new chv.b(20), 1),
                     Pair.of(new bwp(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(chu $$0) {
      $$0.dY().a(ImmutableList.of(cpp.b));
   }

   public static Predicate<cvs> b() {
      return $$0 -> $$0.a(axe.ah);
   }

   public static class a extends bwa<chu> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arj $$0, chu $$1, long $$2) {
         $$1.gD();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bwf<chu> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arj $$0, chu $$1) {
         return !$$1.bi() && $$1.gE() >= (long)this.c && !$$1.L_() && $$1.aH() && !$$1.cV() && $$1.go();
      }

      protected void a(arj $$0, chu $$1, long $$2) {
         if ($$1.gr()) {
            $$1.gC();
         } else if (!$$1.gl()) {
            $$1.gB();
         }
      }
   }
}
