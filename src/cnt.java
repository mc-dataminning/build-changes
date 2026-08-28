import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cnt {
   protected static final ImmutableList<? extends cgi<? extends cgh<? super cns>>> a = ImmutableList.of(cgi.c, cgi.d);
   protected static final ImmutableList<? extends cfb<?>> b = ImmutableList.of(cfb.g, cfb.h, cfb.k, cfb.l, cfb.n, cfb.m, cfb.E, cfb.t, cfb.o, cfb.p);

   static void a(bwz<cns> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new cak<cns>(0.8F) {
         protected boolean a(arx $$0, cns $$1) {
            return $$1.p() && super.a($$0, (bvx)$$1);
         }
      }, new byw(45, 90), new bza()));
   }

   static void b(bwz<cns> $$0) {
      $$0.a(
         crf.b,
         10,
         ImmutableList.of(
            cac.a(($$0x, $$1) -> $$1.go(), ($$0x, $$1) -> $$1.ec().c(cfb.l)),
            bzq.a(8.0F, bsl.a(30, 60)),
            new bzn(ImmutableList.of(Pair.of(bzi.a(0.3F), 2), Pair.of(bzx.a(0.3F, 3), 2), Pair.of(new bya(30, 60), 1)))
         )
      );
   }

   static void c(bwz<cns> $$0) {
      $$0.a(crf.k, 10, ImmutableList.of(bzv.a(1.0F), byx.a(cns::p, 40), caf.a()), cfb.o);
   }

   public static bwz.b<cns> a() {
      return bwz.a(b, a);
   }

   public static bwz<cns> d(bwz<cns> $$0) {
      a($$0);
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crf.a));
      $$0.b(crf.b);
      $$0.f();
      return $$0;
   }

   public static void a(cns $$0) {
      if (!$$0.p()) {
         $$0.ec().f();
      } else {
         $$0.ec().a(ImmutableList.of(crf.k, crf.b));
      }
   }
}
