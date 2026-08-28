import com.google.common.collect.Maps;
import java.util.Map;

public final class cpn {
   public static final cpn a = a("desert");
   public static final cpn b = a("jungle");
   public static final cpn c = a("plains");
   public static final cpn d = a("savanna");
   public static final cpn e = a("snow");
   public static final cpn f = a("swamp");
   public static final cpn g = a("taiga");
   private final String h;
   private static final Map<aly<dij>, cpn> i = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(diq.A, a);
      $$0.put(diq.f, a);
      $$0.put(diq.B, a);
      $$0.put(diq.C, a);
      $$0.put(diq.z, b);
      $$0.put(diq.x, b);
      $$0.put(diq.y, b);
      $$0.put(diq.s, d);
      $$0.put(diq.r, d);
      $$0.put(diq.w, d);
      $$0.put(diq.X, e);
      $$0.put(diq.W, e);
      $$0.put(diq.L, e);
      $$0.put(diq.e, e);
      $$0.put(diq.N, e);
      $$0.put(diq.q, e);
      $$0.put(diq.d, e);
      $$0.put(diq.F, e);
      $$0.put(diq.G, e);
      $$0.put(diq.H, e);
      $$0.put(diq.I, e);
      $$0.put(diq.g, f);
      $$0.put(diq.h, f);
      $$0.put(diq.o, g);
      $$0.put(diq.n, g);
      $$0.put(diq.u, g);
      $$0.put(diq.t, g);
      $$0.put(diq.p, g);
      $$0.put(diq.v, g);
   });

   private cpn(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cpn a(String $$0) {
      return kd.a(ma.w, alz.b($$0), new cpn($$0));
   }

   public static cpn a(jq<dij> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
