import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fqr implements mm {
   private final mo.a d;

   public fqr(mo $$0) {
      this.d = $$0.a(mo.b.b, "equipment");
   }

   private static void a(BiConsumer<alf<dhk>, hld> $$0) {
      $$0.accept(dhl.b, hld.a().a(alg.b("leather"), true).a(alg.b("leather_overlay"), false).a(hld.d.e, hld.c.a(alg.b("leather"), true)).a());
      $$0.accept(dhl.c, a("chainmail"));
      $$0.accept(dhl.d, b("iron"));
      $$0.accept(dhl.e, b("gold"));
      $$0.accept(dhl.f, b("diamond"));
      $$0.accept(dhl.g, hld.a().b(alg.b("turtle_scute"), false).a());
      $$0.accept(dhl.h, a("netherite"));
      $$0.accept(dhl.i, hld.a().a(hld.d.d, hld.c.b(alg.b("armadillo_scute"), false)).a(hld.d.d, hld.c.b(alg.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(dhl.j, hld.a().a(hld.d.c, new hld.c(alg.b("elytra"), Optional.empty(), true)).a());
      hld.c $$1 = new hld.c(alg.b("saddle"));
      $$0.accept(
         dhl.k, hld.a().a(hld.d.g, $$1).a(hld.d.h, $$1).a(hld.d.i, $$1).a(hld.d.j, $$1).a(hld.d.k, $$1).a(hld.d.l, $$1).a(hld.d.n, $$1).a(hld.d.m, $$1).a()
      );

      for (Entry<cyb, alf<dhk>> $$2 : dhl.l.entrySet()) {
         cyb $$3 = $$2.getKey();
         alf<dhk> $$4 = $$2.getValue();
         $$0.accept($$4, hld.a().a(hld.d.f, new hld.c(alg.b($$3.c()))).a());
      }

      $$0.accept(dhl.m, hld.a().a(hld.d.f, new hld.c(alg.b("trader_llama"))).a());
   }

   private static hld a(String $$0) {
      return hld.a().a(alg.b($$0)).a();
   }

   private static hld b(String $$0) {
      return hld.a().a(alg.b($$0)).a(hld.d.e, hld.c.a(alg.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      Map<alf<dhk>, hld> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mm.a($$0, hld.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
