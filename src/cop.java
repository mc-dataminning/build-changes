import com.google.common.collect.Maps;
import java.util.Map;

public final class cop {
   public static final cop a = a("desert");
   public static final cop b = a("jungle");
   public static final cop c = a("plains");
   public static final cop d = a("savanna");
   public static final cop e = a("snow");
   public static final cop f = a("swamp");
   public static final cop g = a("taiga");
   private final String h;
   private static final Map<aku<dhl>, cop> i = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dhs.B, a);
      $$0.put(dhs.f, a);
      $$0.put(dhs.C, a);
      $$0.put(dhs.D, a);
      $$0.put(dhs.A, b);
      $$0.put(dhs.y, b);
      $$0.put(dhs.z, b);
      $$0.put(dhs.t, d);
      $$0.put(dhs.s, d);
      $$0.put(dhs.x, d);
      $$0.put(dhs.Y, e);
      $$0.put(dhs.X, e);
      $$0.put(dhs.M, e);
      $$0.put(dhs.e, e);
      $$0.put(dhs.O, e);
      $$0.put(dhs.r, e);
      $$0.put(dhs.d, e);
      $$0.put(dhs.G, e);
      $$0.put(dhs.H, e);
      $$0.put(dhs.I, e);
      $$0.put(dhs.J, e);
      $$0.put(dhs.g, f);
      $$0.put(dhs.h, f);
      $$0.put(dhs.p, g);
      $$0.put(dhs.o, g);
      $$0.put(dhs.v, g);
      $$0.put(dhs.u, g);
      $$0.put(dhs.q, g);
      $$0.put(dhs.w, g);
   });

   private cop(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cop a(String $$0) {
      return ke.a(mb.w, akv.b($$0), new cop($$0));
   }

   public static cop a(jr<dhl> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
