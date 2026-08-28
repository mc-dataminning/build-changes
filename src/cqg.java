import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cqg {
   protected static final ImmutableList<? extends cif<? extends cie<? super cqf>>> a = ImmutableList.of(cif.c, cif.d);
   protected static final ImmutableList<? extends cgy<?>> b = ImmutableList.of(cgy.g, cgy.h, cgy.k, cgy.l, cgy.m, cgy.o, cgy.n, cgy.F, cgy.u, cgy.p, cgy.q);

   static void a(byw<cqf> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new cch<cqf>(0.8F) {
         protected boolean a(aru $$0, cqf $$1) {
            return $$1.n() && super.a($$0, (bxw)$$1);
         }
      }, new cat(45, 90), new cax()));
   }

   static void b(byw<cqf> $$0) {
      $$0.a(
         ctt.b,
         10,
         ImmutableList.of(
            cbz.a(($$0x, $$1) -> $$1.gC(), ($$0x, $$1) -> $$1.ec().c(cgy.l)),
            cbn.a(8.0F, bue.a(30, 60)),
            new cbk(ImmutableList.of(Pair.of(cbf.a(0.3F), 2), Pair.of(cbu.a(0.3F, 3), 2), Pair.of(new bzx(30, 60), 1)))
         )
      );
   }

   static void a(cqf $$0, byw<cqf> $$1) {
      $$1.a(ctt.k, 10, ImmutableList.of(cbs.a(1.0F), cau.a(cqf::n, 40), ccc.a(($$1x, $$2) -> !a($$0, $$2))), ImmutableSet.of(Pair.of(cgy.p, cgz.a)));
   }

   private static boolean a(cqf $$0, bxw $$1) {
      Optional<List<crz>> $$2 = $$0.ec().c(cgy.m);
      return $$2.<Boolean>map($$1x -> {
         if ($$1 instanceof crz $$2x && $$1x.contains($$2x)) {
            return true;
         }

         return false;
      }).orElse(false);
   }

   public static byw.b<cqf> a() {
      return byw.a(b, a);
   }

   public static byw<cqf> b(cqf $$0, byw<cqf> $$1) {
      a($$1);
      b($$1);
      a($$0, $$1);
      $$1.a(ImmutableSet.of(ctt.a));
      $$1.b(ctt.b);
      $$1.f();
      return $$1;
   }

   public static void a(cqf $$0) {
      if (!$$0.n()) {
         $$0.ec().f();
      } else {
         $$0.ec().a(ImmutableList.of(ctt.k, ctt.b));
      }
   }
}
