public class fsa {
   public static final frr a = frr.a.a(0.0F)
      .a("head", new frq(frq.d.c, new frs(0.0F, frt.a(1.2F, 1.2F, 1.2F), frq.b.a)))
      .a("head", new frq(frq.d.a, new frs(0.0F, frt.a(0.0F, 1.0F, 1.0F), frq.b.a)))
      .b();
   public static final frr b = frr.a.a(8.0F)
      .a()
      .a(
         "nose",
         new frq(
            frq.d.c,
            new frs(0.0F, frt.a(1.0, 1.0, 1.0), frq.b.a),
            new frs(0.5417F, frt.a(1.0, 1.0, 1.0), frq.b.a),
            new frs(0.5833F, frt.a(1.0, 0.5, 1.0), frq.b.b),
            new frs(0.6667F, frt.a(1.0, 2.5, 1.0), frq.b.b),
            new frs(0.7917F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(0.9167F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(1.0F, frt.a(1.0, 3.0, 1.0), frq.b.b),
            new frs(1.125F, frt.a(1.0, 1.0, 1.0), frq.b.a),
            new frs(2.0F, frt.a(1.0, 1.0, 1.0), frq.b.a)
         )
      )
      .b();
   public static final frr c = frr.a.a(1.0F)
      .a(
         "nose",
         new frq(
            frq.d.c,
            new frs(0.0F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(0.0833F, frt.a(1.0, 0.7F, 1.0), frq.b.b),
            new frs(0.125F, frt.a(1.0, 3.0, 1.0), frq.b.b),
            new frs(0.25F, frt.a(1.0, 3.0, 1.0), frq.b.b),
            new frs(0.7083F, frt.a(1.0, 4.0, 1.0), frq.b.b),
            new frs(0.8333F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(1.0F, frt.a(1.0, 1.0, 1.0), frq.b.b)
         )
      )
      .a(
         "head",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.125F, frt.b(-5.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.875F, frt.b(-20.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .b();
   public static final frr d = frr.a.a(2.0F)
      .a()
      .a(
         "right_front_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.5833F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.1667F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "right_front_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 3.0F), frq.b.a),
            new frs(0.75F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(1.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.1667F, frt.a(0.0F, 0.0F, -1.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 0.0F, 3.0F), frq.b.a)
         )
      )
      .a(
         "right_mid_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(-7.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.1667F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.3333F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.1667F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.75F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(-7.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "right_mid_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 2.67F, -0.67F), frq.b.a),
            new frs(0.1667F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.3333F, frt.a(0.0F, 0.0F, -2.0F), frq.b.a),
            new frs(1.0F, frt.a(0.0F, 0.0F, 2.0F), frq.b.a),
            new frs(1.1667F, frt.a(0.0F, 0.0F, 3.0F), frq.b.a),
            new frs(1.9167F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 2.67F, -0.67F), frq.b.a)
         )
      )
      .a(
         "right_hind_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.5833F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(25.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.1667F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5833F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.75F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "right_hind_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, -0.5F), frq.b.a),
            new frs(0.5833F, frt.a(0.0F, 0.0F, 2.0F), frq.b.a),
            new frs(1.0F, frt.a(0.0F, 2.22F, 0.78F), frq.b.a),
            new frs(1.3333F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(1.5833F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.75F, frt.a(0.0F, 0.0F, -2.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 0.0F, -0.5F), frq.b.a)
         )
      )
      .a(
         "left_front_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.1667F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5833F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_front_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.1667F, frt.a(0.0F, 0.0F, -1.0F), frq.b.a),
            new frs(1.0F, frt.a(0.0F, 0.0F, 3.0F), frq.b.a),
            new frs(1.75F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_mid_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.1667F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.75F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.1667F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_mid_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 2.0F), frq.b.a),
            new frs(0.1667F, frt.a(0.0F, 0.0F, 3.0F), frq.b.a),
            new frs(0.9167F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(1.1667F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.a(0.0F, 0.0F, -2.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 0.0F, 2.0F), frq.b.a)
         )
      )
      .a(
         "left_hind_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(25.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.1667F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.5833F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.75F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5833F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(25.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_hind_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 2.22F, 0.78F), frq.b.a),
            new frs(0.3333F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(0.5833F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.75F, frt.a(0.0F, 0.0F, -2.0F), frq.b.a),
            new frs(1.0F, frt.a(0.0F, 0.0F, -0.5F), frq.b.a),
            new frs(1.5833F, frt.a(0.0F, 0.0F, 2.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 2.22F, 0.78F), frq.b.a)
         )
      )
      .a(
         "body",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(1.0F, 0.0F, -2.5F), frq.b.a),
            new frs(0.5F, frt.b(-1.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(1.0F, 0.0F, 2.5F), frq.b.a),
            new frs(1.5F, frt.b(-1.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(1.0F, 0.0F, -2.5F), frq.b.a)
         )
      )
      .a(
         "body",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.2083F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.375F, frt.a(0.0F, -1.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.2083F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.375F, frt.a(0.0F, -1.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "head",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(7.5F, 0.0F, 0.0F), frq.b.b),
            new frs(0.1667F, frt.b(9.0F, 0.0F, 0.0F), frq.b.b),
            new frs(0.875F, frt.b(-1.0F, 0.0F, 0.0F), frq.b.b),
            new frs(1.25F, frt.b(7.0F, 0.0F, 0.0F), frq.b.b),
            new frs(1.75F, frt.b(5.0F, 0.0F, 0.0F), frq.b.b),
            new frs(2.0F, frt.b(7.5F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .a(
         "left_ear",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, -2.5F), frq.b.b),
            new frs(0.5F, frt.b(0.0F, 0.0F, -7.5F), frq.b.b),
            new frs(1.0F, frt.b(0.0F, 0.0F, -2.5F), frq.b.b),
            new frs(1.5F, frt.b(0.0F, 0.0F, -7.5F), frq.b.b),
            new frs(2.0F, frt.b(0.0F, 0.0F, -2.5F), frq.b.b)
         )
      )
      .a(
         "right_ear",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 2.5F), frq.b.b),
            new frs(0.5F, frt.b(0.0F, 0.0F, 7.5F), frq.b.b),
            new frs(1.0F, frt.b(0.0F, 0.0F, 2.5F), frq.b.b),
            new frs(1.5F, frt.b(0.0F, 0.0F, 7.5F), frq.b.b),
            new frs(2.0F, frt.b(0.0F, 0.0F, 2.5F), frq.b.b)
         )
      )
      .b();
   public static final frr e = frr.a.a(2.0F)
      .a()
      .a(
         "right_front_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.5833F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.1667F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "right_front_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 3.0F), frq.b.a),
            new frs(0.75F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(1.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.1667F, frt.a(0.0F, 0.0F, -1.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 0.0F, 3.0F), frq.b.a)
         )
      )
      .a(
         "right_mid_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(-7.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.1667F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.3333F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.1667F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.75F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(-7.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "right_mid_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 2.67F, -0.67F), frq.b.a),
            new frs(0.1667F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.3333F, frt.a(0.0F, 0.0F, -2.0F), frq.b.a),
            new frs(1.0F, frt.a(0.0F, 0.0F, 2.0F), frq.b.a),
            new frs(1.1667F, frt.a(0.0F, 0.0F, 3.0F), frq.b.a),
            new frs(1.9167F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 2.67F, -0.67F), frq.b.a)
         )
      )
      .a(
         "right_hind_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.5833F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(25.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.1667F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5833F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.75F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "right_hind_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, -0.5F), frq.b.a),
            new frs(0.5833F, frt.a(0.0F, 0.0F, 2.0F), frq.b.a),
            new frs(1.0F, frt.a(0.0F, 2.22F, 0.78F), frq.b.a),
            new frs(1.3333F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(1.5833F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.75F, frt.a(0.0F, 0.0F, -2.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 0.0F, -0.5F), frq.b.a)
         )
      )
      .a(
         "left_front_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.1667F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5833F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_front_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.1667F, frt.a(0.0F, 0.0F, -1.0F), frq.b.a),
            new frs(1.0F, frt.a(0.0F, 0.0F, 3.0F), frq.b.a),
            new frs(1.75F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_mid_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.1667F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.75F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.1667F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_mid_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 2.0F), frq.b.a),
            new frs(0.1667F, frt.a(0.0F, 0.0F, 3.0F), frq.b.a),
            new frs(0.9167F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(1.1667F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.a(0.0F, 0.0F, -2.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 0.0F, 2.0F), frq.b.a)
         )
      )
      .a(
         "left_hind_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(25.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.1667F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.5833F, frt.b(-35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.75F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5833F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(25.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_hind_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 2.22F, 0.78F), frq.b.a),
            new frs(0.3333F, frt.a(0.0F, 4.0F, -1.0F), frq.b.a),
            new frs(0.5833F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.75F, frt.a(0.0F, 0.0F, -2.0F), frq.b.a),
            new frs(1.0F, frt.a(0.0F, 0.0F, -0.5F), frq.b.a),
            new frs(1.5833F, frt.a(0.0F, 0.0F, 2.0F), frq.b.a),
            new frs(2.0F, frt.a(0.0F, 2.22F, 0.78F), frq.b.a)
         )
      )
      .a(
         "body",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(2.5F, 0.0F, 0.0F), frq.b.a),
            new frs(0.5F, frt.b(1.25F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(2.5F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "head",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.125F, frt.b(33.61503F, 11.46526F, 9.803F), frq.b.a),
            new frs(0.875F, frt.b(34.71128F, 17.67415F, 14.15251F), frq.b.a),
            new frs(1.125F, frt.b(37.21128F, -17.67415F, -14.15251F), frq.b.a),
            new frs(1.875F, frt.b(38.30529F, -21.62827F, -17.40292F), frq.b.a),
            new frs(2.0F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a("head", new frq(frq.d.a, new frs(0.0F, frt.a(0.0F, -2.0F, 0.0F), frq.b.a), new frs(2.0F, frt.a(0.0F, -2.0F, 0.0F), frq.b.a)))
      .a(
         "left_ear",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, -2.5F), frq.b.a),
            new frs(0.25F, frt.b(0.0F, 0.0F, -15.0F), frq.b.a),
            new frs(0.5F, frt.b(0.0F, 0.0F, -2.5F), frq.b.a),
            new frs(0.75F, frt.b(0.0F, 0.0F, -15.0F), frq.b.a),
            new frs(1.0F, frt.b(0.0F, 0.0F, -2.5F), frq.b.a),
            new frs(1.25F, frt.b(0.0F, 0.0F, -15.0F), frq.b.a),
            new frs(1.5F, frt.b(0.0F, 0.0F, -2.5F), frq.b.a),
            new frs(1.75F, frt.b(0.0F, 0.0F, -15.0F), frq.b.a),
            new frs(2.0F, frt.b(0.0F, 0.0F, -2.5F), frq.b.a)
         )
      )
      .a(
         "right_ear",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 2.5F), frq.b.a),
            new frs(0.25F, frt.b(0.0F, 0.0F, 15.0F), frq.b.a),
            new frs(0.5F, frt.b(0.0F, 0.0F, 2.5F), frq.b.a),
            new frs(0.75F, frt.b(0.0F, 0.0F, 15.0F), frq.b.a),
            new frs(1.0F, frt.b(0.0F, 0.0F, 2.5F), frq.b.a),
            new frs(1.25F, frt.b(0.0F, 0.0F, 15.0F), frq.b.a),
            new frs(1.5F, frt.b(0.0F, 0.0F, 2.5F), frq.b.a),
            new frs(1.75F, frt.b(0.0F, 0.0F, 15.0F), frq.b.a),
            new frs(2.0F, frt.b(0.0F, 0.0F, 2.5F), frq.b.a)
         )
      )
      .a(
         "nose",
         new frq(
            frq.d.c,
            new frs(0.0F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(0.0833F, frt.a(1.0, 1.5, 1.0), frq.b.b),
            new frs(0.2083F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(0.375F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(0.4583F, frt.a(1.0, 2.5, 1.0), frq.b.b),
            new frs(0.625F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(0.8333F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(0.9167F, frt.a(1.0, 2.5, 1.0), frq.b.b),
            new frs(1.0833F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(1.2917F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(1.3333F, frt.a(1.0, 2.5, 1.0), frq.b.b),
            new frs(1.5F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(1.625F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(1.6667F, frt.a(1.0, 3.5, 1.0), frq.b.b),
            new frs(1.8333F, frt.a(1.0, 1.0, 1.0), frq.b.b),
            new frs(2.0F, frt.a(1.0, 1.0, 1.0), frq.b.b)
         )
      )
      .b();
   public static final frr f = frr.a.a(8.0F)
      .a(
         "body",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.5F, frt.b(1.5F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.b(-5.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.5F, frt.b(2.5F, 0.0F, 0.0F), frq.b.a),
            new frs(3.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(3.5F, frt.b(2.5F, 0.0F, 0.0F), frq.b.a),
            new frs(4.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(4.5F, frt.b(2.5F, 0.0F, 0.0F), frq.b.a),
            new frs(5.6667F, frt.b(5.0F, 0.0F, 0.0F), frq.b.a),
            new frs(5.8333F, frt.b(-2.5F, 0.0F, 0.0F), frq.b.a),
            new frs(6.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "body",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.a(0.0F, 1.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.a(0.0F, -7.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "body",
         new frq(
            frq.d.c,
            new frs(0.0F, frt.a(1.0, 1.0, 1.0), frq.b.a),
            new frs(1.5F, frt.a(1.0, 1.0, 1.0), frq.b.a),
            new frs(1.5417F, frt.a(1.04F, 0.98F, 1.02F), frq.b.a),
            new frs(1.5833F, frt.a(1.0, 1.0, 1.0), frq.b.a)
         )
      )
      .a(
         "head",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b),
            new frs(1.1667F, frt.b(10.0F, 0.0F, 0.0F), frq.b.b),
            new frs(1.4167F, frt.b(-10.0F, 0.0F, 0.0F), frq.b.b),
            new frs(1.5F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b),
            new frs(1.5833F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b),
            new frs(1.875F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b),
            new frs(2.0833F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b),
            new frs(2.5F, frt.b(47.5F, 0.0F, 0.0F), frq.b.b),
            new frs(2.6667F, frt.b(38.44F, 0.0F, 0.0F), frq.b.b),
            new frs(2.875F, frt.b(10.95951F, 13.57454F, -14.93501F), frq.b.b),
            new frs(3.2083F, frt.b(47.5F, 0.0F, 0.0F), frq.b.b),
            new frs(3.5833F, frt.b(55.0F, 0.0F, 0.0F), frq.b.b),
            new frs(3.7917F, frt.b(4.2932F, -16.187F, 10.90042F), frq.b.b),
            new frs(4.125F, frt.b(47.5F, 0.0F, 0.0F), frq.b.b),
            new frs(4.4167F, frt.b(54.71135F, 7.98009F, -5.56662F), frq.b.b),
            new frs(4.5F, frt.b(55.72895F, -6.77684F, 4.46197F), frq.b.b),
            new frs(4.5833F, frt.b(54.71135F, 7.98009F, -5.56662F), frq.b.b),
            new frs(4.6667F, frt.b(55.72895F, -6.77684F, 4.46197F), frq.b.b),
            new frs(4.75F, frt.b(54.71135F, 7.98009F, -5.56662F), frq.b.b),
            new frs(4.8333F, frt.b(55.72895F, -6.77684F, 4.46197F), frq.b.b),
            new frs(5.0F, frt.b(65.0F, 0.0F, 0.0F), frq.b.b),
            new frs(5.75F, frt.b(65.0F, 0.0F, 0.0F), frq.b.b),
            new frs(5.9167F, frt.b(-32.5F, 0.0F, 0.0F), frq.b.b),
            new frs(6.25F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "head",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.625F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.375F, frt.a(0.0F, 1.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.a(0.0F, 1.0F, 0.0F), frq.b.a),
            new frs(1.5833F, frt.a(0.0F, 1.0F, 0.0F), frq.b.a),
            new frs(1.875F, frt.a(0.0F, 1.0F, 0.0F), frq.b.a),
            new frs(2.0833F, frt.a(0.0F, 3.0F, 0.0F), frq.b.a),
            new frs(2.2917F, frt.a(0.0F, 6.0F, 0.0F), frq.b.a),
            new frs(2.6667F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(3.2083F, frt.a(0.0F, 4.0F, 0.0F), frq.b.a),
            new frs(3.5833F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(4.125F, frt.a(0.0F, 4.0F, 0.0F), frq.b.a),
            new frs(5.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(5.75F, frt.a(0.0F, 1.0F, 0.0F), frq.b.a),
            new frs(6.0F, frt.a(0.0F, 1.5F, 0.0F), frq.b.a),
            new frs(6.25F, frt.a(0.0F, 1.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_ear",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, -2.5F), frq.b.a),
            new frs(1.25F, frt.b(0.0F, 0.0F, -2.5F), frq.b.a),
            new frs(1.4167F, frt.b(0.0F, 0.0F, -50.0F), frq.b.a),
            new frs(1.5833F, frt.b(0.0F, 0.0F, -30.0F), frq.b.a),
            new frs(5.9167F, frt.b(0.0F, 0.0F, -30.0F), frq.b.a),
            new frs(6.0833F, frt.b(0.0F, 0.0F, -65.0F), frq.b.a),
            new frs(6.3333F, frt.b(0.0F, 0.0F, -30.0F), frq.b.a)
         )
      )
      .a(
         "right_ear",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 2.5F), frq.b.a),
            new frs(1.25F, frt.b(0.0F, 0.0F, 2.5F), frq.b.a),
            new frs(1.4167F, frt.b(0.0F, 0.0F, 50.0F), frq.b.a),
            new frs(1.5833F, frt.b(0.0F, 0.0F, 30.0F), frq.b.a),
            new frs(5.9167F, frt.b(0.0F, 0.0F, 30.0F), frq.b.a),
            new frs(6.0833F, frt.b(0.0F, 0.0F, 65.0F), frq.b.a),
            new frs(6.3333F, frt.b(0.0F, 0.0F, 30.0F), frq.b.a)
         )
      )
      .a(
         "right_front_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.2083F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.375F, frt.b(0.0F, 0.0F, 90.0F), frq.b.a)
         )
      )
      .a(
         "right_front_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.2083F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.2917F, frt.a(-2.0F, -0.75F, 0.0F), frq.b.a),
            new frs(1.375F, frt.a(-4.0F, -5.5F, 0.0F), frq.b.a)
         )
      )
      .a(
         "right_mid_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.25F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.4167F, frt.b(0.0F, 0.0F, 90.0F), frq.b.a)
         )
      )
      .a(
         "right_mid_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.25F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.a(-2.0F, -0.75F, 0.0F), frq.b.a),
            new frs(1.4167F, frt.a(-4.0F, -5.5F, 0.0F), frq.b.a)
         )
      )
      .a(
         "right_hind_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.b(0.0F, 0.0F, 90.0F), frq.b.a)
         )
      )
      .a(
         "right_hind_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.4167F, frt.a(-2.0F, -0.75F, 0.0F), frq.b.a),
            new frs(1.5F, frt.a(-4.0F, -5.5F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_front_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.2083F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.375F, frt.b(0.0F, 0.0F, -90.0F), frq.b.a)
         )
      )
      .a(
         "left_front_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.2083F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.2917F, frt.a(2.0F, -0.75F, 0.0F), frq.b.a),
            new frs(1.375F, frt.a(4.0F, -5.5F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_mid_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.25F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.4167F, frt.b(0.0F, 0.0F, -90.0F), frq.b.a)
         )
      )
      .a(
         "left_mid_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.25F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.a(2.0F, -0.75F, 0.0F), frq.b.a),
            new frs(1.4167F, frt.a(4.0F, -5.5F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_hind_leg",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.b(0.0F, 0.0F, -90.0F), frq.b.a)
         )
      )
      .a(
         "left_hind_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.3333F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.4167F, frt.a(2.0F, -0.75F, 0.0F), frq.b.a),
            new frs(1.5F, frt.a(4.0F, -5.5F, 0.0F), frq.b.a)
         )
      )
      .b();
   public static final frr g = frr.a.a(3.0F)
      .a(
         "body",
         new frq(
            frq.d.b,
            new frs(0.25F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.75F, frt.b(2.5F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.b(-2.5F, 0.0F, 0.0F), frq.b.a),
            new frs(1.7083F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "body",
         new frq(
            frq.d.a,
            new frs(0.25F, frt.a(0.0F, -7.0F, 0.0F), frq.b.a),
            new frs(0.75F, frt.a(0.0F, -7.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.7083F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "head",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.3333F, frt.b(-5.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.7083F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.0F, frt.b(10.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.375F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a("head", new frq(frq.d.a, new frs(0.0F, frt.a(0.0F, 1.0F, 0.0F), frq.b.a), new frs(1.375F, frt.a(0.0F, 1.0F, 0.0F), frq.b.a)))
      .a(
         "left_ear",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, -30.0F), frq.b.a),
            new frs(0.9167F, frt.b(0.0F, 0.0F, -30.0F), frq.b.a),
            new frs(1.2083F, frt.b(0.0F, 0.0F, -5.0F), frq.b.a)
         )
      )
      .a(
         "right_ear",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 30.0F), frq.b.a),
            new frs(0.9167F, frt.b(0.0F, 0.0F, 30.0F), frq.b.a),
            new frs(1.2083F, frt.b(0.0F, 0.0F, 5.0F), frq.b.a)
         )
      )
      .a("right_front_leg", new frq(frq.d.b, new frs(0.0F, frt.b(0.0F, 0.0F, 90.0F), frq.b.b), new frs(0.4583F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b)))
      .a(
         "right_front_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(-4.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.2083F, frt.a(6.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.4583F, frt.a(0.0F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .a("right_mid_leg", new frq(frq.d.b, new frs(0.0833F, frt.b(0.0F, 0.0F, 90.0F), frq.b.b), new frs(0.5833F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b)))
      .a(
         "right_mid_leg",
         new frq(
            frq.d.a,
            new frs(0.0833F, frt.a(-4.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.3333F, frt.a(6.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.5833F, frt.a(0.0F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .a("right_hind_leg", new frq(frq.d.b, new frs(0.1667F, frt.b(0.0F, 0.0F, 90.0F), frq.b.b), new frs(0.6667F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b)))
      .a(
         "right_hind_leg",
         new frq(
            frq.d.a,
            new frs(0.1667F, frt.a(-4.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.4167F, frt.a(6.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.6667F, frt.a(0.0F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .a("left_front_leg", new frq(frq.d.b, new frs(0.0F, frt.b(0.0F, 0.0F, -90.0F), frq.b.b), new frs(0.4583F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b)))
      .a(
         "left_front_leg",
         new frq(
            frq.d.a,
            new frs(0.0F, frt.a(4.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.2083F, frt.a(-6.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.4583F, frt.a(0.0F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .a("left_mid_leg", new frq(frq.d.b, new frs(0.0833F, frt.b(0.0F, 0.0F, -90.0F), frq.b.b), new frs(0.5833F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b)))
      .a(
         "left_mid_leg",
         new frq(
            frq.d.a,
            new frs(0.0833F, frt.a(4.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.3333F, frt.a(-6.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.5833F, frt.a(0.0F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .a("left_hind_leg", new frq(frq.d.b, new frs(0.1667F, frt.b(0.0F, 0.0F, -90.0F), frq.b.b), new frs(0.6667F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b)))
      .a(
         "left_hind_leg",
         new frq(
            frq.d.a,
            new frs(0.1667F, frt.a(4.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.4167F, frt.a(-6.0F, -5.5F, 0.0F), frq.b.b),
            new frs(0.6667F, frt.a(0.0F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .b();
   public static final frr h = frr.a.a(4.0F)
      .a(
         "bone",
         new frq(
            frq.d.b,
            new frs(1.0F, frt.b(-90.0F, 0.0F, 0.0F), frq.b.b),
            new frs(1.5F, frt.b(-98.91F, 0.0F, 0.0F), frq.b.b),
            new frs(1.9583F, frt.b(-90.0F, 0.0F, 0.0F), frq.b.b),
            new frs(2.7083F, frt.b(-68.28F, 0.0F, 0.0F), frq.b.b),
            new frs(2.9583F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .a(
         "bone",
         new frq(
            frq.d.a,
            new frs(1.0F, frt.a(0.0F, 20.0F, 17.0F), frq.b.b),
            new frs(1.5F, frt.a(0.0F, 25.19F, 20.37F), frq.b.b),
            new frs(1.9583F, frt.a(0.0F, 20.0F, 17.0F), frq.b.b),
            new frs(2.7083F, frt.a(0.0F, 17.06F, 11.25F), frq.b.b),
            new frs(2.8333F, frt.a(0.0F, 9.85F, 2.2F), frq.b.b),
            new frs(2.9583F, frt.a(0.0F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .a(
         "body",
         new frq(
            frq.d.c,
            new frs(1.0F, frt.a(1.0, 1.0, 1.0), frq.b.a),
            new frs(1.9583F, frt.a(1.0, 1.0, 1.0), frq.b.a),
            new frs(2.9167F, frt.a(1.0, 1.0, 1.0), frq.b.a),
            new frs(3.0F, frt.a(1.05F, 0.95F, 1.05F), frq.b.a),
            new frs(3.0833F, frt.a(1.0, 1.0, 1.0), frq.b.a)
         )
      )
      .a(
         "head",
         new frq(
            frq.d.b,
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.2917F, frt.b(17.5F, 0.0F, 0.0F), frq.b.a),
            new frs(1.9583F, frt.b(-10.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.75F, frt.b(35.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.9167F, frt.b(-30.0F, 0.0F, 0.0F), frq.b.a),
            new frs(3.0417F, frt.b(7.5F, 0.0F, 0.0F), frq.b.a),
            new frs(3.125F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "head",
         new frq(
            frq.d.a,
            new frs(1.0F, frt.a(0.0F, 7.0F, 19.0F), frq.b.a),
            new frs(1.5F, frt.a(0.0F, 7.0F, 0.0F), frq.b.a),
            new frs(1.9583F, frt.a(0.0F, 7.0F, 0.0F), frq.b.a),
            new frs(2.75F, frt.a(0.0F, 7.0F, 0.0F), frq.b.a),
            new frs(2.9583F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a(
         "left_ear",
         new frq(
            frq.d.b,
            new frs(1.0F, frt.b(0.0F, 0.0F, -5.0F), frq.b.a),
            new frs(1.9583F, frt.b(0.0F, 0.0F, -5.0F), frq.b.a),
            new frs(2.7083F, frt.b(0.0F, 0.0F, -5.0F), frq.b.a),
            new frs(2.9167F, frt.b(0.0F, 0.0F, -90.0F), frq.b.b),
            new frs(3.125F, frt.b(0.0F, 0.0F, -5.0F), frq.b.b)
         )
      )
      .a(
         "right_ear",
         new frq(
            frq.d.b,
            new frs(1.0F, frt.b(0.0F, 0.0F, 5.0F), frq.b.a),
            new frs(1.9583F, frt.b(0.0F, 0.0F, 5.0F), frq.b.a),
            new frs(2.7083F, frt.b(0.0F, 0.0F, 5.0F), frq.b.a),
            new frs(2.9167F, frt.b(0.0F, 0.0F, 90.0F), frq.b.b),
            new frs(3.125F, frt.b(0.0F, 0.0F, 5.0F), frq.b.b)
         )
      )
      .a(
         "right_front_leg",
         new frq(
            frq.d.b,
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.75F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.25F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.5F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.75F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(3.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a("right_front_leg", new frq(frq.d.a, new frs(1.0F, frt.a(0.0F, 4.0F, 0.0F), frq.b.a), new frs(1.5F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a)))
      .a(
         "right_mid_leg",
         new frq(
            frq.d.b,
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.375F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.625F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.875F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.125F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.375F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.625F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(3.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a("right_mid_leg", new frq(frq.d.a, new frs(1.0F, frt.a(0.0F, 4.0F, 0.0F), frq.b.a), new frs(1.5F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a)))
      .a(
         "right_hind_leg",
         new frq(
            frq.d.b,
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.25F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.75F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.25F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.5F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(3.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a("right_hind_leg", new frq(frq.d.a, new frs(1.0F, frt.a(0.0F, 4.0F, 0.0F), frq.b.a), new frs(1.5F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a)))
      .a(
         "left_front_leg",
         new frq(
            frq.d.b,
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.75F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.25F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.5F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.75F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(3.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a("left_front_leg", new frq(frq.d.a, new frs(1.0F, frt.a(0.0F, 4.0F, 0.0F), frq.b.a), new frs(1.5F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a)))
      .a(
         "left_mid_leg",
         new frq(
            frq.d.b,
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.375F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.625F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.875F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.125F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.375F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.625F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(3.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a("left_mid_leg", new frq(frq.d.a, new frs(1.0F, frt.a(0.0F, 4.0F, 0.0F), frq.b.a), new frs(1.5F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a)))
      .a(
         "left_hind_leg",
         new frq(
            frq.d.b,
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.25F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.5F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(1.75F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.0F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.25F, frt.b(-15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(2.5F, frt.b(15.0F, 0.0F, 0.0F), frq.b.a),
            new frs(3.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a)
         )
      )
      .a("left_hind_leg", new frq(frq.d.a, new frs(1.0F, frt.a(0.0F, 4.0F, 0.0F), frq.b.a), new frs(1.5F, frt.a(0.0F, 0.0F, 0.0F), frq.b.a)))
      .b();
   public static final frr i = frr.a.a(2.0F)
      .a()
      .a(
         "head",
         new frq(
            frq.d.b,
            new frs(0.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.a),
            new frs(0.5F, frt.b(-32.00206F, 19.3546F, -11.70092F), frq.b.b),
            new frs(1.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b),
            new frs(1.5F, frt.b(-32.00206F, -19.3546F, 11.70092F), frq.b.b),
            new frs(2.0F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .a(
         "left_ear",
         new frq(
            frq.d.b,
            new frs(0.5F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b),
            new frs(0.75F, frt.b(0.0F, 0.0F, -67.5F), frq.b.b),
            new frs(0.9583F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b),
            new frs(1.125F, frt.b(0.0F, 0.0F, -67.5F), frq.b.b),
            new frs(1.2917F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .a(
         "right_ear",
         new frq(
            frq.d.b,
            new frs(0.5F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b),
            new frs(0.75F, frt.b(0.0F, 0.0F, 67.5F), frq.b.b),
            new frs(0.9583F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b),
            new frs(1.125F, frt.b(0.0F, 0.0F, 67.5F), frq.b.b),
            new frs(1.2917F, frt.b(0.0F, 0.0F, 0.0F), frq.b.b)
         )
      )
      .b();
}
