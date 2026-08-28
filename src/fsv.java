import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fsv implements mn {
   private final mp.a d;

   public fsv(mp $$0) {
      this.d = $$0.a(mp.b.b, "equipment");
   }

   private static void a(BiConsumer<alh<dif>, hng> $$0) {
      $$0.accept(dig.b, hng.a().a(ali.b("leather"), true).a(ali.b("leather_overlay"), false).a(hng.d.e, hng.c.a(ali.b("leather"), true)).a());
      $$0.accept(dig.c, a("chainmail"));
      $$0.accept(dig.d, b("iron"));
      $$0.accept(dig.e, b("gold"));
      $$0.accept(dig.f, b("diamond"));
      $$0.accept(dig.g, hng.a().b(ali.b("turtle_scute"), false).a());
      $$0.accept(dig.h, a("netherite"));
      $$0.accept(dig.i, hng.a().a(hng.d.d, hng.c.b(ali.b("armadillo_scute"), false)).a(hng.d.d, hng.c.b(ali.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(dig.j, hng.a().a(hng.d.c, new hng.c(ali.b("elytra"), Optional.empty(), true)).a());
      hng.c $$1 = new hng.c(ali.b("saddle"));
      $$0.accept(
         dig.k, hng.a().a(hng.d.g, $$1).a(hng.d.h, $$1).a(hng.d.i, $$1).a(hng.d.j, $$1).a(hng.d.k, $$1).a(hng.d.l, $$1).a(hng.d.n, $$1).a(hng.d.m, $$1).a()
      );

      for (Entry<cyw, alh<dif>> $$2 : dig.l.entrySet()) {
         cyw $$3 = $$2.getKey();
         alh<dif> $$4 = $$2.getValue();
         $$0.accept($$4, hng.a().a(hng.d.f, new hng.c(ali.b($$3.c()))).a());
      }

      $$0.accept(dig.m, hng.a().a(hng.d.f, new hng.c(ali.b("trader_llama"))).a());
   }

   private static hng a(String $$0) {
      return hng.a().a(ali.b($$0)).a();
   }

   private static hng b(String $$0) {
      return hng.a().a(ali.b($$0)).a(hng.d.e, hng.c.a(ali.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      Map<alh<dif>, hng> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mn.a($$0, hng.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
