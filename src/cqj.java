import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cqj {
   public static final cqf a;
   public static final cqf b;
   public static final cqf c;
   public static final cqf d;
   public static final cqf e;
   public static final cqg f;
   public static final Codec<cqh> g;
   public static final cqh h;
   public static final cqh i;

   public static String a(cqh $$0, cqh $$1) {
      return a(f, $$0, $$1);
   }

   public static String a(cqg $$0, cqh $$1, cqh $$2) {
      Set<alb> $$3 = $$0.b($$2);
      Set<alb> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alb::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cqh $$0) {
      return !$$0.a(h);
   }

   static {
      cqg.a $$0 = new cqg.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a("redstone_experiments");
      e = $$0.a("minecart_improvements");
      f = $$0.a();
      g = f.b();
      h = cqh.a(a);
      i = h;
   }
}
