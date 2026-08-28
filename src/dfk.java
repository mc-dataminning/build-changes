import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public interface dfk {
   alp a = alp.b("leather");
   alp b = alp.b("chainmail");
   alp c = alp.b("iron");
   alp d = alp.b("gold");
   alp e = alp.b("diamond");
   alp f = alp.b("turtle_scute");
   alp g = alp.b("netherite");
   alp h = alp.b("armadillo_scute");
   alp i = alp.b("elytra");
   Map<cwd, alp> j = ae.a(cwd.class, $$0 -> alp.b($$0.c() + "_carpet"));
   alp k = alp.b("trader_llama");

   static void a(BiConsumer<alp, dfj> $$0) {
      $$0.accept(a, dfj.a().a(alp.b("leather"), true).a(alp.b("leather_overlay"), false).a(dfj.d.e, dfj.c.a(alp.b("leather"), true)).a());
      $$0.accept(b, a("chainmail"));
      $$0.accept(c, b("iron"));
      $$0.accept(d, b("gold"));
      $$0.accept(e, b("diamond"));
      $$0.accept(f, dfj.a().b(alp.b("turtle_scute"), false).a());
      $$0.accept(g, a("netherite"));
      $$0.accept(h, dfj.a().a(dfj.d.d, dfj.c.b(alp.b("armadillo_scute"), false)).a(dfj.d.d, dfj.c.b(alp.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(i, dfj.a().a(dfj.d.c, new dfj.c(alp.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cwd, alp> $$1 : j.entrySet()) {
         cwd $$2 = $$1.getKey();
         alp $$3 = $$1.getValue();
         $$0.accept($$3, dfj.a().a(dfj.d.f, new dfj.c(alp.b($$2.c()))).a());
      }

      $$0.accept(k, dfj.a().a(dfj.d.f, new dfj.c(alp.b("trader_llama"))).a());
   }

   private static dfj a(String $$0) {
      return dfj.a().a(alp.b($$0)).a();
   }

   private static dfj b(String $$0) {
      return dfj.a().a(alp.b($$0)).a(dfj.d.e, dfj.c.a(alp.b($$0), false)).a();
   }
}
