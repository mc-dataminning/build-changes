import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cpp {
   public static final cpl a;
   public static final cpl b;
   public static final cpl c;
   public static final cpl d;
   public static final cpm e;
   public static final Codec<cpn> f;
   public static final cpn g;
   public static final cpn h;

   public static String a(cpn $$0, cpn $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cpm $$0, cpn $$1, cpn $$2) {
      Set<alf> $$3 = $$0.b($$2);
      Set<alf> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alf::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cpn $$0) {
      return !$$0.a(g);
   }

   static {
      cpm.a $$0 = new cpm.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cpn.a(a);
      h = g;
   }
}
