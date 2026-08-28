import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class csp {
   public static final csl a;
   public static final csl b;
   public static final csl c;
   public static final csl d;
   public static final csm e;
   public static final Codec<csn> f;
   public static final csn g;
   public static final csn h;

   public static String a(csn $$0, csn $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(csm $$0, csn $$1, csn $$2) {
      Set<aku> $$3 = $$0.b($$2);
      Set<aku> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(aku::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(csn $$0) {
      return !$$0.a(g);
   }

   static {
      csm.a $$0 = new csm.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = csn.a(a);
      h = g;
   }
}
