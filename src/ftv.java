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

public class ftv {
   public static final ahg a = new ahg("textures/atlas/shulker_boxes.png");
   public static final ahg b = new ahg("textures/atlas/beds.png");
   public static final ahg c = new ahg("textures/atlas/banner_patterns.png");
   public static final ahg d = new ahg("textures/atlas/shield_patterns.png");
   public static final ahg e = new ahg("textures/atlas/signs.png");
   public static final ahg f = new ahg("textures/atlas/chest.png");
   public static final ahg g = new ahg("textures/atlas/armor_trims.png");
   public static final ahg h = new ahg("textures/atlas/decorated_pot.png");
   private static final fto A = fto.e(a);
   private static final fto B = fto.c(b);
   private static final fto C = fto.m(c);
   private static final fto D = fto.m(d);
   private static final fto E = fto.e(e);
   private static final fto F = fto.d(f);
   private static final fto G = fto.a(g);
   private static final fto H = fto.b(g);
   private static final fto I = fto.c(gel.e);
   private static final fto J = fto.d(gel.e);
   private static final fto K = fto.g(gel.e);
   private static final fto L = fto.h(gel.e);
   public static final ggp i = new ggp(a, new ahg("entity/shulker/shulker"));
   public static final List<ggp> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new ggp(a, new ahg("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dkt, ggp> k = dkt.a().collect(Collectors.toMap(Function.identity(), ftv::c));
   public static final Map<dkt, ggp> l = dkt.a().collect(Collectors.toMap(Function.identity(), ftv::d));
   public static final Map<ahf<dgl>, ggp> m = kd.am.f().stream().collect(Collectors.toMap(Function.identity(), ftv::d));
   public static final Map<ahf<dgl>, ggp> n = kd.am.f().stream().collect(Collectors.toMap(Function.identity(), ftv::e));
   public static final Map<ahf<String>, ggp> o = kd.ao.f().stream().collect(Collectors.toMap(Function.identity(), ftv::f));
   public static final ggp[] p = Arrays.stream(cll.values())
      .sorted(Comparator.comparingInt(cll::a))
      .map($$0 -> new ggp(b, new ahg("entity/bed/" + $$0.b())))
      .toArray(ggp[]::new);
   public static final ggp q = a("trapped");
   public static final ggp r = a("trapped_left");
   public static final ggp s = a("trapped_right");
   public static final ggp t = a("christmas");
   public static final ggp u = a("christmas_left");
   public static final ggp v = a("christmas_right");
   public static final ggp w = a("normal");
   public static final ggp x = a("normal_left");
   public static final ggp y = a("normal_right");
   public static final ggp z = a("ender");

   public static fto a() {
      return C;
   }

   public static fto b() {
      return D;
   }

   public static fto c() {
      return B;
   }

   public static fto d() {
      return A;
   }

   public static fto e() {
      return E;
   }

   public static fto f() {
      return E;
   }

   public static fto g() {
      return F;
   }

   public static fto a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fto h() {
      return I;
   }

   public static fto i() {
      return J;
   }

   public static fto j() {
      return K;
   }

   public static fto k() {
      return L;
   }

   public static void a(Consumer<ggp> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (ggp $$1 : p) {
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

   private static ggp c(dkt $$0) {
      return new ggp(e, new ahg("entity/signs/" + $$0.b()));
   }

   private static ggp d(dkt $$0) {
      return new ggp(e, new ahg("entity/signs/hanging/" + $$0.b()));
   }

   public static ggp a(dkt $$0) {
      return k.get($$0);
   }

   public static ggp b(dkt $$0) {
      return l.get($$0);
   }

   private static ggp d(ahf<dgl> $$0) {
      return new ggp(c, dgl.a($$0, true));
   }

   public static ggp a(ahf<dgl> $$0) {
      return m.get($$0);
   }

   private static ggp e(ahf<dgl> $$0) {
      return new ggp(d, dgl.a($$0, false));
   }

   public static ggp b(ahf<dgl> $$0) {
      return n.get($$0);
   }

   private static ggp a(String $$0) {
      return new ggp(f, new ahg("entity/chest/" + $$0));
   }

   private static ggp f(ahf<String> $$0) {
      return new ggp(h, dhl.a($$0));
   }

   @Nullable
   public static ggp c(@Nullable ahf<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static ggp a(dgu $$0, djy $$1, boolean $$2) {
      if ($$0 instanceof dhp) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dim ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static ggp a(djy $$0, ggp $$1, ggp $$2, ggp $$3) {
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
