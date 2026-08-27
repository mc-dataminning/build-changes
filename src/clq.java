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
   public static final clq h = a("potato");
   private final String i;
   private static final Map<aks<dcz>, clq> j = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddg.F, a);
      $$0.put(ddg.k, a);
      $$0.put(ddg.G, a);
      $$0.put(ddg.H, a);
      $$0.put(ddg.E, b);
      $$0.put(ddg.C, b);
      $$0.put(ddg.D, b);
      $$0.put(ddg.x, d);
      $$0.put(ddg.w, d);
      $$0.put(ddg.B, d);
      $$0.put(ddg.ac, e);
      $$0.put(ddg.ab, e);
      $$0.put(ddg.Q, e);
      $$0.put(ddg.j, e);
      $$0.put(ddg.S, e);
      $$0.put(ddg.v, e);
      $$0.put(ddg.i, e);
      $$0.put(ddg.K, e);
      $$0.put(ddg.L, e);
      $$0.put(ddg.M, e);
      $$0.put(ddg.N, e);
      $$0.put(ddg.l, f);
      $$0.put(ddg.m, f);
      $$0.put(ddg.t, g);
      $$0.put(ddg.s, g);
      $$0.put(ddg.z, g);
      $$0.put(ddg.y, g);
      $$0.put(ddg.u, g);
      $$0.put(ddg.A, g);
      $$0.put(ddg.f, h);
      $$0.put(ddg.d, h);
      $$0.put(ddg.e, h);
      $$0.put(ddg.h, h);
      $$0.put(ddg.g, h);
   });

   private clq(String $$0) {
      this.i = $$0;
   }

   @Override
   public String toString() {
      return this.i;
   }

   private static clq a(String $$0) {
      return jn.a(lh.y, new akt($$0), new clq($$0));
   }

   public static clq a(ja<dcz> $$0) {
      return $$0.e().map(j::get).orElse(c);
   }
}
