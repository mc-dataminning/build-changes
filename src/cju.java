import java.util.Optional;

public class cju {
   public static final alj<cjt> a = a(ckr.a);
   public static final alj<cjt> b = a(ckr.b);
   public static final alj<cjt> c = a(ckr.c);
   public static final alj<cjt> d = a;

   private static alj<cjt> a(alk $$0) {
      return alj.a(mi.aJ, $$0);
   }

   public static void a(qi<cjt> $$0) {
      a($$0, a, cjt.a.a, "temperate_chicken", cug.a(0));
      a($$0, b, cjt.a.a, "warm_chicken", axf.al);
      a($$0, c, cjt.a.b, "cold_chicken", axf.ak);
   }

   private static void a(qi<cjt> $$0, alj<cjt> $$1, cjt.a $$2, String $$3, axv<dlc> $$4) {
      jk<dlc> $$5 = $$0.a(mi.aG).b($$4);
      a($$0, $$1, $$2, $$3, cug.a(new ctz($$5), 1));
   }

   private static void a(qi<cjt> $$0, alj<cjt> $$1, cjt.a $$2, String $$3, cug $$4) {
      alk $$5 = alk.b("entity/chicken/" + $$3);
      $$0.a($$1, new cjt(new cua<>($$2, $$5), $$4));
   }

   public static Optional<jg.c<cjt>> a(azz $$0, ju $$1, cuf $$2) {
      return cuc.a($$1.f(mi.aJ).c(), jg::a, $$0, $$2);
   }
}
