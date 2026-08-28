import com.google.common.collect.Maps;
import java.util.Map;

public final class coo {
   public static final coo a = a("desert");
   public static final coo b = a("jungle");
   public static final coo c = a("plains");
   public static final coo d = a("savanna");
   public static final coo e = a("snow");
   public static final coo f = a("swamp");
   public static final coo g = a("taiga");
   private final String h;
   private static final Map<aku<dhk>, coo> i = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dhr.B, a);
      $$0.put(dhr.f, a);
      $$0.put(dhr.C, a);
      $$0.put(dhr.D, a);
      $$0.put(dhr.A, b);
      $$0.put(dhr.y, b);
      $$0.put(dhr.z, b);
      $$0.put(dhr.t, d);
      $$0.put(dhr.s, d);
      $$0.put(dhr.x, d);
      $$0.put(dhr.Y, e);
      $$0.put(dhr.X, e);
      $$0.put(dhr.M, e);
      $$0.put(dhr.e, e);
      $$0.put(dhr.O, e);
      $$0.put(dhr.r, e);
      $$0.put(dhr.d, e);
      $$0.put(dhr.G, e);
      $$0.put(dhr.H, e);
      $$0.put(dhr.I, e);
      $$0.put(dhr.J, e);
      $$0.put(dhr.g, f);
      $$0.put(dhr.h, f);
      $$0.put(dhr.p, g);
      $$0.put(dhr.o, g);
      $$0.put(dhr.v, g);
      $$0.put(dhr.u, g);
      $$0.put(dhr.q, g);
      $$0.put(dhr.w, g);
   });

   private coo(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static coo a(String $$0) {
      return ke.a(mb.w, akv.b($$0), new coo($$0));
   }

   public static coo a(jr<dhk> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
