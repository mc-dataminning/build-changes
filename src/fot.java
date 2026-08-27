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

public class fot {
   public static final aew a = new aew("textures/atlas/shulker_boxes.png");
   public static final aew b = new aew("textures/atlas/beds.png");
   public static final aew c = new aew("textures/atlas/banner_patterns.png");
   public static final aew d = new aew("textures/atlas/shield_patterns.png");
   public static final aew e = new aew("textures/atlas/signs.png");
   public static final aew f = new aew("textures/atlas/chest.png");
   public static final aew g = new aew("textures/atlas/armor_trims.png");
   public static final aew h = new aew("textures/atlas/decorated_pot.png");
   private static final fom A = fom.e(a);
   private static final fom B = fom.c(b);
   private static final fom C = fom.m(c);
   private static final fom D = fom.m(d);
   private static final fom E = fom.e(e);
   private static final fom F = fom.d(f);
   private static final fom G = fom.a(g);
   private static final fom H = fom.b(g);
   private static final fom I = fom.c(fzd.e);
   private static final fom J = fom.d(fzd.e);
   private static final fom K = fom.g(fzd.e);
   private static final fom L = fom.h(fzd.e);
   public static final gbi i = new gbi(a, new aew("entity/shulker/shulker"));
   public static final List<gbi> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gbi(a, new aew("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dgw, gbi> k = dgw.a().collect(Collectors.toMap(Function.identity(), fot::c));
   public static final Map<dgw, gbi> l = dgw.a().collect(Collectors.toMap(Function.identity(), fot::d));
   public static final Map<aev<dcm>, gbi> m = jb.al.f().stream().collect(Collectors.toMap(Function.identity(), fot::d));
   public static final Map<aev<dcm>, gbi> n = jb.al.f().stream().collect(Collectors.toMap(Function.identity(), fot::e));
   public static final Map<aev<String>, gbi> o = jb.an.f().stream().collect(Collectors.toMap(Function.identity(), fot::f));
   public static final gbi[] p = Arrays.stream(cht.values())
      .sorted(Comparator.comparingInt(cht::a))
      .map($$0 -> new gbi(b, new aew("entity/bed/" + $$0.b())))
      .toArray(gbi[]::new);
   public static final gbi q = a("trapped");
   public static final gbi r = a("trapped_left");
   public static final gbi s = a("trapped_right");
   public static final gbi t = a("christmas");
   public static final gbi u = a("christmas_left");
   public static final gbi v = a("christmas_right");
   public static final gbi w = a("normal");
   public static final gbi x = a("normal_left");
   public static final gbi y = a("normal_right");
   public static final gbi z = a("ender");

   public static fom a() {
      return C;
   }

   public static fom b() {
      return D;
   }

   public static fom c() {
      return B;
   }

   public static fom d() {
      return A;
   }

   public static fom e() {
      return E;
   }

   public static fom f() {
      return E;
   }

   public static fom g() {
      return F;
   }

   public static fom a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fom h() {
      return I;
   }

   public static fom i() {
      return J;
   }

   public static fom j() {
      return K;
   }

   public static fom k() {
      return L;
   }

   public static void a(Consumer<gbi> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gbi $$1 : p) {
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

   private static gbi c(dgw $$0) {
      return new gbi(e, new aew("entity/signs/" + $$0.b()));
   }

   private static gbi d(dgw $$0) {
      return new gbi(e, new aew("entity/signs/hanging/" + $$0.b()));
   }

   public static gbi a(dgw $$0) {
      return k.get($$0);
   }

   public static gbi b(dgw $$0) {
      return l.get($$0);
   }

   private static gbi d(aev<dcm> $$0) {
      return new gbi(c, dcm.a($$0, true));
   }

   public static gbi a(aev<dcm> $$0) {
      return m.get($$0);
   }

   private static gbi e(aev<dcm> $$0) {
      return new gbi(d, dcm.a($$0, false));
   }

   public static gbi b(aev<dcm> $$0) {
      return n.get($$0);
   }

   private static gbi a(String $$0) {
      return new gbi(f, new aew("entity/chest/" + $$0));
   }

   private static gbi f(aev<String> $$0) {
      return new gbi(h, ddl.a($$0));
   }

   @Nullable
   public static gbi c(@Nullable aev<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gbi a(dcv $$0, dgb $$1, boolean $$2) {
      if ($$0 instanceof ddp) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dem ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gbi a(dgb $$0, gbi $$1, gbi $$2, gbi $$3) {
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
