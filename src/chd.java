import com.google.common.collect.Maps;
import java.util.Map;

public final class chd {
   public static final chd a = a("desert");
   public static final chd b = a("jungle");
   public static final chd c = a("plains");
   public static final chd d = a("savanna");
   public static final chd e = a("snow");
   public static final chd f = a("swamp");
   public static final chd g = a("taiga");
   private final String h;
   private static final Map<aix<cwq>, chd> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cwx.A, a);
      $$0.put(cwx.f, a);
      $$0.put(cwx.B, a);
      $$0.put(cwx.C, a);
      $$0.put(cwx.z, b);
      $$0.put(cwx.x, b);
      $$0.put(cwx.y, b);
      $$0.put(cwx.s, d);
      $$0.put(cwx.r, d);
      $$0.put(cwx.w, d);
      $$0.put(cwx.X, e);
      $$0.put(cwx.W, e);
      $$0.put(cwx.L, e);
      $$0.put(cwx.e, e);
      $$0.put(cwx.N, e);
      $$0.put(cwx.q, e);
      $$0.put(cwx.d, e);
      $$0.put(cwx.F, e);
      $$0.put(cwx.G, e);
      $$0.put(cwx.H, e);
      $$0.put(cwx.I, e);
      $$0.put(cwx.g, f);
      $$0.put(cwx.h, f);
      $$0.put(cwx.o, g);
      $$0.put(cwx.n, g);
      $$0.put(cwx.u, g);
      $$0.put(cwx.t, g);
      $$0.put(cwx.p, g);
      $$0.put(cwx.v, g);
   });

   private chd(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static chd a(String $$0) {
      return iv.a(kf.y, new aiy($$0), new chd($$0));
   }

   public static chd a(ij<cwq> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
