import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public final class cqp {
   public static final alf<cqp> a = a("desert");
   public static final alf<cqp> b = a("jungle");
   public static final alf<cqp> c = a("plains");
   public static final alf<cqp> d = a("savanna");
   public static final alf<cqp> e = a("snow");
   public static final alf<cqp> f = a("swamp");
   public static final alf<cqp> g = a("taiga");
   public static final Codec<je<cqp>> h = ald.a(mg.aE);
   public static final yw<wj, je<cqp>> i = yu.b(mg.aE);
   private static final Map<alf<djy>, alf<cqp>> j = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dkf.B, a);
      $$0.put(dkf.f, a);
      $$0.put(dkf.C, a);
      $$0.put(dkf.D, a);
      $$0.put(dkf.A, b);
      $$0.put(dkf.y, b);
      $$0.put(dkf.z, b);
      $$0.put(dkf.t, d);
      $$0.put(dkf.s, d);
      $$0.put(dkf.x, d);
      $$0.put(dkf.Y, e);
      $$0.put(dkf.X, e);
      $$0.put(dkf.M, e);
      $$0.put(dkf.e, e);
      $$0.put(dkf.O, e);
      $$0.put(dkf.r, e);
      $$0.put(dkf.d, e);
      $$0.put(dkf.G, e);
      $$0.put(dkf.H, e);
      $$0.put(dkf.I, e);
      $$0.put(dkf.J, e);
      $$0.put(dkf.g, f);
      $$0.put(dkf.h, f);
      $$0.put(dkf.p, g);
      $$0.put(dkf.o, g);
      $$0.put(dkf.v, g);
      $$0.put(dkf.u, g);
      $$0.put(dkf.q, g);
      $$0.put(dkf.w, g);
   });

   private static alf<cqp> a(String $$0) {
      return alf.a(mg.aE, alg.b($$0));
   }

   private static cqp a(jr<cqp> $$0, alf<cqp> $$1) {
      return jr.a($$0, $$1, new cqp());
   }

   public static cqp a(jr<cqp> $$0) {
      a($$0, a);
      a($$0, b);
      a($$0, c);
      a($$0, d);
      a($$0, e);
      a($$0, f);
      return a($$0, g);
   }

   public static alf<cqp> a(je<djy> $$0) {
      return $$0.e().map(j::get).orElse(c);
   }
}
