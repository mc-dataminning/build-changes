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

public class fnz {
   public static final aer a = new aer("textures/atlas/shulker_boxes.png");
   public static final aer b = new aer("textures/atlas/beds.png");
   public static final aer c = new aer("textures/atlas/banner_patterns.png");
   public static final aer d = new aer("textures/atlas/shield_patterns.png");
   public static final aer e = new aer("textures/atlas/signs.png");
   public static final aer f = new aer("textures/atlas/chest.png");
   public static final aer g = new aer("textures/atlas/armor_trims.png");
   public static final aer h = new aer("textures/atlas/decorated_pot.png");
   private static final fnt A = fnt.e(a);
   private static final fnt B = fnt.c(b);
   private static final fnt C = fnt.m(c);
   private static final fnt D = fnt.m(d);
   private static final fnt E = fnt.e(e);
   private static final fnt F = fnt.d(f);
   private static final fnt G = fnt.b(g);
   private static final fnt H = fnt.c(fyk.e);
   private static final fnt I = fnt.d(fyk.e);
   private static final fnt J = fnt.g(fyk.e);
   private static final fnt K = fnt.h(fyk.e);
   public static final gap i = new gap(a, new aer("entity/shulker/shulker"));
   public static final List<gap> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gap(a, new aer("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dgn, gap> k = dgn.a().collect(Collectors.toMap(Function.identity(), fnz::c));
   public static final Map<dgn, gap> l = dgn.a().collect(Collectors.toMap(Function.identity(), fnz::d));
   public static final Map<aeq<dcd>, gap> m = jb.al.f().stream().collect(Collectors.toMap(Function.identity(), fnz::d));
   public static final Map<aeq<dcd>, gap> n = jb.al.f().stream().collect(Collectors.toMap(Function.identity(), fnz::e));
   public static final Map<aeq<String>, gap> o = jb.an.f().stream().collect(Collectors.toMap(Function.identity(), fnz::f));
   public static final gap[] p = Arrays.stream(chm.values())
      .sorted(Comparator.comparingInt(chm::a))
      .map($$0 -> new gap(b, new aer("entity/bed/" + $$0.b())))
      .toArray(gap[]::new);
   public static final gap q = a("trapped");
   public static final gap r = a("trapped_left");
   public static final gap s = a("trapped_right");
   public static final gap t = a("christmas");
   public static final gap u = a("christmas_left");
   public static final gap v = a("christmas_right");
   public static final gap w = a("normal");
   public static final gap x = a("normal_left");
   public static final gap y = a("normal_right");
   public static final gap z = a("ender");

   public static fnt a() {
      return C;
   }

   public static fnt b() {
      return D;
   }

   public static fnt c() {
      return B;
   }

   public static fnt d() {
      return A;
   }

   public static fnt e() {
      return E;
   }

   public static fnt f() {
      return E;
   }

   public static fnt g() {
      return F;
   }

   public static fnt h() {
      return G;
   }

   public static fnt i() {
      return H;
   }

   public static fnt j() {
      return I;
   }

   public static fnt k() {
      return J;
   }

   public static fnt l() {
      return K;
   }

   public static void a(Consumer<gap> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gap $$1 : p) {
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

   private static gap c(dgn $$0) {
      return new gap(e, new aer("entity/signs/" + $$0.b()));
   }

   private static gap d(dgn $$0) {
      return new gap(e, new aer("entity/signs/hanging/" + $$0.b()));
   }

   public static gap a(dgn $$0) {
      return k.get($$0);
   }

   public static gap b(dgn $$0) {
      return l.get($$0);
   }

   private static gap d(aeq<dcd> $$0) {
      return new gap(c, dcd.a($$0, true));
   }

   public static gap a(aeq<dcd> $$0) {
      return m.get($$0);
   }

   private static gap e(aeq<dcd> $$0) {
      return new gap(d, dcd.a($$0, false));
   }

   public static gap b(aeq<dcd> $$0) {
      return n.get($$0);
   }

   private static gap a(String $$0) {
      return new gap(f, new aer("entity/chest/" + $$0));
   }

   private static gap f(aeq<String> $$0) {
      return new gap(h, ddc.a($$0));
   }

   @Nullable
   public static gap c(@Nullable aeq<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gap a(dcm $$0, dfs $$1, boolean $$2) {
      if ($$0 instanceof ddg) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof ded ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gap a(dfs $$0, gap $$1, gap $$2, gap $$3) {
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
