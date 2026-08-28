import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class crl {
   public static final crh a;
   public static final crh b;
   public static final crh c;
   public static final crh d;
   public static final crh e;
   public static final cri f;
   public static final Codec<crj> g;
   public static final crj h;
   public static final crj i;

   public static String a(crj $$0, crj $$1) {
      return a(f, $$0, $$1);
   }

   public static String a(cri $$0, crj $$1, crj $$2) {
      Set<all> $$3 = $$0.b($$2);
      Set<all> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(all::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(crj $$0) {
      return !$$0.a(h);
   }

   static {
      cri.a $$0 = new cri.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a("redstone_experiments");
      e = $$0.a("minecart_improvements");
      f = $$0.a();
      g = f.b();
      h = crj.a(a);
      i = h;
   }
}
