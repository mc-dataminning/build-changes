import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chf {
   public static final int a = 20;
   public static final int b = 7;
   private static final bqc i = bqc.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bqc o = bqc.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bqc p = bqc.a(600, 6000);
   private static final bqc q = bqc.a(100, 300);
   private static final cef r = cef.a().a($$0 -> !$$0.am().equals(bsx.X) && $$0.dP().C_().a($$0.cL()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(che $$0, ayw $$1) {
      $$0.dU().a(ccs.S, o.a($$1));
      $$0.dU().a(ccs.V, p.a($$1));
   }

   protected static buq<?> a(buq<che> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(buq<che> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byb(0.8F), new bvc(2.0F), new bwn(45, 90), new bwr(), new bvn(ccs.P), new bvn(ccs.S), new bvn(ccs.V)));
   }

   private static void c(buq<che> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsx.by, 6.0F, bqc.a(30, 60))),
            Pair.of(0, new bvb(bsx.X)),
            Pair.of(1, new bvu($$0x -> 1.25F)),
            Pair.of(2, bve.a(i, 1.25F)),
            Pair.of(3, new bxe(ImmutableList.of(Pair.of(bwz.a(1.0F), 2), Pair.of(bxo.a(1.0F, 3), 2), Pair.of(new bvr(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(ccs.W, cct.b), Pair.of(ccs.T, cct.b))
      );
   }

   private static void d(buq<che> $$0) {
      $$0.a(
         com.q,
         ImmutableList.of(Pair.of(0, new bwi(o, avp.ld)), Pair.of(1, new bwk<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gv() ? avp.kY : avp.kO))),
         ImmutableSet.of(Pair.of(ccs.O, cct.b), Pair.of(ccs.r, cct.b), Pair.of(ccs.m, cct.b), Pair.of(ccs.S, cct.b))
      );
   }

   private static void e(buq<che> $$0) {
      $$0.a(
         com.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bwx(
                  $$0x -> $$0x.gv() ? q : p, r, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gv() ? avp.lb : avp.kR, $$0x -> $$0x.gv() ? avp.lc : avp.kS
               )
            ),
            Pair.of(1, new bww<>($$0x -> $$0x.gv() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gv() ? avp.la : avp.kQ))
         ),
         ImmutableSet.of(Pair.of(ccs.O, cct.b), Pair.of(ccs.r, cct.b), Pair.of(ccs.V, cct.b))
      );
   }

   public static void a(che $$0) {
      $$0.dU().a(ImmutableList.of(com.r, com.q, com.b));
   }

   public static Predicate<cuq> a() {
      return $$0 -> $$0.a(awn.ab);
   }
}
