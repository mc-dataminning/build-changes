import java.util.Optional;

public class cjs {
   public static final alh<cjr> a = a(ckp.a);
   public static final alh<cjr> b = a(ckp.b);
   public static final alh<cjr> c = a(ckp.c);
   public static final alh<cjr> d = a;

   private static alh<cjr> a(ali $$0) {
      return alh.a(mh.aJ, $$0);
   }

   public static void a(qh<cjr> $$0) {
      a($$0, a, cjr.a.a, "temperate_chicken", cue.a(0));
      a($$0, b, cjr.a.a, "warm_chicken", axd.al);
      a($$0, c, cjr.a.b, "cold_chicken", axd.ak);
   }

   private static void a(qh<cjr> $$0, alh<cjr> $$1, cjr.a $$2, String $$3, axt<dla> $$4) {
      jj<dla> $$5 = $$0.a(mh.aG).b($$4);
      a($$0, $$1, $$2, $$3, cue.a(new ctx($$5), 1));
   }

   private static void a(qh<cjr> $$0, alh<cjr> $$1, cjr.a $$2, String $$3, cue $$4) {
      ali $$5 = ali.b("entity/chicken/" + $$3);
      $$0.a($$1, new cjr(new cty<>($$2, $$5), $$4));
   }

   public static Optional<jf.c<cjr>> a(azx $$0, jt $$1, cud $$2) {
      return cua.a($$1.f(mh.aJ).c(), jf::a, $$0, $$2);
   }
}
