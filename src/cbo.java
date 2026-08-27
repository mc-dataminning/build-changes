import com.google.common.collect.Maps;
import java.util.Map;

public final class cbo {
   public static final cbo a = a("desert");
   public static final cbo b = a("jungle");
   public static final cbo c = a("plains");
   public static final cbo d = a("savanna");
   public static final cbo e = a("snow");
   public static final cbo f = a("swamp");
   public static final cbo g = a("taiga");
   private final String h;
   private static final Map<aex<cqv>, cbo> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(crc.A, a);
      $$0.put(crc.f, a);
      $$0.put(crc.B, a);
      $$0.put(crc.C, a);
      $$0.put(crc.z, b);
      $$0.put(crc.x, b);
      $$0.put(crc.y, b);
      $$0.put(crc.s, d);
      $$0.put(crc.r, d);
      $$0.put(crc.w, d);
      $$0.put(crc.X, e);
      $$0.put(crc.W, e);
      $$0.put(crc.L, e);
      $$0.put(crc.e, e);
      $$0.put(crc.N, e);
      $$0.put(crc.q, e);
      $$0.put(crc.d, e);
      $$0.put(crc.F, e);
      $$0.put(crc.G, e);
      $$0.put(crc.H, e);
      $$0.put(crc.I, e);
      $$0.put(crc.g, f);
      $$0.put(crc.h, f);
      $$0.put(crc.o, g);
      $$0.put(crc.n, g);
      $$0.put(crc.u, g);
      $$0.put(crc.t, g);
      $$0.put(crc.p, g);
      $$0.put(crc.v, g);
   });

   private cbo(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cbo a(String $$0) {
      return ht.a(jd.z, new aey($$0), new cbo($$0));
   }

   public static cbo a(hg<cqv> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
