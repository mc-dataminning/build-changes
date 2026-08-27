import com.google.common.collect.Maps;
import java.util.Map;

public final class clq {
   public static final clq a = a("desert");
   public static final clq b = a("jungle");
   public static final clq c = a("plains");
   public static final clq d = a("savanna");
   public static final clq e = a("snow");
   public static final clq f = a("swamp");
   public static final clq g = a("taiga");
   private final String h;
   private static final Map<akm<dby>, clq> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dcf.A, a);
      $$0.put(dcf.f, a);
      $$0.put(dcf.B, a);
      $$0.put(dcf.C, a);
      $$0.put(dcf.z, b);
      $$0.put(dcf.x, b);
      $$0.put(dcf.y, b);
      $$0.put(dcf.s, d);
      $$0.put(dcf.r, d);
      $$0.put(dcf.w, d);
      $$0.put(dcf.X, e);
      $$0.put(dcf.W, e);
      $$0.put(dcf.L, e);
      $$0.put(dcf.e, e);
      $$0.put(dcf.N, e);
      $$0.put(dcf.q, e);
      $$0.put(dcf.d, e);
      $$0.put(dcf.F, e);
      $$0.put(dcf.G, e);
      $$0.put(dcf.H, e);
      $$0.put(dcf.I, e);
      $$0.put(dcf.g, f);
      $$0.put(dcf.h, f);
      $$0.put(dcf.o, g);
      $$0.put(dcf.n, g);
      $$0.put(dcf.u, g);
      $$0.put(dcf.t, g);
      $$0.put(dcf.p, g);
      $$0.put(dcf.v, g);
   });

   private clq(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static clq a(String $$0) {
      return jk.a(le.y, new akn($$0), new clq($$0));
   }

   public static clq a(ix<dby> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
