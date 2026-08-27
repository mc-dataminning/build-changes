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

public class ftu {
   public static final ahg a = new ahg("textures/atlas/shulker_boxes.png");
   public static final ahg b = new ahg("textures/atlas/beds.png");
   public static final ahg c = new ahg("textures/atlas/banner_patterns.png");
   public static final ahg d = new ahg("textures/atlas/shield_patterns.png");
   public static final ahg e = new ahg("textures/atlas/signs.png");
   public static final ahg f = new ahg("textures/atlas/chest.png");
   public static final ahg g = new ahg("textures/atlas/armor_trims.png");
   public static final ahg h = new ahg("textures/atlas/decorated_pot.png");
   private static final ftn A = ftn.e(a);
   private static final ftn B = ftn.c(b);
   private static final ftn C = ftn.m(c);
   private static final ftn D = ftn.m(d);
   private static final ftn E = ftn.e(e);
   private static final ftn F = ftn.d(f);
   private static final ftn G = ftn.a(g);
   private static final ftn H = ftn.b(g);
   private static final ftn I = ftn.c(gek.e);
   private static final ftn J = ftn.d(gek.e);
   private static final ftn K = ftn.g(gek.e);
   private static final ftn L = ftn.h(gek.e);
   public static final ggo i = new ggo(a, new ahg("entity/shulker/shulker"));
   public static final List<ggo> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new ggo(a, new ahg("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dkt, ggo> k = dkt.a().collect(Collectors.toMap(Function.identity(), ftu::c));
   public static final Map<dkt, ggo> l = dkt.a().collect(Collectors.toMap(Function.identity(), ftu::d));
   public static final Map<ahf<dgl>, ggo> m = kd.am.f().stream().collect(Collectors.toMap(Function.identity(), ftu::d));
   public static final Map<ahf<dgl>, ggo> n = kd.am.f().stream().collect(Collectors.toMap(Function.identity(), ftu::e));
   public static final Map<ahf<String>, ggo> o = kd.ao.f().stream().collect(Collectors.toMap(Function.identity(), ftu::f));
   public static final ggo[] p = Arrays.stream(cll.values())
      .sorted(Comparator.comparingInt(cll::a))
      .map($$0 -> new ggo(b, new ahg("entity/bed/" + $$0.b())))
      .toArray(ggo[]::new);
   public static final ggo q = a("trapped");
   public static final ggo r = a("trapped_left");
   public static final ggo s = a("trapped_right");
   public static final ggo t = a("christmas");
   public static final ggo u = a("christmas_left");
   public static final ggo v = a("christmas_right");
   public static final ggo w = a("normal");
   public static final ggo x = a("normal_left");
   public static final ggo y = a("normal_right");
   public static final ggo z = a("ender");

   public static ftn a() {
      return C;
   }

   public static ftn b() {
      return D;
   }

   public static ftn c() {
      return B;
   }

   public static ftn d() {
      return A;
   }

   public static ftn e() {
      return E;
   }

   public static ftn f() {
      return E;
   }

   public static ftn g() {
      return F;
   }

   public static ftn a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static ftn h() {
      return I;
   }

   public static ftn i() {
      return J;
   }

   public static ftn j() {
      return K;
   }

   public static ftn k() {
      return L;
   }

   public static void a(Consumer<ggo> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (ggo $$1 : p) {
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

   private static ggo c(dkt $$0) {
      return new ggo(e, new ahg("entity/signs/" + $$0.b()));
   }

   private static ggo d(dkt $$0) {
      return new ggo(e, new ahg("entity/signs/hanging/" + $$0.b()));
   }

   public static ggo a(dkt $$0) {
      return k.get($$0);
   }

   public static ggo b(dkt $$0) {
      return l.get($$0);
   }

   private static ggo d(ahf<dgl> $$0) {
      return new ggo(c, dgl.a($$0, true));
   }

   public static ggo a(ahf<dgl> $$0) {
      return m.get($$0);
   }

   private static ggo e(ahf<dgl> $$0) {
      return new ggo(d, dgl.a($$0, false));
   }

   public static ggo b(ahf<dgl> $$0) {
      return n.get($$0);
   }

   private static ggo a(String $$0) {
      return new ggo(f, new ahg("entity/chest/" + $$0));
   }

   private static ggo f(ahf<String> $$0) {
      return new ggo(h, dhl.a($$0));
   }

   @Nullable
   public static ggo c(@Nullable ahf<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static ggo a(dgu $$0, djy $$1, boolean $$2) {
      if ($$0 instanceof dhp) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dim ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static ggo a(djy $$0, ggo $$1, ggo $$2, ggo $$3) {
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
