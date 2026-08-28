public class cjo {
   public static final alc<cjn> a = a("pale");
   public static final alc<cjn> b = a("spotted");
   public static final alc<cjn> c = a("snowy");
   public static final alc<cjn> d = a("black");
   public static final alc<cjn> e = a("ashen");
   public static final alc<cjn> f = a("rusty");
   public static final alc<cjn> g = a("woods");
   public static final alc<cjn> h = a("chestnut");
   public static final alc<cjn> i = a("striped");
   public static final alc<cjn> j = a;

   private static alc<cjn> a(String $$0) {
      return alc.a(me.m, ald.b($$0));
   }

   static void a(qg<cjn> $$0, alc<cjn> $$1, String $$2, alc<dis> $$3) {
      a($$0, $$1, $$2, jw.a($$0.a(me.aM).b($$3)));
   }

   static void a(qg<cjn> $$0, alc<cjn> $$1, String $$2, axp<dis> $$3) {
      a($$0, $$1, $$2, $$0.a(me.aM).b($$3));
   }

   static void a(qg<cjn> $$0, alc<cjn> $$1, String $$2, jw<dis> $$3) {
      ald $$4 = ald.b("entity/wolf/" + $$2);
      ald $$5 = ald.b("entity/wolf/" + $$2 + "_tame");
      ald $$6 = ald.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cjn($$4, $$5, $$6, $$3));
   }

   public static js<cjn> a(kg $$0, js<dis> $$1) {
      kf<cjn> $$2 = $$0.f(me.m);
      return $$2.c().filter($$1x -> ((cjn)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(qg<cjn> $$0) {
      a($$0, a, "wolf", diz.q);
      a($$0, b, "wolf_spotted", awy.k);
      a($$0, c, "wolf_snowy", diz.G);
      a($$0, d, "wolf_black", diz.o);
      a($$0, e, "wolf_ashen", diz.r);
      a($$0, f, "wolf_rusty", awy.i);
      a($$0, g, "wolf_woods", diz.i);
      a($$0, h, "wolf_chestnut", diz.p);
      a($$0, i, "wolf_striped", awy.f);
   }
}
