import java.util.List;
import java.util.Optional;

public class cii {
   public static final akt<cih> a = a(cir.a.a());
   public static final akt<cih> b = a(cir.b.a());
   public static final akt<cih> c = a(cir.c.a());
   public static final akt<cih> d = a;

   private static akt<cih> a(String $$0) {
      return akt.a(mc.aU, aku.b($$0));
   }

   public static void a(qe<cih> $$0) {
      a($$0, a, cih.a.a, "pig", Optional.empty());
      a($$0, b, cih.a.a, "warm_pig", awo.al);
      a($$0, c, cih.a.b, "cold_pig", awo.ak);
   }

   static void a(qe<cih> $$0, akt<cih> $$1, cih.a $$2, String $$3, axf<dic> $$4) {
      a($$0, $$1, $$2, $$3, Optional.of($$0.a(mc.aJ).b($$4)));
   }

   static void a(qe<cih> $$0, akt<cih> $$1, cih.a $$2, String $$3, Optional<jv<dic>> $$4) {
      aku $$5 = aku.b("entity/pig/" + $$3);
      $$0.a($$1, new cih($$2, $$5, $$4));
   }

   public static Optional<jr.c<cih>> a(azh $$0, kf $$1, jr<dic> $$2) {
      ke<cih> $$3 = $$1.e(mc.aU);
      List<jr.c<cih>> $$4 = $$3.c().filter($$1x -> ((cih)$$1x.a()).c().isPresent() && ((cih)$$1x.a()).c().get().a($$2)).toList();
      if (!$$4.isEmpty()) {
         return af.b($$4, $$0);
      } else {
         List<jr.c<cih>> $$5 = $$3.c().filter($$0x -> ((cih)$$0x.a()).c().isEmpty()).toList();
         return af.b($$5, $$0);
      }
   }
}
