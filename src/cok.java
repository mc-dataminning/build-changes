import com.google.common.collect.Maps;
import java.util.Map;

public final class cok {
   public static final cok a = a("desert");
   public static final cok b = a("jungle");
   public static final cok c = a("plains");
   public static final cok d = a("savanna");
   public static final cok e = a("snow");
   public static final cok f = a("swamp");
   public static final cok g = a("taiga");
   private final String h;
   private static final Map<ali<dgo>, cok> i = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dgv.A, a);
      $$0.put(dgv.f, a);
      $$0.put(dgv.B, a);
      $$0.put(dgv.C, a);
      $$0.put(dgv.z, b);
      $$0.put(dgv.x, b);
      $$0.put(dgv.y, b);
      $$0.put(dgv.s, d);
      $$0.put(dgv.r, d);
      $$0.put(dgv.w, d);
      $$0.put(dgv.X, e);
      $$0.put(dgv.W, e);
      $$0.put(dgv.L, e);
      $$0.put(dgv.e, e);
      $$0.put(dgv.N, e);
      $$0.put(dgv.q, e);
      $$0.put(dgv.d, e);
      $$0.put(dgv.F, e);
      $$0.put(dgv.G, e);
      $$0.put(dgv.H, e);
      $$0.put(dgv.I, e);
      $$0.put(dgv.g, f);
      $$0.put(dgv.h, f);
      $$0.put(dgv.o, g);
      $$0.put(dgv.n, g);
      $$0.put(dgv.u, g);
      $$0.put(dgv.t, g);
      $$0.put(dgv.p, g);
      $$0.put(dgv.v, g);
   });

   private cok(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cok a(String $$0) {
      return kd.a(lz.w, alj.b($$0), new cok($$0));
   }

   public static cok a(jq<dgo> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
