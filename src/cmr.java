import com.google.common.collect.Maps;
import java.util.Map;

public final class cmr {
   public static final cmr a = a("desert");
   public static final cmr b = a("jungle");
   public static final cmr c = a("plains");
   public static final cmr d = a("savanna");
   public static final cmr e = a("snow");
   public static final cmr f = a("swamp");
   public static final cmr g = a("taiga");
   private final String h;
   private static final Map<ale<dcz>, cmr> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddg.A, a);
      $$0.put(ddg.f, a);
      $$0.put(ddg.B, a);
      $$0.put(ddg.C, a);
      $$0.put(ddg.z, b);
      $$0.put(ddg.x, b);
      $$0.put(ddg.y, b);
      $$0.put(ddg.s, d);
      $$0.put(ddg.r, d);
      $$0.put(ddg.w, d);
      $$0.put(ddg.X, e);
      $$0.put(ddg.W, e);
      $$0.put(ddg.L, e);
      $$0.put(ddg.e, e);
      $$0.put(ddg.N, e);
      $$0.put(ddg.q, e);
      $$0.put(ddg.d, e);
      $$0.put(ddg.F, e);
      $$0.put(ddg.G, e);
      $$0.put(ddg.H, e);
      $$0.put(ddg.I, e);
      $$0.put(ddg.g, f);
      $$0.put(ddg.h, f);
      $$0.put(ddg.o, g);
      $$0.put(ddg.n, g);
      $$0.put(ddg.u, g);
      $$0.put(ddg.t, g);
      $$0.put(ddg.p, g);
      $$0.put(ddg.v, g);
   });

   private cmr(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cmr a(String $$0) {
      return jv.a(lp.y, new alf($$0), new cmr($$0));
   }

   public static cmr a(ji<dcz> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
