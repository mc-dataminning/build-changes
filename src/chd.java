import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class chd {
   public static final cgz a;
   public static final cgz b;
   public static final cgz c;
   public static final cgz d;
   public static final cha e;
   public static final Codec<chb> f;
   public static final chb g;
   public static final chb h;

   public static String a(chb $$0, chb $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cha $$0, chb $$1, chb $$2) {
      Set<agt> $$3 = $$0.b($$2);
      Set<agt> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(agt::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(chb $$0) {
      return !$$0.a(g);
   }

   static {
      cha.a $$0 = new cha.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = chb.a(a);
      h = g;
   }
}
