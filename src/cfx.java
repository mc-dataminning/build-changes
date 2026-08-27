import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cfx {
   public static final cft a;
   public static final cft b;
   public static final cft c;
   public static final cft d;
   public static final cfu e;
   public static final Codec<cfv> f;
   public static final cfv g;
   public static final cfv h;

   public static String a(cfv $$0, cfv $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cfu $$0, cfv $$1, cfv $$2) {
      Set<agg> $$3 = $$0.b($$2);
      Set<agg> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(agg::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cfv $$0) {
      return !$$0.a(g);
   }

   static {
      cfu.a $$0 = new cfu.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cfv.a(a);
      h = g;
   }
}
