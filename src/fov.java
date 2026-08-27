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

public class fov {
   public static final aey a = new aey("textures/atlas/shulker_boxes.png");
   public static final aey b = new aey("textures/atlas/beds.png");
   public static final aey c = new aey("textures/atlas/banner_patterns.png");
   public static final aey d = new aey("textures/atlas/shield_patterns.png");
   public static final aey e = new aey("textures/atlas/signs.png");
   public static final aey f = new aey("textures/atlas/chest.png");
   public static final aey g = new aey("textures/atlas/armor_trims.png");
   public static final aey h = new aey("textures/atlas/decorated_pot.png");
   private static final foo A = foo.e(a);
   private static final foo B = foo.c(b);
   private static final foo C = foo.m(c);
   private static final foo D = foo.m(d);
   private static final foo E = foo.e(e);
   private static final foo F = foo.d(f);
   private static final foo G = foo.a(g);
   private static final foo H = foo.b(g);
   private static final foo I = foo.c(fzf.e);
   private static final foo J = foo.d(fzf.e);
   private static final foo K = foo.g(fzf.e);
   private static final foo L = foo.h(fzf.e);
   public static final gbk i = new gbk(a, new aey("entity/shulker/shulker"));
   public static final List<gbk> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gbk(a, new aey("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dgy, gbk> k = dgy.a().collect(Collectors.toMap(Function.identity(), fov::c));
   public static final Map<dgy, gbk> l = dgy.a().collect(Collectors.toMap(Function.identity(), fov::d));
   public static final Map<aex<dco>, gbk> m = jd.al.f().stream().collect(Collectors.toMap(Function.identity(), fov::d));
   public static final Map<aex<dco>, gbk> n = jd.al.f().stream().collect(Collectors.toMap(Function.identity(), fov::e));
   public static final Map<aex<String>, gbk> o = jd.an.f().stream().collect(Collectors.toMap(Function.identity(), fov::f));
   public static final gbk[] p = Arrays.stream(chv.values())
      .sorted(Comparator.comparingInt(chv::a))
      .map($$0 -> new gbk(b, new aey("entity/bed/" + $$0.b())))
      .toArray(gbk[]::new);
   public static final gbk q = a("trapped");
   public static final gbk r = a("trapped_left");
   public static final gbk s = a("trapped_right");
   public static final gbk t = a("christmas");
   public static final gbk u = a("christmas_left");
   public static final gbk v = a("christmas_right");
   public static final gbk w = a("normal");
   public static final gbk x = a("normal_left");
   public static final gbk y = a("normal_right");
   public static final gbk z = a("ender");

   public static foo a() {
      return C;
   }

   public static foo b() {
      return D;
   }

   public static foo c() {
      return B;
   }

   public static foo d() {
      return A;
   }

   public static foo e() {
      return E;
   }

   public static foo f() {
      return E;
   }

   public static foo g() {
      return F;
   }

   public static foo a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static foo h() {
      return I;
   }

   public static foo i() {
      return J;
   }

   public static foo j() {
      return K;
   }

   public static foo k() {
      return L;
   }

   public static void a(Consumer<gbk> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gbk $$1 : p) {
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

   private static gbk c(dgy $$0) {
      return new gbk(e, new aey("entity/signs/" + $$0.b()));
   }

   private static gbk d(dgy $$0) {
      return new gbk(e, new aey("entity/signs/hanging/" + $$0.b()));
   }

   public static gbk a(dgy $$0) {
      return k.get($$0);
   }

   public static gbk b(dgy $$0) {
      return l.get($$0);
   }

   private static gbk d(aex<dco> $$0) {
      return new gbk(c, dco.a($$0, true));
   }

   public static gbk a(aex<dco> $$0) {
      return m.get($$0);
   }

   private static gbk e(aex<dco> $$0) {
      return new gbk(d, dco.a($$0, false));
   }

   public static gbk b(aex<dco> $$0) {
      return n.get($$0);
   }

   private static gbk a(String $$0) {
      return new gbk(f, new aey("entity/chest/" + $$0));
   }

   private static gbk f(aex<String> $$0) {
      return new gbk(h, ddn.a($$0));
   }

   @Nullable
   public static gbk c(@Nullable aex<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gbk a(dcx $$0, dgd $$1, boolean $$2) {
      if ($$0 instanceof ddr) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof deo ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gbk a(dgd $$0, gbk $$1, gbk $$2, gbk $$3) {
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
