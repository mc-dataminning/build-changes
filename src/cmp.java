import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cmp {
   public static final cml a;
   public static final cml b;
   public static final cml c;
   public static final cml d;
   public static final cmm e;
   public static final Codec<cmn> f;
   public static final cmn g;
   public static final cmn h;

   public static String a(cmn $$0, cmn $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cmm $$0, cmn $$1, cmn $$2) {
      Set<ajv> $$3 = $$0.b($$2);
      Set<ajv> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ajv::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cmn $$0) {
      return !$$0.a(g);
   }

   static {
      cmm.a $$0 = new cmm.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cmn.a(a);
      h = g;
   }
}
