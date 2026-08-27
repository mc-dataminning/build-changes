import com.google.common.collect.Maps;
import java.util.Map;

public final class cet {
   public static final cet a = a("desert");
   public static final cet b = a("jungle");
   public static final cet c = a("plains");
   public static final cet d = a("savanna");
   public static final cet e = a("snow");
   public static final cet f = a("swamp");
   public static final cet g = a("taiga");
   private final String h;
   private static final Map<ahc<cuh>, cet> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cuo.A, a);
      $$0.put(cuo.f, a);
      $$0.put(cuo.B, a);
      $$0.put(cuo.C, a);
      $$0.put(cuo.z, b);
      $$0.put(cuo.x, b);
      $$0.put(cuo.y, b);
      $$0.put(cuo.s, d);
      $$0.put(cuo.r, d);
      $$0.put(cuo.w, d);
      $$0.put(cuo.X, e);
      $$0.put(cuo.W, e);
      $$0.put(cuo.L, e);
      $$0.put(cuo.e, e);
      $$0.put(cuo.N, e);
      $$0.put(cuo.q, e);
      $$0.put(cuo.d, e);
      $$0.put(cuo.F, e);
      $$0.put(cuo.G, e);
      $$0.put(cuo.H, e);
      $$0.put(cuo.I, e);
      $$0.put(cuo.g, f);
      $$0.put(cuo.h, f);
      $$0.put(cuo.o, g);
      $$0.put(cuo.n, g);
      $$0.put(cuo.u, g);
      $$0.put(cuo.t, g);
      $$0.put(cuo.p, g);
      $$0.put(cuo.v, g);
   });

   private cet(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cet a(String $$0) {
      return it.a(kd.y, new ahd($$0), new cet($$0));
   }

   public static cet a(ih<cuh> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
