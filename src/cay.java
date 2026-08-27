import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cay {
   public static final cau a;
   public static final cau b;
   public static final cav c;
   public static final Codec<caw> d;
   public static final caw e;
   public static final caw f;

   public static String a(caw $$0, caw $$1) {
      return a(c, $$0, $$1);
   }

   public static String a(cav $$0, caw $$1, caw $$2) {
      Set<acq> $$3 = $$0.b($$2);
      Set<acq> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(acq::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(caw $$0) {
      return !$$0.a(e);
   }

   static {
      cav.a $$0 = new cav.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a();
      d = c.b();
      e = caw.a(a);
      f = e;
   }
}
