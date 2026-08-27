import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cfy {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bph f = bph.a(5, 16);
   private static final ImmutableList<cdb<? extends cda<? super cfx>>> g = ImmutableList.of(cdb.c, cdb.f, cdb.t, cdb.o);
   private static final ImmutableList<cbu<?>> h = ImmutableList.of(
      cbu.Z, cbu.x, cbu.y, cbu.m, cbu.n, cbu.E, cbu.t, cbu.h, cbu.O, cbu.P, cbu.Q, cbu.R, new cbu[]{cbu.r, cbu.K}
   );

   protected static void a(cfx $$0, aym $$1) {
   }

   public static bts.b<cfx> a() {
      return bts.a(h, g);
   }

   protected static bts<?> a(bts<cfx> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnn.a));
      $$0.b(cnn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bts<cfx> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bxd(0.8F), new cfy.a(4.0F), new bvp(45, 90), new bvt(), new bup(cbu.P), new bup(cbu.Q)));
   }

   private static void c(bts<cfx> $$0) {
      $$0.a(
         cnn.b,
         ImmutableList.of(
            Pair.of(0, bwj.a(bsc.by, 6.0F, bph.a(30, 60))),
            Pair.of(1, new bud(bsc.o)),
            Pair.of(
               2,
               new bwg(
                  ImmutableList.of(Pair.of(new buw($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(bxw.a(Predicate.not(cfx::u), bug.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bwa(bph.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bwg(
                  ImmutableMap.of(cbu.m, cbv.b),
                  ImmutableList.of(
                     Pair.of(bxw.a(Predicate.not(cfx::u), bwb.a(2.0F)), 1),
                     Pair.of(bxw.a(Predicate.not(cfx::u), bwq.a(2.0F, 3)), 1),
                     Pair.of(new cfy.b(20), 1),
                     Pair.of(new but(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cfx $$0) {
      $$0.dS().a(ImmutableList.of(cnn.b));
   }

   public static Predicate<ctq> b() {
      return $$0 -> $$0.a(awf.ah);
   }

   public static class a extends bue<cfx> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aqn $$0, cfx $$1, long $$2) {
         $$1.gC();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends buj<cfx> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aqn $$0, cfx $$1) {
         return !$$1.be() && $$1.gD() >= (long)this.c && !$$1.gc() && $$1.aE() && !$$1.cR() && $$1.gp();
      }

      protected void a(aqn $$0, cfx $$1, long $$2) {
         if ($$1.gx()) {
            $$1.gB();
         } else if (!$$1.gm()) {
            $$1.gA();
         }
      }
   }
}
