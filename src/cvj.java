import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cvj {
   public static final cvf a;
   public static final cvf b;
   public static final cvf c;
   public static final cvf d;
   public static final cvg e;
   public static final Codec<cvh> f;
   public static final cvh g;
   public static final cvh h;

   public static String a(cvh $$0, cvh $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cvg $$0, cvh $$1, cvh $$2) {
      Set<ali> $$3 = $$0.b($$2);
      Set<ali> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ali::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cvh $$0) {
      return !$$0.a(g);
   }

   static {
      cvg.a $$0 = new cvg.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = cvh.a(a);
      h = g;
   }
}
