import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cjy {
   public static final cju a;
   public static final cju b;
   public static final cju c;
   public static final cju d;
   public static final cjv e;
   public static final Codec<cjw> f;
   public static final cjw g;
   public static final cjw h;

   public static String a(cjw $$0, cjw $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cjv $$0, cjw $$1, cjw $$2) {
      Set<aiy> $$3 = $$0.b($$2);
      Set<aiy> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(aiy::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cjw $$0) {
      return !$$0.a(g);
   }

   static {
      cjv.a $$0 = new cjv.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cjw.a(a);
      h = g;
   }
}
