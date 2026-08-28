import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cpj {
   protected static final ImmutableList<? extends chn<? extends chm<? super cpi>>> a = ImmutableList.of(chn.c, chn.d);
   protected static final ImmutableList<? extends cgg<?>> b = ImmutableList.of(cgg.g, cgg.h, cgg.k, cgg.l, cgg.m, cgg.o, cgg.n, cgg.F, cgg.u, cgg.p, cgg.q);

   static void a(bye<cpi> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cbp<cpi>(0.8F) {
         protected boolean a(arq $$0, cpi $$1) {
            return $$1.n() && super.a($$0, (bxe)$$1);
         }
      }, new cab(45, 90), new caf()));
   }

   static void b(bye<cpi> $$0) {
      $$0.a(
         csw.b,
         10,
         ImmutableList.of(
            cbh.a(($$0x, $$1) -> $$1.gz(), ($$0x, $$1) -> $$1.ec().c(cgg.l)),
            cav.a(8.0F, bto.a(30, 60)),
            new cas(ImmutableList.of(Pair.of(can.a(0.3F), 2), Pair.of(cbc.a(0.3F, 3), 2), Pair.of(new bzf(30, 60), 1)))
         )
      );
   }

   static void a(cpi $$0, bye<cpi> $$1) {
      $$1.a(csw.k, 10, ImmutableList.of(cba.a(1.0F), cac.a(cpi::n, 40), cbk.a(($$1x, $$2) -> !a($$0, $$2))), ImmutableSet.of(Pair.of(cgg.p, cgh.a)));
   }

   private static boolean a(cpi $$0, bxe $$1) {
      Optional<List<crc>> $$2 = $$0.ec().c(cgg.m);
      return $$2.<Boolean>map($$1x -> {
         if ($$1 instanceof crc $$2x && $$1x.contains($$2x)) {
            return true;
         }

         return false;
      }).orElse(false);
   }

   public static bye.b<cpi> a() {
      return bye.a(b, a);
   }

   public static bye<cpi> b(cpi $$0, bye<cpi> $$1) {
      a($$1);
      b($$1);
      a($$0, $$1);
      $$1.a(ImmutableSet.of(csw.a));
      $$1.b(csw.b);
      $$1.f();
      return $$1;
   }

   public static void a(cpi $$0) {
      if (!$$0.n()) {
         $$0.ec().f();
      } else {
         $$0.ec().a(ImmutableList.of(csw.k, csw.b));
      }
   }
}
