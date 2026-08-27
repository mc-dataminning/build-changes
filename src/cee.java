import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cee {
   public static final cea a;
   public static final cea b;
   public static final cea c;
   public static final ceb d;
   public static final Codec<cec> e;
   public static final cec f;
   public static final cec g;

   public static String a(cec $$0, cec $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(ceb $$0, cec $$1, cec $$2) {
      Set<aex> $$3 = $$0.b($$2);
      Set<aex> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(aex::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cec $$0) {
      return !$$0.a(f);
   }

   static {
      ceb.a $$0 = new ceb.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = cec.a(a);
      g = f;
   }
}
