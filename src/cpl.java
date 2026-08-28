import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cpl {
   public static final cph a;
   public static final cph b;
   public static final cph c;
   public static final cpi d;
   public static final Codec<cpj> e;
   public static final cpj f;
   public static final cpj g;

   public static String a(cpj $$0, cpj $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(cpi $$0, cpj $$1, cpj $$2) {
      Set<akq> $$3 = $$0.b($$2);
      Set<akq> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akq::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cpj $$0) {
      return !$$0.a(f);
   }

   static {
      cpi.a $$0 = new cpi.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = cpj.a(a);
      g = f;
   }
}
