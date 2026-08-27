import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class clj {
   public static final clf a;
   public static final clf b;
   public static final clf c;
   public static final clf d;
   public static final clg e;
   public static final Codec<clh> f;
   public static final clh g;
   public static final clh h;

   public static String a(clh $$0, clh $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(clg $$0, clh $$1, clh $$2) {
      Set<ajh> $$3 = $$0.b($$2);
      Set<ajh> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ajh::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(clh $$0) {
      return !$$0.a(g);
   }

   static {
      clg.a $$0 = new clg.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = clh.a(a);
      h = g;
   }
}
