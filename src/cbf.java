import com.google.common.collect.Maps;
import java.util.Map;

public final class cbf {
   public static final cbf a = a("desert");
   public static final cbf b = a("jungle");
   public static final cbf c = a("plains");
   public static final cbf d = a("savanna");
   public static final cbf e = a("snow");
   public static final cbf f = a("swamp");
   public static final cbf g = a("taiga");
   private final String h;
   private static final Map<aeq<cqk>, cbf> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cqr.A, a);
      $$0.put(cqr.f, a);
      $$0.put(cqr.B, a);
      $$0.put(cqr.C, a);
      $$0.put(cqr.z, b);
      $$0.put(cqr.x, b);
      $$0.put(cqr.y, b);
      $$0.put(cqr.s, d);
      $$0.put(cqr.r, d);
      $$0.put(cqr.w, d);
      $$0.put(cqr.X, e);
      $$0.put(cqr.W, e);
      $$0.put(cqr.L, e);
      $$0.put(cqr.e, e);
      $$0.put(cqr.N, e);
      $$0.put(cqr.q, e);
      $$0.put(cqr.d, e);
      $$0.put(cqr.F, e);
      $$0.put(cqr.G, e);
      $$0.put(cqr.H, e);
      $$0.put(cqr.I, e);
      $$0.put(cqr.g, f);
      $$0.put(cqr.h, f);
      $$0.put(cqr.o, g);
      $$0.put(cqr.n, g);
      $$0.put(cqr.u, g);
      $$0.put(cqr.t, g);
      $$0.put(cqr.p, g);
      $$0.put(cqr.v, g);
   });

   private cbf(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cbf a(String $$0) {
      return hr.a(jb.z, new aer($$0), new cbf($$0));
   }

   public static cbf a(he<cqk> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
