import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class crh {
   public static final crd a;
   public static final crd b;
   public static final crd c;
   public static final crd d;
   public static final crd e;
   public static final cre f;
   public static final Codec<crf> g;
   public static final crf h;
   public static final crf i;

   public static String a(crf $$0, crf $$1) {
      return a(f, $$0, $$1);
   }

   public static String a(cre $$0, crf $$1, crf $$2) {
      Set<ali> $$3 = $$0.b($$2);
      Set<ali> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ali::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(crf $$0) {
      return !$$0.a(h);
   }

   static {
      cre.a $$0 = new cre.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a("redstone_experiments");
      e = $$0.a("minecart_improvements");
      f = $$0.a();
      g = f.b();
      h = crf.a(a);
      i = h;
   }
}
