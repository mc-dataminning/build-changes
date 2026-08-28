import com.google.common.collect.Maps;
import java.util.Map;

public final class cmp {
   public static final cmp a = a("desert");
   public static final cmp b = a("jungle");
   public static final cmp c = a("plains");
   public static final cmp d = a("savanna");
   public static final cmp e = a("snow");
   public static final cmp f = a("swamp");
   public static final cmp g = a("taiga");
   private final String h;
   private static final Map<ale<dcx>, cmp> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dde.A, a);
      $$0.put(dde.f, a);
      $$0.put(dde.B, a);
      $$0.put(dde.C, a);
      $$0.put(dde.z, b);
      $$0.put(dde.x, b);
      $$0.put(dde.y, b);
      $$0.put(dde.s, d);
      $$0.put(dde.r, d);
      $$0.put(dde.w, d);
      $$0.put(dde.X, e);
      $$0.put(dde.W, e);
      $$0.put(dde.L, e);
      $$0.put(dde.e, e);
      $$0.put(dde.N, e);
      $$0.put(dde.q, e);
      $$0.put(dde.d, e);
      $$0.put(dde.F, e);
      $$0.put(dde.G, e);
      $$0.put(dde.H, e);
      $$0.put(dde.I, e);
      $$0.put(dde.g, f);
      $$0.put(dde.h, f);
      $$0.put(dde.o, g);
      $$0.put(dde.n, g);
      $$0.put(dde.u, g);
      $$0.put(dde.t, g);
      $$0.put(dde.p, g);
      $$0.put(dde.v, g);
   });

   private cmp(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cmp a(String $$0) {
      return jv.a(lp.y, new alf($$0), new cmp($$0));
   }

   public static cmp a(ji<dcx> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
