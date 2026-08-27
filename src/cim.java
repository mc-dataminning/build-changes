import com.google.common.collect.Maps;
import java.util.Map;

public final class cim {
   public static final cim a = a("desert");
   public static final cim b = a("jungle");
   public static final cim c = a("plains");
   public static final cim d = a("savanna");
   public static final cim e = a("snow");
   public static final cim f = a("swamp");
   public static final cim g = a("taiga");
   private final String h;
   private static final Map<ajg<cya>, cim> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cyh.A, a);
      $$0.put(cyh.f, a);
      $$0.put(cyh.B, a);
      $$0.put(cyh.C, a);
      $$0.put(cyh.z, b);
      $$0.put(cyh.x, b);
      $$0.put(cyh.y, b);
      $$0.put(cyh.s, d);
      $$0.put(cyh.r, d);
      $$0.put(cyh.w, d);
      $$0.put(cyh.X, e);
      $$0.put(cyh.W, e);
      $$0.put(cyh.L, e);
      $$0.put(cyh.e, e);
      $$0.put(cyh.N, e);
      $$0.put(cyh.q, e);
      $$0.put(cyh.d, e);
      $$0.put(cyh.F, e);
      $$0.put(cyh.G, e);
      $$0.put(cyh.H, e);
      $$0.put(cyh.I, e);
      $$0.put(cyh.g, f);
      $$0.put(cyh.h, f);
      $$0.put(cyh.o, g);
      $$0.put(cyh.n, g);
      $$0.put(cyh.u, g);
      $$0.put(cyh.t, g);
      $$0.put(cyh.p, g);
      $$0.put(cyh.v, g);
   });

   private cim(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cim a(String $$0) {
      return iy.a(ki.y, new ajh($$0), new cim($$0));
   }

   public static cim a(il<cya> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
