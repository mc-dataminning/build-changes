import com.google.common.collect.Maps;
import java.util.Map;

public final class ckz {
   public static final ckz a = a("desert");
   public static final ckz b = a("jungle");
   public static final ckz c = a("plains");
   public static final ckz d = a("savanna");
   public static final ckz e = a("snow");
   public static final ckz f = a("swamp");
   public static final ckz g = a("taiga");
   private final String h;
   private static final Map<akg<dbc>, ckz> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dbj.A, a);
      $$0.put(dbj.f, a);
      $$0.put(dbj.B, a);
      $$0.put(dbj.C, a);
      $$0.put(dbj.z, b);
      $$0.put(dbj.x, b);
      $$0.put(dbj.y, b);
      $$0.put(dbj.s, d);
      $$0.put(dbj.r, d);
      $$0.put(dbj.w, d);
      $$0.put(dbj.X, e);
      $$0.put(dbj.W, e);
      $$0.put(dbj.L, e);
      $$0.put(dbj.e, e);
      $$0.put(dbj.N, e);
      $$0.put(dbj.q, e);
      $$0.put(dbj.d, e);
      $$0.put(dbj.F, e);
      $$0.put(dbj.G, e);
      $$0.put(dbj.H, e);
      $$0.put(dbj.I, e);
      $$0.put(dbj.g, f);
      $$0.put(dbj.h, f);
      $$0.put(dbj.o, g);
      $$0.put(dbj.n, g);
      $$0.put(dbj.u, g);
      $$0.put(dbj.t, g);
      $$0.put(dbj.p, g);
      $$0.put(dbj.v, g);
   });

   private ckz(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static ckz a(String $$0) {
      return jj.a(ld.y, new akh($$0), new ckz($$0));
   }

   public static ckz a(iw<dbc> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
