import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public final class cra {
   public static final alf<cra> a = a("desert");
   public static final alf<cra> b = a("jungle");
   public static final alf<cra> c = a("plains");
   public static final alf<cra> d = a("savanna");
   public static final alf<cra> e = a("snow");
   public static final alf<cra> f = a("swamp");
   public static final alf<cra> g = a("taiga");
   public static final Codec<jf<cra>> h = ald.a(mh.aE);
   public static final yw<wj, jf<cra>> i = yu.b(mh.aE);
   private static final Map<alf<dkk>, alf<cra>> j = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dkr.B, a);
      $$0.put(dkr.f, a);
      $$0.put(dkr.C, a);
      $$0.put(dkr.D, a);
      $$0.put(dkr.A, b);
      $$0.put(dkr.y, b);
      $$0.put(dkr.z, b);
      $$0.put(dkr.t, d);
      $$0.put(dkr.s, d);
      $$0.put(dkr.x, d);
      $$0.put(dkr.Y, e);
      $$0.put(dkr.X, e);
      $$0.put(dkr.M, e);
      $$0.put(dkr.e, e);
      $$0.put(dkr.O, e);
      $$0.put(dkr.r, e);
      $$0.put(dkr.d, e);
      $$0.put(dkr.G, e);
      $$0.put(dkr.H, e);
      $$0.put(dkr.I, e);
      $$0.put(dkr.J, e);
      $$0.put(dkr.g, f);
      $$0.put(dkr.h, f);
      $$0.put(dkr.p, g);
      $$0.put(dkr.o, g);
      $$0.put(dkr.v, g);
      $$0.put(dkr.u, g);
      $$0.put(dkr.q, g);
      $$0.put(dkr.w, g);
   });

   private static alf<cra> a(String $$0) {
      return alf.a(mh.aE, alg.b($$0));
   }

   private static cra a(js<cra> $$0, alf<cra> $$1) {
      return js.a($$0, $$1, new cra());
   }

   public static cra a(js<cra> $$0) {
      a($$0, a);
      a($$0, b);
      a($$0, c);
      a($$0, d);
      a($$0, e);
      a($$0, f);
      return a($$0, g);
   }

   public static alf<cra> a(jf<dkk> $$0) {
      return $$0.e().map(j::get).orElse(c);
   }
}
