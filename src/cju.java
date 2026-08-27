import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cju {
   public static final cjq a;
   public static final cjq b;
   public static final cjq c;
   public static final cjq d;
   public static final cjr e;
   public static final Codec<cjs> f;
   public static final cjs g;
   public static final cjs h;

   public static String a(cjs $$0, cjs $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cjr $$0, cjs $$1, cjs $$2) {
      Set<aiy> $$3 = $$0.b($$2);
      Set<aiy> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(aiy::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cjs $$0) {
      return !$$0.a(g);
   }

   static {
      cjr.a $$0 = new cjr.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cjs.a(a);
      h = g;
   }
}
