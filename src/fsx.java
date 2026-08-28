import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fsx implements mo {
   private final mq.a d;

   public fsx(mq $$0) {
      this.d = $$0.a(mq.b.b, "equipment");
   }

   private static void a(BiConsumer<alj<dih>, hni> $$0) {
      $$0.accept(dii.b, hni.a().a(alk.b("leather"), true).a(alk.b("leather_overlay"), false).a(hni.d.e, hni.c.a(alk.b("leather"), true)).a());
      $$0.accept(dii.c, a("chainmail"));
      $$0.accept(dii.d, b("iron"));
      $$0.accept(dii.e, b("gold"));
      $$0.accept(dii.f, b("diamond"));
      $$0.accept(dii.g, hni.a().b(alk.b("turtle_scute"), false).a());
      $$0.accept(dii.h, a("netherite"));
      $$0.accept(dii.i, hni.a().a(hni.d.d, hni.c.b(alk.b("armadillo_scute"), false)).a(hni.d.d, hni.c.b(alk.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(dii.j, hni.a().a(hni.d.c, new hni.c(alk.b("elytra"), Optional.empty(), true)).a());
      hni.c $$1 = new hni.c(alk.b("saddle"));
      $$0.accept(
         dii.k, hni.a().a(hni.d.g, $$1).a(hni.d.h, $$1).a(hni.d.i, $$1).a(hni.d.j, $$1).a(hni.d.k, $$1).a(hni.d.l, $$1).a(hni.d.n, $$1).a(hni.d.m, $$1).a()
      );

      for (Entry<cyy, alj<dih>> $$2 : dii.l.entrySet()) {
         cyy $$3 = $$2.getKey();
         alj<dih> $$4 = $$2.getValue();
         $$0.accept($$4, hni.a().a(hni.d.f, new hni.c(alk.b($$3.c()))).a());
      }

      $$0.accept(dii.m, hni.a().a(hni.d.f, new hni.c(alk.b("trader_llama"))).a());
   }

   private static hni a(String $$0) {
      return hni.a().a(alk.b($$0)).a();
   }

   private static hni b(String $$0) {
      return hni.a().a(alk.b($$0)).a(hni.d.e, hni.c.a(alk.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mm $$0) {
      Map<alj<dih>, hni> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mo.a($$0, hni.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
