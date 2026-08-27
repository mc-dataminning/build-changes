import com.google.common.collect.Maps;
import java.util.Map;

public final class ckd {
   public static final ckd a = a("desert");
   public static final ckd b = a("jungle");
   public static final ckd c = a("plains");
   public static final ckd d = a("savanna");
   public static final ckd e = a("snow");
   public static final ckd f = a("swamp");
   public static final ckd g = a("taiga");
   private final String h;
   private static final Map<ake<dat>, ckd> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dba.A, a);
      $$0.put(dba.f, a);
      $$0.put(dba.B, a);
      $$0.put(dba.C, a);
      $$0.put(dba.z, b);
      $$0.put(dba.x, b);
      $$0.put(dba.y, b);
      $$0.put(dba.s, d);
      $$0.put(dba.r, d);
      $$0.put(dba.w, d);
      $$0.put(dba.X, e);
      $$0.put(dba.W, e);
      $$0.put(dba.L, e);
      $$0.put(dba.e, e);
      $$0.put(dba.N, e);
      $$0.put(dba.q, e);
      $$0.put(dba.d, e);
      $$0.put(dba.F, e);
      $$0.put(dba.G, e);
      $$0.put(dba.H, e);
      $$0.put(dba.I, e);
      $$0.put(dba.g, f);
      $$0.put(dba.h, f);
      $$0.put(dba.o, g);
      $$0.put(dba.n, g);
      $$0.put(dba.u, g);
      $$0.put(dba.t, g);
      $$0.put(dba.p, g);
      $$0.put(dba.v, g);
   });

   private ckd(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static ckd a(String $$0) {
      return ji.a(lc.y, new akf($$0), new ckd($$0));
   }

   public static ckd a(iv<dat> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
