import com.google.common.collect.Maps;
import java.util.Map;

public final class cbs {
   public static final cbs a = a("desert");
   public static final cbs b = a("jungle");
   public static final cbs c = a("plains");
   public static final cbs d = a("savanna");
   public static final cbs e = a("snow");
   public static final cbs f = a("swamp");
   public static final cbs g = a("taiga");
   private final String h;
   private static final Map<aey<cqz>, cbs> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(crg.A, a);
      $$0.put(crg.f, a);
      $$0.put(crg.B, a);
      $$0.put(crg.C, a);
      $$0.put(crg.z, b);
      $$0.put(crg.x, b);
      $$0.put(crg.y, b);
      $$0.put(crg.s, d);
      $$0.put(crg.r, d);
      $$0.put(crg.w, d);
      $$0.put(crg.X, e);
      $$0.put(crg.W, e);
      $$0.put(crg.L, e);
      $$0.put(crg.e, e);
      $$0.put(crg.N, e);
      $$0.put(crg.q, e);
      $$0.put(crg.d, e);
      $$0.put(crg.F, e);
      $$0.put(crg.G, e);
      $$0.put(crg.H, e);
      $$0.put(crg.I, e);
      $$0.put(crg.g, f);
      $$0.put(crg.h, f);
      $$0.put(crg.o, g);
      $$0.put(crg.n, g);
      $$0.put(crg.u, g);
      $$0.put(crg.t, g);
      $$0.put(crg.p, g);
      $$0.put(crg.v, g);
   });

   private cbs(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cbs a(String $$0) {
      return hq.a(jb.z, new aez($$0), new cbs($$0));
   }

   public static cbs a(he<cqz> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
