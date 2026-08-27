import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cna {
   public static final cmw a;
   public static final cmw b;
   public static final cmw c;
   public static final cmw d;
   public static final cmx e;
   public static final Codec<cmy> f;
   public static final cmy g;
   public static final cmy h;

   public static String a(cmy $$0, cmy $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cmx $$0, cmy $$1, cmy $$2) {
      Set<akf> $$3 = $$0.b($$2);
      Set<akf> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akf::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cmy $$0) {
      return !$$0.a(g);
   }

   static {
      cmx.a $$0 = new cmx.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cmy.a(a);
      h = g;
   }
}
