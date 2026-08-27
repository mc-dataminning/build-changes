import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cgk {
   public static final cgg a;
   public static final cgg b;
   public static final cgg c;
   public static final cgg d;
   public static final cgh e;
   public static final Codec<cgi> f;
   public static final cgi g;
   public static final cgi h;

   public static String a(cgi $$0, cgi $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cgh $$0, cgi $$1, cgi $$2) {
      Set<agm> $$3 = $$0.b($$2);
      Set<agm> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(agm::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cgi $$0) {
      return !$$0.a(g);
   }

   static {
      cgh.a $$0 = new cgh.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cgi.a(a);
      h = g;
   }
}
