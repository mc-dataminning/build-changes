import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public final class cqj {
   public static final ald<cqj> a = a("desert");
   public static final ald<cqj> b = a("jungle");
   public static final ald<cqj> c = a("plains");
   public static final ald<cqj> d = a("savanna");
   public static final ald<cqj> e = a("snow");
   public static final ald<cqj> f = a("swamp");
   public static final ald<cqj> g = a("taiga");
   public static final Codec<je<cqj>> h = alb.a(mg.aE);
   public static final yu<wh, je<cqj>> i = ys.b(mg.aE);
   private static final Map<ald<djs>, ald<cqj>> j = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(djz.B, a);
      $$0.put(djz.f, a);
      $$0.put(djz.C, a);
      $$0.put(djz.D, a);
      $$0.put(djz.A, b);
      $$0.put(djz.y, b);
      $$0.put(djz.z, b);
      $$0.put(djz.t, d);
      $$0.put(djz.s, d);
      $$0.put(djz.x, d);
      $$0.put(djz.Y, e);
      $$0.put(djz.X, e);
      $$0.put(djz.M, e);
      $$0.put(djz.e, e);
      $$0.put(djz.O, e);
      $$0.put(djz.r, e);
      $$0.put(djz.d, e);
      $$0.put(djz.G, e);
      $$0.put(djz.H, e);
      $$0.put(djz.I, e);
      $$0.put(djz.J, e);
      $$0.put(djz.g, f);
      $$0.put(djz.h, f);
      $$0.put(djz.p, g);
      $$0.put(djz.o, g);
      $$0.put(djz.v, g);
      $$0.put(djz.u, g);
      $$0.put(djz.q, g);
      $$0.put(djz.w, g);
   });

   private static ald<cqj> a(String $$0) {
      return ald.a(mg.aE, ale.b($$0));
   }

   private static cqj a(jr<cqj> $$0, ald<cqj> $$1) {
      return jr.a($$0, $$1, new cqj());
   }

   public static cqj a(jr<cqj> $$0) {
      a($$0, a);
      a($$0, b);
      a($$0, c);
      a($$0, d);
      a($$0, e);
      a($$0, f);
      return a($$0, g);
   }

   public static ald<cqj> a(je<djs> $$0) {
      return $$0.e().map(j::get).orElse(c);
   }
}
