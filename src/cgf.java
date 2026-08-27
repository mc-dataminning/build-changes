import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cgf {
   public static final cgb a;
   public static final cgb b;
   public static final cgb c;
   public static final cgb d;
   public static final cgc e;
   public static final Codec<cgd> f;
   public static final cgd g;
   public static final cgd h;

   public static String a(cgd $$0, cgd $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cgc $$0, cgd $$1, cgd $$2) {
      Set<agi> $$3 = $$0.b($$2);
      Set<agi> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(agi::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cgd $$0) {
      return !$$0.a(g);
   }

   static {
      cgc.a $$0 = new cgc.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cgd.a(a);
      h = g;
   }
}
