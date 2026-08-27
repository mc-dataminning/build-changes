import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cdw {
   public static final cds a;
   public static final cds b;
   public static final cds c;
   public static final cdt d;
   public static final Codec<cdu> e;
   public static final cdu f;
   public static final cdu g;

   public static String a(cdu $$0, cdu $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(cdt $$0, cdu $$1, cdu $$2) {
      Set<aer> $$3 = $$0.b($$2);
      Set<aer> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(aer::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cdu $$0) {
      return !$$0.a(f);
   }

   static {
      cdt.a $$0 = new cdt.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = cdu.a(a);
      g = f;
   }
}
