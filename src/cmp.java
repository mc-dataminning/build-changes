import com.google.common.collect.Maps;
import java.util.Map;

public final class cmp {
   public static final cmp a = a("desert");
   public static final cmp b = a("jungle");
   public static final cmp c = a("plains");
   public static final cmp d = a("savanna");
   public static final cmp e = a("snow");
   public static final cmp f = a("swamp");
   public static final cmp g = a("taiga");
   private final String h;
   private static final Map<akq<ddw>, cmp> i = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ded.A, a);
      $$0.put(ded.f, a);
      $$0.put(ded.B, a);
      $$0.put(ded.C, a);
      $$0.put(ded.z, b);
      $$0.put(ded.x, b);
      $$0.put(ded.y, b);
      $$0.put(ded.s, d);
      $$0.put(ded.r, d);
      $$0.put(ded.w, d);
      $$0.put(ded.X, e);
      $$0.put(ded.W, e);
      $$0.put(ded.L, e);
      $$0.put(ded.e, e);
      $$0.put(ded.N, e);
      $$0.put(ded.q, e);
      $$0.put(ded.d, e);
      $$0.put(ded.F, e);
      $$0.put(ded.G, e);
      $$0.put(ded.H, e);
      $$0.put(ded.I, e);
      $$0.put(ded.g, f);
      $$0.put(ded.h, f);
      $$0.put(ded.o, g);
      $$0.put(ded.n, g);
      $$0.put(ded.u, g);
      $$0.put(ded.t, g);
      $$0.put(ded.p, g);
      $$0.put(ded.v, g);
   });

   private cmp(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cmp a(String $$0) {
      return jz.a(lt.w, akr.b($$0), new cmp($$0));
   }

   public static cmp a(jm<ddw> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
