public class chi {
   public static final ald<chh> a = a("pale");
   public static final ald<chh> b = a("spotted");
   public static final ald<chh> c = a("snowy");
   public static final ald<chh> d = a("black");
   public static final ald<chh> e = a("ashen");
   public static final ald<chh> f = a("rusty");
   public static final ald<chh> g = a("woods");
   public static final ald<chh> h = a("chestnut");
   public static final ald<chh> i = a("striped");
   public static final ald<chh> j = a;

   private static ald<chh> a(String $$0) {
      return ald.a(lw.m, ale.b($$0));
   }

   static void a(qu<chh> $$0, ald<chh> $$1, String $$2, ald<dfk> $$3) {
      a($$0, $$1, $$2, js.a($$0.a(lw.aH).b($$3)));
   }

   static void a(qu<chh> $$0, ald<chh> $$1, String $$2, axl<dfk> $$3) {
      a($$0, $$1, $$2, $$0.a(lw.aH).b($$3));
   }

   static void a(qu<chh> $$0, ald<chh> $$1, String $$2, js<dfk> $$3) {
      ale $$4 = ale.b("entity/wolf/" + $$2);
      ale $$5 = ale.b("entity/wolf/" + $$2 + "_tame");
      ale $$6 = ale.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new chh($$4, $$5, $$6, $$3));
   }

   public static jo<chh> a(kc $$0, jo<dfk> $$1) {
      kb<chh> $$2 = $$0.e(lw.m);
      return $$2.c().filter($$1x -> ((chh)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(qu<chh> $$0) {
      a($$0, a, "wolf", dfr.p);
      a($$0, b, "wolf_spotted", awu.k);
      a($$0, c, "wolf_snowy", dfr.F);
      a($$0, d, "wolf_black", dfr.n);
      a($$0, e, "wolf_ashen", dfr.q);
      a($$0, f, "wolf_rusty", awu.i);
      a($$0, g, "wolf_woods", dfr.i);
      a($$0, h, "wolf_chestnut", dfr.o);
      a($$0, i, "wolf_striped", awu.f);
   }
}
