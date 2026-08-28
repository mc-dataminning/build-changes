import com.google.common.collect.Maps;
import java.util.Map;

public final class cmo {
   public static final cmo a = a("desert");
   public static final cmo b = a("jungle");
   public static final cmo c = a("plains");
   public static final cmo d = a("savanna");
   public static final cmo e = a("snow");
   public static final cmo f = a("swamp");
   public static final cmo g = a("taiga");
   private final String h;
   private static final Map<ald<dcw>, cmo> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddd.A, a);
      $$0.put(ddd.f, a);
      $$0.put(ddd.B, a);
      $$0.put(ddd.C, a);
      $$0.put(ddd.z, b);
      $$0.put(ddd.x, b);
      $$0.put(ddd.y, b);
      $$0.put(ddd.s, d);
      $$0.put(ddd.r, d);
      $$0.put(ddd.w, d);
      $$0.put(ddd.X, e);
      $$0.put(ddd.W, e);
      $$0.put(ddd.L, e);
      $$0.put(ddd.e, e);
      $$0.put(ddd.N, e);
      $$0.put(ddd.q, e);
      $$0.put(ddd.d, e);
      $$0.put(ddd.F, e);
      $$0.put(ddd.G, e);
      $$0.put(ddd.H, e);
      $$0.put(ddd.I, e);
      $$0.put(ddd.g, f);
      $$0.put(ddd.h, f);
      $$0.put(ddd.o, g);
      $$0.put(ddd.n, g);
      $$0.put(ddd.u, g);
      $$0.put(ddd.t, g);
      $$0.put(ddd.p, g);
      $$0.put(ddd.v, g);
   });

   private cmo(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cmo a(String $$0) {
      return jv.a(lp.y, new ale($$0), new cmo($$0));
   }

   public static cmo a(ji<dcw> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
