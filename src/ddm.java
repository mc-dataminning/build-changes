import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public interface ddm {
   ali a = ali.b("leather");
   ali b = ali.b("chainmail");
   ali c = ali.b("iron");
   ali d = ali.b("gold");
   ali e = ali.b("diamond");
   ali f = ali.b("turtle_scute");
   ali g = ali.b("netherite");
   ali h = ali.b("armadillo_scute");
   ali i = ali.b("elytra");
   Map<cuy, ali> j = ae.a(cuy.class, $$0 -> ali.b($$0.c() + "_carpet"));
   ali k = ali.b("trader_llama");

   static void a(BiConsumer<ali, ddl> $$0) {
      $$0.accept(a, ddl.a().a(ali.b("leather"), true).a(ali.b("leather_overlay"), false).a(ddl.d.e, ddl.c.a(ali.b("leather"), true)).a());
      $$0.accept(b, a("chainmail"));
      $$0.accept(c, b("iron"));
      $$0.accept(d, b("gold"));
      $$0.accept(e, b("diamond"));
      $$0.accept(f, ddl.a().b(ali.b("turtle_scute"), false).a());
      $$0.accept(g, a("netherite"));
      $$0.accept(h, ddl.a().a(ddl.d.d, ddl.c.b(ali.b("armadillo_scute"), false)).a(ddl.d.d, ddl.c.b(ali.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(i, ddl.a().a(ddl.d.c, new ddl.c(ali.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cuy, ali> $$1 : j.entrySet()) {
         cuy $$2 = $$1.getKey();
         ali $$3 = $$1.getValue();
         $$0.accept($$3, ddl.a().a(ddl.d.f, new ddl.c(ali.b($$2.c()))).a());
      }

      $$0.accept(k, ddl.a().a(ddl.d.f, new ddl.c(ali.b("trader_llama"))).a());
   }

   private static ddl a(String $$0) {
      return ddl.a().a(ali.b($$0)).a();
   }

   private static ddl b(String $$0) {
      return ddl.a().a(ali.b($$0)).a(ddl.d.e, ddl.c.a(ali.b($$0), false)).a();
   }
}
