import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public final class crq {
   public static final alj<crq> a = a("desert");
   public static final alj<crq> b = a("jungle");
   public static final alj<crq> c = a("plains");
   public static final alj<crq> d = a("savanna");
   public static final alj<crq> e = a("snow");
   public static final alj<crq> f = a("swamp");
   public static final alj<crq> g = a("taiga");
   public static final Codec<jg<crq>> h = alh.a(mi.aE);
   public static final za<wn, jg<crq>> i = yy.b(mi.aE);
   private static final Map<alj<dlc>, alj<crq>> j = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dlj.B, a);
      $$0.put(dlj.f, a);
      $$0.put(dlj.C, a);
      $$0.put(dlj.D, a);
      $$0.put(dlj.A, b);
      $$0.put(dlj.y, b);
      $$0.put(dlj.z, b);
      $$0.put(dlj.t, d);
      $$0.put(dlj.s, d);
      $$0.put(dlj.x, d);
      $$0.put(dlj.Y, e);
      $$0.put(dlj.X, e);
      $$0.put(dlj.M, e);
      $$0.put(dlj.e, e);
      $$0.put(dlj.O, e);
      $$0.put(dlj.r, e);
      $$0.put(dlj.d, e);
      $$0.put(dlj.G, e);
      $$0.put(dlj.H, e);
      $$0.put(dlj.I, e);
      $$0.put(dlj.J, e);
      $$0.put(dlj.g, f);
      $$0.put(dlj.h, f);
      $$0.put(dlj.p, g);
      $$0.put(dlj.o, g);
      $$0.put(dlj.v, g);
      $$0.put(dlj.u, g);
      $$0.put(dlj.q, g);
      $$0.put(dlj.w, g);
   });

   private static alj<crq> a(String $$0) {
      return alj.a(mi.aE, alk.b($$0));
   }

   private static crq a(jt<crq> $$0, alj<crq> $$1) {
      return jt.a($$0, $$1, new crq());
   }

   public static crq a(jt<crq> $$0) {
      a($$0, a);
      a($$0, b);
      a($$0, c);
      a($$0, d);
      a($$0, e);
      a($$0, f);
      return a($$0, g);
   }

   public static alj<crq> a(jg<dlc> $$0) {
      return $$0.e().map(j::get).orElse(c);
   }
}
