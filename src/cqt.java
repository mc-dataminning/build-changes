import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public final class cqt {
   public static final alf<cqt> a = a("desert");
   public static final alf<cqt> b = a("jungle");
   public static final alf<cqt> c = a("plains");
   public static final alf<cqt> d = a("savanna");
   public static final alf<cqt> e = a("snow");
   public static final alf<cqt> f = a("swamp");
   public static final alf<cqt> g = a("taiga");
   public static final Codec<je<cqt>> h = ald.a(mg.aE);
   public static final yw<wj, je<cqt>> i = yu.b(mg.aE);
   private static final Map<alf<dkd>, alf<cqt>> j = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dkk.B, a);
      $$0.put(dkk.f, a);
      $$0.put(dkk.C, a);
      $$0.put(dkk.D, a);
      $$0.put(dkk.A, b);
      $$0.put(dkk.y, b);
      $$0.put(dkk.z, b);
      $$0.put(dkk.t, d);
      $$0.put(dkk.s, d);
      $$0.put(dkk.x, d);
      $$0.put(dkk.Y, e);
      $$0.put(dkk.X, e);
      $$0.put(dkk.M, e);
      $$0.put(dkk.e, e);
      $$0.put(dkk.O, e);
      $$0.put(dkk.r, e);
      $$0.put(dkk.d, e);
      $$0.put(dkk.G, e);
      $$0.put(dkk.H, e);
      $$0.put(dkk.I, e);
      $$0.put(dkk.J, e);
      $$0.put(dkk.g, f);
      $$0.put(dkk.h, f);
      $$0.put(dkk.p, g);
      $$0.put(dkk.o, g);
      $$0.put(dkk.v, g);
      $$0.put(dkk.u, g);
      $$0.put(dkk.q, g);
      $$0.put(dkk.w, g);
   });

   private static alf<cqt> a(String $$0) {
      return alf.a(mg.aE, alg.b($$0));
   }

   private static cqt a(jr<cqt> $$0, alf<cqt> $$1) {
      return jr.a($$0, $$1, new cqt());
   }

   public static cqt a(jr<cqt> $$0) {
      a($$0, a);
      a($$0, b);
      a($$0, c);
      a($$0, d);
      a($$0, e);
      a($$0, f);
      return a($$0, g);
   }

   public static alf<cqt> a(je<dkd> $$0) {
      return $$0.e().map(j::get).orElse(c);
   }
}
