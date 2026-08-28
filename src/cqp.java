import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cqp {
   public static final cql a;
   public static final cql b;
   public static final cql c;
   public static final cql d;
   public static final cql e;
   public static final cqm f;
   public static final Codec<cqn> g;
   public static final cqn h;
   public static final cqn i;

   public static String a(cqn $$0, cqn $$1) {
      return a(f, $$0, $$1);
   }

   public static String a(cqm $$0, cqn $$1, cqn $$2) {
      Set<alc> $$3 = $$0.b($$2);
      Set<alc> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alc::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cqn $$0) {
      return !$$0.a(h);
   }

   static {
      cqm.a $$0 = new cqm.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a("redstone_experiments");
      e = $$0.a("minecart_improvements");
      f = $$0.a();
      g = f.b();
      h = cqn.a(a);
      i = h;
   }
}
