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

public class ftw {
   public static final ahg a = new ahg("textures/atlas/shulker_boxes.png");
   public static final ahg b = new ahg("textures/atlas/beds.png");
   public static final ahg c = new ahg("textures/atlas/banner_patterns.png");
   public static final ahg d = new ahg("textures/atlas/shield_patterns.png");
   public static final ahg e = new ahg("textures/atlas/signs.png");
   public static final ahg f = new ahg("textures/atlas/chest.png");
   public static final ahg g = new ahg("textures/atlas/armor_trims.png");
   public static final ahg h = new ahg("textures/atlas/decorated_pot.png");
   private static final ftp A = ftp.e(a);
   private static final ftp B = ftp.c(b);
   private static final ftp C = ftp.m(c);
   private static final ftp D = ftp.m(d);
   private static final ftp E = ftp.e(e);
   private static final ftp F = ftp.d(f);
   private static final ftp G = ftp.a(g);
   private static final ftp H = ftp.b(g);
   private static final ftp I = ftp.c(gem.e);
   private static final ftp J = ftp.d(gem.e);
   private static final ftp K = ftp.g(gem.e);
   private static final ftp L = ftp.h(gem.e);
   public static final ggq i = new ggq(a, new ahg("entity/shulker/shulker"));
   public static final List<ggq> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new ggq(a, new ahg("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dku, ggq> k = dku.a().collect(Collectors.toMap(Function.identity(), ftw::c));
   public static final Map<dku, ggq> l = dku.a().collect(Collectors.toMap(Function.identity(), ftw::d));
   public static final Map<ahf<dgm>, ggq> m = kd.am.f().stream().collect(Collectors.toMap(Function.identity(), ftw::d));
   public static final Map<ahf<dgm>, ggq> n = kd.am.f().stream().collect(Collectors.toMap(Function.identity(), ftw::e));
   public static final Map<ahf<String>, ggq> o = kd.ao.f().stream().collect(Collectors.toMap(Function.identity(), ftw::f));
   public static final ggq[] p = Arrays.stream(clm.values())
      .sorted(Comparator.comparingInt(clm::a))
      .map($$0 -> new ggq(b, new ahg("entity/bed/" + $$0.b())))
      .toArray(ggq[]::new);
   public static final ggq q = a("trapped");
   public static final ggq r = a("trapped_left");
   public static final ggq s = a("trapped_right");
   public static final ggq t = a("christmas");
   public static final ggq u = a("christmas_left");
   public static final ggq v = a("christmas_right");
   public static final ggq w = a("normal");
   public static final ggq x = a("normal_left");
   public static final ggq y = a("normal_right");
   public static final ggq z = a("ender");

   public static ftp a() {
      return C;
   }

   public static ftp b() {
      return D;
   }

   public static ftp c() {
      return B;
   }

   public static ftp d() {
      return A;
   }

   public static ftp e() {
      return E;
   }

   public static ftp f() {
      return E;
   }

   public static ftp g() {
      return F;
   }

   public static ftp a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static ftp h() {
      return I;
   }

   public static ftp i() {
      return J;
   }

   public static ftp j() {
      return K;
   }

   public static ftp k() {
      return L;
   }

   public static void a(Consumer<ggq> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (ggq $$1 : p) {
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

   private static ggq c(dku $$0) {
      return new ggq(e, new ahg("entity/signs/" + $$0.b()));
   }

   private static ggq d(dku $$0) {
      return new ggq(e, new ahg("entity/signs/hanging/" + $$0.b()));
   }

   public static ggq a(dku $$0) {
      return k.get($$0);
   }

   public static ggq b(dku $$0) {
      return l.get($$0);
   }

   private static ggq d(ahf<dgm> $$0) {
      return new ggq(c, dgm.a($$0, true));
   }

   public static ggq a(ahf<dgm> $$0) {
      return m.get($$0);
   }

   private static ggq e(ahf<dgm> $$0) {
      return new ggq(d, dgm.a($$0, false));
   }

   public static ggq b(ahf<dgm> $$0) {
      return n.get($$0);
   }

   private static ggq a(String $$0) {
      return new ggq(f, new ahg("entity/chest/" + $$0));
   }

   private static ggq f(ahf<String> $$0) {
      return new ggq(h, dhm.a($$0));
   }

   @Nullable
   public static ggq c(@Nullable ahf<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static ggq a(dgv $$0, djz $$1, boolean $$2) {
      if ($$0 instanceof dhq) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof din ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static ggq a(djz $$0, ggq $$1, ggq $$2, ggq $$3) {
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
