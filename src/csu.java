import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class csu {
   public static final csq a;
   public static final csq b;
   public static final csq c;
   public static final csq d;
   public static final csq e;
   public static final csr f;
   public static final Codec<css> g;
   public static final css h;
   public static final css i;

   public static String a(css $$0, css $$1) {
      return a(f, $$0, $$1);
   }

   public static String a(csr $$0, css $$1, css $$2) {
      Set<alz> $$3 = $$0.b($$2);
      Set<alz> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alz::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(css $$0) {
      return !$$0.a(h);
   }

   static {
      csr.a $$0 = new csr.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("winter_drop");
      c = $$0.a("trade_rebalance");
      d = $$0.a("redstone_experiments");
      e = $$0.a("minecart_improvements");
      f = $$0.a();
      g = f.b();
      h = css.a(a);
      i = h;
   }
}
