public class cid {
   public static final ali<cic> a = a("pale");
   public static final ali<cic> b = a("spotted");
   public static final ali<cic> c = a("snowy");
   public static final ali<cic> d = a("black");
   public static final ali<cic> e = a("ashen");
   public static final ali<cic> f = a("rusty");
   public static final ali<cic> g = a("woods");
   public static final ali<cic> h = a("chestnut");
   public static final ali<cic> i = a("striped");
   public static final ali<cic> j = a;

   private static ali<cic> a(String $$0) {
      return ali.a(ma.m, alj.b($$0));
   }

   static void a(qz<cic> $$0, ali<cic> $$1, String $$2, ali<dgo> $$3) {
      a($$0, $$1, $$2, ju.a($$0.a(ma.aG).b($$3)));
   }

   static void a(qz<cic> $$0, ali<cic> $$1, String $$2, axs<dgo> $$3) {
      a($$0, $$1, $$2, $$0.a(ma.aG).b($$3));
   }

   static void a(qz<cic> $$0, ali<cic> $$1, String $$2, ju<dgo> $$3) {
      alj $$4 = alj.b("entity/wolf/" + $$2);
      alj $$5 = alj.b("entity/wolf/" + $$2 + "_tame");
      alj $$6 = alj.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cic($$4, $$5, $$6, $$3));
   }

   public static jq<cic> a(ke $$0, jq<dgo> $$1) {
      kd<cic> $$2 = $$0.e(ma.m);
      return $$2.c().filter($$1x -> ((cic)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(qz<cic> $$0) {
      a($$0, a, "wolf", dgv.p);
      a($$0, b, "wolf_spotted", axb.k);
      a($$0, c, "wolf_snowy", dgv.F);
      a($$0, d, "wolf_black", dgv.n);
      a($$0, e, "wolf_ashen", dgv.q);
      a($$0, f, "wolf_rusty", axb.i);
      a($$0, g, "wolf_woods", dgv.i);
      a($$0, h, "wolf_chestnut", dgv.o);
      a($$0, i, "wolf_striped", axb.f);
   }
}
