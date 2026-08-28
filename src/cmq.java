import java.util.Optional;

public class cmq {
   public static final alh<cmp> a = a("pale");
   public static final alh<cmp> b = a("spotted");
   public static final alh<cmp> c = a("snowy");
   public static final alh<cmp> d = a("black");
   public static final alh<cmp> e = a("ashen");
   public static final alh<cmp> f = a("rusty");
   public static final alh<cmp> g = a("woods");
   public static final alh<cmp> h = a("chestnut");
   public static final alh<cmp> i = a("striped");
   public static final alh<cmp> j = a;

   private static alh<cmp> a(String $$0) {
      return alh.a(mh.bm, ali.b($$0));
   }

   private static void a(qh<cmp> $$0, alh<cmp> $$1, String $$2, alh<dla> $$3) {
      a($$0, $$1, $$2, a(jj.a($$0.a(mh.aG).b($$3))));
   }

   private static void a(qh<cmp> $$0, alh<cmp> $$1, String $$2, axt<dla> $$3) {
      a($$0, $$1, $$2, a($$0.a(mh.aG).b($$3)));
   }

   private static cue a(jj<dla> $$0) {
      return cue.a(new ctx($$0), 1);
   }

   private static void a(qh<cmp> $$0, alh<cmp> $$1, String $$2, cue $$3) {
      ali $$4 = ali.b("entity/wolf/" + $$2);
      ali $$5 = ali.b("entity/wolf/" + $$2 + "_tame");
      ali $$6 = ali.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cmp(new cmp.a(new iw($$4), new iw($$5), new iw($$6)), $$3));
   }

   public static Optional<? extends jf<cmp>> a(azx $$0, jt $$1, cud $$2) {
      return cua.a($$1.f(mh.bm).c(), jf::a, $$0, $$2);
   }

   public static void a(qh<cmp> $$0) {
      a($$0, a, "wolf", cue.a(0));
      a($$0, b, "wolf_spotted", axd.k);
      a($$0, c, "wolf_snowy", dlh.G);
      a($$0, d, "wolf_black", dlh.o);
      a($$0, e, "wolf_ashen", dlh.r);
      a($$0, f, "wolf_rusty", axd.i);
      a($$0, g, "wolf_woods", dlh.i);
      a($$0, h, "wolf_chestnut", dlh.p);
      a($$0, i, "wolf_striped", axd.f);
   }
}
