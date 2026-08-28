import java.util.Optional;

public class cjw {
   public static final alh<cjv> a = a(ckp.a);
   public static final alh<cjv> b = a(ckp.b);
   public static final alh<cjv> c = a(ckp.c);
   public static final alh<cjv> d = a;

   private static alh<cjv> a(ali $$0) {
      return alh.a(mh.aM, $$0);
   }

   public static void a(qh<cjv> $$0) {
      a($$0, a, cjv.a.a, "temperate_cow", cue.a(0));
      a($$0, b, cjv.a.c, "warm_cow", axd.al);
      a($$0, c, cjv.a.b, "cold_cow", axd.ak);
   }

   private static void a(qh<cjv> $$0, alh<cjv> $$1, cjv.a $$2, String $$3, axt<dla> $$4) {
      jj<dla> $$5 = $$0.a(mh.aG).b($$4);
      a($$0, $$1, $$2, $$3, cue.a(new ctx($$5), 1));
   }

   private static void a(qh<cjv> $$0, alh<cjv> $$1, cjv.a $$2, String $$3, cue $$4) {
      ali $$5 = ali.b("entity/cow/" + $$3);
      $$0.a($$1, new cjv(new cty<>($$2, $$5), $$4));
   }

   public static Optional<jf.c<cjv>> a(azx $$0, jt $$1, cud $$2) {
      return cua.a($$1.f(mh.aM).c(), jf::a, $$0, $$2);
   }
}
