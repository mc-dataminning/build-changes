import com.google.common.collect.Maps;
import java.util.Map;

public final class cdm {
   public static final cdm a = a("desert");
   public static final cdm b = a("jungle");
   public static final cdm c = a("plains");
   public static final cdm d = a("savanna");
   public static final cdm e = a("snow");
   public static final cdm f = a("swamp");
   public static final cdm g = a("taiga");
   private final String h;
   private static final Map<agh<csy>, cdm> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ctf.A, a);
      $$0.put(ctf.f, a);
      $$0.put(ctf.B, a);
      $$0.put(ctf.C, a);
      $$0.put(ctf.z, b);
      $$0.put(ctf.x, b);
      $$0.put(ctf.y, b);
      $$0.put(ctf.s, d);
      $$0.put(ctf.r, d);
      $$0.put(ctf.w, d);
      $$0.put(ctf.X, e);
      $$0.put(ctf.W, e);
      $$0.put(ctf.L, e);
      $$0.put(ctf.e, e);
      $$0.put(ctf.N, e);
      $$0.put(ctf.q, e);
      $$0.put(ctf.d, e);
      $$0.put(ctf.F, e);
      $$0.put(ctf.G, e);
      $$0.put(ctf.H, e);
      $$0.put(ctf.I, e);
      $$0.put(ctf.g, f);
      $$0.put(ctf.h, f);
      $$0.put(ctf.o, g);
      $$0.put(ctf.n, g);
      $$0.put(ctf.u, g);
      $$0.put(ctf.t, g);
      $$0.put(ctf.p, g);
      $$0.put(ctf.v, g);
   });

   private cdm(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cdm a(String $$0) {
      return io.a(jy.z, new agi($$0), new cdm($$0));
   }

   public static cdm a(ib<csy> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
