import com.google.common.collect.Maps;
import java.util.Map;

public final class cbd {
   public static final cbd a = a("desert");
   public static final cbd b = a("jungle");
   public static final cbd c = a("plains");
   public static final cbd d = a("savanna");
   public static final cbd e = a("snow");
   public static final cbd f = a("swamp");
   public static final cbd g = a("taiga");
   private final String h;
   private static final Map<aeo<cqi>, cbd> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cqp.A, a);
      $$0.put(cqp.f, a);
      $$0.put(cqp.B, a);
      $$0.put(cqp.C, a);
      $$0.put(cqp.z, b);
      $$0.put(cqp.x, b);
      $$0.put(cqp.y, b);
      $$0.put(cqp.s, d);
      $$0.put(cqp.r, d);
      $$0.put(cqp.w, d);
      $$0.put(cqp.X, e);
      $$0.put(cqp.W, e);
      $$0.put(cqp.L, e);
      $$0.put(cqp.e, e);
      $$0.put(cqp.N, e);
      $$0.put(cqp.q, e);
      $$0.put(cqp.d, e);
      $$0.put(cqp.F, e);
      $$0.put(cqp.G, e);
      $$0.put(cqp.H, e);
      $$0.put(cqp.I, e);
      $$0.put(cqp.g, f);
      $$0.put(cqp.h, f);
      $$0.put(cqp.o, g);
      $$0.put(cqp.n, g);
      $$0.put(cqp.u, g);
      $$0.put(cqp.t, g);
      $$0.put(cqp.p, g);
      $$0.put(cqp.v, g);
   });

   private cbd(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cbd a(String $$0) {
      return hs.a(jc.z, new aep($$0), new cbd($$0));
   }

   public static cbd a(hf<cqi> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
