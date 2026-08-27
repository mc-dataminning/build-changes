import com.google.common.collect.Maps;
import java.util.Map;

public final class cbh {
   public static final cbh a = a("desert");
   public static final cbh b = a("jungle");
   public static final cbh c = a("plains");
   public static final cbh d = a("savanna");
   public static final cbh e = a("snow");
   public static final cbh f = a("swamp");
   public static final cbh g = a("taiga");
   private final String h;
   private static final Map<aet<cqo>, cbh> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cqv.A, a);
      $$0.put(cqv.f, a);
      $$0.put(cqv.B, a);
      $$0.put(cqv.C, a);
      $$0.put(cqv.z, b);
      $$0.put(cqv.x, b);
      $$0.put(cqv.y, b);
      $$0.put(cqv.s, d);
      $$0.put(cqv.r, d);
      $$0.put(cqv.w, d);
      $$0.put(cqv.X, e);
      $$0.put(cqv.W, e);
      $$0.put(cqv.L, e);
      $$0.put(cqv.e, e);
      $$0.put(cqv.N, e);
      $$0.put(cqv.q, e);
      $$0.put(cqv.d, e);
      $$0.put(cqv.F, e);
      $$0.put(cqv.G, e);
      $$0.put(cqv.H, e);
      $$0.put(cqv.I, e);
      $$0.put(cqv.g, f);
      $$0.put(cqv.h, f);
      $$0.put(cqv.o, g);
      $$0.put(cqv.n, g);
      $$0.put(cqv.u, g);
      $$0.put(cqv.t, g);
      $$0.put(cqv.p, g);
      $$0.put(cqv.v, g);
   });

   private cbh(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cbh a(String $$0) {
      return ht.a(jd.z, new aeu($$0), new cbh($$0));
   }

   public static cbh a(hg<cqo> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
