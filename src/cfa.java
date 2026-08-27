import com.google.common.collect.Maps;
import java.util.Map;

public final class cfa {
   public static final cfa a = a("desert");
   public static final cfa b = a("jungle");
   public static final cfa c = a("plains");
   public static final cfa d = a("savanna");
   public static final cfa e = a("snow");
   public static final cfa f = a("swamp");
   public static final cfa g = a("taiga");
   private final String h;
   private static final Map<ahf<cuo>, cfa> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cuv.A, a);
      $$0.put(cuv.f, a);
      $$0.put(cuv.B, a);
      $$0.put(cuv.C, a);
      $$0.put(cuv.z, b);
      $$0.put(cuv.x, b);
      $$0.put(cuv.y, b);
      $$0.put(cuv.s, d);
      $$0.put(cuv.r, d);
      $$0.put(cuv.w, d);
      $$0.put(cuv.X, e);
      $$0.put(cuv.W, e);
      $$0.put(cuv.L, e);
      $$0.put(cuv.e, e);
      $$0.put(cuv.N, e);
      $$0.put(cuv.q, e);
      $$0.put(cuv.d, e);
      $$0.put(cuv.F, e);
      $$0.put(cuv.G, e);
      $$0.put(cuv.H, e);
      $$0.put(cuv.I, e);
      $$0.put(cuv.g, f);
      $$0.put(cuv.h, f);
      $$0.put(cuv.o, g);
      $$0.put(cuv.n, g);
      $$0.put(cuv.u, g);
      $$0.put(cuv.t, g);
      $$0.put(cuv.p, g);
      $$0.put(cuv.v, g);
   });

   private cfa(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cfa a(String $$0) {
      return it.a(kd.y, new ahg($$0), new cfa($$0));
   }

   public static cfa a(ih<cuo> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
