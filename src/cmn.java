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
   private static final Map<akp<ddu>, cmn> i = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(deb.A, a);
      $$0.put(deb.f, a);
      $$0.put(deb.B, a);
      $$0.put(deb.C, a);
      $$0.put(deb.z, b);
      $$0.put(deb.x, b);
      $$0.put(deb.y, b);
      $$0.put(deb.s, d);
      $$0.put(deb.r, d);
      $$0.put(deb.w, d);
      $$0.put(deb.X, e);
      $$0.put(deb.W, e);
      $$0.put(deb.L, e);
      $$0.put(deb.e, e);
      $$0.put(deb.N, e);
      $$0.put(deb.q, e);
      $$0.put(deb.d, e);
      $$0.put(deb.F, e);
      $$0.put(deb.G, e);
      $$0.put(deb.H, e);
      $$0.put(deb.I, e);
      $$0.put(deb.g, f);
      $$0.put(deb.h, f);
      $$0.put(deb.o, g);
      $$0.put(deb.n, g);
      $$0.put(deb.u, g);
      $$0.put(deb.t, g);
      $$0.put(deb.p, g);
      $$0.put(deb.v, g);
   });

   private cmn(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cmn a(String $$0) {
      return jz.a(lt.w, akq.b($$0), new cmn($$0));
   }

   public static cmn a(jm<ddu> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
