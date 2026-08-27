import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum ekp implements aug {
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

   public static final aug.a<ekp> t = aug.a(ekp::values);
   public static final IntFunction<ekp> u = asf.a(ekp::a, values(), asf.a.a);
   private final int v;
   private final String w;

   private ekp(int $$0, String $$1) {
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
   public static ekp a(n $$0) {
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
