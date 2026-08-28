import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class crv {
   public static final crr a;
   public static final crr b;
   public static final crr c;
   public static final crr d;
   public static final crs e;
   public static final Codec<crt> f;
   public static final crt g;
   public static final crt h;

   public static String a(crt $$0, crt $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(crs $$0, crt $$1, crt $$2) {
      Set<akv> $$3 = $$0.b($$2);
      Set<akv> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akv::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(crt $$0) {
      return !$$0.a(g);
   }

   static {
      crs.a $$0 = new crs.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = crt.a(a);
      h = g;
   }
}
