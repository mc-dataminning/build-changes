import java.util.Optional;

public class ckj {
   public static final alj<cki> a = a(ckr.a);
   public static final alj<cki> b = a(ckr.b);
   public static final alj<cki> c = a(ckr.c);
   public static final alj<cki> d = a;

   private static alj<cki> a(alk $$0) {
      return alj.a(mi.ba, $$0);
   }

   public static void a(qi<cki> $$0) {
      a($$0, a, cki.a.a, "temperate_pig", cug.a(0));
      a($$0, b, cki.a.a, "warm_pig", axf.al);
      a($$0, c, cki.a.b, "cold_pig", axf.ak);
   }

   private static void a(qi<cki> $$0, alj<cki> $$1, cki.a $$2, String $$3, axv<dlc> $$4) {
      jk<dlc> $$5 = $$0.a(mi.aG).b($$4);
      a($$0, $$1, $$2, $$3, cug.a(new ctz($$5), 1));
   }

   private static void a(qi<cki> $$0, alj<cki> $$1, cki.a $$2, String $$3, cug $$4) {
      alk $$5 = alk.b("entity/pig/" + $$3);
      $$0.a($$1, new cki(new cua<>($$2, $$5), $$4));
   }

   public static Optional<jg.c<cki>> a(azz $$0, ju $$1, cuf $$2) {
      return cuc.a($$1.f(mi.ba).c(), jg::a, $$0, $$2);
   }
}
