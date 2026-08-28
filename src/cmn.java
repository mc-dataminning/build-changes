import com.google.common.collect.Maps;
import java.util.Map;

public final class cmn {
   public static final cmn a = a("desert");
   public static final cmn b = a("jungle");
   public static final cmn c = a("plains");
   public static final cmn d = a("savanna");
   public static final cmn e = a("snow");
   public static final cmn f = a("swamp");
   public static final cmn g = a("taiga");
   private final String h;
   private static final Map<ald<dcv>, cmn> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddc.A, a);
      $$0.put(ddc.f, a);
      $$0.put(ddc.B, a);
      $$0.put(ddc.C, a);
      $$0.put(ddc.z, b);
      $$0.put(ddc.x, b);
      $$0.put(ddc.y, b);
      $$0.put(ddc.s, d);
      $$0.put(ddc.r, d);
      $$0.put(ddc.w, d);
      $$0.put(ddc.X, e);
      $$0.put(ddc.W, e);
      $$0.put(ddc.L, e);
      $$0.put(ddc.e, e);
      $$0.put(ddc.N, e);
      $$0.put(ddc.q, e);
      $$0.put(ddc.d, e);
      $$0.put(ddc.F, e);
      $$0.put(ddc.G, e);
      $$0.put(ddc.H, e);
      $$0.put(ddc.I, e);
      $$0.put(ddc.g, f);
      $$0.put(ddc.h, f);
      $$0.put(ddc.o, g);
      $$0.put(ddc.n, g);
      $$0.put(ddc.u, g);
      $$0.put(ddc.t, g);
      $$0.put(ddc.p, g);
      $$0.put(ddc.v, g);
   });

   private cmn(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cmn a(String $$0) {
      return jv.a(lp.y, new ale($$0), new cmn($$0));
   }

   public static cmn a(ji<dcv> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
