import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fov implements mk {
   private final mm.a d;

   public fov(mm $$0) {
      this.d = $$0.a(mm.b.b, "equipment");
   }

   private static void a(BiConsumer<alc<dga>, hiy> $$0) {
      $$0.accept(dgb.b, hiy.a().a(ald.b("leather"), true).a(ald.b("leather_overlay"), false).a(hiy.d.e, hiy.c.a(ald.b("leather"), true)).a());
      $$0.accept(dgb.c, a("chainmail"));
      $$0.accept(dgb.d, b("iron"));
      $$0.accept(dgb.e, b("gold"));
      $$0.accept(dgb.f, b("diamond"));
      $$0.accept(dgb.g, hiy.a().b(ald.b("turtle_scute"), false).a());
      $$0.accept(dgb.h, a("netherite"));
      $$0.accept(dgb.i, hiy.a().a(hiy.d.d, hiy.c.b(ald.b("armadillo_scute"), false)).a(hiy.d.d, hiy.c.b(ald.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(dgb.j, hiy.a().a(hiy.d.c, new hiy.c(ald.b("elytra"), Optional.empty(), true)).a());
      hiy.c $$1 = new hiy.c(ald.b("saddle"));
      $$0.accept(
         dgb.k, hiy.a().a(hiy.d.g, $$1).a(hiy.d.h, $$1).a(hiy.d.i, $$1).a(hiy.d.j, $$1).a(hiy.d.k, $$1).a(hiy.d.l, $$1).a(hiy.d.n, $$1).a(hiy.d.m, $$1).a()
      );

      for (Entry<cwv, alc<dga>> $$2 : dgb.l.entrySet()) {
         cwv $$3 = $$2.getKey();
         alc<dga> $$4 = $$2.getValue();
         $$0.accept($$4, hiy.a().a(hiy.d.f, new hiy.c(ald.b($$3.c()))).a());
      }

      $$0.accept(dgb.m, hiy.a().a(hiy.d.f, new hiy.c(ald.b("trader_llama"))).a());
   }

   private static hiy a(String $$0) {
      return hiy.a().a(ald.b($$0)).a();
   }

   private static hiy b(String $$0) {
      return hiy.a().a(ald.b($$0)).a(hiy.d.e, hiy.c.a(ald.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mi $$0) {
      Map<alc<dga>, hiy> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mk.a($$0, hiy.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
