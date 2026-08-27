import com.google.common.collect.Maps;
import java.util.Map;

public final class cfi {
   public static final cfi a = a("desert");
   public static final cfi b = a("jungle");
   public static final cfi c = a("plains");
   public static final cfi d = a("savanna");
   public static final cfi e = a("snow");
   public static final cfi f = a("swamp");
   public static final cfi g = a("taiga");
   private final String h;
   private static final Map<ahg<cuw>, cfi> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cvd.A, a);
      $$0.put(cvd.f, a);
      $$0.put(cvd.B, a);
      $$0.put(cvd.C, a);
      $$0.put(cvd.z, b);
      $$0.put(cvd.x, b);
      $$0.put(cvd.y, b);
      $$0.put(cvd.s, d);
      $$0.put(cvd.r, d);
      $$0.put(cvd.w, d);
      $$0.put(cvd.X, e);
      $$0.put(cvd.W, e);
      $$0.put(cvd.L, e);
      $$0.put(cvd.e, e);
      $$0.put(cvd.N, e);
      $$0.put(cvd.q, e);
      $$0.put(cvd.d, e);
      $$0.put(cvd.F, e);
      $$0.put(cvd.G, e);
      $$0.put(cvd.H, e);
      $$0.put(cvd.I, e);
      $$0.put(cvd.g, f);
      $$0.put(cvd.h, f);
      $$0.put(cvd.o, g);
      $$0.put(cvd.n, g);
      $$0.put(cvd.u, g);
      $$0.put(cvd.t, g);
      $$0.put(cvd.p, g);
      $$0.put(cvd.v, g);
   });

   private cfi(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cfi a(String $$0) {
      return it.a(kd.y, new ahh($$0), new cfi($$0));
   }

   public static cfi a(ih<cuw> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
