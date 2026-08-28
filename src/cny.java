import com.google.common.collect.Maps;
import java.util.Map;

public final class cny {
   public static final cny a = a("desert");
   public static final cny b = a("jungle");
   public static final cny c = a("plains");
   public static final cny d = a("savanna");
   public static final cny e = a("snow");
   public static final cny f = a("swamp");
   public static final cny g = a("taiga");
   private final String h;
   private static final Map<alg<dfw>, cny> i = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dgd.A, a);
      $$0.put(dgd.f, a);
      $$0.put(dgd.B, a);
      $$0.put(dgd.C, a);
      $$0.put(dgd.z, b);
      $$0.put(dgd.x, b);
      $$0.put(dgd.y, b);
      $$0.put(dgd.s, d);
      $$0.put(dgd.r, d);
      $$0.put(dgd.w, d);
      $$0.put(dgd.X, e);
      $$0.put(dgd.W, e);
      $$0.put(dgd.L, e);
      $$0.put(dgd.e, e);
      $$0.put(dgd.N, e);
      $$0.put(dgd.q, e);
      $$0.put(dgd.d, e);
      $$0.put(dgd.F, e);
      $$0.put(dgd.G, e);
      $$0.put(dgd.H, e);
      $$0.put(dgd.I, e);
      $$0.put(dgd.g, f);
      $$0.put(dgd.h, f);
      $$0.put(dgd.o, g);
      $$0.put(dgd.n, g);
      $$0.put(dgd.u, g);
      $$0.put(dgd.t, g);
      $$0.put(dgd.p, g);
      $$0.put(dgd.v, g);
   });

   private cny(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cny a(String $$0) {
      return kc.a(lx.w, alh.b($$0), new cny($$0));
   }

   public static cny a(jp<dfw> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
