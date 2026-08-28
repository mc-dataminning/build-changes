import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cnd {
   protected static final ImmutableList<? extends cfs<? extends cfr<? super cnc>>> a = ImmutableList.of(cfs.c, cfs.d);
   protected static final ImmutableList<? extends cel<?>> b = ImmutableList.of(cel.g, cel.h, cel.k, cel.l, cel.n, cel.m, cel.E, cel.t, cel.o, cel.p);

   static void a(bwj<cnc> $$0) {
      $$0.a(cqo.a, 0, ImmutableList.of(new bzu<cnc>(0.8F) {
         protected boolean a(ard $$0, cnc $$1) {
            return $$1.t() && super.a($$0, (bvh)$$1);
         }
      }, new byg(45, 90), new byk()));
   }

   static void b(bwj<cnc> $$0) {
      $$0.a(
         cqo.b,
         10,
         ImmutableList.of(
            bzm.a(($$0x, $$1) -> $$1.gC(), ($$0x, $$1) -> $$1.eb().c(cel.l)),
            bza.a(8.0F, brv.a(30, 60)),
            new byx(ImmutableList.of(Pair.of(bys.a(0.3F), 2), Pair.of(bzh.a(0.3F, 3), 2), Pair.of(new bxk(30, 60), 1)))
         )
      );
   }

   static void c(bwj<cnc> $$0) {
      $$0.a(cqo.k, 10, ImmutableList.of(bzf.a(1.0F), byh.a(cnc::t, 40), bzp.a()), cel.o);
   }

   public static bwj.b<cnc> a() {
      return bwj.a(b, a);
   }

   public static bwj<cnc> d(bwj<cnc> $$0) {
      a($$0);
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqo.a));
      $$0.b(cqo.b);
      $$0.f();
      return $$0;
   }

   public static void a(cnc $$0) {
      if (!$$0.t()) {
         $$0.eb().f();
      } else {
         $$0.eb().a(ImmutableList.of(cqo.k, cqo.b));
      }
   }
}
