import java.util.Optional;

public class ckc {
   public static final alf<ckb> a = a("pale");
   public static final alf<ckb> b = a("spotted");
   public static final alf<ckb> c = a("snowy");
   public static final alf<ckb> d = a("black");
   public static final alf<ckb> e = a("ashen");
   public static final alf<ckb> f = a("rusty");
   public static final alf<ckb> g = a("woods");
   public static final alf<ckb> h = a("chestnut");
   public static final alf<ckb> i = a("striped");
   public static final alf<ckb> j = a;

   private static alf<ckb> a(String $$0) {
      return alf.a(mg.bl, alg.b($$0));
   }

   private static void a(qh<ckb> $$0, alf<ckb> $$1, String $$2, alf<djy> $$3) {
      a($$0, $$1, $$2, a(ji.a($$0.a(mg.aG).b($$3))));
   }

   private static void a(qh<ckb> $$0, alf<ckb> $$1, String $$2, axr<djy> $$3) {
      a($$0, $$1, $$2, a($$0.a(mg.aG).b($$3)));
   }

   private static cte a(ji<djy> $$0) {
      return cte.a(new csx($$0), 1);
   }

   private static void a(qh<ckb> $$0, alf<ckb> $$1, String $$2, cte $$3) {
      alg $$4 = alg.b("entity/wolf/" + $$2);
      alg $$5 = alg.b("entity/wolf/" + $$2 + "_tame");
      alg $$6 = alg.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new ckb(new ckb.a(new iv($$4), new iv($$5), new iv($$6)), $$3));
   }

   public static Optional<? extends je<ckb>> a(azv $$0, js $$1, ctd $$2) {
      return cta.a($$1.f(mg.bl).c(), je::a, $$0, $$2);
   }

   public static void a(qh<ckb> $$0) {
      a($$0, a, "wolf", cte.a(0));
      a($$0, b, "wolf_spotted", axb.k);
      a($$0, c, "wolf_snowy", dkf.G);
      a($$0, d, "wolf_black", dkf.o);
      a($$0, e, "wolf_ashen", dkf.r);
      a($$0, f, "wolf_rusty", axb.i);
      a($$0, g, "wolf_woods", dkf.i);
      a($$0, h, "wolf_chestnut", dkf.p);
      a($$0, i, "wolf_striped", axb.f);
   }
}
