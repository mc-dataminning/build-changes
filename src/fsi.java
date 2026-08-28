import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fsi implements mo {
   private final mq.a d;

   public fsi(mq $$0) {
      this.d = $$0.a(mq.b.b, "equipment");
   }

   private static void a(BiConsumer<alq<dir>, hmw> $$0) {
      $$0.accept(dis.b, hmw.a().a(alr.b("leather"), true).a(alr.b("leather_overlay"), false).a(hmw.d.e, hmw.c.a(alr.b("leather"), true)).a());
      $$0.accept(dis.c, a("chainmail"));
      $$0.accept(dis.d, b("iron"));
      $$0.accept(dis.e, b("gold"));
      $$0.accept(dis.f, b("diamond"));
      $$0.accept(dis.g, hmw.a().b(alr.b("turtle_scute"), false).a());
      $$0.accept(dis.h, a("netherite"));
      $$0.accept(dis.i, hmw.a().a(hmw.d.d, hmw.c.b(alr.b("armadillo_scute"), false)).a(hmw.d.d, hmw.c.b(alr.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(dis.j, hmw.a().a(hmw.d.c, new hmw.c(alr.b("elytra"), Optional.empty(), true)).a());
      hmw.c $$1 = new hmw.c(alr.b("saddle"));
      $$0.accept(
         dis.k, hmw.a().a(hmw.d.g, $$1).a(hmw.d.h, $$1).a(hmw.d.i, $$1).a(hmw.d.j, $$1).a(hmw.d.k, $$1).a(hmw.d.l, $$1).a(hmw.d.n, $$1).a(hmw.d.m, $$1).a()
      );

      for (Entry<czi, alq<dir>> $$2 : dis.l.entrySet()) {
         czi $$3 = $$2.getKey();
         alq<dir> $$4 = $$2.getValue();
         $$0.accept($$4, hmw.a().a(hmw.d.f, new hmw.c(alr.b($$3.c()))).a());
      }

      $$0.accept(dis.m, hmw.a().a(hmw.d.f, new hmw.c(alr.b("trader_llama"))).a());
   }

   private static hmw a(String $$0) {
      return hmw.a().a(alr.b($$0)).a();
   }

   private static hmw b(String $$0) {
      return hmw.a().a(alr.b($$0)).a(hmw.d.e, hmw.c.a(alr.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mm $$0) {
      Map<alq<dir>, hmw> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mo.a($$0, hmw.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
