import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cic {
   public static final chy a;
   public static final chy b;
   public static final chy c;
   public static final chy d;
   public static final chz e;
   public static final Codec<cia> f;
   public static final cia g;
   public static final cia h;

   public static String a(cia $$0, cia $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(chz $$0, cia $$1, cia $$2) {
      Set<ahh> $$3 = $$0.b($$2);
      Set<ahh> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ahh::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cia $$0) {
      return !$$0.a(g);
   }

   static {
      chz.a $$0 = new chz.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cia.a(a);
      h = g;
   }
}
