import com.google.common.collect.Maps;
import java.util.Map;

public final class clo {
   public static final clo a = a("desert");
   public static final clo b = a("jungle");
   public static final clo c = a("plains");
   public static final clo d = a("savanna");
   public static final clo e = a("snow");
   public static final clo f = a("swamp");
   public static final clo g = a("taiga");
   private final String h;
   private static final Map<akl<dbw>, clo> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dcd.A, a);
      $$0.put(dcd.f, a);
      $$0.put(dcd.B, a);
      $$0.put(dcd.C, a);
      $$0.put(dcd.z, b);
      $$0.put(dcd.x, b);
      $$0.put(dcd.y, b);
      $$0.put(dcd.s, d);
      $$0.put(dcd.r, d);
      $$0.put(dcd.w, d);
      $$0.put(dcd.X, e);
      $$0.put(dcd.W, e);
      $$0.put(dcd.L, e);
      $$0.put(dcd.e, e);
      $$0.put(dcd.N, e);
      $$0.put(dcd.q, e);
      $$0.put(dcd.d, e);
      $$0.put(dcd.F, e);
      $$0.put(dcd.G, e);
      $$0.put(dcd.H, e);
      $$0.put(dcd.I, e);
      $$0.put(dcd.g, f);
      $$0.put(dcd.h, f);
      $$0.put(dcd.o, g);
      $$0.put(dcd.n, g);
      $$0.put(dcd.u, g);
      $$0.put(dcd.t, g);
      $$0.put(dcd.p, g);
      $$0.put(dcd.v, g);
   });

   private clo(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static clo a(String $$0) {
      return jk.a(le.y, new akm($$0), new clo($$0));
   }

   public static clo a(ix<dbw> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
