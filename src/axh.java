import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class axh implements auj {
   private static final Map<ale<? extends jv<?>>, String> a = Map.of(
      lq.f, "tags/blocks", lq.v, "tags/entity_types", lq.z, "tags/fluids", lq.C, "tags/game_events", lq.G, "tags/items"
   );
   private final jw b;
   private List<axh.a<?>> c = List.of();

   public axh(jw $$0) {
      this.b = $$0;
   }

   public List<axh.a<?>> a() {
      return this.c;
   }

   public static String a(ale<? extends jv<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, bnk $$2, bnk $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends axh.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<axh.a<T>> a(aup $$0, Executor $$1, jw.d<T> $$2) {
      ale<? extends jv<T>> $$3 = $$2.a();
      jv<T> $$4 = $$2.b();
      axg<ji<T>> $$5 = new axg<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new axh.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(ale<? extends jv<T>> a, Map<alf, Collection<ji<T>>> b) {
   }
}
