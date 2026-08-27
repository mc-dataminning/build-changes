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

public class fsx {
   public static final agt a = new agt("textures/atlas/shulker_boxes.png");
   public static final agt b = new agt("textures/atlas/beds.png");
   public static final agt c = new agt("textures/atlas/banner_patterns.png");
   public static final agt d = new agt("textures/atlas/shield_patterns.png");
   public static final agt e = new agt("textures/atlas/signs.png");
   public static final agt f = new agt("textures/atlas/chest.png");
   public static final agt g = new agt("textures/atlas/armor_trims.png");
   public static final agt h = new agt("textures/atlas/decorated_pot.png");
   private static final fsq A = fsq.e(a);
   private static final fsq B = fsq.c(b);
   private static final fsq C = fsq.m(c);
   private static final fsq D = fsq.m(d);
   private static final fsq E = fsq.e(e);
   private static final fsq F = fsq.d(f);
   private static final fsq G = fsq.a(g);
   private static final fsq H = fsq.b(g);
   private static final fsq I = fsq.c(gdn.e);
   private static final fsq J = fsq.d(gdn.e);
   private static final fsq K = fsq.g(gdn.e);
   private static final fsq L = fsq.h(gdn.e);
   public static final gfs i = new gfs(a, new agt("entity/shulker/shulker"));
   public static final List<gfs> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gfs(a, new agt("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dkc, gfs> k = dkc.a().collect(Collectors.toMap(Function.identity(), fsx::c));
   public static final Map<dkc, gfs> l = dkc.a().collect(Collectors.toMap(Function.identity(), fsx::d));
   public static final Map<ags<dfu>, gfs> m = kb.am.f().stream().collect(Collectors.toMap(Function.identity(), fsx::d));
   public static final Map<ags<dfu>, gfs> n = kb.am.f().stream().collect(Collectors.toMap(Function.identity(), fsx::e));
   public static final Map<ags<String>, gfs> o = kb.ao.f().stream().collect(Collectors.toMap(Function.identity(), fsx::f));
   public static final gfs[] p = Arrays.stream(ckv.values())
      .sorted(Comparator.comparingInt(ckv::a))
      .map($$0 -> new gfs(b, new agt("entity/bed/" + $$0.b())))
      .toArray(gfs[]::new);
   public static final gfs q = a("trapped");
   public static final gfs r = a("trapped_left");
   public static final gfs s = a("trapped_right");
   public static final gfs t = a("christmas");
   public static final gfs u = a("christmas_left");
   public static final gfs v = a("christmas_right");
   public static final gfs w = a("normal");
   public static final gfs x = a("normal_left");
   public static final gfs y = a("normal_right");
   public static final gfs z = a("ender");

   public static fsq a() {
      return C;
   }

   public static fsq b() {
      return D;
   }

   public static fsq c() {
      return B;
   }

   public static fsq d() {
      return A;
   }

   public static fsq e() {
      return E;
   }

   public static fsq f() {
      return E;
   }

   public static fsq g() {
      return F;
   }

   public static fsq a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fsq h() {
      return I;
   }

   public static fsq i() {
      return J;
   }

   public static fsq j() {
      return K;
   }

   public static fsq k() {
      return L;
   }

   public static void a(Consumer<gfs> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gfs $$1 : p) {
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

   private static gfs c(dkc $$0) {
      return new gfs(e, new agt("entity/signs/" + $$0.b()));
   }

   private static gfs d(dkc $$0) {
      return new gfs(e, new agt("entity/signs/hanging/" + $$0.b()));
   }

   public static gfs a(dkc $$0) {
      return k.get($$0);
   }

   public static gfs b(dkc $$0) {
      return l.get($$0);
   }

   private static gfs d(ags<dfu> $$0) {
      return new gfs(c, dfu.a($$0, true));
   }

   public static gfs a(ags<dfu> $$0) {
      return m.get($$0);
   }

   private static gfs e(ags<dfu> $$0) {
      return new gfs(d, dfu.a($$0, false));
   }

   public static gfs b(ags<dfu> $$0) {
      return n.get($$0);
   }

   private static gfs a(String $$0) {
      return new gfs(f, new agt("entity/chest/" + $$0));
   }

   private static gfs f(ags<String> $$0) {
      return new gfs(h, dgu.a($$0));
   }

   @Nullable
   public static gfs c(@Nullable ags<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gfs a(dgd $$0, djh $$1, boolean $$2) {
      if ($$0 instanceof dgy) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dhv ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gfs a(djh $$0, gfs $$1, gfs $$2, gfs $$3) {
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
