import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cue extends cte {
   protected static final Map<dfy, Pair<Predicate<cyf>, Consumer<cyf>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dga.i,
         Pair.of(cue::b, a(dga.cC.o())),
         dga.kE,
         Pair.of(cue::b, a(dga.cC.o())),
         dga.j,
         Pair.of(cue::b, a(dga.cC.o())),
         dga.k,
         Pair.of(cue::b, a(dga.j.o())),
         dga.sH,
         Pair.of((Predicate<cyf>)$$0 -> true, a(dga.j.o(), cut.dO))
      )
   );

   public cue(cwi $$0, cul.a $$1) {
      super($$0, awe.bB, $$1);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      Pair<Predicate<cyf>, Consumer<cyf>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqr.e;
      } else {
         Predicate<cyf> $$4 = (Predicate<cyf>)$$3.getFirst();
         Consumer<cyf> $$5 = (Consumer<cyf>)$$3.getSecond();
         if ($$4.test($$0)) {
            cmx $$6 = $$0.o();
            $$1.a($$6, $$2, avp.mn, avq.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, btn.d($$0.p()));
               }
            }

            return bqr.a($$1.B);
         } else {
            return bqr.e;
         }
      }
   }

   public static Consumer<cyf> a(dtc $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dxz.c, $$1.a(), dxz.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cyf> a(dtc $$0, dcv $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dxz.c, $$2.a(), dxz.a.a($$2.o(), $$0));
         dfy.a($$2.q(), $$2.a(), $$2.k(), new cuq($$1));
      };
   }

   public static boolean b(cyf $$0) {
      return $$0.k() != ji.a && $$0.q().a_($$0.a().d()).i();
   }
}
