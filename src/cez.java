import com.google.common.collect.Maps;
import java.util.Map;

public final class cez {
   public static final cez a = a("desert");
   public static final cez b = a("jungle");
   public static final cez c = a("plains");
   public static final cez d = a("savanna");
   public static final cez e = a("snow");
   public static final cez f = a("swamp");
   public static final cez g = a("taiga");
   private final String h;
   private static final Map<ahf<cun>, cez> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cuu.A, a);
      $$0.put(cuu.f, a);
      $$0.put(cuu.B, a);
      $$0.put(cuu.C, a);
      $$0.put(cuu.z, b);
      $$0.put(cuu.x, b);
      $$0.put(cuu.y, b);
      $$0.put(cuu.s, d);
      $$0.put(cuu.r, d);
      $$0.put(cuu.w, d);
      $$0.put(cuu.X, e);
      $$0.put(cuu.W, e);
      $$0.put(cuu.L, e);
      $$0.put(cuu.e, e);
      $$0.put(cuu.N, e);
      $$0.put(cuu.q, e);
      $$0.put(cuu.d, e);
      $$0.put(cuu.F, e);
      $$0.put(cuu.G, e);
      $$0.put(cuu.H, e);
      $$0.put(cuu.I, e);
      $$0.put(cuu.g, f);
      $$0.put(cuu.h, f);
      $$0.put(cuu.o, g);
      $$0.put(cuu.n, g);
      $$0.put(cuu.u, g);
      $$0.put(cuu.t, g);
      $$0.put(cuu.p, g);
      $$0.put(cuu.v, g);
   });

   private cez(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cez a(String $$0) {
      return it.a(kd.y, new ahg($$0), new cez($$0));
   }

   public static cez a(ih<cun> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
