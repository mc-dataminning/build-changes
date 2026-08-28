import com.google.common.collect.Maps;
import java.util.Map;

public final class col {
   public static final col a = a("desert");
   public static final col b = a("jungle");
   public static final col c = a("plains");
   public static final col d = a("savanna");
   public static final col e = a("snow");
   public static final col f = a("swamp");
   public static final col g = a("taiga");
   private final String h;
   private static final Map<akt<dhi>, col> i = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dhp.B, a);
      $$0.put(dhp.f, a);
      $$0.put(dhp.C, a);
      $$0.put(dhp.D, a);
      $$0.put(dhp.A, b);
      $$0.put(dhp.y, b);
      $$0.put(dhp.z, b);
      $$0.put(dhp.t, d);
      $$0.put(dhp.s, d);
      $$0.put(dhp.x, d);
      $$0.put(dhp.Y, e);
      $$0.put(dhp.X, e);
      $$0.put(dhp.M, e);
      $$0.put(dhp.e, e);
      $$0.put(dhp.O, e);
      $$0.put(dhp.r, e);
      $$0.put(dhp.d, e);
      $$0.put(dhp.G, e);
      $$0.put(dhp.H, e);
      $$0.put(dhp.I, e);
      $$0.put(dhp.J, e);
      $$0.put(dhp.g, f);
      $$0.put(dhp.h, f);
      $$0.put(dhp.p, g);
      $$0.put(dhp.o, g);
      $$0.put(dhp.v, g);
      $$0.put(dhp.u, g);
      $$0.put(dhp.q, g);
      $$0.put(dhp.w, g);
   });

   private col(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static col a(String $$0) {
      return ke.a(mb.w, aku.b($$0), new col($$0));
   }

   public static col a(jr<dhi> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
