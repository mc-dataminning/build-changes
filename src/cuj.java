import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cuj {
   public static final cuf a;
   public static final cuf b;
   public static final cuf c;
   public static final cuf d;
   public static final cug e;
   public static final Codec<cuh> f;
   public static final cuh g;
   public static final cuh h;

   public static String a(cuh $$0, cuh $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cug $$0, cuh $$1, cuh $$2) {
      Set<alg> $$3 = $$0.b($$2);
      Set<alg> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alg::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cuh $$0) {
      return !$$0.a(g);
   }

   static {
      cug.a $$0 = new cug.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = cuh.a(a);
      h = g;
   }
}
