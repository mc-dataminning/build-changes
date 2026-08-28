import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fqk implements mm {
   private final mo.a d;

   public fqk(mo $$0) {
      this.d = $$0.a(mo.b.b, "equipment");
   }

   private static void a(BiConsumer<alf<dhf>, hkv> $$0) {
      $$0.accept(dhg.b, hkv.a().a(alg.b("leather"), true).a(alg.b("leather_overlay"), false).a(hkv.d.e, hkv.c.a(alg.b("leather"), true)).a());
      $$0.accept(dhg.c, a("chainmail"));
      $$0.accept(dhg.d, b("iron"));
      $$0.accept(dhg.e, b("gold"));
      $$0.accept(dhg.f, b("diamond"));
      $$0.accept(dhg.g, hkv.a().b(alg.b("turtle_scute"), false).a());
      $$0.accept(dhg.h, a("netherite"));
      $$0.accept(dhg.i, hkv.a().a(hkv.d.d, hkv.c.b(alg.b("armadillo_scute"), false)).a(hkv.d.d, hkv.c.b(alg.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(dhg.j, hkv.a().a(hkv.d.c, new hkv.c(alg.b("elytra"), Optional.empty(), true)).a());
      hkv.c $$1 = new hkv.c(alg.b("saddle"));
      $$0.accept(
         dhg.k, hkv.a().a(hkv.d.g, $$1).a(hkv.d.h, $$1).a(hkv.d.i, $$1).a(hkv.d.j, $$1).a(hkv.d.k, $$1).a(hkv.d.l, $$1).a(hkv.d.n, $$1).a(hkv.d.m, $$1).a()
      );

      for (Entry<cxw, alf<dhf>> $$2 : dhg.l.entrySet()) {
         cxw $$3 = $$2.getKey();
         alf<dhf> $$4 = $$2.getValue();
         $$0.accept($$4, hkv.a().a(hkv.d.f, new hkv.c(alg.b($$3.c()))).a());
      }

      $$0.accept(dhg.m, hkv.a().a(hkv.d.f, new hkv.c(alg.b("trader_llama"))).a());
   }

   private static hkv a(String $$0) {
      return hkv.a().a(alg.b($$0)).a();
   }

   private static hkv b(String $$0) {
      return hkv.a().a(alg.b($$0)).a(hkv.d.e, hkv.c.a(alg.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      Map<alf<dhf>, hkv> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mm.a($$0, hkv.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
