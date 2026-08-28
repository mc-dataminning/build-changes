import java.util.Optional;

public class cms {
   public static final alj<cmr> a = a("pale");
   public static final alj<cmr> b = a("spotted");
   public static final alj<cmr> c = a("snowy");
   public static final alj<cmr> d = a("black");
   public static final alj<cmr> e = a("ashen");
   public static final alj<cmr> f = a("rusty");
   public static final alj<cmr> g = a("woods");
   public static final alj<cmr> h = a("chestnut");
   public static final alj<cmr> i = a("striped");
   public static final alj<cmr> j = a;

   private static alj<cmr> a(String $$0) {
      return alj.a(mi.bm, alk.b($$0));
   }

   private static void a(qi<cmr> $$0, alj<cmr> $$1, String $$2, alj<dlc> $$3) {
      a($$0, $$1, $$2, a(jk.a($$0.a(mi.aG).b($$3))));
   }

   private static void a(qi<cmr> $$0, alj<cmr> $$1, String $$2, axv<dlc> $$3) {
      a($$0, $$1, $$2, a($$0.a(mi.aG).b($$3)));
   }

   private static cug a(jk<dlc> $$0) {
      return cug.a(new ctz($$0), 1);
   }

   private static void a(qi<cmr> $$0, alj<cmr> $$1, String $$2, cug $$3) {
      alk $$4 = alk.b("entity/wolf/" + $$2);
      alk $$5 = alk.b("entity/wolf/" + $$2 + "_tame");
      alk $$6 = alk.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cmr(new cmr.a(new ix($$4), new ix($$5), new ix($$6)), $$3));
   }

   public static Optional<? extends jg<cmr>> a(azz $$0, ju $$1, cuf $$2) {
      return cuc.a($$1.f(mi.bm).c(), jg::a, $$0, $$2);
   }

   public static void a(qi<cmr> $$0) {
      a($$0, a, "wolf", cug.a(0));
      a($$0, b, "wolf_spotted", axf.k);
      a($$0, c, "wolf_snowy", dlj.G);
      a($$0, d, "wolf_black", dlj.o);
      a($$0, e, "wolf_ashen", dlj.r);
      a($$0, f, "wolf_rusty", axf.i);
      a($$0, g, "wolf_woods", dlj.i);
      a($$0, h, "wolf_chestnut", dlj.p);
      a($$0, i, "wolf_striped", axf.f);
   }
}
