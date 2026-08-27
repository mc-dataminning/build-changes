import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cmi {
   public static final cme a;
   public static final cme b;
   public static final cme c;
   public static final cme d;
   public static final cmf e;
   public static final Codec<cmg> f;
   public static final cmg g;
   public static final cmg h;

   public static String a(cmg $$0, cmg $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cmf $$0, cmg $$1, cmg $$2) {
      Set<ajt> $$3 = $$0.b($$2);
      Set<ajt> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ajt::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cmg $$0) {
      return !$$0.a(g);
   }

   static {
      cmf.a $$0 = new cmf.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cmg.a(a);
      h = g;
   }
}
