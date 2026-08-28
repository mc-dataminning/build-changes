import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cuy {
   public static final cuu a;
   public static final cuu b;
   public static final cuu c;
   public static final cuu d;
   public static final cuv e;
   public static final Codec<cuw> f;
   public static final cuw g;
   public static final cuw h;

   public static String a(cuw $$0, cuw $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cuv $$0, cuw $$1, cuw $$2) {
      Set<alg> $$3 = $$0.b($$2);
      Set<alg> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alg::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cuw $$0) {
      return !$$0.a(g);
   }

   static {
      cuv.a $$0 = new cuv.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = cuw.a(a);
      h = g;
   }
}
