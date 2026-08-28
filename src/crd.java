import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public final class crd {
   public static final alf<crd> a = a("desert");
   public static final alf<crd> b = a("jungle");
   public static final alf<crd> c = a("plains");
   public static final alf<crd> d = a("savanna");
   public static final alf<crd> e = a("snow");
   public static final alf<crd> f = a("swamp");
   public static final alf<crd> g = a("taiga");
   public static final Codec<jf<crd>> h = ald.a(mh.aE);
   public static final yw<wj, jf<crd>> i = yu.b(mh.aE);
   private static final Map<alf<dkp>, alf<crd>> j = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dkw.B, a);
      $$0.put(dkw.f, a);
      $$0.put(dkw.C, a);
      $$0.put(dkw.D, a);
      $$0.put(dkw.A, b);
      $$0.put(dkw.y, b);
      $$0.put(dkw.z, b);
      $$0.put(dkw.t, d);
      $$0.put(dkw.s, d);
      $$0.put(dkw.x, d);
      $$0.put(dkw.Y, e);
      $$0.put(dkw.X, e);
      $$0.put(dkw.M, e);
      $$0.put(dkw.e, e);
      $$0.put(dkw.O, e);
      $$0.put(dkw.r, e);
      $$0.put(dkw.d, e);
      $$0.put(dkw.G, e);
      $$0.put(dkw.H, e);
      $$0.put(dkw.I, e);
      $$0.put(dkw.J, e);
      $$0.put(dkw.g, f);
      $$0.put(dkw.h, f);
      $$0.put(dkw.p, g);
      $$0.put(dkw.o, g);
      $$0.put(dkw.v, g);
      $$0.put(dkw.u, g);
      $$0.put(dkw.q, g);
      $$0.put(dkw.w, g);
   });

   private static alf<crd> a(String $$0) {
      return alf.a(mh.aE, alg.b($$0));
   }

   private static crd a(js<crd> $$0, alf<crd> $$1) {
      return js.a($$0, $$1, new crd());
   }

   public static crd a(js<crd> $$0) {
      a($$0, a);
      a($$0, b);
      a($$0, c);
      a($$0, d);
      a($$0, e);
      a($$0, f);
      return a($$0, g);
   }

   public static alf<crd> a(jf<dkp> $$0) {
      return $$0.e().map(j::get).orElse(c);
   }
}
