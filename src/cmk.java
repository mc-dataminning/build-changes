import com.google.common.collect.Maps;
import java.util.Map;

public final class cmk {
   public static final cmk a = a("desert");
   public static final cmk b = a("jungle");
   public static final cmk c = a("plains");
   public static final cmk d = a("savanna");
   public static final cmk e = a("snow");
   public static final cmk f = a("swamp");
   public static final cmk g = a("taiga");
   private final String h;
   private static final Map<ala<dcs>, cmk> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dcz.A, a);
      $$0.put(dcz.f, a);
      $$0.put(dcz.B, a);
      $$0.put(dcz.C, a);
      $$0.put(dcz.z, b);
      $$0.put(dcz.x, b);
      $$0.put(dcz.y, b);
      $$0.put(dcz.s, d);
      $$0.put(dcz.r, d);
      $$0.put(dcz.w, d);
      $$0.put(dcz.X, e);
      $$0.put(dcz.W, e);
      $$0.put(dcz.L, e);
      $$0.put(dcz.e, e);
      $$0.put(dcz.N, e);
      $$0.put(dcz.q, e);
      $$0.put(dcz.d, e);
      $$0.put(dcz.F, e);
      $$0.put(dcz.G, e);
      $$0.put(dcz.H, e);
      $$0.put(dcz.I, e);
      $$0.put(dcz.g, f);
      $$0.put(dcz.h, f);
      $$0.put(dcz.o, g);
      $$0.put(dcz.n, g);
      $$0.put(dcz.u, g);
      $$0.put(dcz.t, g);
      $$0.put(dcz.p, g);
      $$0.put(dcz.v, g);
   });

   private cmk(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cmk a(String $$0) {
      return jv.a(lp.y, new alb($$0), new cmk($$0));
   }

   public static cmk a(ji<dcs> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
