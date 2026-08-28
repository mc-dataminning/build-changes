import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cqs {
   public static final cqo a;
   public static final cqo b;
   public static final cqo c;
   public static final cqo d;
   public static final cqo e;
   public static final cqp f;
   public static final Codec<cqq> g;
   public static final cqq h;
   public static final cqq i;

   public static String a(cqq $$0, cqq $$1) {
      return a(f, $$0, $$1);
   }

   public static String a(cqp $$0, cqq $$1, cqq $$2) {
      Set<ale> $$3 = $$0.b($$2);
      Set<ale> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ale::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cqq $$0) {
      return !$$0.a(h);
   }

   static {
      cqp.a $$0 = new cqp.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a("redstone_experiments");
      e = $$0.a("minecart_improvements");
      f = $$0.a();
      g = f.b();
      h = cqq.a(a);
      i = h;
   }
}
