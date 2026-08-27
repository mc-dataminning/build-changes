import com.google.common.collect.Maps;
import java.util.Map;

public final class cdr {
   public static final cdr a = a("desert");
   public static final cdr b = a("jungle");
   public static final cdr c = a("plains");
   public static final cdr d = a("savanna");
   public static final cdr e = a("snow");
   public static final cdr f = a("swamp");
   public static final cdr g = a("taiga");
   private final String h;
   private static final Map<agl<ctd>, cdr> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ctk.A, a);
      $$0.put(ctk.f, a);
      $$0.put(ctk.B, a);
      $$0.put(ctk.C, a);
      $$0.put(ctk.z, b);
      $$0.put(ctk.x, b);
      $$0.put(ctk.y, b);
      $$0.put(ctk.s, d);
      $$0.put(ctk.r, d);
      $$0.put(ctk.w, d);
      $$0.put(ctk.X, e);
      $$0.put(ctk.W, e);
      $$0.put(ctk.L, e);
      $$0.put(ctk.e, e);
      $$0.put(ctk.N, e);
      $$0.put(ctk.q, e);
      $$0.put(ctk.d, e);
      $$0.put(ctk.F, e);
      $$0.put(ctk.G, e);
      $$0.put(ctk.H, e);
      $$0.put(ctk.I, e);
      $$0.put(ctk.g, f);
      $$0.put(ctk.h, f);
      $$0.put(ctk.o, g);
      $$0.put(ctk.n, g);
      $$0.put(ctk.u, g);
      $$0.put(ctk.t, g);
      $$0.put(ctk.p, g);
      $$0.put(ctk.v, g);
   });

   private cdr(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cdr a(String $$0) {
      return is.a(kc.z, new agm($$0), new cdr($$0));
   }

   public static cdr a(ig<ctd> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
