import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgt {
   public static final int a = 20;
   public static final int b = 7;
   private static final bps i = bps.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bps o = bps.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bps p = bps.a(600, 6000);
   private static final bps q = bps.a(100, 300);
   private static final cdt r = cdt.a().a($$0 -> !$$0.am().equals(bsn.X) && $$0.dR().C_().a($$0.cM()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cgs $$0, ayo $$1) {
      $$0.dV().a(ccg.S, o.a($$1));
      $$0.dV().a(ccg.V, p.a($$1));
   }

   protected static bue<?> a(bue<cgs> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(coa.a));
      $$0.b(coa.b);
      $$0.f();
      return $$0;
   }

   private static void b(bue<cgs> $$0) {
      $$0.a(coa.a, 0, ImmutableList.of(new bxp(0.8F), new buq(2.0F), new bwb(45, 90), new bwf(), new bvb(ccg.P), new bvb(ccg.S), new bvb(ccg.V)));
   }

   private static void c(bue<cgs> $$0) {
      $$0.a(
         coa.b,
         ImmutableList.of(
            Pair.of(0, bwv.a(bsn.by, 6.0F, bps.a(30, 60))),
            Pair.of(0, new bup(bsn.X)),
            Pair.of(1, new bvi($$0x -> 1.25F)),
            Pair.of(2, bus.a(i, 1.25F)),
            Pair.of(3, new bws(ImmutableList.of(Pair.of(bwn.a(1.0F), 2), Pair.of(bxc.a(1.0F, 3), 2), Pair.of(new bvf(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(ccg.W, cch.b), Pair.of(ccg.T, cch.b))
      );
   }

   private static void d(bue<cgs> $$0) {
      $$0.a(
         coa.q,
         ImmutableList.of(Pair.of(0, new bvw(o, avh.ld)), Pair.of(1, new bvy<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gx() ? avh.kY : avh.kO))),
         ImmutableSet.of(Pair.of(ccg.O, cch.b), Pair.of(ccg.r, cch.b), Pair.of(ccg.m, cch.b), Pair.of(ccg.S, cch.b))
      );
   }

   private static void e(bue<cgs> $$0) {
      $$0.a(
         coa.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bwl(
                  $$0x -> $$0x.gx() ? q : p, r, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gx() ? avh.lb : avh.kR, $$0x -> $$0x.gx() ? avh.lc : avh.kS
               )
            ),
            Pair.of(1, new bwk<>($$0x -> $$0x.gx() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gx() ? avh.la : avh.kQ))
         ),
         ImmutableSet.of(Pair.of(ccg.O, cch.b), Pair.of(ccg.r, cch.b), Pair.of(ccg.V, cch.b))
      );
   }

   public static void a(cgs $$0) {
      $$0.dV().a(ImmutableList.of(coa.r, coa.q, coa.b));
   }

   public static Predicate<cud> a() {
      return $$0 -> $$0.a(awf.ab);
   }
}
