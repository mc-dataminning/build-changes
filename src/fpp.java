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

public class fpp {
   public static final afw a = new afw("textures/atlas/shulker_boxes.png");
   public static final afw b = new afw("textures/atlas/beds.png");
   public static final afw c = new afw("textures/atlas/banner_patterns.png");
   public static final afw d = new afw("textures/atlas/shield_patterns.png");
   public static final afw e = new afw("textures/atlas/signs.png");
   public static final afw f = new afw("textures/atlas/chest.png");
   public static final afw g = new afw("textures/atlas/armor_trims.png");
   public static final afw h = new afw("textures/atlas/decorated_pot.png");
   private static final fpj A = fpj.e(a);
   private static final fpj B = fpj.c(b);
   private static final fpj C = fpj.m(c);
   private static final fpj D = fpj.m(d);
   private static final fpj E = fpj.e(e);
   private static final fpj F = fpj.d(f);
   private static final fpj G = fpj.a(g);
   private static final fpj H = fpj.b(g);
   private static final fpj I = fpj.c(fzz.e);
   private static final fpj J = fpj.d(fzz.e);
   private static final fpj K = fpj.g(fzz.e);
   private static final fpj L = fpj.h(fzz.e);
   public static final gce i = new gce(a, new afw("entity/shulker/shulker"));
   public static final List<gce> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gce(a, new afw("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dho, gce> k = dho.a().collect(Collectors.toMap(Function.identity(), fpp::c));
   public static final Map<dho, gce> l = dho.a().collect(Collectors.toMap(Function.identity(), fpp::d));
   public static final Map<afv<ddo>, gce> m = jy.am.f().stream().collect(Collectors.toMap(Function.identity(), fpp::d));
   public static final Map<afv<ddo>, gce> n = jy.am.f().stream().collect(Collectors.toMap(Function.identity(), fpp::e));
   public static final Map<afv<String>, gce> o = jy.ao.f().stream().collect(Collectors.toMap(Function.identity(), fpp::f));
   public static final gce[] p = Arrays.stream(cix.values())
      .sorted(Comparator.comparingInt(cix::a))
      .map($$0 -> new gce(b, new afw("entity/bed/" + $$0.b())))
      .toArray(gce[]::new);
   public static final gce q = a("trapped");
   public static final gce r = a("trapped_left");
   public static final gce s = a("trapped_right");
   public static final gce t = a("christmas");
   public static final gce u = a("christmas_left");
   public static final gce v = a("christmas_right");
   public static final gce w = a("normal");
   public static final gce x = a("normal_left");
   public static final gce y = a("normal_right");
   public static final gce z = a("ender");

   public static fpj a() {
      return C;
   }

   public static fpj b() {
      return D;
   }

   public static fpj c() {
      return B;
   }

   public static fpj d() {
      return A;
   }

   public static fpj e() {
      return E;
   }

   public static fpj f() {
      return E;
   }

   public static fpj g() {
      return F;
   }

   public static fpj a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fpj h() {
      return I;
   }

   public static fpj i() {
      return J;
   }

   public static fpj j() {
      return K;
   }

   public static fpj k() {
      return L;
   }

   public static void a(Consumer<gce> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gce $$1 : p) {
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

   private static gce c(dho $$0) {
      return new gce(e, new afw("entity/signs/" + $$0.b()));
   }

   private static gce d(dho $$0) {
      return new gce(e, new afw("entity/signs/hanging/" + $$0.b()));
   }

   public static gce a(dho $$0) {
      return k.get($$0);
   }

   public static gce b(dho $$0) {
      return l.get($$0);
   }

   private static gce d(afv<ddo> $$0) {
      return new gce(c, ddo.a($$0, true));
   }

   public static gce a(afv<ddo> $$0) {
      return m.get($$0);
   }

   private static gce e(afv<ddo> $$0) {
      return new gce(d, ddo.a($$0, false));
   }

   public static gce b(afv<ddo> $$0) {
      return n.get($$0);
   }

   private static gce a(String $$0) {
      return new gce(f, new afw("entity/chest/" + $$0));
   }

   private static gce f(afv<String> $$0) {
      return new gce(h, den.a($$0));
   }

   @Nullable
   public static gce c(@Nullable afv<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gce a(ddx $$0, dgt $$1, boolean $$2) {
      if ($$0 instanceof der) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dfo ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gce a(dgt $$0, gce $$1, gce $$2, gce $$3) {
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
