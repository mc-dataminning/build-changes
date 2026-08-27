import com.google.common.collect.Maps;
import java.util.Map;

public final class cbe {
   public static final cbe a = a("desert");
   public static final cbe b = a("jungle");
   public static final cbe c = a("plains");
   public static final cbe d = a("savanna");
   public static final cbe e = a("snow");
   public static final cbe f = a("swamp");
   public static final cbe g = a("taiga");
   private final String h;
   private static final Map<aeq<cqj>, cbe> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cqq.A, a);
      $$0.put(cqq.f, a);
      $$0.put(cqq.B, a);
      $$0.put(cqq.C, a);
      $$0.put(cqq.z, b);
      $$0.put(cqq.x, b);
      $$0.put(cqq.y, b);
      $$0.put(cqq.s, d);
      $$0.put(cqq.r, d);
      $$0.put(cqq.w, d);
      $$0.put(cqq.X, e);
      $$0.put(cqq.W, e);
      $$0.put(cqq.L, e);
      $$0.put(cqq.e, e);
      $$0.put(cqq.N, e);
      $$0.put(cqq.q, e);
      $$0.put(cqq.d, e);
      $$0.put(cqq.F, e);
      $$0.put(cqq.G, e);
      $$0.put(cqq.H, e);
      $$0.put(cqq.I, e);
      $$0.put(cqq.g, f);
      $$0.put(cqq.h, f);
      $$0.put(cqq.o, g);
      $$0.put(cqq.n, g);
      $$0.put(cqq.u, g);
      $$0.put(cqq.t, g);
      $$0.put(cqq.p, g);
      $$0.put(cqq.v, g);
   });

   private cbe(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cbe a(String $$0) {
      return hr.a(jb.z, new aer($$0), new cbe($$0));
   }

   public static cbe a(he<cqj> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
