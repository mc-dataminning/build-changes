import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cdv {
   public static final cdr a;
   public static final cdr b;
   public static final cdr c;
   public static final cds d;
   public static final Codec<cdt> e;
   public static final cdt f;
   public static final cdt g;

   public static String a(cdt $$0, cdt $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(cds $$0, cdt $$1, cdt $$2) {
      Set<aep> $$3 = $$0.b($$2);
      Set<aep> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(aep::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cdt $$0) {
      return !$$0.a(f);
   }

   static {
      cds.a $$0 = new cds.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = cdt.a(a);
      g = f;
   }
}
