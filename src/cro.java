import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public final class cro {
   public static final alh<cro> a = a("desert");
   public static final alh<cro> b = a("jungle");
   public static final alh<cro> c = a("plains");
   public static final alh<cro> d = a("savanna");
   public static final alh<cro> e = a("snow");
   public static final alh<cro> f = a("swamp");
   public static final alh<cro> g = a("taiga");
   public static final Codec<jf<cro>> h = alf.a(mh.aE);
   public static final yy<wl, jf<cro>> i = yw.b(mh.aE);
   private static final Map<alh<dla>, alh<cro>> j = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dlh.B, a);
      $$0.put(dlh.f, a);
      $$0.put(dlh.C, a);
      $$0.put(dlh.D, a);
      $$0.put(dlh.A, b);
      $$0.put(dlh.y, b);
      $$0.put(dlh.z, b);
      $$0.put(dlh.t, d);
      $$0.put(dlh.s, d);
      $$0.put(dlh.x, d);
      $$0.put(dlh.Y, e);
      $$0.put(dlh.X, e);
      $$0.put(dlh.M, e);
      $$0.put(dlh.e, e);
      $$0.put(dlh.O, e);
      $$0.put(dlh.r, e);
      $$0.put(dlh.d, e);
      $$0.put(dlh.G, e);
      $$0.put(dlh.H, e);
      $$0.put(dlh.I, e);
      $$0.put(dlh.J, e);
      $$0.put(dlh.g, f);
      $$0.put(dlh.h, f);
      $$0.put(dlh.p, g);
      $$0.put(dlh.o, g);
      $$0.put(dlh.v, g);
      $$0.put(dlh.u, g);
      $$0.put(dlh.q, g);
      $$0.put(dlh.w, g);
   });

   private static alh<cro> a(String $$0) {
      return alh.a(mh.aE, ali.b($$0));
   }

   private static cro a(js<cro> $$0, alh<cro> $$1) {
      return js.a($$0, $$1, new cro());
   }

   public static cro a(js<cro> $$0) {
      a($$0, a);
      a($$0, b);
      a($$0, c);
      a($$0, d);
      a($$0, e);
      a($$0, f);
      return a($$0, g);
   }

   public static alh<cro> a(jf<dla> $$0) {
      return $$0.e().map(j::get).orElse(c);
   }
}
