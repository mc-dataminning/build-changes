import com.google.common.collect.Maps;
import java.util.Map;

public final class cej {
   public static final cej a = a("desert");
   public static final cej b = a("jungle");
   public static final cej c = a("plains");
   public static final cej d = a("savanna");
   public static final cej e = a("snow");
   public static final cej f = a("swamp");
   public static final cej g = a("taiga");
   private final String h;
   private static final Map<ags<ctx>, cej> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cue.A, a);
      $$0.put(cue.f, a);
      $$0.put(cue.B, a);
      $$0.put(cue.C, a);
      $$0.put(cue.z, b);
      $$0.put(cue.x, b);
      $$0.put(cue.y, b);
      $$0.put(cue.s, d);
      $$0.put(cue.r, d);
      $$0.put(cue.w, d);
      $$0.put(cue.X, e);
      $$0.put(cue.W, e);
      $$0.put(cue.L, e);
      $$0.put(cue.e, e);
      $$0.put(cue.N, e);
      $$0.put(cue.q, e);
      $$0.put(cue.d, e);
      $$0.put(cue.F, e);
      $$0.put(cue.G, e);
      $$0.put(cue.H, e);
      $$0.put(cue.I, e);
      $$0.put(cue.g, f);
      $$0.put(cue.h, f);
      $$0.put(cue.o, g);
      $$0.put(cue.n, g);
      $$0.put(cue.u, g);
      $$0.put(cue.t, g);
      $$0.put(cue.p, g);
      $$0.put(cue.v, g);
   });

   private cej(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cej a(String $$0) {
      return ir.a(kb.y, new agt($$0), new cej($$0));
   }

   public static cej a(ie<ctx> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
