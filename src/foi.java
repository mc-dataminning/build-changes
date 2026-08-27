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

public class foi {
   public static final aer a = new aer("textures/atlas/shulker_boxes.png");
   public static final aer b = new aer("textures/atlas/beds.png");
   public static final aer c = new aer("textures/atlas/banner_patterns.png");
   public static final aer d = new aer("textures/atlas/shield_patterns.png");
   public static final aer e = new aer("textures/atlas/signs.png");
   public static final aer f = new aer("textures/atlas/chest.png");
   public static final aer g = new aer("textures/atlas/armor_trims.png");
   public static final aer h = new aer("textures/atlas/decorated_pot.png");
   private static final foc A = foc.e(a);
   private static final foc B = foc.c(b);
   private static final foc C = foc.m(c);
   private static final foc D = foc.m(d);
   private static final foc E = foc.e(e);
   private static final foc F = foc.d(f);
   private static final foc G = foc.a(g);
   private static final foc H = foc.b(g);
   private static final foc I = foc.c(fyt.e);
   private static final foc J = foc.d(fyt.e);
   private static final foc K = foc.g(fyt.e);
   private static final foc L = foc.h(fyt.e);
   public static final gay i = new gay(a, new aer("entity/shulker/shulker"));
   public static final List<gay> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gay(a, new aer("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dgm, gay> k = dgm.a().collect(Collectors.toMap(Function.identity(), foi::c));
   public static final Map<dgm, gay> l = dgm.a().collect(Collectors.toMap(Function.identity(), foi::d));
   public static final Map<aeq<dcc>, gay> m = jb.al.f().stream().collect(Collectors.toMap(Function.identity(), foi::d));
   public static final Map<aeq<dcc>, gay> n = jb.al.f().stream().collect(Collectors.toMap(Function.identity(), foi::e));
   public static final Map<aeq<String>, gay> o = jb.an.f().stream().collect(Collectors.toMap(Function.identity(), foi::f));
   public static final gay[] p = Arrays.stream(chl.values())
      .sorted(Comparator.comparingInt(chl::a))
      .map($$0 -> new gay(b, new aer("entity/bed/" + $$0.b())))
      .toArray(gay[]::new);
   public static final gay q = a("trapped");
   public static final gay r = a("trapped_left");
   public static final gay s = a("trapped_right");
   public static final gay t = a("christmas");
   public static final gay u = a("christmas_left");
   public static final gay v = a("christmas_right");
   public static final gay w = a("normal");
   public static final gay x = a("normal_left");
   public static final gay y = a("normal_right");
   public static final gay z = a("ender");

   public static foc a() {
      return C;
   }

   public static foc b() {
      return D;
   }

   public static foc c() {
      return B;
   }

   public static foc d() {
      return A;
   }

   public static foc e() {
      return E;
   }

   public static foc f() {
      return E;
   }

   public static foc g() {
      return F;
   }

   public static foc a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static foc h() {
      return I;
   }

   public static foc i() {
      return J;
   }

   public static foc j() {
      return K;
   }

   public static foc k() {
      return L;
   }

   public static void a(Consumer<gay> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gay $$1 : p) {
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

   private static gay c(dgm $$0) {
      return new gay(e, new aer("entity/signs/" + $$0.b()));
   }

   private static gay d(dgm $$0) {
      return new gay(e, new aer("entity/signs/hanging/" + $$0.b()));
   }

   public static gay a(dgm $$0) {
      return k.get($$0);
   }

   public static gay b(dgm $$0) {
      return l.get($$0);
   }

   private static gay d(aeq<dcc> $$0) {
      return new gay(c, dcc.a($$0, true));
   }

   public static gay a(aeq<dcc> $$0) {
      return m.get($$0);
   }

   private static gay e(aeq<dcc> $$0) {
      return new gay(d, dcc.a($$0, false));
   }

   public static gay b(aeq<dcc> $$0) {
      return n.get($$0);
   }

   private static gay a(String $$0) {
      return new gay(f, new aer("entity/chest/" + $$0));
   }

   private static gay f(aeq<String> $$0) {
      return new gay(h, ddb.a($$0));
   }

   @Nullable
   public static gay c(@Nullable aeq<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gay a(dcl $$0, dfr $$1, boolean $$2) {
      if ($$0 instanceof ddf) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dec ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gay a(dfr $$0, gay $$1, gay $$2, gay $$3) {
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
