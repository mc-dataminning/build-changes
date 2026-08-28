import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fmz implements mi {
   private final mk.a d;

   public fmz(mk $$0) {
      this.d = $$0.a(mk.b.b, "equipment");
   }

   private static void a(BiConsumer<akt<des>, hgq> $$0) {
      $$0.accept(det.b, hgq.a().a(aku.b("leather"), true).a(aku.b("leather_overlay"), false).a(hgq.d.e, hgq.c.a(aku.b("leather"), true)).a());
      $$0.accept(det.c, a("chainmail"));
      $$0.accept(det.d, b("iron"));
      $$0.accept(det.e, b("gold"));
      $$0.accept(det.f, b("diamond"));
      $$0.accept(det.g, hgq.a().b(aku.b("turtle_scute"), false).a());
      $$0.accept(det.h, a("netherite"));
      $$0.accept(det.i, hgq.a().a(hgq.d.d, hgq.c.b(aku.b("armadillo_scute"), false)).a(hgq.d.d, hgq.c.b(aku.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(det.j, hgq.a().a(hgq.d.c, new hgq.c(aku.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cvm, akt<des>> $$1 : det.k.entrySet()) {
         cvm $$2 = $$1.getKey();
         akt<des> $$3 = $$1.getValue();
         $$0.accept($$3, hgq.a().a(hgq.d.f, new hgq.c(aku.b($$2.c()))).a());
      }

      $$0.accept(det.l, hgq.a().a(hgq.d.f, new hgq.c(aku.b("trader_llama"))).a());
   }

   private static hgq a(String $$0) {
      return hgq.a().a(aku.b($$0)).a();
   }

   private static hgq b(String $$0) {
      return hgq.a().a(aku.b($$0)).a(hgq.d.e, hgq.c.a(aku.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      Map<akt<des>, hgq> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mi.a($$0, hgq.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
