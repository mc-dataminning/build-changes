import com.google.common.collect.Maps;
import java.util.Map;

public final class cmq {
   public static final cmq a = a("desert");
   public static final cmq b = a("jungle");
   public static final cmq c = a("plains");
   public static final cmq d = a("savanna");
   public static final cmq e = a("snow");
   public static final cmq f = a("swamp");
   public static final cmq g = a("taiga");
   private final String h;
   private static final Map<ale<dcy>, cmq> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddf.A, a);
      $$0.put(ddf.f, a);
      $$0.put(ddf.B, a);
      $$0.put(ddf.C, a);
      $$0.put(ddf.z, b);
      $$0.put(ddf.x, b);
      $$0.put(ddf.y, b);
      $$0.put(ddf.s, d);
      $$0.put(ddf.r, d);
      $$0.put(ddf.w, d);
      $$0.put(ddf.X, e);
      $$0.put(ddf.W, e);
      $$0.put(ddf.L, e);
      $$0.put(ddf.e, e);
      $$0.put(ddf.N, e);
      $$0.put(ddf.q, e);
      $$0.put(ddf.d, e);
      $$0.put(ddf.F, e);
      $$0.put(ddf.G, e);
      $$0.put(ddf.H, e);
      $$0.put(ddf.I, e);
      $$0.put(ddf.g, f);
      $$0.put(ddf.h, f);
      $$0.put(ddf.o, g);
      $$0.put(ddf.n, g);
      $$0.put(ddf.u, g);
      $$0.put(ddf.t, g);
      $$0.put(ddf.p, g);
      $$0.put(ddf.v, g);
   });

   private cmq(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cmq a(String $$0) {
      return jv.a(lp.y, new alf($$0), new cmq($$0));
   }

   public static cmq a(ji<dcy> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
