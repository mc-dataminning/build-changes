import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cpi {
   public static final cpe a;
   public static final cpe b;
   public static final cpe c;
   public static final cpe d;
   public static final cpf e;
   public static final Codec<cpg> f;
   public static final cpg g;
   public static final cpg h;

   public static String a(cpg $$0, cpg $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cpf $$0, cpg $$1, cpg $$2) {
      Set<alb> $$3 = $$0.b($$2);
      Set<alb> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(alb::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cpg $$0) {
      return !$$0.a(g);
   }

   static {
      cpf.a $$0 = new cpf.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      d = $$0.a("trade_rebalance");
      c = $$0.a("update_1_21");
      e = $$0.a();
      f = e.b();
      g = cpg.a(a);
      h = g;
   }
}
