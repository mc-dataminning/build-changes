import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class chn {
   public static final chj a;
   public static final chj b;
   public static final chj c;
   public static final chj d;
   public static final chk e;
   public static final Codec<chl> f;
   public static final chl g;
   public static final chl h;

   public static String a(chl $$0, chl $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(chk $$0, chl $$1, chl $$2) {
      Set<ahd> $$3 = $$0.b($$2);
      Set<ahd> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ahd::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(chl $$0) {
      return !$$0.a(g);
   }

   static {
      chk.a $$0 = new chk.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = chl.a(a);
      h = g;
   }
}
