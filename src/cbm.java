import com.google.common.collect.Maps;
import java.util.Map;

public final class cbm {
   public static final cbm a = a("desert");
   public static final cbm b = a("jungle");
   public static final cbm c = a("plains");
   public static final cbm d = a("savanna");
   public static final cbm e = a("snow");
   public static final cbm f = a("swamp");
   public static final cbm g = a("taiga");
   private final String h;
   private static final Map<aev<cqt>, cbm> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cra.A, a);
      $$0.put(cra.f, a);
      $$0.put(cra.B, a);
      $$0.put(cra.C, a);
      $$0.put(cra.z, b);
      $$0.put(cra.x, b);
      $$0.put(cra.y, b);
      $$0.put(cra.s, d);
      $$0.put(cra.r, d);
      $$0.put(cra.w, d);
      $$0.put(cra.X, e);
      $$0.put(cra.W, e);
      $$0.put(cra.L, e);
      $$0.put(cra.e, e);
      $$0.put(cra.N, e);
      $$0.put(cra.q, e);
      $$0.put(cra.d, e);
      $$0.put(cra.F, e);
      $$0.put(cra.G, e);
      $$0.put(cra.H, e);
      $$0.put(cra.I, e);
      $$0.put(cra.g, f);
      $$0.put(cra.h, f);
      $$0.put(cra.o, g);
      $$0.put(cra.n, g);
      $$0.put(cra.u, g);
      $$0.put(cra.t, g);
      $$0.put(cra.p, g);
      $$0.put(cra.v, g);
   });

   private cbm(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cbm a(String $$0) {
      return hq.a(jb.z, new aew($$0), new cbm($$0));
   }

   public static cbm a(he<cqt> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
