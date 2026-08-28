import com.google.common.collect.Maps;
import java.util.Map;

public final class clz {
   public static final clz a = a("desert");
   public static final clz b = a("jungle");
   public static final clz c = a("plains");
   public static final clz d = a("savanna");
   public static final clz e = a("snow");
   public static final clz f = a("swamp");
   public static final clz g = a("taiga");
   private final String h;
   private static final Map<akj<ddd>, clz> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddk.A, a);
      $$0.put(ddk.f, a);
      $$0.put(ddk.B, a);
      $$0.put(ddk.C, a);
      $$0.put(ddk.z, b);
      $$0.put(ddk.x, b);
      $$0.put(ddk.y, b);
      $$0.put(ddk.s, d);
      $$0.put(ddk.r, d);
      $$0.put(ddk.w, d);
      $$0.put(ddk.X, e);
      $$0.put(ddk.W, e);
      $$0.put(ddk.L, e);
      $$0.put(ddk.e, e);
      $$0.put(ddk.N, e);
      $$0.put(ddk.q, e);
      $$0.put(ddk.d, e);
      $$0.put(ddk.F, e);
      $$0.put(ddk.G, e);
      $$0.put(ddk.H, e);
      $$0.put(ddk.I, e);
      $$0.put(ddk.g, f);
      $$0.put(ddk.h, f);
      $$0.put(ddk.o, g);
      $$0.put(ddk.n, g);
      $$0.put(ddk.u, g);
      $$0.put(ddk.t, g);
      $$0.put(ddk.p, g);
      $$0.put(ddk.v, g);
   });

   private clz(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static clz a(String $$0) {
      return jw.a(lq.w, new akk($$0), new clz($$0));
   }

   public static clz a(jj<ddd> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
