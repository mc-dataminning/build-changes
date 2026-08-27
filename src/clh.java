import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class clh {
   public static final cld a;
   public static final cld b;
   public static final cld c;
   public static final cld d;
   public static final cle e;
   public static final Codec<clf> f;
   public static final clf g;
   public static final clf h;

   public static String a(clf $$0, clf $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cle $$0, clf $$1, clf $$2) {
      Set<ajh> $$3 = $$0.b($$2);
      Set<ajh> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ajh::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(clf $$0) {
      return !$$0.a(g);
   }

   static {
      cle.a $$0 = new cle.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = clf.a(a);
      h = g;
   }
}
