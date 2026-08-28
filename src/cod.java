import com.google.common.collect.Maps;
import java.util.Map;

public final class cod {
   public static final cod a = a("desert");
   public static final cod b = a("jungle");
   public static final cod c = a("plains");
   public static final cod d = a("savanna");
   public static final cod e = a("snow");
   public static final cod f = a("swamp");
   public static final cod g = a("taiga");
   private final String h;
   private static final Map<alh<dgc>, cod> i = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dgj.A, a);
      $$0.put(dgj.f, a);
      $$0.put(dgj.B, a);
      $$0.put(dgj.C, a);
      $$0.put(dgj.z, b);
      $$0.put(dgj.x, b);
      $$0.put(dgj.y, b);
      $$0.put(dgj.s, d);
      $$0.put(dgj.r, d);
      $$0.put(dgj.w, d);
      $$0.put(dgj.X, e);
      $$0.put(dgj.W, e);
      $$0.put(dgj.L, e);
      $$0.put(dgj.e, e);
      $$0.put(dgj.N, e);
      $$0.put(dgj.q, e);
      $$0.put(dgj.d, e);
      $$0.put(dgj.F, e);
      $$0.put(dgj.G, e);
      $$0.put(dgj.H, e);
      $$0.put(dgj.I, e);
      $$0.put(dgj.g, f);
      $$0.put(dgj.h, f);
      $$0.put(dgj.o, g);
      $$0.put(dgj.n, g);
      $$0.put(dgj.u, g);
      $$0.put(dgj.t, g);
      $$0.put(dgj.p, g);
      $$0.put(dgj.v, g);
   });

   private cod(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cod a(String $$0) {
      return kd.a(ly.w, ali.b($$0), new cod($$0));
   }

   public static cod a(jq<dgc> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
