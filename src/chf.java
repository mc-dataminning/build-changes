public class chf {
   public static final alb<che> a = a("pale");
   public static final alb<che> b = a("spotted");
   public static final alb<che> c = a("snowy");
   public static final alb<che> d = a("black");
   public static final alb<che> e = a("ashen");
   public static final alb<che> f = a("rusty");
   public static final alb<che> g = a("woods");
   public static final alb<che> h = a("chestnut");
   public static final alb<che> i = a("striped");
   public static final alb<che> j = a;

   private static alb<che> a(String $$0) {
      return alb.a(lv.m, alc.b($$0));
   }

   static void a(qt<che> $$0, alb<che> $$1, String $$2, alb<dfh> $$3) {
      a($$0, $$1, $$2, jr.a($$0.a(lv.aG).b($$3)));
   }

   static void a(qt<che> $$0, alb<che> $$1, String $$2, axj<dfh> $$3) {
      a($$0, $$1, $$2, $$0.a(lv.aG).b($$3));
   }

   static void a(qt<che> $$0, alb<che> $$1, String $$2, jr<dfh> $$3) {
      alc $$4 = alc.b("entity/wolf/" + $$2);
      alc $$5 = alc.b("entity/wolf/" + $$2 + "_tame");
      alc $$6 = alc.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new che($$4, $$5, $$6, $$3));
   }

   public static jn<che> a(kb $$0, jn<dfh> $$1) {
      ka<che> $$2 = $$0.d(lv.m);
      return $$2.i().filter($$1x -> ((che)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.b(j)).or($$2::a).orElseThrow();
   }

   public static void a(qt<che> $$0) {
      a($$0, a, "wolf", dfo.p);
      a($$0, b, "wolf_spotted", aws.k);
      a($$0, c, "wolf_snowy", dfo.F);
      a($$0, d, "wolf_black", dfo.n);
      a($$0, e, "wolf_ashen", dfo.q);
      a($$0, f, "wolf_rusty", aws.i);
      a($$0, g, "wolf_woods", dfo.i);
      a($$0, h, "wolf_chestnut", dfo.o);
      a($$0, i, "wolf_striped", aws.f);
   }
}
