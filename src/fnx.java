import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fnx implements mi {
   private final mk.a d;

   public fnx(mk $$0) {
      this.d = $$0.a(mk.b.b, "equipment");
   }

   private static void a(BiConsumer<akt<dfk>, hhx> $$0) {
      $$0.accept(dfl.b, hhx.a().a(aku.b("leather"), true).a(aku.b("leather_overlay"), false).a(hhx.d.e, hhx.c.a(aku.b("leather"), true)).a());
      $$0.accept(dfl.c, a("chainmail"));
      $$0.accept(dfl.d, b("iron"));
      $$0.accept(dfl.e, b("gold"));
      $$0.accept(dfl.f, b("diamond"));
      $$0.accept(dfl.g, hhx.a().b(aku.b("turtle_scute"), false).a());
      $$0.accept(dfl.h, a("netherite"));
      $$0.accept(dfl.i, hhx.a().a(hhx.d.d, hhx.c.b(aku.b("armadillo_scute"), false)).a(hhx.d.d, hhx.c.b(aku.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(dfl.j, hhx.a().a(hhx.d.c, new hhx.c(aku.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cwe, akt<dfk>> $$1 : dfl.k.entrySet()) {
         cwe $$2 = $$1.getKey();
         akt<dfk> $$3 = $$1.getValue();
         $$0.accept($$3, hhx.a().a(hhx.d.f, new hhx.c(aku.b($$2.c()))).a());
      }

      $$0.accept(dfl.l, hhx.a().a(hhx.d.f, new hhx.c(aku.b("trader_llama"))).a());
   }

   private static hhx a(String $$0) {
      return hhx.a().a(aku.b($$0)).a();
   }

   private static hhx b(String $$0) {
      return hhx.a().a(aku.b($$0)).a(hhx.d.e, hhx.c.a(aku.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      Map<akt<dfk>, hhx> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mi.a($$0, hhx.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
