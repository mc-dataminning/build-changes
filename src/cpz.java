import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public final class cpz {
   public static final alc<cpz> a = a("desert");
   public static final alc<cpz> b = a("jungle");
   public static final alc<cpz> c = a("plains");
   public static final alc<cpz> d = a("savanna");
   public static final alc<cpz> e = a("snow");
   public static final alc<cpz> f = a("swamp");
   public static final alc<cpz> g = a("taiga");
   public static final Codec<js<cpz>> h = ala.a(me.aw);
   public static final yt<wg, js<cpz>> i = yr.b(me.aw);
   private static final Map<alc<dis>, alc<cpz>> j = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(diz.B, a);
      $$0.put(diz.f, a);
      $$0.put(diz.C, a);
      $$0.put(diz.D, a);
      $$0.put(diz.A, b);
      $$0.put(diz.y, b);
      $$0.put(diz.z, b);
      $$0.put(diz.t, d);
      $$0.put(diz.s, d);
      $$0.put(diz.x, d);
      $$0.put(diz.Y, e);
      $$0.put(diz.X, e);
      $$0.put(diz.M, e);
      $$0.put(diz.e, e);
      $$0.put(diz.O, e);
      $$0.put(diz.r, e);
      $$0.put(diz.d, e);
      $$0.put(diz.G, e);
      $$0.put(diz.H, e);
      $$0.put(diz.I, e);
      $$0.put(diz.J, e);
      $$0.put(diz.g, f);
      $$0.put(diz.h, f);
      $$0.put(diz.p, g);
      $$0.put(diz.o, g);
      $$0.put(diz.v, g);
      $$0.put(diz.u, g);
      $$0.put(diz.q, g);
      $$0.put(diz.w, g);
   });

   private static alc<cpz> a(String $$0) {
      return alc.a(me.aw, ald.b($$0));
   }

   private static cpz a(kf<cpz> $$0, alc<cpz> $$1) {
      return kf.a($$0, $$1, new cpz());
   }

   public static cpz a(kf<cpz> $$0) {
      a($$0, a);
      a($$0, b);
      a($$0, c);
      a($$0, d);
      a($$0, e);
      a($$0, f);
      return a($$0, g);
   }

   public static alc<cpz> a(js<dis> $$0) {
      return $$0.e().map(j::get).orElse(c);
   }
}
