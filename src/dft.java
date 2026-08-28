import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public interface dft {
   alz a = alz.b("leather");
   alz b = alz.b("chainmail");
   alz c = alz.b("iron");
   alz d = alz.b("gold");
   alz e = alz.b("diamond");
   alz f = alz.b("turtle_scute");
   alz g = alz.b("netherite");
   alz h = alz.b("armadillo_scute");
   alz i = alz.b("elytra");
   Map<cwm, alz> j = ae.a(cwm.class, $$0 -> alz.b($$0.c() + "_carpet"));
   alz k = alz.b("trader_llama");

   static void a(BiConsumer<alz, dfs> $$0) {
      $$0.accept(a, dfs.a().a(alz.b("leather"), true).a(alz.b("leather_overlay"), false).a(dfs.d.e, dfs.c.a(alz.b("leather"), true)).a());
      $$0.accept(b, a("chainmail"));
      $$0.accept(c, b("iron"));
      $$0.accept(d, b("gold"));
      $$0.accept(e, b("diamond"));
      $$0.accept(f, dfs.a().b(alz.b("turtle_scute"), false).a());
      $$0.accept(g, a("netherite"));
      $$0.accept(h, dfs.a().a(dfs.d.d, dfs.c.b(alz.b("armadillo_scute"), false)).a(dfs.d.d, dfs.c.b(alz.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(i, dfs.a().a(dfs.d.c, new dfs.c(alz.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cwm, alz> $$1 : j.entrySet()) {
         cwm $$2 = $$1.getKey();
         alz $$3 = $$1.getValue();
         $$0.accept($$3, dfs.a().a(dfs.d.f, new dfs.c(alz.b($$2.c()))).a());
      }

      $$0.accept(k, dfs.a().a(dfs.d.f, new dfs.c(alz.b("trader_llama"))).a());
   }

   private static dfs a(String $$0) {
      return dfs.a().a(alz.b($$0)).a();
   }

   private static dfs b(String $$0) {
      return dfs.a().a(alz.b($$0)).a(dfs.d.e, dfs.c.a(alz.b($$0), false)).a();
   }
}
