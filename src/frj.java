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

public class frj {
   public static final agi a = new agi("textures/atlas/shulker_boxes.png");
   public static final agi b = new agi("textures/atlas/beds.png");
   public static final agi c = new agi("textures/atlas/banner_patterns.png");
   public static final agi d = new agi("textures/atlas/shield_patterns.png");
   public static final agi e = new agi("textures/atlas/signs.png");
   public static final agi f = new agi("textures/atlas/chest.png");
   public static final agi g = new agi("textures/atlas/armor_trims.png");
   public static final agi h = new agi("textures/atlas/decorated_pot.png");
   private static final frc A = frc.e(a);
   private static final frc B = frc.c(b);
   private static final frc C = frc.m(c);
   private static final frc D = frc.m(d);
   private static final frc E = frc.e(e);
   private static final frc F = frc.d(f);
   private static final frc G = frc.a(g);
   private static final frc H = frc.b(g);
   private static final frc I = frc.c(gbt.e);
   private static final frc J = frc.d(gbt.e);
   private static final frc K = frc.g(gbt.e);
   private static final frc L = frc.h(gbt.e);
   public static final gdy i = new gdy(a, new agi("entity/shulker/shulker"));
   public static final List<gdy> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gdy(a, new agi("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<div, gdy> k = div.a().collect(Collectors.toMap(Function.identity(), frj::c));
   public static final Map<div, gdy> l = div.a().collect(Collectors.toMap(Function.identity(), frj::d));
   public static final Map<agh<deu>, gdy> m = jy.an.f().stream().collect(Collectors.toMap(Function.identity(), frj::d));
   public static final Map<agh<deu>, gdy> n = jy.an.f().stream().collect(Collectors.toMap(Function.identity(), frj::e));
   public static final Map<agh<String>, gdy> o = jy.ap.f().stream().collect(Collectors.toMap(Function.identity(), frj::f));
   public static final gdy[] p = Arrays.stream(cjx.values())
      .sorted(Comparator.comparingInt(cjx::a))
      .map($$0 -> new gdy(b, new agi("entity/bed/" + $$0.b())))
      .toArray(gdy[]::new);
   public static final gdy q = a("trapped");
   public static final gdy r = a("trapped_left");
   public static final gdy s = a("trapped_right");
   public static final gdy t = a("christmas");
   public static final gdy u = a("christmas_left");
   public static final gdy v = a("christmas_right");
   public static final gdy w = a("normal");
   public static final gdy x = a("normal_left");
   public static final gdy y = a("normal_right");
   public static final gdy z = a("ender");

   public static frc a() {
      return C;
   }

   public static frc b() {
      return D;
   }

   public static frc c() {
      return B;
   }

   public static frc d() {
      return A;
   }

   public static frc e() {
      return E;
   }

   public static frc f() {
      return E;
   }

   public static frc g() {
      return F;
   }

   public static frc a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static frc h() {
      return I;
   }

   public static frc i() {
      return J;
   }

   public static frc j() {
      return K;
   }

   public static frc k() {
      return L;
   }

   public static void a(Consumer<gdy> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gdy $$1 : p) {
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

   private static gdy c(div $$0) {
      return new gdy(e, new agi("entity/signs/" + $$0.b()));
   }

   private static gdy d(div $$0) {
      return new gdy(e, new agi("entity/signs/hanging/" + $$0.b()));
   }

   public static gdy a(div $$0) {
      return k.get($$0);
   }

   public static gdy b(div $$0) {
      return l.get($$0);
   }

   private static gdy d(agh<deu> $$0) {
      return new gdy(c, deu.a($$0, true));
   }

   public static gdy a(agh<deu> $$0) {
      return m.get($$0);
   }

   private static gdy e(agh<deu> $$0) {
      return new gdy(d, deu.a($$0, false));
   }

   public static gdy b(agh<deu> $$0) {
      return n.get($$0);
   }

   private static gdy a(String $$0) {
      return new gdy(f, new agi("entity/chest/" + $$0));
   }

   private static gdy f(agh<String> $$0) {
      return new gdy(h, dfu.a($$0));
   }

   @Nullable
   public static gdy c(@Nullable agh<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gdy a(dfd $$0, dia $$1, boolean $$2) {
      if ($$0 instanceof dfy) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dgv ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gdy a(dia $$0, gdy $$1, gdy $$2, gdy $$3) {
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
