import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class ceg {
   public static final cec a;
   public static final cec b;
   public static final cec c;
   public static final ced d;
   public static final Codec<cee> e;
   public static final cee f;
   public static final cee g;

   public static String a(cee $$0, cee $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(ced $$0, cee $$1, cee $$2) {
      Set<aey> $$3 = $$0.b($$2);
      Set<aey> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(aey::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cee $$0) {
      return !$$0.a(f);
   }

   static {
      ced.a $$0 = new ced.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = cee.a(a);
      g = f;
   }
}
