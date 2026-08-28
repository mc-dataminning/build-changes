import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cud {
   public static final ctz a;
   public static final ctz b;
   public static final ctz c;
   public static final ctz d;
   public static final cua e;
   public static final Codec<cub> f;
   public static final cub g;
   public static final cub h;

   public static String a(cub $$0, cub $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cua $$0, cub $$1, cub $$2) {
      Set<ale> $$3 = $$0.b($$2);
      Set<ale> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ale::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cub $$0) {
      return !$$0.a(g);
   }

   static {
      cua.a $$0 = new cua.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = cub.a(a);
      h = g;
   }
}
