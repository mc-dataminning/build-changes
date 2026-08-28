import com.google.common.collect.Maps;
import java.util.Map;

public final class cnm {
   public static final cnm a = a("desert");
   public static final cnm b = a("jungle");
   public static final cnm c = a("plains");
   public static final cnm d = a("savanna");
   public static final cnm e = a("snow");
   public static final cnm f = a("swamp");
   public static final cnm g = a("taiga");
   private final String h;
   private static final Map<alb<dfh>, cnm> i = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfo.A, a);
      $$0.put(dfo.f, a);
      $$0.put(dfo.B, a);
      $$0.put(dfo.C, a);
      $$0.put(dfo.z, b);
      $$0.put(dfo.x, b);
      $$0.put(dfo.y, b);
      $$0.put(dfo.s, d);
      $$0.put(dfo.r, d);
      $$0.put(dfo.w, d);
      $$0.put(dfo.X, e);
      $$0.put(dfo.W, e);
      $$0.put(dfo.L, e);
      $$0.put(dfo.e, e);
      $$0.put(dfo.N, e);
      $$0.put(dfo.q, e);
      $$0.put(dfo.d, e);
      $$0.put(dfo.F, e);
      $$0.put(dfo.G, e);
      $$0.put(dfo.H, e);
      $$0.put(dfo.I, e);
      $$0.put(dfo.g, f);
      $$0.put(dfo.h, f);
      $$0.put(dfo.o, g);
      $$0.put(dfo.n, g);
      $$0.put(dfo.u, g);
      $$0.put(dfo.t, g);
      $$0.put(dfo.p, g);
      $$0.put(dfo.v, g);
   });

   private cnm(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cnm a(String $$0) {
      return ka.a(lu.w, alc.b($$0), new cnm($$0));
   }

   public static cnm a(jn<dfh> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
