import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cpo {
   public static final cpk a;
   public static final cpk b;
   public static final cpk c;
   public static final cpk d;
   public static final cpl e;
   public static final Codec<cpm> f;
   public static final cpm g;
   public static final cpm h;

   public static String a(cpm $$0, cpm $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cpl $$0, cpm $$1, cpm $$2) {
      Set<alf> $$3 = $$0.b($$2);
      Set<alf> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alf::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cpm $$0) {
      return !$$0.a(g);
   }

   static {
      cpl.a $$0 = new cpl.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cpm.a(a);
      h = g;
   }
}
