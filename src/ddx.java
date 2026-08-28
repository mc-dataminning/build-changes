import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public interface ddx {
   alj a = alj.b("leather");
   alj b = alj.b("chainmail");
   alj c = alj.b("iron");
   alj d = alj.b("gold");
   alj e = alj.b("diamond");
   alj f = alj.b("turtle_scute");
   alj g = alj.b("netherite");
   alj h = alj.b("armadillo_scute");
   alj i = alj.b("elytra");
   Map<cvj, alj> j = ae.a(cvj.class, $$0 -> alj.b($$0.c() + "_carpet"));
   alj k = alj.b("trader_llama");

   static void a(BiConsumer<alj, ddw> $$0) {
      $$0.accept(a, ddw.a().a(alj.b("leather"), true).a(alj.b("leather_overlay"), false).a(ddw.d.e, ddw.c.a(alj.b("leather"), true)).a());
      $$0.accept(b, a("chainmail"));
      $$0.accept(c, b("iron"));
      $$0.accept(d, b("gold"));
      $$0.accept(e, b("diamond"));
      $$0.accept(f, ddw.a().b(alj.b("turtle_scute"), false).a());
      $$0.accept(g, a("netherite"));
      $$0.accept(h, ddw.a().a(ddw.d.d, ddw.c.b(alj.b("armadillo_scute"), false)).a(ddw.d.d, ddw.c.b(alj.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(i, ddw.a().a(ddw.d.c, new ddw.c(alj.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cvj, alj> $$1 : j.entrySet()) {
         cvj $$2 = $$1.getKey();
         alj $$3 = $$1.getValue();
         $$0.accept($$3, ddw.a().a(ddw.d.f, new ddw.c(alj.b($$2.c()))).a());
      }

      $$0.accept(k, ddw.a().a(ddw.d.f, new ddw.c(alj.b("trader_llama"))).a());
   }

   private static ddw a(String $$0) {
      return ddw.a().a(alj.b($$0)).a();
   }

   private static ddw b(String $$0) {
      return ddw.a().a(alj.b($$0)).a(ddw.d.e, ddw.c.a(alj.b($$0), false)).a();
   }
}
