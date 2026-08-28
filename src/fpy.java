import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fpy implements mm {
   private final mo.a d;

   public fpy(mo $$0) {
      this.d = $$0.a(mo.b.b, "equipment");
   }

   private static void a(BiConsumer<ald<dgz>, hkf> $$0) {
      $$0.accept(dha.b, hkf.a().a(ale.b("leather"), true).a(ale.b("leather_overlay"), false).a(hkf.d.e, hkf.c.a(ale.b("leather"), true)).a());
      $$0.accept(dha.c, a("chainmail"));
      $$0.accept(dha.d, b("iron"));
      $$0.accept(dha.e, b("gold"));
      $$0.accept(dha.f, b("diamond"));
      $$0.accept(dha.g, hkf.a().b(ale.b("turtle_scute"), false).a());
      $$0.accept(dha.h, a("netherite"));
      $$0.accept(dha.i, hkf.a().a(hkf.d.d, hkf.c.b(ale.b("armadillo_scute"), false)).a(hkf.d.d, hkf.c.b(ale.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(dha.j, hkf.a().a(hkf.d.c, new hkf.c(ale.b("elytra"), Optional.empty(), true)).a());
      hkf.c $$1 = new hkf.c(ale.b("saddle"));
      $$0.accept(
         dha.k, hkf.a().a(hkf.d.g, $$1).a(hkf.d.h, $$1).a(hkf.d.i, $$1).a(hkf.d.j, $$1).a(hkf.d.k, $$1).a(hkf.d.l, $$1).a(hkf.d.n, $$1).a(hkf.d.m, $$1).a()
      );

      for (Entry<cxq, ald<dgz>> $$2 : dha.l.entrySet()) {
         cxq $$3 = $$2.getKey();
         ald<dgz> $$4 = $$2.getValue();
         $$0.accept($$4, hkf.a().a(hkf.d.f, new hkf.c(ale.b($$3.c()))).a());
      }

      $$0.accept(dha.m, hkf.a().a(hkf.d.f, new hkf.c(ale.b("trader_llama"))).a());
   }

   private static hkf a(String $$0) {
      return hkf.a().a(ale.b($$0)).a();
   }

   private static hkf b(String $$0) {
      return hkf.a().a(ale.b($$0)).a(hkf.d.e, hkf.c.a(ale.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      Map<ald<dgz>, hkf> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mm.a($$0, hkf.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
