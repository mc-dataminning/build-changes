import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cvu {
   public static final cvq a;
   public static final cvq b;
   public static final cvq c;
   public static final cvq d;
   public static final cvr e;
   public static final Codec<cvs> f;
   public static final cvs g;
   public static final cvs h;

   public static String a(cvs $$0, cvs $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cvr $$0, cvs $$1, cvs $$2) {
      Set<alr> $$3 = $$0.b($$2);
      Set<alr> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alr::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cvs $$0) {
      return !$$0.a(g);
   }

   static {
      cvr.a $$0 = new cvr.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = cvs.a(a);
      h = g;
   }
}
