import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cdx {
   public static final cdt a;
   public static final cdt b;
   public static final cdt c;
   public static final cdu d;
   public static final Codec<cdv> e;
   public static final cdv f;
   public static final cdv g;

   public static String a(cdv $$0, cdv $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(cdu $$0, cdv $$1, cdv $$2) {
      Set<aer> $$3 = $$0.b($$2);
      Set<aer> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(aer::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cdv $$0) {
      return !$$0.a(f);
   }

   static {
      cdu.a $$0 = new cdu.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = cdv.a(a);
      g = f;
   }
}
