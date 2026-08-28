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

   private static void a(BiConsumer<aku<der>, hgx> $$0) {
      $$0.accept(des.b, hgx.a().a(akv.b("leather"), true).a(akv.b("leather_overlay"), false).a(hgx.d.e, hgx.c.a(akv.b("leather"), true)).a());
      $$0.accept(des.c, a("chainmail"));
      $$0.accept(des.d, b("iron"));
      $$0.accept(des.e, b("gold"));
      $$0.accept(des.f, b("diamond"));
      $$0.accept(des.g, hgx.a().b(akv.b("turtle_scute"), false).a());
      $$0.accept(des.h, a("netherite"));
      $$0.accept(des.i, hgx.a().a(hgx.d.d, hgx.c.b(akv.b("armadillo_scute"), false)).a(hgx.d.d, hgx.c.b(akv.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(des.j, hgx.a().a(hgx.d.c, new hgx.c(akv.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cvl, aku<der>> $$1 : des.k.entrySet()) {
         cvl $$2 = $$1.getKey();
         aku<der> $$3 = $$1.getValue();
         $$0.accept($$3, hgx.a().a(hgx.d.f, new hgx.c(akv.b($$2.c()))).a());
      }

      $$0.accept(des.l, hgx.a().a(hgx.d.f, new hgx.c(akv.b("trader_llama"))).a());
   }

   private static hgx a(String $$0) {
      return hgx.a().a(akv.b($$0)).a();
   }

   private static hgx b(String $$0) {
      return hgx.a().a(akv.b($$0)).a(hgx.d.e, hgx.c.a(akv.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      Map<aku<der>, hgx> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mi.a($$0, hgx.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
