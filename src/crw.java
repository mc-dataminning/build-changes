import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class crw {
   public static final crs a;
   public static final crs b;
   public static final crs c;
   public static final crs d;
   public static final crt e;
   public static final Codec<cru> f;
   public static final cru g;
   public static final cru h;

   public static String a(cru $$0, cru $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(crt $$0, cru $$1, cru $$2) {
      Set<akv> $$3 = $$0.b($$2);
      Set<akv> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akv::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cru $$0) {
      return !$$0.a(g);
   }

   static {
      crt.a $$0 = new crt.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = cru.a(a);
      h = g;
   }
}
