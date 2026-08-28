public class dtp {
   public static final akt<dtn> a = a("base");
   public static final akt<dtn> b = a("square_bottom_left");
   public static final akt<dtn> c = a("square_bottom_right");
   public static final akt<dtn> d = a("square_top_left");
   public static final akt<dtn> e = a("square_top_right");
   public static final akt<dtn> f = a("stripe_bottom");
   public static final akt<dtn> g = a("stripe_top");
   public static final akt<dtn> h = a("stripe_left");
   public static final akt<dtn> i = a("stripe_right");
   public static final akt<dtn> j = a("stripe_center");
   public static final akt<dtn> k = a("stripe_middle");
   public static final akt<dtn> l = a("stripe_downright");
   public static final akt<dtn> m = a("stripe_downleft");
   public static final akt<dtn> n = a("small_stripes");
   public static final akt<dtn> o = a("cross");
   public static final akt<dtn> p = a("straight_cross");
   public static final akt<dtn> q = a("triangle_bottom");
   public static final akt<dtn> r = a("triangle_top");
   public static final akt<dtn> s = a("triangles_bottom");
   public static final akt<dtn> t = a("triangles_top");
   public static final akt<dtn> u = a("diagonal_left");
   public static final akt<dtn> v = a("diagonal_up_right");
   public static final akt<dtn> w = a("diagonal_up_left");
   public static final akt<dtn> x = a("diagonal_right");
   public static final akt<dtn> y = a("circle");
   public static final akt<dtn> z = a("rhombus");
   public static final akt<dtn> A = a("half_vertical");
   public static final akt<dtn> B = a("half_horizontal");
   public static final akt<dtn> C = a("half_vertical_right");
   public static final akt<dtn> D = a("half_horizontal_bottom");
   public static final akt<dtn> E = a("border");
   public static final akt<dtn> F = a("curly_border");
   public static final akt<dtn> G = a("gradient");
   public static final akt<dtn> H = a("gradient_up");
   public static final akt<dtn> I = a("bricks");
   public static final akt<dtn> J = a("globe");
   public static final akt<dtn> K = a("creeper");
   public static final akt<dtn> L = a("skull");
   public static final akt<dtn> M = a("flower");
   public static final akt<dtn> N = a("mojang");
   public static final akt<dtn> O = a("piglin");
   public static final akt<dtn> P = a("flow");
   public static final akt<dtn> Q = a("guster");

   private static akt<dtn> a(String $$0) {
      return akt.a(mc.d, aku.b($$0));
   }

   public static void a(qe<dtn> $$0) {
      a($$0, a);
      a($$0, b);
      a($$0, c);
      a($$0, d);
      a($$0, e);
      a($$0, f);
      a($$0, g);
      a($$0, h);
      a($$0, i);
      a($$0, j);
      a($$0, k);
      a($$0, l);
      a($$0, m);
      a($$0, n);
      a($$0, o);
      a($$0, p);
      a($$0, q);
      a($$0, r);
      a($$0, s);
      a($$0, t);
      a($$0, u);
      a($$0, v);
      a($$0, w);
      a($$0, x);
      a($$0, y);
      a($$0, z);
      a($$0, A);
      a($$0, B);
      a($$0, C);
      a($$0, D);
      a($$0, E);
      a($$0, G);
      a($$0, H);
      a($$0, I);
      a($$0, F);
      a($$0, J);
      a($$0, K);
      a($$0, L);
      a($$0, M);
      a($$0, N);
      a($$0, O);
      a($$0, P);
      a($$0, Q);
   }

   public static void a(qe<dtn> $$0, akt<dtn> $$1) {
      $$0.a($$1, new dtn($$1.a(), "block.minecraft.banner." + $$1.a().e()));
   }
}
