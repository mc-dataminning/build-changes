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

public class fto {
   public static final ahd a = new ahd("textures/atlas/shulker_boxes.png");
   public static final ahd b = new ahd("textures/atlas/beds.png");
   public static final ahd c = new ahd("textures/atlas/banner_patterns.png");
   public static final ahd d = new ahd("textures/atlas/shield_patterns.png");
   public static final ahd e = new ahd("textures/atlas/signs.png");
   public static final ahd f = new ahd("textures/atlas/chest.png");
   public static final ahd g = new ahd("textures/atlas/armor_trims.png");
   public static final ahd h = new ahd("textures/atlas/decorated_pot.png");
   private static final fth A = fth.e(a);
   private static final fth B = fth.c(b);
   private static final fth C = fth.m(c);
   private static final fth D = fth.m(d);
   private static final fth E = fth.e(e);
   private static final fth F = fth.d(f);
   private static final fth G = fth.a(g);
   private static final fth H = fth.b(g);
   private static final fth I = fth.c(gee.e);
   private static final fth J = fth.d(gee.e);
   private static final fth K = fth.g(gee.e);
   private static final fth L = fth.h(gee.e);
   public static final ggj i = new ggj(a, new ahd("entity/shulker/shulker"));
   public static final List<ggj> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new ggj(a, new ahd("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dkn, ggj> k = dkn.a().collect(Collectors.toMap(Function.identity(), fto::c));
   public static final Map<dkn, ggj> l = dkn.a().collect(Collectors.toMap(Function.identity(), fto::d));
   public static final Map<ahc<dgf>, ggj> m = kd.am.f().stream().collect(Collectors.toMap(Function.identity(), fto::d));
   public static final Map<ahc<dgf>, ggj> n = kd.am.f().stream().collect(Collectors.toMap(Function.identity(), fto::e));
   public static final Map<ahc<String>, ggj> o = kd.ao.f().stream().collect(Collectors.toMap(Function.identity(), fto::f));
   public static final ggj[] p = Arrays.stream(clf.values())
      .sorted(Comparator.comparingInt(clf::a))
      .map($$0 -> new ggj(b, new ahd("entity/bed/" + $$0.b())))
      .toArray(ggj[]::new);
   public static final ggj q = a("trapped");
   public static final ggj r = a("trapped_left");
   public static final ggj s = a("trapped_right");
   public static final ggj t = a("christmas");
   public static final ggj u = a("christmas_left");
   public static final ggj v = a("christmas_right");
   public static final ggj w = a("normal");
   public static final ggj x = a("normal_left");
   public static final ggj y = a("normal_right");
   public static final ggj z = a("ender");

   public static fth a() {
      return C;
   }

   public static fth b() {
      return D;
   }

   public static fth c() {
      return B;
   }

   public static fth d() {
      return A;
   }

   public static fth e() {
      return E;
   }

   public static fth f() {
      return E;
   }

   public static fth g() {
      return F;
   }

   public static fth a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fth h() {
      return I;
   }

   public static fth i() {
      return J;
   }

   public static fth j() {
      return K;
   }

   public static fth k() {
      return L;
   }

   public static void a(Consumer<ggj> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (ggj $$1 : p) {
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

   private static ggj c(dkn $$0) {
      return new ggj(e, new ahd("entity/signs/" + $$0.b()));
   }

   private static ggj d(dkn $$0) {
      return new ggj(e, new ahd("entity/signs/hanging/" + $$0.b()));
   }

   public static ggj a(dkn $$0) {
      return k.get($$0);
   }

   public static ggj b(dkn $$0) {
      return l.get($$0);
   }

   private static ggj d(ahc<dgf> $$0) {
      return new ggj(c, dgf.a($$0, true));
   }

   public static ggj a(ahc<dgf> $$0) {
      return m.get($$0);
   }

   private static ggj e(ahc<dgf> $$0) {
      return new ggj(d, dgf.a($$0, false));
   }

   public static ggj b(ahc<dgf> $$0) {
      return n.get($$0);
   }

   private static ggj a(String $$0) {
      return new ggj(f, new ahd("entity/chest/" + $$0));
   }

   private static ggj f(ahc<String> $$0) {
      return new ggj(h, dhf.a($$0));
   }

   @Nullable
   public static ggj c(@Nullable ahc<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static ggj a(dgo $$0, djs $$1, boolean $$2) {
      if ($$0 instanceof dhj) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dig ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static ggj a(djs $$0, ggj $$1, ggj $$2, ggj $$3) {
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
