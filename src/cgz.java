import com.google.common.collect.Maps;
import java.util.Map;

public final class cgz {
   public static final cgz a = a("desert");
   public static final cgz b = a("jungle");
   public static final cgz c = a("plains");
   public static final cgz d = a("savanna");
   public static final cgz e = a("snow");
   public static final cgz f = a("swamp");
   public static final cgz g = a("taiga");
   private final String h;
   private static final Map<aix<cwm>, cgz> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cwt.A, a);
      $$0.put(cwt.f, a);
      $$0.put(cwt.B, a);
      $$0.put(cwt.C, a);
      $$0.put(cwt.z, b);
      $$0.put(cwt.x, b);
      $$0.put(cwt.y, b);
      $$0.put(cwt.s, d);
      $$0.put(cwt.r, d);
      $$0.put(cwt.w, d);
      $$0.put(cwt.X, e);
      $$0.put(cwt.W, e);
      $$0.put(cwt.L, e);
      $$0.put(cwt.e, e);
      $$0.put(cwt.N, e);
      $$0.put(cwt.q, e);
      $$0.put(cwt.d, e);
      $$0.put(cwt.F, e);
      $$0.put(cwt.G, e);
      $$0.put(cwt.H, e);
      $$0.put(cwt.I, e);
      $$0.put(cwt.g, f);
      $$0.put(cwt.h, f);
      $$0.put(cwt.o, g);
      $$0.put(cwt.n, g);
      $$0.put(cwt.u, g);
      $$0.put(cwt.t, g);
      $$0.put(cwt.p, g);
      $$0.put(cwt.v, g);
   });

   private cgz(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cgz a(String $$0) {
      return iv.a(kf.y, new aiy($$0), new cgz($$0));
   }

   public static cgz a(ij<cwm> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
