import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cuv {
   public static final cur a;
   public static final cur b;
   public static final cur c;
   public static final cur d;
   public static final cus e;
   public static final Codec<cut> f;
   public static final cut g;
   public static final cut h;

   public static String a(cut $$0, cut $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cus $$0, cut $$1, cut $$2) {
      Set<alg> $$3 = $$0.b($$2);
      Set<alg> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alg::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cut $$0) {
      return !$$0.a(g);
   }

   static {
      cus.a $$0 = new cus.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = cut.a(a);
      h = g;
   }
}
