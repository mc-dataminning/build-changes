import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cek {
   public static final ceg a;
   public static final ceg b;
   public static final ceg c;
   public static final ceh d;
   public static final Codec<cei> e;
   public static final cei f;
   public static final cei g;

   public static String a(cei $$0, cei $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(ceh $$0, cei $$1, cei $$2) {
      Set<aez> $$3 = $$0.b($$2);
      Set<aez> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(aez::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cei $$0) {
      return !$$0.a(f);
   }

   static {
      ceh.a $$0 = new ceh.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = cei.a(a);
      g = f;
   }
}
