import com.google.common.collect.Maps;
import java.util.Map;

public final class cpj {
   public static final cpj a = a("desert");
   public static final cpj b = a("jungle");
   public static final cpj c = a("plains");
   public static final cpj d = a("savanna");
   public static final cpj e = a("snow");
   public static final cpj f = a("swamp");
   public static final cpj g = a("taiga");
   private final String h;
   private static final Map<aly<dic>, cpj> i = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dij.A, a);
      $$0.put(dij.f, a);
      $$0.put(dij.B, a);
      $$0.put(dij.C, a);
      $$0.put(dij.z, b);
      $$0.put(dij.x, b);
      $$0.put(dij.y, b);
      $$0.put(dij.s, d);
      $$0.put(dij.r, d);
      $$0.put(dij.w, d);
      $$0.put(dij.X, e);
      $$0.put(dij.W, e);
      $$0.put(dij.L, e);
      $$0.put(dij.e, e);
      $$0.put(dij.N, e);
      $$0.put(dij.q, e);
      $$0.put(dij.d, e);
      $$0.put(dij.F, e);
      $$0.put(dij.G, e);
      $$0.put(dij.H, e);
      $$0.put(dij.I, e);
      $$0.put(dij.g, f);
      $$0.put(dij.h, f);
      $$0.put(dij.o, g);
      $$0.put(dij.n, g);
      $$0.put(dij.u, g);
      $$0.put(dij.t, g);
      $$0.put(dij.p, g);
      $$0.put(dij.v, g);
   });

   private cpj(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cpj a(String $$0) {
      return kd.a(ma.w, alz.b($$0), new cpj($$0));
   }

   public static cpj a(jq<dic> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
