import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public final class crz {
   public static final alq<crz> a = a("desert");
   public static final alq<crz> b = a("jungle");
   public static final alq<crz> c = a("plains");
   public static final alq<crz> d = a("savanna");
   public static final alq<crz> e = a("snow");
   public static final alq<crz> f = a("swamp");
   public static final alq<crz> g = a("taiga");
   public static final Codec<jg<crz>> h = alo.a(mi.aE);
   public static final ze<wp, jg<crz>> i = zc.b(mi.aE);
   private static final Map<alq<dlm>, alq<crz>> j = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dlt.B, a);
      $$0.put(dlt.f, a);
      $$0.put(dlt.C, a);
      $$0.put(dlt.D, a);
      $$0.put(dlt.A, b);
      $$0.put(dlt.y, b);
      $$0.put(dlt.z, b);
      $$0.put(dlt.t, d);
      $$0.put(dlt.s, d);
      $$0.put(dlt.x, d);
      $$0.put(dlt.Y, e);
      $$0.put(dlt.X, e);
      $$0.put(dlt.M, e);
      $$0.put(dlt.e, e);
      $$0.put(dlt.O, e);
      $$0.put(dlt.r, e);
      $$0.put(dlt.d, e);
      $$0.put(dlt.G, e);
      $$0.put(dlt.H, e);
      $$0.put(dlt.I, e);
      $$0.put(dlt.J, e);
      $$0.put(dlt.g, f);
      $$0.put(dlt.h, f);
      $$0.put(dlt.p, g);
      $$0.put(dlt.o, g);
      $$0.put(dlt.v, g);
      $$0.put(dlt.u, g);
      $$0.put(dlt.q, g);
      $$0.put(dlt.w, g);
   });

   private static alq<crz> a(String $$0) {
      return alq.a(mi.aE, alr.b($$0));
   }

   private static crz a(jt<crz> $$0, alq<crz> $$1) {
      return jt.a($$0, $$1, new crz());
   }

   public static crz a(jt<crz> $$0) {
      a($$0, a);
      a($$0, b);
      a($$0, c);
      a($$0, d);
      a($$0, e);
      a($$0, f);
      return a($$0, g);
   }

   public static alq<crz> a(jg<dlm> $$0) {
      return $$0.e().map(j::get).orElse(c);
   }
}
