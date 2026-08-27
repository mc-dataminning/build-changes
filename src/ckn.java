import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class ckn {
   public static final ckj a;
   public static final ckj b;
   public static final ckj c;
   public static final ckj d;
   public static final ckk e;
   public static final Codec<ckl> f;
   public static final ckl g;
   public static final ckl h;

   public static String a(ckl $$0, ckl $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(ckk $$0, ckl $$1, ckl $$2) {
      Set<ajc> $$3 = $$0.b($$2);
      Set<ajc> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ajc::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(ckl $$0) {
      return !$$0.a(g);
   }

   static {
      ckk.a $$0 = new ckk.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = ckl.a(a);
      h = g;
   }
}
