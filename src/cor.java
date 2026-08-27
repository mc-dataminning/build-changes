import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cor {
   public static final com a;
   public static final com b;
   public static final com c;
   public static final com d;
   public static final coo e;
   public static final Codec<cop> f;
   public static final cop g;
   public static final cop h;

   public static String a(cop $$0, cop $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(coo $$0, cop $$1, cop $$2) {
      Set<akt> $$3 = $$0.b($$2);
      Set<akt> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akt::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cop $$0) {
      return !$$0.a(g);
   }

   static {
      coo.a $$0 = new coo.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cop.a(a);
      h = g;
   }
}
