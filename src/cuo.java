import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cuo {
   public static final cuk a;
   public static final cuk b;
   public static final cuk c;
   public static final cuk d;
   public static final cul e;
   public static final Codec<cum> f;
   public static final cum g;
   public static final cum h;

   public static String a(cum $$0, cum $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cul $$0, cum $$1, cum $$2) {
      Set<alg> $$3 = $$0.b($$2);
      Set<alg> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alg::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cum $$0) {
      return !$$0.a(g);
   }

   static {
      cul.a $$0 = new cul.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = cum.a(a);
      h = g;
   }
}
