import com.google.common.collect.Maps;
import java.util.Map;

public final class cjs {
   public static final cjs a = a("desert");
   public static final cjs b = a("jungle");
   public static final cjs c = a("plains");
   public static final cjs d = a("savanna");
   public static final cjs e = a("snow");
   public static final cjs f = a("swamp");
   public static final cjs g = a("taiga");
   private final String h;
   private static final Map<aju<daf>, cjs> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dam.A, a);
      $$0.put(dam.f, a);
      $$0.put(dam.B, a);
      $$0.put(dam.C, a);
      $$0.put(dam.z, b);
      $$0.put(dam.x, b);
      $$0.put(dam.y, b);
      $$0.put(dam.s, d);
      $$0.put(dam.r, d);
      $$0.put(dam.w, d);
      $$0.put(dam.X, e);
      $$0.put(dam.W, e);
      $$0.put(dam.L, e);
      $$0.put(dam.e, e);
      $$0.put(dam.N, e);
      $$0.put(dam.q, e);
      $$0.put(dam.d, e);
      $$0.put(dam.F, e);
      $$0.put(dam.G, e);
      $$0.put(dam.H, e);
      $$0.put(dam.I, e);
      $$0.put(dam.g, f);
      $$0.put(dam.h, f);
      $$0.put(dam.o, g);
      $$0.put(dam.n, g);
      $$0.put(dam.u, g);
      $$0.put(dam.t, g);
      $$0.put(dam.p, g);
      $$0.put(dam.v, g);
   });

   private cjs(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cjs a(String $$0) {
      return ja.a(kt.y, new ajv($$0), new cjs($$0));
   }

   public static cjs a(in<daf> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
