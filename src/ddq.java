import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public interface ddq {
   all a = all.b("leather");
   all b = all.b("chainmail");
   all c = all.b("iron");
   all d = all.b("gold");
   all e = all.b("diamond");
   all f = all.b("turtle_scute");
   all g = all.b("netherite");
   all h = all.b("armadillo_scute");
   all i = all.b("elytra");
   Map<cvc, all> j = ae.a(cvc.class, $$0 -> all.b($$0.c() + "_carpet"));
   all k = all.b("trader_llama");

   static void a(BiConsumer<all, ddp> $$0) {
      $$0.accept(a, ddp.a().a(all.b("leather"), true).a(all.b("leather_overlay"), false).a(ddp.d.e, ddp.c.a(all.b("leather"), true)).a());
      $$0.accept(b, a("chainmail"));
      $$0.accept(c, b("iron"));
      $$0.accept(d, b("gold"));
      $$0.accept(e, b("diamond"));
      $$0.accept(f, ddp.a().b(all.b("turtle_scute"), false).a());
      $$0.accept(g, a("netherite"));
      $$0.accept(h, ddp.a().a(ddp.d.d, ddp.c.b(all.b("armadillo_scute"), false)).a(ddp.d.d, ddp.c.b(all.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(i, ddp.a().a(ddp.d.c, new ddp.c(all.b("elytra"), Optional.empty(), true)).a());

      for (Entry<cvc, all> $$1 : j.entrySet()) {
         cvc $$2 = $$1.getKey();
         all $$3 = $$1.getValue();
         $$0.accept($$3, ddp.a().a(ddp.d.f, new ddp.c(all.b($$2.c()))).a());
      }

      $$0.accept(k, ddp.a().a(ddp.d.f, new ddp.c(all.b("trader_llama"))).a());
   }

   private static ddp a(String $$0) {
      return ddp.a().a(all.b($$0)).a();
   }

   private static ddp b(String $$0) {
      return ddp.a().a(all.b($$0)).a(ddp.d.e, ddp.c.a(all.b($$0), false)).a();
   }
}
