import java.util.Optional;

public class ckk {
   public static final alf<ckj> a = a("pale");
   public static final alf<ckj> b = a("spotted");
   public static final alf<ckj> c = a("snowy");
   public static final alf<ckj> d = a("black");
   public static final alf<ckj> e = a("ashen");
   public static final alf<ckj> f = a("rusty");
   public static final alf<ckj> g = a("woods");
   public static final alf<ckj> h = a("chestnut");
   public static final alf<ckj> i = a("striped");
   public static final alf<ckj> j = a;

   private static alf<ckj> a(String $$0) {
      return alf.a(mh.bm, alg.b($$0));
   }

   private static void a(qh<ckj> $$0, alf<ckj> $$1, String $$2, alf<dkk> $$3) {
      a($$0, $$1, $$2, a(jj.a($$0.a(mh.aG).b($$3))));
   }

   private static void a(qh<ckj> $$0, alf<ckj> $$1, String $$2, axr<dkk> $$3) {
      a($$0, $$1, $$2, a($$0.a(mh.aG).b($$3)));
   }

   private static ctq a(jj<dkk> $$0) {
      return ctq.a(new ctj($$0), 1);
   }

   private static void a(qh<ckj> $$0, alf<ckj> $$1, String $$2, ctq $$3) {
      alg $$4 = alg.b("entity/wolf/" + $$2);
      alg $$5 = alg.b("entity/wolf/" + $$2 + "_tame");
      alg $$6 = alg.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new ckj(new ckj.a(new iw($$4), new iw($$5), new iw($$6)), $$3));
   }

   public static Optional<? extends jf<ckj>> a(azv $$0, jt $$1, ctp $$2) {
      return ctm.a($$1.f(mh.bm).c(), jf::a, $$0, $$2);
   }

   public static void a(qh<ckj> $$0) {
      a($$0, a, "wolf", ctq.a(0));
      a($$0, b, "wolf_spotted", axb.k);
      a($$0, c, "wolf_snowy", dkr.G);
      a($$0, d, "wolf_black", dkr.o);
      a($$0, e, "wolf_ashen", dkr.r);
      a($$0, f, "wolf_rusty", axb.i);
      a($$0, g, "wolf_woods", dkr.i);
      a($$0, h, "wolf_chestnut", dkr.p);
      a($$0, i, "wolf_striped", axb.f);
   }
}
