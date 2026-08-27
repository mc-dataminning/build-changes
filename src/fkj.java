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

public class fkj {
   public static final acq a = new acq("textures/atlas/shulker_boxes.png");
   public static final acq b = new acq("textures/atlas/beds.png");
   public static final acq c = new acq("textures/atlas/banner_patterns.png");
   public static final acq d = new acq("textures/atlas/shield_patterns.png");
   public static final acq e = new acq("textures/atlas/signs.png");
   public static final acq f = new acq("textures/atlas/chest.png");
   public static final acq g = new acq("textures/atlas/armor_trims.png");
   public static final acq h = new acq("textures/atlas/decorated_pot.png");
   private static final fkf A = fkf.d(a);
   private static final fkf B = fkf.b(b);
   private static final fkf C = fkf.l(c);
   private static final fkf D = fkf.l(d);
   private static final fkf E = fkf.d(e);
   private static final fkf F = fkf.c(f);
   private static final fkf G = fkf.a(g);
   private static final fkf H = fkf.b(fuu.e);
   private static final fkf I = fkf.c(fuu.e);
   private static final fkf J = fkf.f(fuu.e);
   private static final fkf K = fkf.g(fuu.e);
   public static final fwu i = new fwu(a, new acq("entity/shulker/shulker"));
   public static final List<fwu> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new fwu(a, new acq("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<ddo, fwu> k = ddo.a().collect(Collectors.toMap(Function.identity(), fkj::c));
   public static final Map<ddo, fwu> l = ddo.a().collect(Collectors.toMap(Function.identity(), fkj::d));
   public static final Map<acp<cze>, fwu> m = jb.al.f().stream().collect(Collectors.toMap(Function.identity(), fkj::d));
   public static final Map<acp<cze>, fwu> n = jb.al.f().stream().collect(Collectors.toMap(Function.identity(), fkj::e));
   public static final Map<acp<String>, fwu> o = jb.an.f().stream().collect(Collectors.toMap(Function.identity(), fkj::f));
   public static final fwu[] p = Arrays.stream(cen.values())
      .sorted(Comparator.comparingInt(cen::a))
      .map($$0 -> new fwu(b, new acq("entity/bed/" + $$0.b())))
      .toArray(fwu[]::new);
   public static final fwu q = a("trapped");
   public static final fwu r = a("trapped_left");
   public static final fwu s = a("trapped_right");
   public static final fwu t = a("christmas");
   public static final fwu u = a("christmas_left");
   public static final fwu v = a("christmas_right");
   public static final fwu w = a("normal");
   public static final fwu x = a("normal_left");
   public static final fwu y = a("normal_right");
   public static final fwu z = a("ender");

   public static fkf a() {
      return C;
   }

   public static fkf b() {
      return D;
   }

   public static fkf c() {
      return B;
   }

   public static fkf d() {
      return A;
   }

   public static fkf e() {
      return E;
   }

   public static fkf f() {
      return E;
   }

   public static fkf g() {
      return F;
   }

   public static fkf h() {
      return G;
   }

   public static fkf i() {
      return H;
   }

   public static fkf j() {
      return I;
   }

   public static fkf k() {
      return J;
   }

   public static fkf l() {
      return K;
   }

   public static void a(Consumer<fwu> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (fwu $$1 : p) {
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

   private static fwu c(ddo $$0) {
      return new fwu(e, new acq("entity/signs/" + $$0.b()));
   }

   private static fwu d(ddo $$0) {
      return new fwu(e, new acq("entity/signs/hanging/" + $$0.b()));
   }

   public static fwu a(ddo $$0) {
      return k.get($$0);
   }

   public static fwu b(ddo $$0) {
      return l.get($$0);
   }

   private static fwu d(acp<cze> $$0) {
      return new fwu(c, cze.a($$0, true));
   }

   public static fwu a(acp<cze> $$0) {
      return m.get($$0);
   }

   private static fwu e(acp<cze> $$0) {
      return new fwu(d, cze.a($$0, false));
   }

   public static fwu b(acp<cze> $$0) {
      return n.get($$0);
   }

   private static fwu a(String $$0) {
      return new fwu(f, new acq("entity/chest/" + $$0));
   }

   private static fwu f(acp<String> $$0) {
      return new fwu(h, dad.a($$0));
   }

   @Nullable
   public static fwu c(@Nullable acp<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static fwu a(czn $$0, dct $$1, boolean $$2) {
      if ($$0 instanceof dah) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dbe ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static fwu a(dct $$0, fwu $$1, fwu $$2, fwu $$3) {
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
