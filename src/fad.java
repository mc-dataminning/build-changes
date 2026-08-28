import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum fad implements baf {
   a(0, "list"),
   b(1, "sidebar"),
   c(2, "below_name"),
   d(3, "sidebar.team.black"),
   e(4, "sidebar.team.dark_blue"),
   f(5, "sidebar.team.dark_green"),
   g(6, "sidebar.team.dark_aqua"),
   h(7, "sidebar.team.dark_red"),
   i(8, "sidebar.team.dark_purple"),
   j(9, "sidebar.team.gold"),
   k(10, "sidebar.team.gray"),
   l(11, "sidebar.team.dark_gray"),
   m(12, "sidebar.team.blue"),
   n(13, "sidebar.team.green"),
   o(14, "sidebar.team.aqua"),
   p(15, "sidebar.team.red"),
   q(16, "sidebar.team.light_purple"),
   r(17, "sidebar.team.yellow"),
   s(18, "sidebar.team.white");

   public static final baf.a<fad> t = baf.a(fad::values);
   public static final IntFunction<fad> u = aya.a(fad::a, values(), aya.a.a);
   private final int v;
   private final String w;

   private fad(final int $$0, final String $$1) {
      this.v = $$0;
      this.w = $$1;
   }

   public int a() {
      return this.v;
   }

   @Override
   public String c() {
      return this.w;
   }

   @Nullable
   public static fad a(n $$0) {
      return switch ($$0) {
         case a -> d;
         case b -> e;
         case c -> f;
         case d -> g;
         case e -> h;
         case f -> i;
         case g -> j;
         case h -> k;
         case i -> l;
         case j -> m;
         case k -> n;
         case l -> o;
         case m -> p;
         case n -> q;
         case o -> r;
         case p -> s;
         case r, u, t, v, q, s -> null;
      };
   }
}
