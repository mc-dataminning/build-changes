import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cvl {
   public static final cvh a;
   public static final cvh b;
   public static final cvh c;
   public static final cvh d;
   public static final cvi e;
   public static final Codec<cvj> f;
   public static final cvj g;
   public static final cvj h;

   public static String a(cvj $$0, cvj $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cvi $$0, cvj $$1, cvj $$2) {
      Set<alk> $$3 = $$0.b($$2);
      Set<alk> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alk::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cvj $$0) {
      return !$$0.a(g);
   }

   static {
      cvi.a $$0 = new cvi.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = cvj.a(a);
      h = g;
   }
}
