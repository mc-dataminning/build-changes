import com.google.common.collect.Maps;
import java.util.Map;

public final class chs {
   public static final chs a = a("desert");
   public static final chs b = a("jungle");
   public static final chs c = a("plains");
   public static final chs d = a("savanna");
   public static final chs e = a("snow");
   public static final chs f = a("swamp");
   public static final chs g = a("taiga");
   private final String h;
   private static final Map<ajb<cxd>, chs> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cxk.A, a);
      $$0.put(cxk.f, a);
      $$0.put(cxk.B, a);
      $$0.put(cxk.C, a);
      $$0.put(cxk.z, b);
      $$0.put(cxk.x, b);
      $$0.put(cxk.y, b);
      $$0.put(cxk.s, d);
      $$0.put(cxk.r, d);
      $$0.put(cxk.w, d);
      $$0.put(cxk.X, e);
      $$0.put(cxk.W, e);
      $$0.put(cxk.L, e);
      $$0.put(cxk.e, e);
      $$0.put(cxk.N, e);
      $$0.put(cxk.q, e);
      $$0.put(cxk.d, e);
      $$0.put(cxk.F, e);
      $$0.put(cxk.G, e);
      $$0.put(cxk.H, e);
      $$0.put(cxk.I, e);
      $$0.put(cxk.g, f);
      $$0.put(cxk.h, f);
      $$0.put(cxk.o, g);
      $$0.put(cxk.n, g);
      $$0.put(cxk.u, g);
      $$0.put(cxk.t, g);
      $$0.put(cxk.p, g);
      $$0.put(cxk.v, g);
   });

   private chs(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static chs a(String $$0) {
      return ix.a(kh.y, new ajc($$0), new chs($$0));
   }

   public static chs a(il<cxd> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
