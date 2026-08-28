import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fna implements mi {
   private final mk.a d;

   public fna(mk $$0) {
      this.d = $$0.a(mk.b.b, "equipment");
   }

   private static void a(BiConsumer<aku<des>, hgy> $$0) {
      $$0.accept(det.b, hgy.a().a(akv.b("leather"), true).a(akv.b("leather_overlay"), false).a(hgy.d.e, hgy.c.a(akv.b("leather"), true)).a());
      $$0.accept(det.c, a("chainmail"));
      $$0.accept(det.d, b("iron"));
      $$0.accept(det.e, b("gold"));
      $$0.accept(det.f, b("diamond"));
      $$0.accept(det.g, hgy.a().b(akv.b("turtle_scute"), false).a());
      $$0.accept(det.h, a("netherite"));
      $$0.accept(det.i, hgy.a().a(hgy.d.d, hgy.c.b(akv.b("armadillo_scute"), false)).a(hgy.d.d, hgy.c.b(akv.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(det.j, hgy.a().a(hgy.d.c, new hgy.c(akv.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cvm, aku<des>> $$1 : det.k.entrySet()) {
         cvm $$2 = $$1.getKey();
         aku<des> $$3 = $$1.getValue();
         $$0.accept($$3, hgy.a().a(hgy.d.f, new hgy.c(akv.b($$2.c()))).a());
      }

      $$0.accept(det.l, hgy.a().a(hgy.d.f, new hgy.c(akv.b("trader_llama"))).a());
   }

   private static hgy a(String $$0) {
      return hgy.a().a(akv.b($$0)).a();
   }

   private static hgy b(String $$0) {
      return hgy.a().a(akv.b($$0)).a(hgy.d.e, hgy.c.a(akv.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      Map<aku<des>, hgy> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mi.a($$0, hgy.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
