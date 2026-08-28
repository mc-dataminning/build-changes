import com.google.common.collect.Maps;
import java.util.Map;

public final class coh {
   public static final coh a = a("desert");
   public static final coh b = a("jungle");
   public static final coh c = a("plains");
   public static final coh d = a("savanna");
   public static final coh e = a("snow");
   public static final coh f = a("swamp");
   public static final coh g = a("taiga");
   private final String h;
   private static final Map<alk<dgh>, coh> i = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dgo.A, a);
      $$0.put(dgo.f, a);
      $$0.put(dgo.B, a);
      $$0.put(dgo.C, a);
      $$0.put(dgo.z, b);
      $$0.put(dgo.x, b);
      $$0.put(dgo.y, b);
      $$0.put(dgo.s, d);
      $$0.put(dgo.r, d);
      $$0.put(dgo.w, d);
      $$0.put(dgo.X, e);
      $$0.put(dgo.W, e);
      $$0.put(dgo.L, e);
      $$0.put(dgo.e, e);
      $$0.put(dgo.N, e);
      $$0.put(dgo.q, e);
      $$0.put(dgo.d, e);
      $$0.put(dgo.F, e);
      $$0.put(dgo.G, e);
      $$0.put(dgo.H, e);
      $$0.put(dgo.I, e);
      $$0.put(dgo.g, f);
      $$0.put(dgo.h, f);
      $$0.put(dgo.o, g);
      $$0.put(dgo.n, g);
      $$0.put(dgo.u, g);
      $$0.put(dgo.t, g);
      $$0.put(dgo.p, g);
      $$0.put(dgo.v, g);
   });

   private coh(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static coh a(String $$0) {
      return kd.a(lz.w, all.b($$0), new coh($$0));
   }

   public static coh a(jq<dgh> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
