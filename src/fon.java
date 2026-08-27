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

public class fon {
   public static final aeu a = new aeu("textures/atlas/shulker_boxes.png");
   public static final aeu b = new aeu("textures/atlas/beds.png");
   public static final aeu c = new aeu("textures/atlas/banner_patterns.png");
   public static final aeu d = new aeu("textures/atlas/shield_patterns.png");
   public static final aeu e = new aeu("textures/atlas/signs.png");
   public static final aeu f = new aeu("textures/atlas/chest.png");
   public static final aeu g = new aeu("textures/atlas/armor_trims.png");
   public static final aeu h = new aeu("textures/atlas/decorated_pot.png");
   private static final foh A = foh.e(a);
   private static final foh B = foh.c(b);
   private static final foh C = foh.m(c);
   private static final foh D = foh.m(d);
   private static final foh E = foh.e(e);
   private static final foh F = foh.d(f);
   private static final foh G = foh.a(g);
   private static final foh H = foh.b(g);
   private static final foh I = foh.c(fyy.e);
   private static final foh J = foh.d(fyy.e);
   private static final foh K = foh.g(fyy.e);
   private static final foh L = foh.h(fyy.e);
   public static final gbd i = new gbd(a, new aeu("entity/shulker/shulker"));
   public static final List<gbd> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gbd(a, new aeu("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dgr, gbd> k = dgr.a().collect(Collectors.toMap(Function.identity(), fon::c));
   public static final Map<dgr, gbd> l = dgr.a().collect(Collectors.toMap(Function.identity(), fon::d));
   public static final Map<aet<dch>, gbd> m = jd.al.f().stream().collect(Collectors.toMap(Function.identity(), fon::d));
   public static final Map<aet<dch>, gbd> n = jd.al.f().stream().collect(Collectors.toMap(Function.identity(), fon::e));
   public static final Map<aet<String>, gbd> o = jd.an.f().stream().collect(Collectors.toMap(Function.identity(), fon::f));
   public static final gbd[] p = Arrays.stream(cho.values())
      .sorted(Comparator.comparingInt(cho::a))
      .map($$0 -> new gbd(b, new aeu("entity/bed/" + $$0.b())))
      .toArray(gbd[]::new);
   public static final gbd q = a("trapped");
   public static final gbd r = a("trapped_left");
   public static final gbd s = a("trapped_right");
   public static final gbd t = a("christmas");
   public static final gbd u = a("christmas_left");
   public static final gbd v = a("christmas_right");
   public static final gbd w = a("normal");
   public static final gbd x = a("normal_left");
   public static final gbd y = a("normal_right");
   public static final gbd z = a("ender");

   public static foh a() {
      return C;
   }

   public static foh b() {
      return D;
   }

   public static foh c() {
      return B;
   }

   public static foh d() {
      return A;
   }

   public static foh e() {
      return E;
   }

   public static foh f() {
      return E;
   }

   public static foh g() {
      return F;
   }

   public static foh a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static foh h() {
      return I;
   }

   public static foh i() {
      return J;
   }

   public static foh j() {
      return K;
   }

   public static foh k() {
      return L;
   }

   public static void a(Consumer<gbd> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gbd $$1 : p) {
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

   private static gbd c(dgr $$0) {
      return new gbd(e, new aeu("entity/signs/" + $$0.b()));
   }

   private static gbd d(dgr $$0) {
      return new gbd(e, new aeu("entity/signs/hanging/" + $$0.b()));
   }

   public static gbd a(dgr $$0) {
      return k.get($$0);
   }

   public static gbd b(dgr $$0) {
      return l.get($$0);
   }

   private static gbd d(aet<dch> $$0) {
      return new gbd(c, dch.a($$0, true));
   }

   public static gbd a(aet<dch> $$0) {
      return m.get($$0);
   }

   private static gbd e(aet<dch> $$0) {
      return new gbd(d, dch.a($$0, false));
   }

   public static gbd b(aet<dch> $$0) {
      return n.get($$0);
   }

   private static gbd a(String $$0) {
      return new gbd(f, new aeu("entity/chest/" + $$0));
   }

   private static gbd f(aet<String> $$0) {
      return new gbd(h, ddg.a($$0));
   }

   @Nullable
   public static gbd c(@Nullable aet<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gbd a(dcq $$0, dfw $$1, boolean $$2) {
      if ($$0 instanceof ddk) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof deh ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gbd a(dfw $$0, gbd $$1, gbd $$2, gbd $$3) {
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
