import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class col {
   public static final coh a;
   public static final coh b;
   public static final coh c;
   public static final coh d;
   public static final coi e;
   public static final Codec<coj> f;
   public static final coj g;
   public static final coj h;

   public static String a(coj $$0, coj $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(coi $$0, coj $$1, coj $$2) {
      Set<akm> $$3 = $$0.b($$2);
      Set<akm> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akm::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(coj $$0) {
      return !$$0.a(g);
   }

   static {
      coi.a $$0 = new coi.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = coj.a(a);
      h = g;
   }
}
