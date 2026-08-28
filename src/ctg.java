import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class ctg {
   public static final ctc a;
   public static final ctc b;
   public static final ctc c;
   public static final ctc d;
   public static final ctd e;
   public static final Codec<cte> f;
   public static final cte g;
   public static final cte h;

   public static String a(cte $$0, cte $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(ctd $$0, cte $$1, cte $$2) {
      Set<ald> $$3 = $$0.b($$2);
      Set<ald> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ald::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cte $$0) {
      return !$$0.a(g);
   }

   static {
      ctd.a $$0 = new ctd.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = cte.a(a);
      h = g;
   }
}
