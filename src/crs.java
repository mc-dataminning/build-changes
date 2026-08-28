import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class crs {
   public static final cro a;
   public static final cro b;
   public static final cro c;
   public static final cro d;
   public static final crp e;
   public static final Codec<crq> f;
   public static final crq g;
   public static final crq h;

   public static String a(crq $$0, crq $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(crp $$0, crq $$1, crq $$2) {
      Set<alj> $$3 = $$0.b($$2);
      Set<alj> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alj::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(crq $$0) {
      return !$$0.a(g);
   }

   static {
      crp.a $$0 = new crp.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = crq.a(a);
      h = g;
   }
}
