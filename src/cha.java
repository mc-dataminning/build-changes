public class cha {
   public static final ala<cgz> a = a("pale");
   public static final ala<cgz> b = a("spotted");
   public static final ala<cgz> c = a("snowy");
   public static final ala<cgz> d = a("black");
   public static final ala<cgz> e = a("ashen");
   public static final ala<cgz> f = a("rusty");
   public static final ala<cgz> g = a("woods");
   public static final ala<cgz> h = a("chestnut");
   public static final ala<cgz> i = a("striped");
   public static final ala<cgz> j = a;

   private static ala<cgz> a(String $$0) {
      return ala.a(lv.m, alb.b($$0));
   }

   static void a(qt<cgz> $$0, ala<cgz> $$1, String $$2, ala<det> $$3) {
      a($$0, $$1, $$2, jr.a($$0.a(lv.aF).b($$3)));
   }

   static void a(qt<cgz> $$0, ala<cgz> $$1, String $$2, axi<det> $$3) {
      a($$0, $$1, $$2, $$0.a(lv.aF).b($$3));
   }

   static void a(qt<cgz> $$0, ala<cgz> $$1, String $$2, jr<det> $$3) {
      alb $$4 = alb.b("entity/wolf/" + $$2);
      alb $$5 = alb.b("entity/wolf/" + $$2 + "_tame");
      alb $$6 = alb.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cgz($$4, $$5, $$6, $$3));
   }

   public static jn<cgz> a(kb $$0, jn<det> $$1) {
      ka<cgz> $$2 = $$0.d(lv.m);
      return $$2.i().filter($$1x -> ((cgz)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.b(j)).or($$2::a).orElseThrow();
   }

   public static void a(qt<cgz> $$0) {
      a($$0, a, "wolf", dfa.p);
      a($$0, b, "wolf_spotted", awr.k);
      a($$0, c, "wolf_snowy", dfa.F);
      a($$0, d, "wolf_black", dfa.n);
      a($$0, e, "wolf_ashen", dfa.q);
      a($$0, f, "wolf_rusty", awr.i);
      a($$0, g, "wolf_woods", dfa.i);
      a($$0, h, "wolf_chestnut", dfa.o);
      a($$0, i, "wolf_striped", awr.f);
   }
}
