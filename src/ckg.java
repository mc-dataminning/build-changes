import java.util.Optional;

public class ckg {
   public static final alf<ckf> a = a("pale");
   public static final alf<ckf> b = a("spotted");
   public static final alf<ckf> c = a("snowy");
   public static final alf<ckf> d = a("black");
   public static final alf<ckf> e = a("ashen");
   public static final alf<ckf> f = a("rusty");
   public static final alf<ckf> g = a("woods");
   public static final alf<ckf> h = a("chestnut");
   public static final alf<ckf> i = a("striped");
   public static final alf<ckf> j = a;

   private static alf<ckf> a(String $$0) {
      return alf.a(mg.bm, alg.b($$0));
   }

   private static void a(qh<ckf> $$0, alf<ckf> $$1, String $$2, alf<dkd> $$3) {
      a($$0, $$1, $$2, a(ji.a($$0.a(mg.aG).b($$3))));
   }

   private static void a(qh<ckf> $$0, alf<ckf> $$1, String $$2, axr<dkd> $$3) {
      a($$0, $$1, $$2, a($$0.a(mg.aG).b($$3)));
   }

   private static ctj a(ji<dkd> $$0) {
      return ctj.a(new ctc($$0), 1);
   }

   private static void a(qh<ckf> $$0, alf<ckf> $$1, String $$2, ctj $$3) {
      alg $$4 = alg.b("entity/wolf/" + $$2);
      alg $$5 = alg.b("entity/wolf/" + $$2 + "_tame");
      alg $$6 = alg.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new ckf(new ckf.a(new iv($$4), new iv($$5), new iv($$6)), $$3));
   }

   public static Optional<? extends je<ckf>> a(azv $$0, js $$1, cti $$2) {
      return ctf.a($$1.f(mg.bm).c(), je::a, $$0, $$2);
   }

   public static void a(qh<ckf> $$0) {
      a($$0, a, "wolf", ctj.a(0));
      a($$0, b, "wolf_spotted", axb.k);
      a($$0, c, "wolf_snowy", dkk.G);
      a($$0, d, "wolf_black", dkk.o);
      a($$0, e, "wolf_ashen", dkk.r);
      a($$0, f, "wolf_rusty", axb.i);
      a($$0, g, "wolf_woods", dkk.i);
      a($$0, h, "wolf_chestnut", dkk.p);
      a($$0, i, "wolf_striped", axb.f);
   }
}
