import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cio {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final brt f = brt.a(5, 16);
   private static final ImmutableList<cfq<? extends cfp<? super cin>>> g = ImmutableList.of(cfq.c, cfq.f, cfq.t, cfq.o);
   private static final ImmutableList<cej<?>> h = ImmutableList.of(
      cej.Z, cej.x, cej.y, cej.m, cej.n, cej.E, cej.t, cej.h, cej.O, cej.P, cej.Q, cej.R, new cej[]{cej.r, cej.K}
   );

   protected static void a(cin $$0, azg $$1) {
   }

   public static bwh.b<cin> a() {
      return bwh.a(h, g);
   }

   protected static bwh<?> a(bwh<cin> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqm.a));
      $$0.b(cqm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwh<cin> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bzs(0.8F), new cio.a(4.0F), new bye(45, 90), new byi(), new bxe(cej.P), new bxe(cej.Q)));
   }

   private static void c(bwh<cin> $$0) {
      $$0.a(
         cqm.b,
         ImmutableList.of(
            Pair.of(0, byy.a(buq.bR, 6.0F, brt.a(30, 60))),
            Pair.of(1, new bws(buq.t)),
            Pair.of(
               2,
               new byv(
                  ImmutableList.of(Pair.of(new bxl($$0x -> 2.5F, $$0x -> $$0x.e_() ? 2.5 : 3.5), 1), Pair.of(cal.a(Predicate.not(cin::t), bwv.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new byp(brt.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new byv(
                  ImmutableMap.of(cej.m, cek.b),
                  ImmutableList.of(
                     Pair.of(cal.a(Predicate.not(cin::t), byq.a(2.0F)), 1),
                     Pair.of(cal.a(Predicate.not(cin::t), bzf.a(2.0F, 3)), 1),
                     Pair.of(new cio.b(20), 1),
                     Pair.of(new bxi(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cin $$0) {
      $$0.ec().a(ImmutableList.of(cqm.b));
   }

   public static Predicate<cwn> b() {
      return $$0 -> $$0.a(awx.ak);
   }

   public static class a extends bwt<cin> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arc $$0, cin $$1, long $$2) {
         $$1.gE();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bwy<cin> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arc $$0, cin $$1) {
         return !$$1.bj() && $$1.gF() >= (long)this.c && !$$1.P_() && $$1.aJ() && !$$1.cY() && $$1.gp();
      }

      protected void a(arc $$0, cin $$1, long $$2) {
         if ($$1.gs()) {
            $$1.gD();
         } else if (!$$1.gm()) {
            $$1.gC();
         }
      }
   }
}
