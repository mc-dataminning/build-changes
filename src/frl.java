import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class frl implements mn {
   private final mp.a d;

   public frl(mp $$0) {
      this.d = $$0.a(mp.b.b, "equipment");
   }

   private static void a(BiConsumer<alf<dhu>, hlw> $$0) {
      $$0.accept(dhv.b, hlw.a().a(alg.b("leather"), true).a(alg.b("leather_overlay"), false).a(hlw.d.e, hlw.c.a(alg.b("leather"), true)).a());
      $$0.accept(dhv.c, a("chainmail"));
      $$0.accept(dhv.d, b("iron"));
      $$0.accept(dhv.e, b("gold"));
      $$0.accept(dhv.f, b("diamond"));
      $$0.accept(dhv.g, hlw.a().b(alg.b("turtle_scute"), false).a());
      $$0.accept(dhv.h, a("netherite"));
      $$0.accept(dhv.i, hlw.a().a(hlw.d.d, hlw.c.b(alg.b("armadillo_scute"), false)).a(hlw.d.d, hlw.c.b(alg.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(dhv.j, hlw.a().a(hlw.d.c, new hlw.c(alg.b("elytra"), Optional.empty(), true)).a());
      hlw.c $$1 = new hlw.c(alg.b("saddle"));
      $$0.accept(
         dhv.k, hlw.a().a(hlw.d.g, $$1).a(hlw.d.h, $$1).a(hlw.d.i, $$1).a(hlw.d.j, $$1).a(hlw.d.k, $$1).a(hlw.d.l, $$1).a(hlw.d.n, $$1).a(hlw.d.m, $$1).a()
      );

      for (Entry<cyl, alf<dhu>> $$2 : dhv.l.entrySet()) {
         cyl $$3 = $$2.getKey();
         alf<dhu> $$4 = $$2.getValue();
         $$0.accept($$4, hlw.a().a(hlw.d.f, new hlw.c(alg.b($$3.c()))).a());
      }

      $$0.accept(dhv.m, hlw.a().a(hlw.d.f, new hlw.c(alg.b("trader_llama"))).a());
   }

   private static hlw a(String $$0) {
      return hlw.a().a(alg.b($$0)).a();
   }

   private static hlw b(String $$0) {
      return hlw.a().a(alg.b($$0)).a(hlw.d.e, hlw.c.a(alg.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      Map<alf<dhu>, hlw> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mn.a($$0, hlw.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
