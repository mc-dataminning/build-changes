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

public class fqw {
   public static final agg a = new agg("textures/atlas/shulker_boxes.png");
   public static final agg b = new agg("textures/atlas/beds.png");
   public static final agg c = new agg("textures/atlas/banner_patterns.png");
   public static final agg d = new agg("textures/atlas/shield_patterns.png");
   public static final agg e = new agg("textures/atlas/signs.png");
   public static final agg f = new agg("textures/atlas/chest.png");
   public static final agg g = new agg("textures/atlas/armor_trims.png");
   public static final agg h = new agg("textures/atlas/decorated_pot.png");
   private static final fqp A = fqp.e(a);
   private static final fqp B = fqp.c(b);
   private static final fqp C = fqp.m(c);
   private static final fqp D = fqp.m(d);
   private static final fqp E = fqp.e(e);
   private static final fqp F = fqp.d(f);
   private static final fqp G = fqp.a(g);
   private static final fqp H = fqp.b(g);
   private static final fqp I = fqp.c(gbg.e);
   private static final fqp J = fqp.d(gbg.e);
   private static final fqp K = fqp.g(gbg.e);
   private static final fqp L = fqp.h(gbg.e);
   public static final gdl i = new gdl(a, new agg("entity/shulker/shulker"));
   public static final List<gdl> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gdl(a, new agg("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dij, gdl> k = dij.a().collect(Collectors.toMap(Function.identity(), fqw::c));
   public static final Map<dij, gdl> l = dij.a().collect(Collectors.toMap(Function.identity(), fqw::d));
   public static final Map<agf<dei>, gdl> m = jy.an.f().stream().collect(Collectors.toMap(Function.identity(), fqw::d));
   public static final Map<agf<dei>, gdl> n = jy.an.f().stream().collect(Collectors.toMap(Function.identity(), fqw::e));
   public static final Map<agf<String>, gdl> o = jy.ap.f().stream().collect(Collectors.toMap(Function.identity(), fqw::f));
   public static final gdl[] p = Arrays.stream(cjp.values())
      .sorted(Comparator.comparingInt(cjp::a))
      .map($$0 -> new gdl(b, new agg("entity/bed/" + $$0.b())))
      .toArray(gdl[]::new);
   public static final gdl q = a("trapped");
   public static final gdl r = a("trapped_left");
   public static final gdl s = a("trapped_right");
   public static final gdl t = a("christmas");
   public static final gdl u = a("christmas_left");
   public static final gdl v = a("christmas_right");
   public static final gdl w = a("normal");
   public static final gdl x = a("normal_left");
   public static final gdl y = a("normal_right");
   public static final gdl z = a("ender");

   public static fqp a() {
      return C;
   }

   public static fqp b() {
      return D;
   }

   public static fqp c() {
      return B;
   }

   public static fqp d() {
      return A;
   }

   public static fqp e() {
      return E;
   }

   public static fqp f() {
      return E;
   }

   public static fqp g() {
      return F;
   }

   public static fqp a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fqp h() {
      return I;
   }

   public static fqp i() {
      return J;
   }

   public static fqp j() {
      return K;
   }

   public static fqp k() {
      return L;
   }

   public static void a(Consumer<gdl> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gdl $$1 : p) {
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

   private static gdl c(dij $$0) {
      return new gdl(e, new agg("entity/signs/" + $$0.b()));
   }

   private static gdl d(dij $$0) {
      return new gdl(e, new agg("entity/signs/hanging/" + $$0.b()));
   }

   public static gdl a(dij $$0) {
      return k.get($$0);
   }

   public static gdl b(dij $$0) {
      return l.get($$0);
   }

   private static gdl d(agf<dei> $$0) {
      return new gdl(c, dei.a($$0, true));
   }

   public static gdl a(agf<dei> $$0) {
      return m.get($$0);
   }

   private static gdl e(agf<dei> $$0) {
      return new gdl(d, dei.a($$0, false));
   }

   public static gdl b(agf<dei> $$0) {
      return n.get($$0);
   }

   private static gdl a(String $$0) {
      return new gdl(f, new agg("entity/chest/" + $$0));
   }

   private static gdl f(agf<String> $$0) {
      return new gdl(h, dfi.a($$0));
   }

   @Nullable
   public static gdl c(@Nullable agf<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gdl a(der $$0, dho $$1, boolean $$2) {
      if ($$0 instanceof dfm) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dgj ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gdl a(dho $$0, gdl $$1, gdl $$2, gdl $$3) {
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
