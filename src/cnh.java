import com.google.common.collect.Maps;
import java.util.Map;

public final class cnh {
   public static final cnh a = a("desert");
   public static final cnh b = a("jungle");
   public static final cnh c = a("plains");
   public static final cnh d = a("savanna");
   public static final cnh e = a("snow");
   public static final cnh f = a("swamp");
   public static final cnh g = a("taiga");
   private final String h;
   private static final Map<ala<det>, cnh> i = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfa.A, a);
      $$0.put(dfa.f, a);
      $$0.put(dfa.B, a);
      $$0.put(dfa.C, a);
      $$0.put(dfa.z, b);
      $$0.put(dfa.x, b);
      $$0.put(dfa.y, b);
      $$0.put(dfa.s, d);
      $$0.put(dfa.r, d);
      $$0.put(dfa.w, d);
      $$0.put(dfa.X, e);
      $$0.put(dfa.W, e);
      $$0.put(dfa.L, e);
      $$0.put(dfa.e, e);
      $$0.put(dfa.N, e);
      $$0.put(dfa.q, e);
      $$0.put(dfa.d, e);
      $$0.put(dfa.F, e);
      $$0.put(dfa.G, e);
      $$0.put(dfa.H, e);
      $$0.put(dfa.I, e);
      $$0.put(dfa.g, f);
      $$0.put(dfa.h, f);
      $$0.put(dfa.o, g);
      $$0.put(dfa.n, g);
      $$0.put(dfa.u, g);
      $$0.put(dfa.t, g);
      $$0.put(dfa.p, g);
      $$0.put(dfa.v, g);
   });

   private cnh(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cnh a(String $$0) {
      return ka.a(lu.w, alb.b($$0), new cnh($$0));
   }

   public static cnh a(jn<det> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
