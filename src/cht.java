import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cht {
   public static final chp a;
   public static final chp b;
   public static final chp c;
   public static final chp d;
   public static final chq e;
   public static final Codec<chr> f;
   public static final chr g;
   public static final chr h;

   public static String a(chr $$0, chr $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(chq $$0, chr $$1, chr $$2) {
      Set<ahg> $$3 = $$0.b($$2);
      Set<ahg> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ahg::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(chr $$0) {
      return !$$0.a(g);
   }

   static {
      chq.a $$0 = new chq.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = chr.a(a);
      h = g;
   }
}
