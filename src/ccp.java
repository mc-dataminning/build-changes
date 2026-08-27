import com.google.common.collect.Maps;
import java.util.Map;

public final class ccp {
   public static final ccp a = a("desert");
   public static final ccp b = a("jungle");
   public static final ccp c = a("plains");
   public static final ccp d = a("savanna");
   public static final ccp e = a("snow");
   public static final ccp f = a("swamp");
   public static final ccp g = a("taiga");
   private final String h;
   private static final Map<afv<crx>, ccp> i = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cse.A, a);
      $$0.put(cse.f, a);
      $$0.put(cse.B, a);
      $$0.put(cse.C, a);
      $$0.put(cse.z, b);
      $$0.put(cse.x, b);
      $$0.put(cse.y, b);
      $$0.put(cse.s, d);
      $$0.put(cse.r, d);
      $$0.put(cse.w, d);
      $$0.put(cse.X, e);
      $$0.put(cse.W, e);
      $$0.put(cse.L, e);
      $$0.put(cse.e, e);
      $$0.put(cse.N, e);
      $$0.put(cse.q, e);
      $$0.put(cse.d, e);
      $$0.put(cse.F, e);
      $$0.put(cse.G, e);
      $$0.put(cse.H, e);
      $$0.put(cse.I, e);
      $$0.put(cse.g, f);
      $$0.put(cse.h, f);
      $$0.put(cse.o, g);
      $$0.put(cse.n, g);
      $$0.put(cse.u, g);
      $$0.put(cse.t, g);
      $$0.put(cse.p, g);
      $$0.put(cse.v, g);
   });

   private ccp(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static ccp a(String $$0) {
      return io.a(jy.z, new afw($$0), new ccp($$0));
   }

   public static ccp a(ib<crx> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
