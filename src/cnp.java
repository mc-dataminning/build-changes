import com.google.common.collect.Maps;
import java.util.Map;

public final class cnp {
   public static final cnp a = a("desert");
   public static final cnp b = a("jungle");
   public static final cnp c = a("plains");
   public static final cnp d = a("savanna");
   public static final cnp e = a("snow");
   public static final cnp f = a("swamp");
   public static final cnp g = a("taiga");
   private final String h;
   private static final Map<ald<dfk>, cnp> i = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfr.A, a);
      $$0.put(dfr.f, a);
      $$0.put(dfr.B, a);
      $$0.put(dfr.C, a);
      $$0.put(dfr.z, b);
      $$0.put(dfr.x, b);
      $$0.put(dfr.y, b);
      $$0.put(dfr.s, d);
      $$0.put(dfr.r, d);
      $$0.put(dfr.w, d);
      $$0.put(dfr.X, e);
      $$0.put(dfr.W, e);
      $$0.put(dfr.L, e);
      $$0.put(dfr.e, e);
      $$0.put(dfr.N, e);
      $$0.put(dfr.q, e);
      $$0.put(dfr.d, e);
      $$0.put(dfr.F, e);
      $$0.put(dfr.G, e);
      $$0.put(dfr.H, e);
      $$0.put(dfr.I, e);
      $$0.put(dfr.g, f);
      $$0.put(dfr.h, f);
      $$0.put(dfr.o, g);
      $$0.put(dfr.n, g);
      $$0.put(dfr.u, g);
      $$0.put(dfr.t, g);
      $$0.put(dfr.p, g);
      $$0.put(dfr.v, g);
   });

   private cnp(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cnp a(String $$0) {
      return kb.a(lv.w, ale.b($$0), new cnp($$0));
   }

   public static cnp a(jo<dfk> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
