import com.google.common.collect.Maps;
import java.util.Map;

public final class cmd {
   public static final cmd a = a("desert");
   public static final cmd b = a("jungle");
   public static final cmd c = a("plains");
   public static final cmd d = a("savanna");
   public static final cmd e = a("snow");
   public static final cmd f = a("swamp");
   public static final cmd g = a("taiga");
   private final String h;
   private static final Map<akj<ddg>, cmd> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddn.A, a);
      $$0.put(ddn.f, a);
      $$0.put(ddn.B, a);
      $$0.put(ddn.C, a);
      $$0.put(ddn.z, b);
      $$0.put(ddn.x, b);
      $$0.put(ddn.y, b);
      $$0.put(ddn.s, d);
      $$0.put(ddn.r, d);
      $$0.put(ddn.w, d);
      $$0.put(ddn.X, e);
      $$0.put(ddn.W, e);
      $$0.put(ddn.L, e);
      $$0.put(ddn.e, e);
      $$0.put(ddn.N, e);
      $$0.put(ddn.q, e);
      $$0.put(ddn.d, e);
      $$0.put(ddn.F, e);
      $$0.put(ddn.G, e);
      $$0.put(ddn.H, e);
      $$0.put(ddn.I, e);
      $$0.put(ddn.g, f);
      $$0.put(ddn.h, f);
      $$0.put(ddn.o, g);
      $$0.put(ddn.n, g);
      $$0.put(ddn.u, g);
      $$0.put(ddn.t, g);
      $$0.put(ddn.p, g);
      $$0.put(ddn.v, g);
   });

   private cmd(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cmd a(String $$0) {
      return jw.a(lq.w, new akk($$0), new cmd($$0));
   }

   public static cmd a(jj<ddg> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
