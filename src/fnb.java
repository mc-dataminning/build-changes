import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fnb implements mi {
   private final mk.a d;

   public fnb(mk $$0) {
      this.d = $$0.a(mk.b.b, "equipment");
   }

   private static void a(BiConsumer<aku<det>, hgz> $$0) {
      $$0.accept(deu.b, hgz.a().a(akv.b("leather"), true).a(akv.b("leather_overlay"), false).a(hgz.d.e, hgz.c.a(akv.b("leather"), true)).a());
      $$0.accept(deu.c, a("chainmail"));
      $$0.accept(deu.d, b("iron"));
      $$0.accept(deu.e, b("gold"));
      $$0.accept(deu.f, b("diamond"));
      $$0.accept(deu.g, hgz.a().b(akv.b("turtle_scute"), false).a());
      $$0.accept(deu.h, a("netherite"));
      $$0.accept(deu.i, hgz.a().a(hgz.d.d, hgz.c.b(akv.b("armadillo_scute"), false)).a(hgz.d.d, hgz.c.b(akv.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(deu.j, hgz.a().a(hgz.d.c, new hgz.c(akv.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cvn, aku<det>> $$1 : deu.k.entrySet()) {
         cvn $$2 = $$1.getKey();
         aku<det> $$3 = $$1.getValue();
         $$0.accept($$3, hgz.a().a(hgz.d.f, new hgz.c(akv.b($$2.c()))).a());
      }

      $$0.accept(deu.l, hgz.a().a(hgz.d.f, new hgz.c(akv.b("trader_llama"))).a());
   }

   private static hgz a(String $$0) {
      return hgz.a().a(akv.b($$0)).a();
   }

   private static hgz b(String $$0) {
      return hgz.a().a(akv.b($$0)).a(hgz.d.e, hgz.c.a(akv.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      Map<aku<det>, hgz> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mi.a($$0, hgz.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
