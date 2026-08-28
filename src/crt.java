import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class crt {
   public static final crp a;
   public static final crp b;
   public static final crp c;
   public static final crp d;
   public static final crq e;
   public static final Codec<crr> f;
   public static final crr g;
   public static final crr h;

   public static String a(crr $$0, crr $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(crq $$0, crr $$1, crr $$2) {
      Set<aku> $$3 = $$0.b($$2);
      Set<aku> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(aku::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(crr $$0) {
      return !$$0.a(g);
   }

   static {
      crq.a $$0 = new crq.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = crr.a(a);
      h = g;
   }
}
