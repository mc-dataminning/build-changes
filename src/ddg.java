import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public interface ddg {
   alh a = alh.b("leather");
   alh b = alh.b("chainmail");
   alh c = alh.b("iron");
   alh d = alh.b("gold");
   alh e = alh.b("diamond");
   alh f = alh.b("turtle_scute");
   alh g = alh.b("netherite");
   alh h = alh.b("armadillo_scute");
   alh i = alh.b("elytra");
   Map<cuu, alh> j = ad.a(cuu.class, $$0 -> alh.b($$0.c() + "_carpet"));
   alh k = alh.b("trader_llama");

   static void a(BiConsumer<alh, ddf> $$0) {
      $$0.accept(a, ddf.a().a(alh.b("leather"), true).a(alh.b("leather_overlay"), false).a(ddf.d.e, ddf.c.a(alh.b("leather"), true)).a());
      $$0.accept(b, a("chain"));
      $$0.accept(c, b("iron"));
      $$0.accept(d, b("gold"));
      $$0.accept(e, b("diamond"));
      $$0.accept(f, ddf.a().b(alh.b("turtle_scute"), false).a());
      $$0.accept(g, a("diamond"));
      $$0.accept(h, ddf.a().a(ddf.d.d, ddf.c.b(alh.b("armadillo_scute"), false)).a(ddf.d.d, ddf.c.b(alh.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(i, ddf.a().a(ddf.d.c, new ddf.c(alh.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cuu, alh> $$1 : j.entrySet()) {
         cuu $$2 = $$1.getKey();
         alh $$3 = $$1.getValue();
         $$0.accept($$3, ddf.a().a(ddf.d.f, new ddf.c(alh.b($$2.c()))).a());
      }

      $$0.accept(k, ddf.a().a(ddf.d.f, new ddf.c(alh.b("trader_llama"))).a());
   }

   private static ddf a(String $$0) {
      return ddf.a().a(alh.b($$0)).a();
   }

   private static ddf b(String $$0) {
      return ddf.a().a(alh.b($$0)).a(ddf.d.e, ddf.c.a(alh.b($$0), false)).a();
   }
}
