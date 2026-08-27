import com.google.common.collect.Maps;
import java.util.Map;

public final class cjl {
   public static final cjl a = a("desert");
   public static final cjl b = a("jungle");
   public static final cjl c = a("plains");
   public static final cjl d = a("savanna");
   public static final cjl e = a("snow");
   public static final cjl f = a("swamp");
   public static final cjl g = a("taiga");
   private final String h;
   private static final Map<ajs<czw>, cjl> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dad.A, a);
      $$0.put(dad.f, a);
      $$0.put(dad.B, a);
      $$0.put(dad.C, a);
      $$0.put(dad.z, b);
      $$0.put(dad.x, b);
      $$0.put(dad.y, b);
      $$0.put(dad.s, d);
      $$0.put(dad.r, d);
      $$0.put(dad.w, d);
      $$0.put(dad.X, e);
      $$0.put(dad.W, e);
      $$0.put(dad.L, e);
      $$0.put(dad.e, e);
      $$0.put(dad.N, e);
      $$0.put(dad.q, e);
      $$0.put(dad.d, e);
      $$0.put(dad.F, e);
      $$0.put(dad.G, e);
      $$0.put(dad.H, e);
      $$0.put(dad.I, e);
      $$0.put(dad.g, f);
      $$0.put(dad.h, f);
      $$0.put(dad.o, g);
      $$0.put(dad.n, g);
      $$0.put(dad.u, g);
      $$0.put(dad.t, g);
      $$0.put(dad.p, g);
      $$0.put(dad.v, g);
   });

   private cjl(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cjl a(String $$0) {
      return iy.a(kr.y, new ajt($$0), new cjl($$0));
   }

   public static cjl a(il<czw> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
