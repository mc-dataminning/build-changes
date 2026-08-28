import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class csq {
   public static final csm a;
   public static final csm b;
   public static final csm c;
   public static final csm d;
   public static final csm e;
   public static final csn f;
   public static final Codec<cso> g;
   public static final cso h;
   public static final cso i;

   public static String a(cso $$0, cso $$1) {
      return a(f, $$0, $$1);
   }

   public static String a(csn $$0, cso $$1, cso $$2) {
      Set<alz> $$3 = $$0.b($$2);
      Set<alz> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alz::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cso $$0) {
      return !$$0.a(h);
   }

   static {
      csn.a $$0 = new csn.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("winter_drop");
      c = $$0.a("trade_rebalance");
      d = $$0.a("redstone_experiments");
      e = $$0.a("minecart_improvements");
      f = $$0.a();
      g = f.b();
      h = cso.a(a);
      i = h;
   }
}
