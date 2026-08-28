import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cpm {
   public static final cpi a;
   public static final cpi b;
   public static final cpi c;
   public static final cpi d;
   public static final cpj e;
   public static final Codec<cpk> f;
   public static final cpk g;
   public static final cpk h;

   public static String a(cpk $$0, cpk $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cpj $$0, cpk $$1, cpk $$2) {
      Set<ale> $$3 = $$0.b($$2);
      Set<ale> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ale::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cpk $$0) {
      return !$$0.a(g);
   }

   static {
      cpj.a $$0 = new cpj.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cpk.a(a);
      h = g;
   }
}
