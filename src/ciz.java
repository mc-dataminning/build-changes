import java.util.List;
import java.util.Optional;

public class ciz {
   public static final alc<ciy> a = a(cji.a.a());
   public static final alc<ciy> b = a(cji.b.a());
   public static final alc<ciy> c = a(cji.c.a());
   public static final alc<ciy> d = a;

   private static alc<ciy> a(String $$0) {
      return alc.a(me.aX, ald.b($$0));
   }

   public static void a(qg<ciy> $$0) {
      a($$0, a, ciy.a.a, "pig", Optional.empty());
      a($$0, b, ciy.a.a, "warm_pig", awy.al);
      a($$0, c, ciy.a.b, "cold_pig", awy.ak);
   }

   static void a(qg<ciy> $$0, alc<ciy> $$1, ciy.a $$2, String $$3, axp<dis> $$4) {
      a($$0, $$1, $$2, $$3, Optional.of($$0.a(me.aM).b($$4)));
   }

   static void a(qg<ciy> $$0, alc<ciy> $$1, ciy.a $$2, String $$3, Optional<jw<dis>> $$4) {
      ald $$5 = ald.b("entity/pig/" + $$3);
      $$0.a($$1, new ciy($$2, $$5, $$4));
   }

   public static Optional<js.c<ciy>> a(azs $$0, kg $$1, js<dis> $$2) {
      kf<ciy> $$3 = $$1.f(me.aX);
      List<js.c<ciy>> $$4 = $$3.c().filter($$1x -> ((ciy)$$1x.a()).c().isPresent() && ((ciy)$$1x.a()).c().get().a($$2)).toList();
      if (!$$4.isEmpty()) {
         return af.b($$4, $$0);
      } else {
         List<js.c<ciy>> $$5 = $$3.c().filter($$0x -> ((ciy)$$0x.a()).c().isEmpty()).toList();
         return af.b($$5, $$0);
      }
   }
}
