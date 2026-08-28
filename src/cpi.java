import com.google.common.collect.Maps;
import java.util.Map;

public final class cpi {
   public static final cpi a = a("desert");
   public static final cpi b = a("jungle");
   public static final cpi c = a("plains");
   public static final cpi d = a("savanna");
   public static final cpi e = a("snow");
   public static final cpi f = a("swamp");
   public static final cpi g = a("taiga");
   private final String h;
   private static final Map<akt<dic>, cpi> i = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dij.B, a);
      $$0.put(dij.f, a);
      $$0.put(dij.C, a);
      $$0.put(dij.D, a);
      $$0.put(dij.A, b);
      $$0.put(dij.y, b);
      $$0.put(dij.z, b);
      $$0.put(dij.t, d);
      $$0.put(dij.s, d);
      $$0.put(dij.x, d);
      $$0.put(dij.Y, e);
      $$0.put(dij.X, e);
      $$0.put(dij.M, e);
      $$0.put(dij.e, e);
      $$0.put(dij.O, e);
      $$0.put(dij.r, e);
      $$0.put(dij.d, e);
      $$0.put(dij.G, e);
      $$0.put(dij.H, e);
      $$0.put(dij.I, e);
      $$0.put(dij.J, e);
      $$0.put(dij.g, f);
      $$0.put(dij.h, f);
      $$0.put(dij.p, g);
      $$0.put(dij.o, g);
      $$0.put(dij.v, g);
      $$0.put(dij.u, g);
      $$0.put(dij.q, g);
      $$0.put(dij.w, g);
   });

   private cpi(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cpi a(String $$0) {
      return ke.a(mb.w, aku.b($$0), new cpi($$0));
   }

   public static cpi a(jr<dic> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
