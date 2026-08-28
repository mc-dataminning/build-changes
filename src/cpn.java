import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cpn {
   public static final cpj a;
   public static final cpj b;
   public static final cpj c;
   public static final cpj d;
   public static final cpk e;
   public static final Codec<cpl> f;
   public static final cpl g;
   public static final cpl h;

   public static String a(cpl $$0, cpl $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cpk $$0, cpl $$1, cpl $$2) {
      Set<alf> $$3 = $$0.b($$2);
      Set<alf> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alf::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cpl $$0) {
      return !$$0.a(g);
   }

   static {
      cpk.a $$0 = new cpk.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cpl.a(a);
      h = g;
   }
}
