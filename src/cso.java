import java.util.Map;
import java.util.Optional;

public class cso {
   public static final ajg<csn> a = a("quartz");
   public static final ajg<csn> b = a("iron");
   public static final ajg<csn> c = a("netherite");
   public static final ajg<csn> d = a("redstone");
   public static final ajg<csn> e = a("copper");
   public static final ajg<csn> f = a("gold");
   public static final ajg<csn> g = a("emerald");
   public static final ajg<csn> h = a("diamond");
   public static final ajg<csn> i = a("lapis");
   public static final ajg<csn> j = a("amethyst");

   public static void a(pl<csn> $$0) {
      a($$0, a, cqn.oA, wr.a.a(14931140), 0.1F);
      a($$0, b, cqn.oD, wr.a.a(15527148), 0.2F, Map.of(cny.c, "iron_darker"));
      a($$0, c, cqn.oI, wr.a.a(6445145), 0.3F, Map.of(cny.g, "netherite_darker"));
      a($$0, d, cqn.lG, wr.a.a(9901575), 0.4F);
      a($$0, e, cqn.oF, wr.a.a(11823181), 0.5F);
      a($$0, f, cqn.oH, wr.a.a(14594349), 0.6F, Map.of(cny.d, "gold_darker"));
      a($$0, g, cqn.oy, wr.a.a(1155126), 0.7F);
      a($$0, h, cqn.ox, wr.a.a(7269586), 0.8F, Map.of(cny.e, "diamond_darker"));
      a($$0, i, cqn.oz, wr.a.a(4288151), 0.9F);
      a($$0, j, cqn.oB, wr.a.a(10116294), 1.0F);
   }

   public static Optional<il.c<csn>> a(iz $$0, cqk $$1) {
      return $$0.d(kj.aJ).h().filter($$1x -> $$1.a(((csn)$$1x.a()).b())).findFirst();
   }

   private static void a(pl<csn> $$0, ajg<csn> $$1, cqf $$2, wr $$3, float $$4) {
      a($$0, $$1, $$2, $$3, $$4, Map.of());
   }

   private static void a(pl<csn> $$0, ajg<csn> $$1, cqf $$2, wr $$3, float $$4, Map<il<cnx>, String> $$5) {
      csn $$6 = csn.a($$1.a().a(), $$2, $$4, vu.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
      $$0.a($$1, $$6);
   }

   private static ajg<csn> a(String $$0) {
      return ajg.a(kj.aJ, new ajh($$0));
   }
}
