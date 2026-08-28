import java.util.Optional;

public class cjy {
   public static final alj<cjx> a = a(ckr.a);
   public static final alj<cjx> b = a(ckr.b);
   public static final alj<cjx> c = a(ckr.c);
   public static final alj<cjx> d = a;

   private static alj<cjx> a(alk $$0) {
      return alj.a(mi.aM, $$0);
   }

   public static void a(qi<cjx> $$0) {
      a($$0, a, cjx.a.a, "temperate_cow", cug.a(0));
      a($$0, b, cjx.a.c, "warm_cow", axf.al);
      a($$0, c, cjx.a.b, "cold_cow", axf.ak);
   }

   private static void a(qi<cjx> $$0, alj<cjx> $$1, cjx.a $$2, String $$3, axv<dlc> $$4) {
      jk<dlc> $$5 = $$0.a(mi.aG).b($$4);
      a($$0, $$1, $$2, $$3, cug.a(new ctz($$5), 1));
   }

   private static void a(qi<cjx> $$0, alj<cjx> $$1, cjx.a $$2, String $$3, cug $$4) {
      alk $$5 = alk.b("entity/cow/" + $$3);
      $$0.a($$1, new cjx(new cua<>($$2, $$5), $$4));
   }

   public static Optional<jg.c<cjx>> a(azz $$0, ju $$1, cuf $$2) {
      return cuc.a($$1.f(mi.aM).c(), jg::a, $$0, $$2);
   }
}
