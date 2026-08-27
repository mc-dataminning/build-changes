import com.google.common.collect.Maps;
import java.util.Map;

public final class cik {
   public static final cik a = a("desert");
   public static final cik b = a("jungle");
   public static final cik c = a("plains");
   public static final cik d = a("savanna");
   public static final cik e = a("snow");
   public static final cik f = a("swamp");
   public static final cik g = a("taiga");
   private final String h;
   private static final Map<ajg<cxy>, cik> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cyf.A, a);
      $$0.put(cyf.f, a);
      $$0.put(cyf.B, a);
      $$0.put(cyf.C, a);
      $$0.put(cyf.z, b);
      $$0.put(cyf.x, b);
      $$0.put(cyf.y, b);
      $$0.put(cyf.s, d);
      $$0.put(cyf.r, d);
      $$0.put(cyf.w, d);
      $$0.put(cyf.X, e);
      $$0.put(cyf.W, e);
      $$0.put(cyf.L, e);
      $$0.put(cyf.e, e);
      $$0.put(cyf.N, e);
      $$0.put(cyf.q, e);
      $$0.put(cyf.d, e);
      $$0.put(cyf.F, e);
      $$0.put(cyf.G, e);
      $$0.put(cyf.H, e);
      $$0.put(cyf.I, e);
      $$0.put(cyf.g, f);
      $$0.put(cyf.h, f);
      $$0.put(cyf.o, g);
      $$0.put(cyf.n, g);
      $$0.put(cyf.u, g);
      $$0.put(cyf.t, g);
      $$0.put(cyf.p, g);
      $$0.put(cyf.v, g);
   });

   private cik(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cik a(String $$0) {
      return iy.a(ki.y, new ajh($$0), new cik($$0));
   }

   public static cik a(il<cxy> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
