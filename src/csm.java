import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class csm {
   public static final csi a;
   public static final csi b;
   public static final csi c;
   public static final csi d;
   public static final csj e;
   public static final Codec<csk> f;
   public static final csk g;
   public static final csk h;

   public static String a(csk $$0, csk $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(csj $$0, csk $$1, csk $$2) {
      Set<alp> $$3 = $$0.b($$2);
      Set<alp> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alp::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(csk $$0) {
      return !$$0.a(g);
   }

   static {
      csj.a $$0 = new csj.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = csk.a(a);
      h = g;
   }
}
