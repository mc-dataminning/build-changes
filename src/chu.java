import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class chu {
   public static final chq a;
   public static final chq b;
   public static final chq c;
   public static final chq d;
   public static final chr e;
   public static final Codec<chs> f;
   public static final chs g;
   public static final chs h;

   public static String a(chs $$0, chs $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(chr $$0, chs $$1, chs $$2) {
      Set<ahg> $$3 = $$0.b($$2);
      Set<ahg> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ahg::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(chs $$0) {
      return !$$0.a(g);
   }

   static {
      chr.a $$0 = new chr.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = chs.a(a);
      h = g;
   }
}
