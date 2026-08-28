import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cpb {
   public static final cox a;
   public static final cox b;
   public static final cox c;
   public static final coy d;
   public static final Codec<coz> e;
   public static final coz f;
   public static final coz g;

   public static String a(coz $$0, coz $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(coy $$0, coz $$1, coz $$2) {
      Set<akk> $$3 = $$0.b($$2);
      Set<akk> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akk::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(coz $$0) {
      return !$$0.a(f);
   }

   static {
      coy.a $$0 = new coy.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = coz.a(a);
      g = f;
   }
}
