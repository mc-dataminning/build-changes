import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cpn {
   public static final cpj a;
   public static final cpj b;
   public static final cpj c;
   public static final cpk d;
   public static final Codec<cpl> e;
   public static final cpl f;
   public static final cpl g;

   public static String a(cpl $$0, cpl $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(cpk $$0, cpl $$1, cpl $$2) {
      Set<akr> $$3 = $$0.b($$2);
      Set<akr> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(akr::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cpl $$0) {
      return !$$0.a(f);
   }

   static {
      cpk.a $$0 = new cpk.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = cpl.a(a);
      g = f;
   }
}
