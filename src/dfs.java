import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public interface dfs {
   alz a = alz.b("leather");
   alz b = alz.b("chainmail");
   alz c = alz.b("iron");
   alz d = alz.b("gold");
   alz e = alz.b("diamond");
   alz f = alz.b("turtle_scute");
   alz g = alz.b("netherite");
   alz h = alz.b("armadillo_scute");
   alz i = alz.b("elytra");
   Map<cwl, alz> j = ae.a(cwl.class, $$0 -> alz.b($$0.c() + "_carpet"));
   alz k = alz.b("trader_llama");

   static void a(BiConsumer<alz, dfr> $$0) {
      $$0.accept(a, dfr.a().a(alz.b("leather"), true).a(alz.b("leather_overlay"), false).a(dfr.d.e, dfr.c.a(alz.b("leather"), true)).a());
      $$0.accept(b, a("chainmail"));
      $$0.accept(c, b("iron"));
      $$0.accept(d, b("gold"));
      $$0.accept(e, b("diamond"));
      $$0.accept(f, dfr.a().b(alz.b("turtle_scute"), false).a());
      $$0.accept(g, a("netherite"));
      $$0.accept(h, dfr.a().a(dfr.d.d, dfr.c.b(alz.b("armadillo_scute"), false)).a(dfr.d.d, dfr.c.b(alz.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(i, dfr.a().a(dfr.d.c, new dfr.c(alz.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cwl, alz> $$1 : j.entrySet()) {
         cwl $$2 = $$1.getKey();
         alz $$3 = $$1.getValue();
         $$0.accept($$3, dfr.a().a(dfr.d.f, new dfr.c(alz.b($$2.c()))).a());
      }

      $$0.accept(k, dfr.a().a(dfr.d.f, new dfr.c(alz.b("trader_llama"))).a());
   }

   private static dfr a(String $$0) {
      return dfr.a().a(alz.b($$0)).a();
   }

   private static dfr b(String $$0) {
      return dfr.a().a(alz.b($$0)).a(dfr.d.e, dfr.c.a(alz.b($$0), false)).a();
   }
}
