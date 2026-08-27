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

public class fnu {
   public static final aep a = new aep("textures/atlas/shulker_boxes.png");
   public static final aep b = new aep("textures/atlas/beds.png");
   public static final aep c = new aep("textures/atlas/banner_patterns.png");
   public static final aep d = new aep("textures/atlas/shield_patterns.png");
   public static final aep e = new aep("textures/atlas/signs.png");
   public static final aep f = new aep("textures/atlas/chest.png");
   public static final aep g = new aep("textures/atlas/armor_trims.png");
   public static final aep h = new aep("textures/atlas/decorated_pot.png");
   private static final fno A = fno.d(a);
   private static final fno B = fno.b(b);
   private static final fno C = fno.l(c);
   private static final fno D = fno.l(d);
   private static final fno E = fno.d(e);
   private static final fno F = fno.c(f);
   private static final fno G = fno.a(g);
   private static final fno H = fno.b(fyf.e);
   private static final fno I = fno.c(fyf.e);
   private static final fno J = fno.f(fyf.e);
   private static final fno K = fno.g(fyf.e);
   public static final gak i = new gak(a, new aep("entity/shulker/shulker"));
   public static final List<gak> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gak(a, new aep("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dgl, gak> k = dgl.a().collect(Collectors.toMap(Function.identity(), fnu::c));
   public static final Map<dgl, gak> l = dgl.a().collect(Collectors.toMap(Function.identity(), fnu::d));
   public static final Map<aeo<dcb>, gak> m = jc.al.f().stream().collect(Collectors.toMap(Function.identity(), fnu::d));
   public static final Map<aeo<dcb>, gak> n = jc.al.f().stream().collect(Collectors.toMap(Function.identity(), fnu::e));
   public static final Map<aeo<String>, gak> o = jc.an.f().stream().collect(Collectors.toMap(Function.identity(), fnu::f));
   public static final gak[] p = Arrays.stream(chk.values())
      .sorted(Comparator.comparingInt(chk::a))
      .map($$0 -> new gak(b, new aep("entity/bed/" + $$0.b())))
      .toArray(gak[]::new);
   public static final gak q = a("trapped");
   public static final gak r = a("trapped_left");
   public static final gak s = a("trapped_right");
   public static final gak t = a("christmas");
   public static final gak u = a("christmas_left");
   public static final gak v = a("christmas_right");
   public static final gak w = a("normal");
   public static final gak x = a("normal_left");
   public static final gak y = a("normal_right");
   public static final gak z = a("ender");

   public static fno a() {
      return C;
   }

   public static fno b() {
      return D;
   }

   public static fno c() {
      return B;
   }

   public static fno d() {
      return A;
   }

   public static fno e() {
      return E;
   }

   public static fno f() {
      return E;
   }

   public static fno g() {
      return F;
   }

   public static fno h() {
      return G;
   }

   public static fno i() {
      return H;
   }

   public static fno j() {
      return I;
   }

   public static fno k() {
      return J;
   }

   public static fno l() {
      return K;
   }

   public static void a(Consumer<gak> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gak $$1 : p) {
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

   private static gak c(dgl $$0) {
      return new gak(e, new aep("entity/signs/" + $$0.b()));
   }

   private static gak d(dgl $$0) {
      return new gak(e, new aep("entity/signs/hanging/" + $$0.b()));
   }

   public static gak a(dgl $$0) {
      return k.get($$0);
   }

   public static gak b(dgl $$0) {
      return l.get($$0);
   }

   private static gak d(aeo<dcb> $$0) {
      return new gak(c, dcb.a($$0, true));
   }

   public static gak a(aeo<dcb> $$0) {
      return m.get($$0);
   }

   private static gak e(aeo<dcb> $$0) {
      return new gak(d, dcb.a($$0, false));
   }

   public static gak b(aeo<dcb> $$0) {
      return n.get($$0);
   }

   private static gak a(String $$0) {
      return new gak(f, new aep("entity/chest/" + $$0));
   }

   private static gak f(aeo<String> $$0) {
      return new gak(h, dda.a($$0));
   }

   @Nullable
   public static gak c(@Nullable aeo<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gak a(dck $$0, dfq $$1, boolean $$2) {
      if ($$0 instanceof dde) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof deb ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gak a(dfq $$0, gak $$1, gak $$2, gak $$3) {
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
