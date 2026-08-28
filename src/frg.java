import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class frg implements mn {
   private final mp.a d;

   public frg(mp $$0) {
      this.d = $$0.a(mp.b.b, "equipment");
   }

   private static void a(BiConsumer<alf<dhr>, hlp> $$0) {
      $$0.accept(dhs.b, hlp.a().a(alg.b("leather"), true).a(alg.b("leather_overlay"), false).a(hlp.d.e, hlp.c.a(alg.b("leather"), true)).a());
      $$0.accept(dhs.c, a("chainmail"));
      $$0.accept(dhs.d, b("iron"));
      $$0.accept(dhs.e, b("gold"));
      $$0.accept(dhs.f, b("diamond"));
      $$0.accept(dhs.g, hlp.a().b(alg.b("turtle_scute"), false).a());
      $$0.accept(dhs.h, a("netherite"));
      $$0.accept(dhs.i, hlp.a().a(hlp.d.d, hlp.c.b(alg.b("armadillo_scute"), false)).a(hlp.d.d, hlp.c.b(alg.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(dhs.j, hlp.a().a(hlp.d.c, new hlp.c(alg.b("elytra"), Optional.empty(), true)).a());
      hlp.c $$1 = new hlp.c(alg.b("saddle"));
      $$0.accept(
         dhs.k, hlp.a().a(hlp.d.g, $$1).a(hlp.d.h, $$1).a(hlp.d.i, $$1).a(hlp.d.j, $$1).a(hlp.d.k, $$1).a(hlp.d.l, $$1).a(hlp.d.n, $$1).a(hlp.d.m, $$1).a()
      );

      for (Entry<cyi, alf<dhr>> $$2 : dhs.l.entrySet()) {
         cyi $$3 = $$2.getKey();
         alf<dhr> $$4 = $$2.getValue();
         $$0.accept($$4, hlp.a().a(hlp.d.f, new hlp.c(alg.b($$3.c()))).a());
      }

      $$0.accept(dhs.m, hlp.a().a(hlp.d.f, new hlp.c(alg.b("trader_llama"))).a());
   }

   private static hlp a(String $$0) {
      return hlp.a().a(alg.b($$0)).a();
   }

   private static hlp b(String $$0) {
      return hlp.a().a(alg.b($$0)).a(hlp.d.e, hlp.c.a(alg.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      Map<alf<dhr>, hlp> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mn.a($$0, hlp.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
