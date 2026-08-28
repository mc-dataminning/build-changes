import java.util.Optional;

public class cnb {
   public static final alq<cna> a = a("pale");
   public static final alq<cna> b = a("spotted");
   public static final alq<cna> c = a("snowy");
   public static final alq<cna> d = a("black");
   public static final alq<cna> e = a("ashen");
   public static final alq<cna> f = a("rusty");
   public static final alq<cna> g = a("woods");
   public static final alq<cna> h = a("chestnut");
   public static final alq<cna> i = a("striped");
   public static final alq<cna> j = a;

   private static alq<cna> a(String $$0) {
      return alq.a(mi.bm, alr.b($$0));
   }

   private static void a(qi<cna> $$0, alq<cna> $$1, String $$2, alq<dlm> $$3) {
      a($$0, $$1, $$2, a(jk.a($$0.a(mi.aG).b($$3))));
   }

   private static void a(qi<cna> $$0, alq<cna> $$1, String $$2, ayc<dlm> $$3) {
      a($$0, $$1, $$2, a($$0.a(mi.aG).b($$3)));
   }

   private static cup a(jk<dlm> $$0) {
      return cup.a(new cui($$0), 1);
   }

   private static void a(qi<cna> $$0, alq<cna> $$1, String $$2, cup $$3) {
      alr $$4 = alr.b("entity/wolf/" + $$2);
      alr $$5 = alr.b("entity/wolf/" + $$2 + "_tame");
      alr $$6 = alr.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cna(new cna.a(new ix($$4), new ix($$5), new ix($$6)), $$3));
   }

   public static Optional<? extends jg<cna>> a(bai $$0, ju $$1, cuo $$2) {
      return cul.a($$1.f(mi.bm).c(), jg::a, $$0, $$2);
   }

   public static void a(qi<cna> $$0) {
      a($$0, a, "wolf", cup.a(0));
      a($$0, b, "wolf_spotted", axm.k);
      a($$0, c, "wolf_snowy", dlt.G);
      a($$0, d, "wolf_black", dlt.o);
      a($$0, e, "wolf_ashen", dlt.r);
      a($$0, f, "wolf_rusty", axm.i);
      a($$0, g, "wolf_woods", dlt.i);
      a($$0, h, "wolf_chestnut", dlt.p);
      a($$0, i, "wolf_striped", axm.f);
   }
}
