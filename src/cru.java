import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cru {
   public static final crq a;
   public static final crq b;
   public static final crq c;
   public static final crq d;
   public static final crr e;
   public static final Codec<crs> f;
   public static final crs g;
   public static final crs h;

   public static String a(crs $$0, crs $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(crr $$0, crs $$1, crs $$2) {
      Set<akv> $$3 = $$0.b($$2);
      Set<akv> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akv::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(crs $$0) {
      return !$$0.a(g);
   }

   static {
      crr.a $$0 = new crr.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = crs.a(a);
      h = g;
   }
}
