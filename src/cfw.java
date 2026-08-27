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
   private static final bpl f = bpl.a(5, 16);
   private static final ImmutableList<ccy<? extends ccx<? super cfv>>> g = ImmutableList.of(ccy.c, ccy.f, ccy.t, ccy.o);
   private static final ImmutableList<cbr<?>> h = ImmutableList.of(
      cbr.Z, cbr.x, cbr.y, cbr.m, cbr.n, cbr.E, cbr.t, cbr.h, cbr.O, cbr.P, cbr.Q, cbr.R, new cbr[]{cbr.r, cbr.K}
   );

   protected static void a(cfv $$0, ayt $$1) {
   }

   public static btp.b<cfv> a() {
      return btp.a(h, g);
   }

   protected static btp<?> a(btp<cfv> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnq.a));
      $$0.b(cnq.b);
      $$0.f();
      return $$0;
   }

   private static void b(btp<cfv> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bxa(0.8F), new cfw.a(4.0F), new bvm(45, 90), new bvq(), new bum(cbr.P), new bum(cbr.Q)));
   }

   private static void c(btp<cfv> $$0) {
      $$0.a(
         cnq.b,
         ImmutableList.of(
            Pair.of(0, bwg.a(bsb.bE, 6.0F, bpl.a(30, 60))),
            Pair.of(1, new bua(bsb.q)),
            Pair.of(
               2,
               new bwd(
                  ImmutableList.of(Pair.of(new but($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(bxt.a(Predicate.not(cfv::t), bud.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bvx(bpl.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bwd(
                  ImmutableMap.of(cbr.m, cbs.b),
                  ImmutableList.of(
                     Pair.of(bxt.a(Predicate.not(cfv::t), bvy.a(2.0F)), 1),
                     Pair.of(bxt.a(Predicate.not(cfv::t), bwn.a(2.0F, 3)), 1),
                     Pair.of(new cfw.b(20), 1),
                     Pair.of(new buq(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cfv $$0) {
      $$0.dZ().a(ImmutableList.of(cnq.b));
   }

   public static Predicate<cuh> b() {
      return $$0 -> $$0.a(awm.ah);
   }

   public static class a extends bub<cfv> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aqt $$0, cfv $$1, long $$2) {
         $$1.gL();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bug<cfv> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aqt $$0, cfv $$1) {
         return !$$1.bi() && $$1.gM() >= (long)this.c && !$$1.gl() && $$1.aE() && !$$1.cW() && $$1.gy();
      }

      protected void a(aqt $$0, cfv $$1, long $$2) {
         if ($$1.gG()) {
            $$1.gK();
         } else if (!$$1.gv()) {
            $$1.gJ();
         }
      }
   }
}
