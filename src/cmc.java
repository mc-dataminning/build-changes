import com.google.common.collect.Maps;
import java.util.Map;

public final class cmc {
   public static final cmc a = a("desert");
   public static final cmc b = a("jungle");
   public static final cmc c = a("plains");
   public static final cmc d = a("savanna");
   public static final cmc e = a("snow");
   public static final cmc f = a("swamp");
   public static final cmc g = a("taiga");
   private final String h;
   private static final Map<akj<ddf>, cmc> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddm.A, a);
      $$0.put(ddm.f, a);
      $$0.put(ddm.B, a);
      $$0.put(ddm.C, a);
      $$0.put(ddm.z, b);
      $$0.put(ddm.x, b);
      $$0.put(ddm.y, b);
      $$0.put(ddm.s, d);
      $$0.put(ddm.r, d);
      $$0.put(ddm.w, d);
      $$0.put(ddm.X, e);
      $$0.put(ddm.W, e);
      $$0.put(ddm.L, e);
      $$0.put(ddm.e, e);
      $$0.put(ddm.N, e);
      $$0.put(ddm.q, e);
      $$0.put(ddm.d, e);
      $$0.put(ddm.F, e);
      $$0.put(ddm.G, e);
      $$0.put(ddm.H, e);
      $$0.put(ddm.I, e);
      $$0.put(ddm.g, f);
      $$0.put(ddm.h, f);
      $$0.put(ddm.o, g);
      $$0.put(ddm.n, g);
      $$0.put(ddm.u, g);
      $$0.put(ddm.t, g);
      $$0.put(ddm.p, g);
      $$0.put(ddm.v, g);
   });

   private cmc(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cmc a(String $$0) {
      return jw.a(lq.w, new akk($$0), new cmc($$0));
   }

   public static cmc a(jj<ddf> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
