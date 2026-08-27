import com.google.common.collect.Maps;
import java.util.Map;

public final class cde {
   public static final cde a = a("desert");
   public static final cde b = a("jungle");
   public static final cde c = a("plains");
   public static final cde d = a("savanna");
   public static final cde e = a("snow");
   public static final cde f = a("swamp");
   public static final cde g = a("taiga");
   private final String h;
   private static final Map<agf<csq>, cde> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(csx.A, a);
      $$0.put(csx.f, a);
      $$0.put(csx.B, a);
      $$0.put(csx.C, a);
      $$0.put(csx.z, b);
      $$0.put(csx.x, b);
      $$0.put(csx.y, b);
      $$0.put(csx.s, d);
      $$0.put(csx.r, d);
      $$0.put(csx.w, d);
      $$0.put(csx.X, e);
      $$0.put(csx.W, e);
      $$0.put(csx.L, e);
      $$0.put(csx.e, e);
      $$0.put(csx.N, e);
      $$0.put(csx.q, e);
      $$0.put(csx.d, e);
      $$0.put(csx.F, e);
      $$0.put(csx.G, e);
      $$0.put(csx.H, e);
      $$0.put(csx.I, e);
      $$0.put(csx.g, f);
      $$0.put(csx.h, f);
      $$0.put(csx.o, g);
      $$0.put(csx.n, g);
      $$0.put(csx.u, g);
      $$0.put(csx.t, g);
      $$0.put(csx.p, g);
      $$0.put(csx.v, g);
   });

   private cde(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cde a(String $$0) {
      return io.a(jy.z, new agg($$0), new cde($$0));
   }

   public static cde a(ib<csq> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
