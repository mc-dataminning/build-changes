import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cdz {
   public static final cdv a;
   public static final cdv b;
   public static final cdv c;
   public static final cdw d;
   public static final Codec<cdx> e;
   public static final cdx f;
   public static final cdx g;

   public static String a(cdx $$0, cdx $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(cdw $$0, cdx $$1, cdx $$2) {
      Set<aeu> $$3 = $$0.b($$2);
      Set<aeu> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(aeu::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cdx $$0) {
      return !$$0.a(f);
   }

   static {
      cdw.a $$0 = new cdw.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = cdx.a(a);
      g = f;
   }
}
