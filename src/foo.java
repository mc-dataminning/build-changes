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

public class foo {
   public static final aez a = new aez("textures/atlas/shulker_boxes.png");
   public static final aez b = new aez("textures/atlas/beds.png");
   public static final aez c = new aez("textures/atlas/banner_patterns.png");
   public static final aez d = new aez("textures/atlas/shield_patterns.png");
   public static final aez e = new aez("textures/atlas/signs.png");
   public static final aez f = new aez("textures/atlas/chest.png");
   public static final aez g = new aez("textures/atlas/armor_trims.png");
   public static final aez h = new aez("textures/atlas/decorated_pot.png");
   private static final foi A = foi.e(a);
   private static final foi B = foi.c(b);
   private static final foi C = foi.m(c);
   private static final foi D = foi.m(d);
   private static final foi E = foi.e(e);
   private static final foi F = foi.d(f);
   private static final foi G = foi.a(g);
   private static final foi H = foi.b(g);
   private static final foi I = foi.c(fyz.e);
   private static final foi J = foi.d(fyz.e);
   private static final foi K = foi.g(fyz.e);
   private static final foi L = foi.h(fyz.e);
   public static final gbe i = new gbe(a, new aez("entity/shulker/shulker"));
   public static final List<gbe> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gbe(a, new aez("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dgq, gbe> k = dgq.a().collect(Collectors.toMap(Function.identity(), foo::c));
   public static final Map<dgq, gbe> l = dgq.a().collect(Collectors.toMap(Function.identity(), foo::d));
   public static final Map<aey<dcq>, gbe> m = jb.am.f().stream().collect(Collectors.toMap(Function.identity(), foo::d));
   public static final Map<aey<dcq>, gbe> n = jb.am.f().stream().collect(Collectors.toMap(Function.identity(), foo::e));
   public static final Map<aey<String>, gbe> o = jb.ao.f().stream().collect(Collectors.toMap(Function.identity(), foo::f));
   public static final gbe[] p = Arrays.stream(chz.values())
      .sorted(Comparator.comparingInt(chz::a))
      .map($$0 -> new gbe(b, new aez("entity/bed/" + $$0.b())))
      .toArray(gbe[]::new);
   public static final gbe q = a("trapped");
   public static final gbe r = a("trapped_left");
   public static final gbe s = a("trapped_right");
   public static final gbe t = a("christmas");
   public static final gbe u = a("christmas_left");
   public static final gbe v = a("christmas_right");
   public static final gbe w = a("normal");
   public static final gbe x = a("normal_left");
   public static final gbe y = a("normal_right");
   public static final gbe z = a("ender");

   public static foi a() {
      return C;
   }

   public static foi b() {
      return D;
   }

   public static foi c() {
      return B;
   }

   public static foi d() {
      return A;
   }

   public static foi e() {
      return E;
   }

   public static foi f() {
      return E;
   }

   public static foi g() {
      return F;
   }

   public static foi a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static foi h() {
      return I;
   }

   public static foi i() {
      return J;
   }

   public static foi j() {
      return K;
   }

   public static foi k() {
      return L;
   }

   public static void a(Consumer<gbe> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gbe $$1 : p) {
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

   private static gbe c(dgq $$0) {
      return new gbe(e, new aez("entity/signs/" + $$0.b()));
   }

   private static gbe d(dgq $$0) {
      return new gbe(e, new aez("entity/signs/hanging/" + $$0.b()));
   }

   public static gbe a(dgq $$0) {
      return k.get($$0);
   }

   public static gbe b(dgq $$0) {
      return l.get($$0);
   }

   private static gbe d(aey<dcq> $$0) {
      return new gbe(c, dcq.a($$0, true));
   }

   public static gbe a(aey<dcq> $$0) {
      return m.get($$0);
   }

   private static gbe e(aey<dcq> $$0) {
      return new gbe(d, dcq.a($$0, false));
   }

   public static gbe b(aey<dcq> $$0) {
      return n.get($$0);
   }

   private static gbe a(String $$0) {
      return new gbe(f, new aez("entity/chest/" + $$0));
   }

   private static gbe f(aey<String> $$0) {
      return new gbe(h, ddp.a($$0));
   }

   @Nullable
   public static gbe c(@Nullable aey<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gbe a(dcz $$0, dfv $$1, boolean $$2) {
      if ($$0 instanceof ddt) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof deq ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gbe a(dfv $$0, gbe $$1, gbe $$2, gbe $$3) {
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
