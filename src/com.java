import com.google.common.collect.Maps;
import java.util.Map;

public final class com {
   public static final com a = a("desert");
   public static final com b = a("jungle");
   public static final com c = a("plains");
   public static final com d = a("savanna");
   public static final com e = a("snow");
   public static final com f = a("swamp");
   public static final com g = a("taiga");
   private final String h;
   private static final Map<aku<dhj>, com> i = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dhq.B, a);
      $$0.put(dhq.f, a);
      $$0.put(dhq.C, a);
      $$0.put(dhq.D, a);
      $$0.put(dhq.A, b);
      $$0.put(dhq.y, b);
      $$0.put(dhq.z, b);
      $$0.put(dhq.t, d);
      $$0.put(dhq.s, d);
      $$0.put(dhq.x, d);
      $$0.put(dhq.Y, e);
      $$0.put(dhq.X, e);
      $$0.put(dhq.M, e);
      $$0.put(dhq.e, e);
      $$0.put(dhq.O, e);
      $$0.put(dhq.r, e);
      $$0.put(dhq.d, e);
      $$0.put(dhq.G, e);
      $$0.put(dhq.H, e);
      $$0.put(dhq.I, e);
      $$0.put(dhq.J, e);
      $$0.put(dhq.g, f);
      $$0.put(dhq.h, f);
      $$0.put(dhq.p, g);
      $$0.put(dhq.o, g);
      $$0.put(dhq.v, g);
      $$0.put(dhq.u, g);
      $$0.put(dhq.q, g);
      $$0.put(dhq.w, g);
   });

   private com(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static com a(String $$0) {
      return ke.a(mb.w, akv.b($$0), new com($$0));
   }

   public static com a(jr<dhj> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
