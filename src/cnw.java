import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cnw {
   public static final cns a;
   public static final cns b;
   public static final cns c;
   public static final cns d;
   public static final cnt e;
   public static final Codec<cnu> f;
   public static final cnu g;
   public static final cnu h;

   public static String a(cnu $$0, cnu $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cnt $$0, cnu $$1, cnu $$2) {
      Set<akh> $$3 = $$0.b($$2);
      Set<akh> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akh::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cnu $$0) {
      return !$$0.a(g);
   }

   static {
      cnt.a $$0 = new cnt.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cnu.a(a);
      h = g;
   }
}
