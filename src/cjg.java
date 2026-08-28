import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjg {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bsl f = bsl.a(5, 16);
   private static final ImmutableList<cgi<? extends cgh<? super cjf>>> g = ImmutableList.of(cgi.c, cgi.f, cgi.t, cgi.o);
   private static final ImmutableList<cfb<?>> h = ImmutableList.of(
      cfb.Z, cfb.x, cfb.y, cfb.m, cfb.n, cfb.E, cfb.t, cfb.h, cfb.O, cfb.P, cfb.Q, cfb.R, new cfb[]{cfb.r, cfb.K}
   );

   protected static void a(cjf $$0, bac $$1) {
   }

   public static bwz.b<cjf> a() {
      return bwz.a(h, g);
   }

   protected static bwz<?> a(bwz<cjf> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crf.a));
      $$0.b(crf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwz<cjf> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new cak(0.8F), new cjg.a(4.0F), new byw(45, 90), new bza(), new bxw(cfb.P), new bxw(cfb.Q)));
   }

   private static void c(bwz<cjf> $$0) {
      $$0.a(
         crf.b,
         ImmutableList.of(
            Pair.of(0, bzq.a(bvi.bS, 6.0F, bsl.a(30, 60))),
            Pair.of(1, new bxk(bvi.t)),
            Pair.of(
               2,
               new bzn(
                  ImmutableList.of(Pair.of(new byd($$0x -> 2.5F, $$0x -> $$0x.e_() ? 2.5 : 3.5), 1), Pair.of(cbd.a(Predicate.not(cjf::t), bxn.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bzh(bsl.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bzn(
                  ImmutableMap.of(cfb.m, cfc.b),
                  ImmutableList.of(
                     Pair.of(cbd.a(Predicate.not(cjf::t), bzi.a(2.0F)), 1),
                     Pair.of(cbd.a(Predicate.not(cjf::t), bzx.a(2.0F, 3)), 1),
                     Pair.of(new cjg.b(20), 1),
                     Pair.of(new bya(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cjf $$0) {
      $$0.ec().a(ImmutableList.of(crf.b));
   }

   public static Predicate<cxg> b() {
      return $$0 -> $$0.a(axt.am);
   }

   public static class a extends bxl<cjf> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arx $$0, cjf $$1, long $$2) {
         $$1.gD();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bxq<cjf> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arx $$0, cjf $$1) {
         return !$$1.bj() && $$1.gE() >= (long)this.c && !$$1.P_() && $$1.aJ() && !$$1.cY() && $$1.go();
      }

      protected void a(arx $$0, cjf $$1, long $$2) {
         if ($$1.gr()) {
            $$1.gC();
         } else if (!$$1.gl()) {
            $$1.gB();
         }
      }
   }
}
