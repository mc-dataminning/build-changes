import com.google.common.collect.Maps;
import java.util.Map;

public final class cpo {
   public static final cpo a = a("desert");
   public static final cpo b = a("jungle");
   public static final cpo c = a("plains");
   public static final cpo d = a("savanna");
   public static final cpo e = a("snow");
   public static final cpo f = a("swamp");
   public static final cpo g = a("taiga");
   private final String h;
   private static final Map<aly<dik>, cpo> i = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dir.A, a);
      $$0.put(dir.f, a);
      $$0.put(dir.B, a);
      $$0.put(dir.C, a);
      $$0.put(dir.z, b);
      $$0.put(dir.x, b);
      $$0.put(dir.y, b);
      $$0.put(dir.s, d);
      $$0.put(dir.r, d);
      $$0.put(dir.w, d);
      $$0.put(dir.X, e);
      $$0.put(dir.W, e);
      $$0.put(dir.L, e);
      $$0.put(dir.e, e);
      $$0.put(dir.N, e);
      $$0.put(dir.q, e);
      $$0.put(dir.d, e);
      $$0.put(dir.F, e);
      $$0.put(dir.G, e);
      $$0.put(dir.H, e);
      $$0.put(dir.I, e);
      $$0.put(dir.g, f);
      $$0.put(dir.h, f);
      $$0.put(dir.o, g);
      $$0.put(dir.n, g);
      $$0.put(dir.u, g);
      $$0.put(dir.t, g);
      $$0.put(dir.p, g);
      $$0.put(dir.v, g);
   });

   private cpo(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cpo a(String $$0) {
      return kd.a(ma.w, alz.b($$0), new cpo($$0));
   }

   public static cpo a(jq<dik> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
