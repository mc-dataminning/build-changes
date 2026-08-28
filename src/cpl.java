import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cpl {
   public static final cph a;
   public static final cph b;
   public static final cph c;
   public static final cph d;
   public static final cpi e;
   public static final Codec<cpj> f;
   public static final cpj g;
   public static final cpj h;

   public static String a(cpj $$0, cpj $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cpi $$0, cpj $$1, cpj $$2) {
      Set<ale> $$3 = $$0.b($$2);
      Set<ale> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ale::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cpj $$0) {
      return !$$0.a(g);
   }

   static {
      cpi.a $$0 = new cpi.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cpj.a(a);
      h = g;
   }
}
