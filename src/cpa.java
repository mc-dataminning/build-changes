import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cpa {
   public static final cow a;
   public static final cow b;
   public static final cow c;
   public static final cox d;
   public static final Codec<coy> e;
   public static final coy f;
   public static final coy g;

   public static String a(coy $$0, coy $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(cox $$0, coy $$1, coy $$2) {
      Set<akk> $$3 = $$0.b($$2);
      Set<akk> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akk::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(coy $$0) {
      return !$$0.a(f);
   }

   static {
      cox.a $$0 = new cox.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = coy.a(a);
      g = f;
   }
}
