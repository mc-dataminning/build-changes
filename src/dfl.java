import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public interface dfl {
   alz a = alz.b("leather");
   alz b = alz.b("chainmail");
   alz c = alz.b("iron");
   alz d = alz.b("gold");
   alz e = alz.b("diamond");
   alz f = alz.b("turtle_scute");
   alz g = alz.b("netherite");
   alz h = alz.b("armadillo_scute");
   alz i = alz.b("elytra");
   Map<cwh, alz> j = ae.a(cwh.class, $$0 -> alz.b($$0.c() + "_carpet"));
   alz k = alz.b("trader_llama");

   static void a(BiConsumer<alz, dfk> $$0) {
      $$0.accept(a, dfk.a().a(alz.b("leather"), true).a(alz.b("leather_overlay"), false).a(dfk.d.e, dfk.c.a(alz.b("leather"), true)).a());
      $$0.accept(b, a("chainmail"));
      $$0.accept(c, b("iron"));
      $$0.accept(d, b("gold"));
      $$0.accept(e, b("diamond"));
      $$0.accept(f, dfk.a().b(alz.b("turtle_scute"), false).a());
      $$0.accept(g, a("netherite"));
      $$0.accept(h, dfk.a().a(dfk.d.d, dfk.c.b(alz.b("armadillo_scute"), false)).a(dfk.d.d, dfk.c.b(alz.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(i, dfk.a().a(dfk.d.c, new dfk.c(alz.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cwh, alz> $$1 : j.entrySet()) {
         cwh $$2 = $$1.getKey();
         alz $$3 = $$1.getValue();
         $$0.accept($$3, dfk.a().a(dfk.d.f, new dfk.c(alz.b($$2.c()))).a());
      }

      $$0.accept(k, dfk.a().a(dfk.d.f, new dfk.c(alz.b("trader_llama"))).a());
   }

   private static dfk a(String $$0) {
      return dfk.a().a(alz.b($$0)).a();
   }

   private static dfk b(String $$0) {
      return dfk.a().a(alz.b($$0)).a(dfk.d.e, dfk.c.a(alz.b($$0), false)).a();
   }
}
