import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class coo {
   public static final coj a;
   public static final coj b;
   public static final coj c;
   public static final coj d;
   public static final cok e;
   public static final Codec<col> f;
   public static final col g;
   public static final col h;

   public static String a(col $$0, col $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cok $$0, col $$1, col $$2) {
      Set<akn> $$3 = $$0.b($$2);
      Set<akn> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akn::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(col $$0) {
      return !$$0.a(g);
   }

   static {
      cok.a $$0 = new cok.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = col.a(a);
      h = g;
   }
}
