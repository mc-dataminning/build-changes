import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cox {
   public static final cot a;
   public static final cot b;
   public static final cot c;
   public static final cou d;
   public static final Codec<cov> e;
   public static final cov f;
   public static final cov g;

   public static String a(cov $$0, cov $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(cou $$0, cov $$1, cov $$2) {
      Set<akk> $$3 = $$0.b($$2);
      Set<akk> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akk::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cov $$0) {
      return !$$0.a(f);
   }

   static {
      cou.a $$0 = new cou.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = cov.a(a);
      g = f;
   }
}
