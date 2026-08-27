import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fro {
   public static final agm a = new agm("textures/atlas/shulker_boxes.png");
   public static final agm b = new agm("textures/atlas/beds.png");
   public static final agm c = new agm("textures/atlas/banner_patterns.png");
   public static final agm d = new agm("textures/atlas/shield_patterns.png");
   public static final agm e = new agm("textures/atlas/signs.png");
   public static final agm f = new agm("textures/atlas/chest.png");
   public static final agm g = new agm("textures/atlas/armor_trims.png");
   public static final agm h = new agm("textures/atlas/decorated_pot.png");
   private static final frh A = frh.e(a);
   private static final frh B = frh.c(b);
   private static final frh C = frh.m(c);
   private static final frh D = frh.m(d);
   private static final frh E = frh.e(e);
   private static final frh F = frh.d(f);
   private static final frh G = frh.a(g);
   private static final frh H = frh.b(g);
   private static final frh I = frh.c(gby.e);
   private static final frh J = frh.d(gby.e);
   private static final frh K = frh.g(gby.e);
   private static final frh L = frh.h(gby.e);
   public static final ged i = new ged(a, new agm("entity/shulker/shulker"));
   public static final List<ged> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new ged(a, new agm("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dja, ged> k = dja.a().collect(Collectors.toMap(Function.identity(), fro::c));
   public static final Map<dja, ged> l = dja.a().collect(Collectors.toMap(Function.identity(), fro::d));
   public static final Map<agl<dez>, ged> m = kc.an.f().stream().collect(Collectors.toMap(Function.identity(), fro::d));
   public static final Map<agl<dez>, ged> n = kc.an.f().stream().collect(Collectors.toMap(Function.identity(), fro::e));
   public static final Map<agl<String>, ged> o = kc.ap.f().stream().collect(Collectors.toMap(Function.identity(), fro::f));
   public static final ged[] p = Arrays.stream(ckc.values())
      .sorted(Comparator.comparingInt(ckc::a))
      .map($$0 -> new ged(b, new agm("entity/bed/" + $$0.b())))
      .toArray(ged[]::new);
   public static final ged q = a("trapped");
   public static final ged r = a("trapped_left");
   public static final ged s = a("trapped_right");
   public static final ged t = a("christmas");
   public static final ged u = a("christmas_left");
   public static final ged v = a("christmas_right");
   public static final ged w = a("normal");
   public static final ged x = a("normal_left");
   public static final ged y = a("normal_right");
   public static final ged z = a("ender");

   public static frh a() {
      return C;
   }

   public static frh b() {
      return D;
   }

   public static frh c() {
      return B;
   }

   public static frh d() {
      return A;
   }

   public static frh e() {
      return E;
   }

   public static frh f() {
      return E;
   }

   public static frh g() {
      return F;
   }

   public static frh a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static frh h() {
      return I;
   }

   public static frh i() {
      return J;
   }

   public static frh j() {
      return K;
   }

   public static frh k() {
      return L;
   }

   public static void a(Consumer<ged> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (ged $$1 : p) {
         $$0.accept($$1);
      }

      $$0.accept(q);
      $$0.accept(r);
      $$0.accept(s);
      $$0.accept(t);
      $$0.accept(u);
      $$0.accept(v);
      $$0.accept(w);
      $$0.accept(x);
      $$0.accept(y);
      $$0.accept(z);
   }

   private static ged c(dja $$0) {
      return new ged(e, new agm("entity/signs/" + $$0.b()));
   }

   private static ged d(dja $$0) {
      return new ged(e, new agm("entity/signs/hanging/" + $$0.b()));
   }

   public static ged a(dja $$0) {
      return k.get($$0);
   }

   public static ged b(dja $$0) {
      return l.get($$0);
   }

   private static ged d(agl<dez> $$0) {
      return new ged(c, dez.a($$0, true));
   }

   public static ged a(agl<dez> $$0) {
      return m.get($$0);
   }

   private static ged e(agl<dez> $$0) {
      return new ged(d, dez.a($$0, false));
   }

   public static ged b(agl<dez> $$0) {
      return n.get($$0);
   }

   private static ged a(String $$0) {
      return new ged(f, new agm("entity/chest/" + $$0));
   }

   private static ged f(agl<String> $$0) {
      return new ged(h, dfz.a($$0));
   }

   @Nullable
   public static ged c(@Nullable agl<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static ged a(dfi $$0, dif $$1, boolean $$2) {
      if ($$0 instanceof dgd) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dha ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static ged a(dif $$0, ged $$1, ged $$2, ged $$3) {
      switch ($$0) {
         case b:
            return $$2;
         case c:
            return $$3;
         case a:
         default:
            return $$1;
      }
   }
}
