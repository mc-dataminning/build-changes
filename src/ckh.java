import java.util.Optional;

public class ckh {
   public static final alq<ckg> a = a(cla.a);
   public static final alq<ckg> b = a(cla.b);
   public static final alq<ckg> c = a(cla.c);
   public static final alq<ckg> d = a;

   private static alq<ckg> a(alr $$0) {
      return alq.a(mi.aM, $$0);
   }

   public static void a(qi<ckg> $$0) {
      a($$0, a, ckg.a.a, "temperate_cow", cup.a(0));
      a($$0, b, ckg.a.c, "warm_cow", axm.al);
      a($$0, c, ckg.a.b, "cold_cow", axm.ak);
   }

   private static void a(qi<ckg> $$0, alq<ckg> $$1, ckg.a $$2, String $$3, ayc<dlm> $$4) {
      jk<dlm> $$5 = $$0.a(mi.aG).b($$4);
      a($$0, $$1, $$2, $$3, cup.a(new cui($$5), 1));
   }

   private static void a(qi<ckg> $$0, alq<ckg> $$1, ckg.a $$2, String $$3, cup $$4) {
      alr $$5 = alr.b("entity/cow/" + $$3);
      $$0.a($$1, new ckg(new cuj<>($$2, $$5), $$4));
   }

   public static Optional<jg.c<ckg>> a(bai $$0, ju $$1, cuo $$2) {
      return cul.a($$1.f(mi.aM).c(), jg::a, $$0, $$2);
   }
}
