import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fmx implements mi {
   private final mk.a d;

   public fmx(mk $$0) {
      this.d = $$0.a(mk.b.b, "equipment");
   }

   private static void a(BiConsumer<akt<deq>, hgr> $$0) {
      $$0.accept(der.b, hgr.a().a(aku.b("leather"), true).a(aku.b("leather_overlay"), false).a(hgr.d.e, hgr.c.a(aku.b("leather"), true)).a());
      $$0.accept(der.c, a("chainmail"));
      $$0.accept(der.d, b("iron"));
      $$0.accept(der.e, b("gold"));
      $$0.accept(der.f, b("diamond"));
      $$0.accept(der.g, hgr.a().b(aku.b("turtle_scute"), false).a());
      $$0.accept(der.h, a("netherite"));
      $$0.accept(der.i, hgr.a().a(hgr.d.d, hgr.c.b(aku.b("armadillo_scute"), false)).a(hgr.d.d, hgr.c.b(aku.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(der.j, hgr.a().a(hgr.d.c, new hgr.c(aku.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cvk, akt<deq>> $$1 : der.k.entrySet()) {
         cvk $$2 = $$1.getKey();
         akt<deq> $$3 = $$1.getValue();
         $$0.accept($$3, hgr.a().a(hgr.d.f, new hgr.c(aku.b($$2.c()))).a());
      }

      $$0.accept(der.l, hgr.a().a(hgr.d.f, new hgr.c(aku.b("trader_llama"))).a());
   }

   private static hgr a(String $$0) {
      return hgr.a().a(aku.b($$0)).a();
   }

   private static hgr b(String $$0) {
      return hgr.a().a(aku.b($$0)).a(hgr.d.e, hgr.c.a(aku.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      Map<akt<deq>, hgr> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mi.a($$0, hgr.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
