import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class crc {
   public static final cqy a;
   public static final cqy b;
   public static final cqy c;
   public static final cqy d;
   public static final cqy e;
   public static final cqz f;
   public static final Codec<cra> g;
   public static final cra h;
   public static final cra i;

   public static String a(cra $$0, cra $$1) {
      return a(f, $$0, $$1);
   }

   public static String a(cqz $$0, cra $$1, cra $$2) {
      Set<alh> $$3 = $$0.b($$2);
      Set<alh> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alh::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cra $$0) {
      return !$$0.a(h);
   }

   static {
      cqz.a $$0 = new cqz.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a("redstone_experiments");
      e = $$0.a("minecart_improvements");
      f = $$0.a();
      g = f.b();
      h = cra.a(a);
      i = h;
   }
}
