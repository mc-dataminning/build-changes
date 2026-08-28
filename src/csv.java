import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class csv {
   public static final csr a;
   public static final csr b;
   public static final csr c;
   public static final csr d;
   public static final csr e;
   public static final css f;
   public static final Codec<cst> g;
   public static final cst h;
   public static final cst i;

   public static String a(cst $$0, cst $$1) {
      return a(f, $$0, $$1);
   }

   public static String a(css $$0, cst $$1, cst $$2) {
      Set<alz> $$3 = $$0.b($$2);
      Set<alz> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alz::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cst $$0) {
      return !$$0.a(h);
   }

   static {
      css.a $$0 = new css.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("winter_drop");
      c = $$0.a("trade_rebalance");
      d = $$0.a("redstone_experiments");
      e = $$0.a("minecart_improvements");
      f = $$0.a();
      g = f.b();
      h = cst.a(a);
      i = h;
   }
}
